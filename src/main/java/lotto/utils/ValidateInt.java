package lotto.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidateInt {
    //6자리 검증
    public static List<Integer> validatedInt(String input) {
        String[] winnigNumberArr = input.split(",");

        if(winnigNumberArr.length > 6) {
            throw new IllegalArgumentException("6자리 초과");
        }
        return verificationAggregate(winnigNumberArr);
    }
    //이 부분은 검증 집합체로 만들고 이 클래스는 도메인으로 옮길 예정 로직은 변경 될 예쩡
    private static List<Integer> verificationAggregate(String[] winnigNumberArr) {
        Set<Integer> duplicateNumber = new HashSet<>();
        List<Integer> winningNumbersList = new ArrayList<>();

        for (String winnigNumber : winnigNumberArr) {
            int number = parseNumber(winnigNumber);
            validateRange(number);
            validateDuplicate(duplicateNumber, number);
            winningNumbersList.add(number);
        }

        return winningNumbersList;
    }

    //숫자 검증
    private static int parseNumber(String token) {
        try {
            return Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("문자 발견");
        }
    }
    //1부터 45까지 검증
    private static void validateRange(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("숫자는 1부터 45 사이로 입력해주세요");
        }
    }
    //중복 숫자 검증
    private static void validateDuplicate(Set<Integer> duplicateNumber, int number) {
        //Set은 중복된 값을 허용하지 않아서 에러 터트림
        if (!duplicateNumber.add(number)) {
            throw new IllegalArgumentException("중복 숫자 발견");
        }
    }
}
