package lotto.utils;

public class ValidateInt {
    public static int toValidatedInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            throw new IllegalArgumentException("문자발견");
        }
    }
}
