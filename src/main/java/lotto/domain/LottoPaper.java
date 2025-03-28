package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoPaper {
    int lottoPrice = 1000;
    int lottoPaperCount;
    List<Lotto> lottos = new ArrayList<>();

    public LottoPaper(int money) {
        //뭔가 코드가 깔끔하지 않은데?
        this.lottoPaperCount = money / lottoPrice;
        test();
    }
    //6으로 나눠서 Lotto클래스로 생성하는 로직 필요할 듯
    private void test () {
        for(int i = 0; i < lottoPaperCount; i++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            lottos.add(new Lotto(numbers));
        }
    }

    public List<Lotto> getNumbers () {
        return lottos;
    }
}
