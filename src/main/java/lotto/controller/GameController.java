package lotto.controller;

import lotto.domain.Input;
import lotto.domain.Lotto;
import lotto.domain.LottoPaper;
import lotto.domain.ValidatePrice;

public class GameController {
    public void run () {
        Input input= new Input();
        ValidatePrice validateInput = input.inputBuyLotto(); //입력 받고 검증까지 끝냄, 돈 값 넘기려고 구분
        //돈 값 받아서 로또 발행 클래스로 넘기기 굳이 넘겨야하나? 그냥 return 으로 받고 싶은데
        int money = validateInput.getIsMoney();
        // 로또 발행 로직
        LottoPaper lottoPaper = new LottoPaper(money);
        //lottoPaper의 getLottos는 lotto의 각 객체로 포문을 도는 거임
        //한 마디로 또 lottoPaper를 겟로또로
        for(Lotto lotto : lottoPaper.getLottos()) {
            System.out.println(lotto.getNumbers());
        }
        int winningNumber = input.inputWinningNumberLotto();
        //6자리 검증, 숫자 검증, 겹치는 숫자 검증,
        int bonusNumber = input.inputBonusNumberLotto();
    }
}
