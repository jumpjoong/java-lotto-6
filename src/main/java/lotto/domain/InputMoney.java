package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

public class InputMoney {

    public ValidateInput input() {
        System.out.println("구입금액을 입력해 주세요.");
        String money = Console.readLine();
        return new ValidateInput(money);
    }
}
