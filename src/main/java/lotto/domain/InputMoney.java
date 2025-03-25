package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

public class InputMoney {

    public void input() {
        System.out.println("구입금액을 입력해 주세요.");
        String money = Console.readLine();
        validateInt(money);
    }
    //숫자 검증
    private void validateInt (String money) {
        try {
            int isMoney = Integer.parseInt(money);
            validateThousandUnit(isMoney);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
    //1000단위 검증
    private void validateThousandUnit (int isMoney) {
        int ThousandRex = 1000;

        if (!(isMoney % ThousandRex == 0)) {
            throw new IllegalArgumentException("1000원 단위로 입력해주세요");
        }
    }
}
