package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoPaper {
    int lottoPrice = 1000;
    int lottoPaperCount;
    List<Integer> numbers = new ArrayList<>();

    public LottoPaper(int money) {
        //뭔가 코드가 깔끔하지 않은데?
        this.lottoPaperCount = money / lottoPrice;
        test();
    }
    //한 줄로 쭉 나오는데 5개 씩 나눠야 할듯 2차원 배열로
    private void test () {
        numbers = Randoms.pickUniqueNumbersInRange(1, 45, lottoPaperCount);
    }
}
