package answers;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

    // todo arraylist -> linkedlist

    public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
        int minTime =  Integer.MAX_VALUE;
        ArrayList<ArrayList<Integer>> rowPossibles = new ArrayList<>();

        for (String[] row : rows) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (String s : row) {
                if (s.equals("X")) {
                    if (temp.size() >= numberMachines) {
                        rowPossibles.add(new ArrayList<>(temp));
                    }
                    temp.clear();
                } else {
                    temp.add(Integer.valueOf(s));
                    if (temp.size() == numberMachines) {
                        rowPossibles.add(new ArrayList<>(temp));
                        temp = new ArrayList<Integer>(temp.subList(1, temp.size()));
                    }
                }
            }
            if (temp.size() >= numberMachines) { // after last char in row, check again
                rowPossibles.add(new ArrayList<>(temp));
            }
        }

        if (rowPossibles.isEmpty()) {
            minTime = 0;
        }
        else {
            for (ArrayList<Integer> rowPossible : rowPossibles) {
                int sum = 0;
                for (Integer integer : rowPossible) {
                    sum += integer;
                }
                if (sum < minTime) {
                    minTime = sum;
                }
            }
        }
        return minTime; // return min here?
    }
}
