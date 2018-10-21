package answers;

public class Question1 {

    public static int bestMergedPortfolio(int[] portfolios) {
        int highest = 0;
        for (int i : portfolios) {
            for (int i1 : portfolios) {
                if ((i ^ i1) > highest) {
                    highest = i ^ i1;
                }
            }
        }
        return highest;
    }
}
