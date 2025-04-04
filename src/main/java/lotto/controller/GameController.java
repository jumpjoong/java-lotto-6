package lotto.controller;

import lotto.domain.*;

import java.util.List;
//클래스명은 명확하게
public class GameController {
    public void run () {
        Input input= new Input();
        Money money = input.inputMoney(); //입력 받고 검증까지 끝냄, 컨트롤러에서 객체로 관리
        // 로또 발행 로직
        LottoPaper lottoPaper = new LottoPaper(money);
        List<Lotto> lottos = lottoPaper.getLottos();
        //로또 객체로 그냥 받아와서 사용
        for(Lotto lotto : lottos) {
            System.out.println(lotto.getNumbers());
        }

        ValidateWinningNumber winningNumber = input.inputWinningNumberLotto();
        //6자리 검증, 숫자 검증, 겹치는 숫자 검증,
//        int bonusNumber = input.inputBonusNumberLotto();
    }
}
