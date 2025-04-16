package lotto.config;

public enum InputMsg {
    INPUT_BUY_MSG("구입금액을 입력해 주세요."),
    INPUT_WINNING_NUMBER_MSG("\n당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER_MSG("보너스 번호를 입력해 주세요."),
    BUY_LOTTO_MSG("개를 구매했습니다."),
    ;

    private final String msg;

    InputMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
