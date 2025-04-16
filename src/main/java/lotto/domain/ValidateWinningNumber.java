package lotto.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static lotto.config.RuleErrorMsg.*;
import static lotto.config.InputErrorMsg.NOT_A_NUMBER;

public class ValidateWinningNumber {
    List<Integer> winningNumber = new ArrayList<>();

    public ValidateWinningNumber(String input) {
        this.winningNumber = validateLength(input);
    }

    //6자리 검증
    private List<Integer> validateLength(String input) {
        String[] winnigNumberArr = input.split(",");

        if(!(winnigNumberArr.length == 6)) {
            throw new IllegalArgumentException(INVALID_INPUT_SIZE_ERROR.getMsg());
        }
        return validateOnly(winnigNumberArr);
    }
    //얘도 메서드명 어떻게 해야할지 모르겠음
    private List<Integer> validateOnly(String[] input) {
        //Set은 중복값 허용x
        Set<Integer> duplicateNumber = new HashSet<>();
        List<Integer> winningNumbersList = new ArrayList<>();

        for (String winnigNumber : input) {
            //여기서 웬만한 검증이 시작 됨
            int number = verificationAggregate(winnigNumber, duplicateNumber);
            winningNumbersList.add(number);
        }

        return winningNumbersList;
    }
    //웬만한 검증이 여기에 들어있음 메서드명 뭐로할지 감도 안 옴
    private int verificationAggregate(String winnigNumber, Set<Integer> duplicateNumber) {
        //숫자 검증
        int number = validateInt(winnigNumber);
        //숫자 검증이 끝나면 1~45까지 검사
        validateRange(number);
        // 1~45의 사이의 검증
        validateDuplicate(duplicateNumber, number);
        return number;
    }
    //숫자  검증
    private int validateInt(String winnigNumber) {
        try {
            return Integer.parseInt(winnigNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_A_NUMBER.getMsg());
        }
    }
    //숫자 범위 검증
    private void validateRange(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException(NUMBER_RANGE_ERROR.getMsg());
        }
    }
    //증복 숫자 검증
    private static void validateDuplicate(Set<Integer> duplicateNumber, int number) {
        //Set은 중복된 값을 허용하지 않아서 에러 터트림
        if (!duplicateNumber.add(number)) {
            throw new IllegalArgumentException(DUPLICATE_NUMBER_ERROR.getMsg());
        }
    }

    public List<Integer> getWinningNumber () {
        return winningNumber;
    }
}
