package answers;

public class Question1 {

    public static int bestMergedPortfolio(int[] portfolios) {
        int highest = 0;
        for (int j = 0; j < portfolios.length; j++) {
            int outer = portfolios[j];
            for (int k = j + 1; k < portfolios.length; k++) {
                highest = ((outer ^ portfolios[k]) > highest) ? outer ^ portfolios[k] : highest;
            }
        }
        return highest;
    }
}
