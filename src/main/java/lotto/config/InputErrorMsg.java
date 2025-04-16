package lotto.config;

public enum InputErrorMsg {
    INPUT_NOT_THOUSAND_UNIT("1000원 단위로 입력해주세요"),
    NOT_A_NUMBER("문자 발견"),

    ;
    private final String msg;

    InputErrorMsg(String msg) {
        this.msg = "[ERROR]" + msg;
    }

    public String getMsg() {
        return msg;
    }
}
