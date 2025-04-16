package lotto.domain;

import camp.nextstep.edu.missionutils.Console;
import lotto.utils.ValidateInt;

import static lotto.config.InputMsg.*;

public class Input {
    public Money inputMoney() {
        while(true) {
            try {
                System.out.println(INPUT_BUY_MSG.getMsg());
                String money = Console.readLine();
                return new Money(money); // 내부에서 검증 포함
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    //당첨 번호 입력
    public ValidateWinningNumber inputWinningNumberLotto () {
        while (true) {
            try {
                System.out.println(INPUT_WINNING_NUMBER_MSG.getMsg());
                return new ValidateWinningNumber(Console.readLine());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //보너스 번호 입력
    public int inputBonusNumberLotto() {
        while (true) {
            try{
                System.out.println(INPUT_BONUS_NUMBER_MSG.getMsg());
                return ValidateInt.toValidatedInt(Console.readLine());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
