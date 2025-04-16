package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static lotto.config.InputMsg.BUY_LOTTO_MSG;

public class LottoPaper {
    private final List<Lotto> totalLottos = new ArrayList<>();

    public LottoPaper(Money money) {
        int count = money.lottoPaperCount();
        buyLotto(count);
    }

    private void buyLotto(int count) {
        System.out.println("\n" + count + BUY_LOTTO_MSG.getMsg());
        for (int i = 0; i < count; i++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            totalLottos.add(new Lotto(numbers));
        }
    }

    public List<Lotto> getLottos() {
        return totalLottos;
    }
}
