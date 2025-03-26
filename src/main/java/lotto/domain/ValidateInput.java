package lotto.domain;

public class ValidateInput {
    private final int isMoney;

    public ValidateInput(String money) {
        this.isMoney = validateMoney(money);
    }

    // 검증 메소드 집합체
    private int validateMoney(String money) {
        int isMoney = validateInt(money);
        validateThousandUnit(isMoney);
        return isMoney;
    }
    //숫자 검증
    private int validateInt (String money) {
        try {
            return Integer.parseInt(money);
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

    public int getIsMoney () {
        return isMoney;
    }
}
