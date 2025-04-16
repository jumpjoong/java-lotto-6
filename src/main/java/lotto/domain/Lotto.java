package lotto.domain;

import java.util.Collections;
import java.util.List;

import static lotto.config.RuleErrorMsg.*;

//로또 한 줄
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(LOTTO_NUMBER_OVER_SIZE_ERROR.getMsg());
        }
        if (duplicateLottoNumber(numbers) != 6) {
            throw new IllegalArgumentException(DUPLICATE_NUMBER_ERROR.getMsg());
        }
    }
    //로또 한줄이 6개가 아닐 경우, 즉 중복값이 있을 경우
    private long duplicateLottoNumber(List<Integer> numbers) {
        return numbers.stream().distinct().count();
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    // TODO: 추가 기능 구현
}
