package lotto.config;

public enum RuleErrorMsg {
    INVALID_INPUT_SIZE_ERROR("6자리로 입력해주세요"),
    NUMBER_RANGE_ERROR("숫자는 1부터 45 사이로 입력해주세요"),
    DUPLICATE_NUMBER_ERROR("중복 숫자 발견"),
    LOTTO_NUMBER_OVER_SIZE_ERROR("로또의 숫자 범위가 6자리를 넘어갑니다")
    ;

    private final String msg;

    RuleErrorMsg(String msg) {
        this.msg = "[ERROR]" + msg;
    }

    public String getMsg() {
        return msg;
    }
}
