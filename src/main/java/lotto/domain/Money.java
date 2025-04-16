package lotto.domain;

import static lotto.config.InputErrorMsg.*;

public class Money {
    private final int totalMoney;
    int lottoPrice = 1000;

    public Money(String inputMoney) {
        this.totalMoney = validateInputMoney(inputMoney);
    }

    private int validateInputMoney(String inputMoney) {
        try {
            int money = Integer.parseInt(inputMoney.trim());
            if (money % lottoPrice != 0) {
                throw new IllegalArgumentException(INPUT_NOT_THOUSAND_UNIT.getMsg());
            }
            return money;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_A_NUMBER.getMsg());
        }
    }

    public int lottoPaperCount() {
        return totalMoney / lottoPrice;
    }
    public int getTotalMoney () {
        return totalMoney;
    }
}