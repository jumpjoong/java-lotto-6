package lotto.domain;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.ValidateInt;

public class Input {
    public ValidatePrice inputBuyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        String money = Console.readLine();
        return new ValidatePrice(money);
    }
    //6자리도 검증 클래스 만들기
    public int inputWinningNumberLotto () {
        System.out.println("\n당첨 번호를 입력해 주세요.");
        return ValidateInt.toValidatedInt(Console.readLine());
    }

    //예외처리 해야함, 위 숫자와 중복 될 경우도 생각 해야함
    public void inputBonusNumberLotto() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusNumber = Console.readLine();
    }
}
