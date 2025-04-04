package lotto.utils;

public class ValidateInt {
    public static int toValidatedInt(String money) {
        try {
            return Integer.parseInt(money);
        } catch (Exception e) {
            throw new IllegalArgumentException("문자발견");
        }
    }
}
