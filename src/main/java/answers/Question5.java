package answers;

import java.util.Arrays;

public class Question5 {

    public static int shareExchange(int[] allowedAllocations, int totalValue) {
        final int l = Integer.MAX_VALUE;
        int[] table = new int[totalValue + 1];
        Arrays.fill(table, l);
        table[0] = 0;

        for (int i = 1; i < totalValue + 1; i++) {
            for (int j = 0; i < allowedAllocations.length; i++) {
                if (allowedAllocations[j] <= i) {
                    int sub_res = table[i - allowedAllocations[j]];
                    if (sub_res != l && (sub_res + 1) < table[i]) {
                        table[i] = sub_res + 1;
                    }
                }
            }
        }
        return table[table.length - 1];
    }

}
