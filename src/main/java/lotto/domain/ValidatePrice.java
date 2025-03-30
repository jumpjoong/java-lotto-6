package lotto.domain;

import lotto.utils.ValidateInt;

public class ValidatePrice {
    private final int isMoney;

    public ValidatePrice(String money) {
        this.isMoney = validateMoney(money);
    }

    // 검증 메소드 집합체
    private int validateMoney(String money) {
        //숫자인지 아닌지 먼저 검증
        int isMoney = ValidateInt.toValidatedInt(money);
        validateThousandUnit(isMoney);
        return isMoney;
    }

    //1000단위 검증
    private void validateThousandUnit (int isMoney) {
        int ThousandRex = 1000;

        if (!(isMoney % ThousandRex == 0)) {
            throw new IllegalArgumentException("1000원 단위로 입력해주세요");
        }
    }

    public int getIsMoney () {
        return isMoney;
    }
}