package lotto.domain;

import java.util.List;

public class WinningLotto {
    List<Lotto> lottos;
    List<Integer> winningLottosNumber;
    int bonusNumber;
    int[] rank = new int[5];

    public WinningLotto(List<Integer> winningLottosNumber, List<Lotto> lottos, int bonusNumber) {
        this.winningLottosNumber = winningLottosNumber;
        this.lottos = lottos;
        this.bonusNumber = bonusNumber;
    }

    public void checkAllLotto () {
        int num;
        for(Lotto lotto :  lottos) {
            //aaa = 로또 한 줄
            List<Integer> aaa = lotto.getNumbers();
            num = countMatches(aaa);
            rankCount(num, aaa); //반복하면서 당첨 갯수 파악
        }
    }

    public int countMatches (List<Integer> aaa) {
        int matchCount = 0;
        //aaa = 로또 한 줄 이고 그 리스트에 들어있는 각 숫자에 대해 for문 돌리는데 그 값은 num으로 칭함
        for (int num : aaa) {
            //로또 한 줄에서 한 줄의 숫자 하나가 포함되어 있냐 어디에? winningLottoNumber = 당첨 번호 6자리
            if(winningLottosNumber.contains(num)) {
                matchCount++;
            }
        }
        return matchCount;
    }

    public void rankCount (int count, List<Integer> aaa) {
        if (count == 6) {
            rank[0]++;
        }
        if (count == 5 && aaa.contains(bonusNumber)) {
            rank[1]++;
        }
        if (count == 5 && !aaa.contains(bonusNumber)) {
            rank[2]++;
        }
        if (count == 4) {
            rank[3]++;
        }
        if (count == 3) {
            rank[4]++;
        }
    }

    public void getResult() {
        System.out.println("3개 일치 (5,000원) - " + rank[4] +"개\n" +
            "4개 일치 (50,000원) - " +rank[3] + "개\n" +
            "5개 일치 (1,500,000원) - " + rank[2] + "개\n" +
            "5개 일치, 보너스 볼 일치 (30,000,000원) - "+ rank[1] +"개\n" +
            "6개 일치 (2,000,000,000원) - "+ rank[0] + "개\n" +
            "총 수익률은 62.5%입니다."
        );
    }
}
