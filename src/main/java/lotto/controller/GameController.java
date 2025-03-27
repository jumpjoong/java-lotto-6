package lotto.controller;

import lotto.domain.InputMoney;
import lotto.domain.LottoPaper;
import lotto.domain.ValidateInput;

public class GameController {
    public void run () {
        InputMoney inputMoney = new InputMoney();


        ValidateInput validateInput = inputMoney.input(); //입력 받고 검증까지 끝냄, 돈 값 넘기려고 구분
        //돈 값 받아서 로또 발행 클래스로 넘기기 굳이 넘겨야하나? 그냥 return 으로 받고 싶은데
        int money = validateInput.getIsMoney();
        // 만약 lottoPaper 메소드를 사용할 일이 없다면 위 코드에서 리턴 때리고 실행시키는 쪽으로 변경
        //
        LottoPaper lottoPaper = new LottoPaper(money);
    }
}
