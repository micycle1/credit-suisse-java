package answers;

public class Question1 {

    public static int bestMergedPortfolio(int[] portfolios) {
        int highest = 0;
        for (int j = 0; j < portfolios.length; j++) {
            for (int k = j; k < portfolios.length; k++) {
                highest = ((j ^ k) > highest) ? j ^ k : highest;
            }
        }
        return highest;
    }

}
