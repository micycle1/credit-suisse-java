package answers;

import java.util.*;

public class Question6 {

    public static int shortestServerRoute(int numServers, int targetServer, int[][] times) {
        int heuristic = times[0][targetServer];

        HashMap<Integer,Integer> minimumCosts = new HashMap<>();
        for (int i = 0; i < numServers; i++) {
            minimumCosts.put(i, times[i][targetServer]);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> nodesToConsider = new HashSet<>(0); // add first to considered

        for (int i = 0; i < numServers; i++) {
            if (times[i][targetServer] < heuristic) {
                queue.add(i);
                nodesToConsider.add(i);
            }

            HashSet<Integer> nodesConsidered = new HashSet<>();
            while(!queue.isEmpty()) {
//                for
                    while (nodesToConsider.iterator().hasNext()) {
//                        nodesToConsider.iterator().next()
                    }
            }
        }

        HashMap<Integer,Integer> parentChild = new HashMap<>();
        return  -1;
    }
}