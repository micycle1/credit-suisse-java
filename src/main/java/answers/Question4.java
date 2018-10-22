package answers;

public class Question4 {

    public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
        int minTime = Integer.MAX_VALUE;
        for (String[] row : rows) {
            int first_index = 0;
            int total_sum = 0;
            int count = 0;

            check_char :
            {
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("X")) {
                        if ((row.length - (i+1)) < numberMachines) {
                            break check_char;
                        }
                        first_index = 0;
                        total_sum = 0;
                        count = 0;
                    } else {
                        if (count == 0) {
                            first_index = i;
                            total_sum = Integer.valueOf(row[i]);
                            count++;
                        } else {
                            if (count + 1 == numberMachines) {
                                total_sum += Integer.valueOf(row[i]);
                                minTime = Math.min(minTime, total_sum);
                                total_sum -= Integer.valueOf(row[first_index]);
                                first_index++;
                            } else {
                                total_sum += Integer.valueOf(row[i]);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        if (minTime == Integer.MAX_VALUE) {
            minTime = 0;
        }
        return minTime;
    }
}
