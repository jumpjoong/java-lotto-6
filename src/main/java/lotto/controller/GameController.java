package lotto.controller;

import lotto.domain.InputMoney;
import lotto.domain.ValidateInput;

public class GameController {
    public void run () {
        InputMoney inputMoney = new InputMoney();
        ValidateInput validateInput = inputMoney.input(); //입력 받고 검증까지 끝냄, 돈 값 넘기려고 구분
    }
}
