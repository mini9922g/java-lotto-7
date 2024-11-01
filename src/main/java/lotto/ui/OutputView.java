package lotto.ui;

import lotto.model.LottoRank;
import lotto.model.LottoResult;

import java.util.List;

public class OutputView {

    public static void countLotto(int lotto) {
        System.out.println(lotto + "개를 구매했습니다.");
    }

    public static void lottoPrint(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public static void lottoResult(LottoResult lottoResult) {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + lottoResult.getRankCount(LottoRank.FIFTH) + "개");
        System.out.println("4개 일치 (5,0000원) - " + lottoResult.getRankCount(LottoRank.FOURTH) + "개");
        System.out.println("5개 일치 (1,500,000원) - " + lottoResult.getRankCount(LottoRank.THIRD) + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + lottoResult.getRankCount(LottoRank.SECOND) + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + lottoResult.getRankCount(LottoRank.FIRST) + "개");
        System.out.println("총 수익률은 n% 입니다"); // 수정해야합니다
    }
}
