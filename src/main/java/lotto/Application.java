package lotto;

import lotto.controller.GameController;
import lotto.domain.InputMoney;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.run();
    }
}
