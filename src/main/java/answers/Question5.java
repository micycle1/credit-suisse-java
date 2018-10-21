package answers;

import java.util.Arrays;

public class Question5 {

    public static int shareExchange(int[] allowedAllocations, int totalValue) {
        int table[] = new int[totalValue + 1];
        Arrays.fill(table, Integer.MAX_VALUE);
        table[0] = 0;
        for (int i = 1; i <= totalValue; i++) {
            for (int j = 0; j < allowedAllocations.length; j++)
                if (allowedAllocations[j] <= i) {
                    int sub_res = table[i - allowedAllocations[j]];
                    if (sub_res != Integer.MAX_VALUE
                            && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        return table[totalValue];
    }

}
