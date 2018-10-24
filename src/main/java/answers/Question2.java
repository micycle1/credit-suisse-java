package answers;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Only 2 iters deep
 */
public class Question2 {

    public static int equallyBalancedCashFlow(int[] cashflowIn, int[] cashflowOut) {

        int min = cashflowIn[0];
        for (int n : cashflowIn) {
            Math.min(min, n);
        }
        for (int n : cashflowOut) {
            Math.min(min, n);
        }

        List<Integer> rows = Arrays.stream(cashflowIn).boxed().collect(Collectors.toList());
        List<Integer> columns = Arrays.stream(cashflowOut).boxed().collect(Collectors.toList());
        Table<Integer, Integer, Integer> sum = ArrayTable.create(rows, columns);

        for (int in : cashflowIn) {
            for (int out : cashflowOut) {
                sum.put(in, out, in - out);
                min = Math.min(min, Math.abs(in - out));
            }
        }

        /**
         * For each number, check against others
         */
        for (int in : cashflowIn) {
            for (int out : cashflowOut) {
                int current = sum.get(in, out);
                Set<Integer> rowsToCheck = new HashSet<>(sum.rowKeySet());
                rowsToCheck.remove(in);
                for (Integer row : rowsToCheck) {
                    Set<Integer> columnsToCheck = new HashSet<>(sum.columnKeySet());
                    rowsToCheck.remove(out);
                    for (Integer column : columnsToCheck) {
                        min = Math.min(min, Math.abs(current - sum.get(row, column)));
                    }
                }
            }
        }
        return min;
    }

}
