package lotto.domain;

public class Money {
    private final int totalMoney;
    int lottoPrice = 1000;

    public Money(String inputMoney) {
        this.totalMoney = validateInputMoney(inputMoney);
    }

    private int validateInputMoney(String inputMoney) {
        try {
            int money = Integer.parseInt(inputMoney);
            if (money % lottoPrice != 0) {
                throw new IllegalArgumentException("1000원 단위로 입력해주세요");
            }
            return money;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }

    public int lottoPaperCount() {
        return totalMoney / lottoPrice;
    }
}