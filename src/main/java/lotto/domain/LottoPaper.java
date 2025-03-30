package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoPaper {
    int lottoPrice = 1000;
    int lottoPaperCount;
    List<Lotto> totalLottos = new ArrayList<>();

    public LottoPaper(int money) {
        //뭔가 코드가 깔끔하지 않은데?
        this.lottoPaperCount = money / lottoPrice;
        buyLotto();
    }

    private void buyLotto () {
        System.out.println("\n"+lottoPaperCount + "개를 구매했습니다");
        //로또 한 줄씩 발행
        for(int i = 0; i < lottoPaperCount; i++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            totalLottos.add(new Lotto(numbers));
        }
    }

    public List<Lotto> getLottos () {
        return totalLottos;
    }
}
