package answers;

import helpers.Edge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question3 {

    public static int lowestExposureToExchanges(int numNodes, Edge[] edgeList) {

        HashSet<Integer> initial = new HashSet<Integer>(); // remove nodes that are connected from list
        for (int i = 1; i < numNodes + 1; i++) {
            initial.add(i);
        }

        ArrayList<HashSet<Integer>> record = new ArrayList<>(); // list of sets of non-connected nodes
        for (int i = 1; i < numNodes + 1; i++) {
            record.add((HashSet<Integer>) initial.clone());
//            record.get(i)
        }

        int maxQuantity = 0;
        int index = 0;
        int[] edgeCountPerNode = new int[numNodes];
        Arrays.fill(edgeCountPerNode, numNodes);

        // remove connecting edges
        for (Edge edge : edgeList) {
            record.get(edge.getEdgeA()).remove(edge.getEdgeB());
            record.get(edge.getEdgeB()).remove(edge.getEdgeA());
        }

        // score
        HashSet<Integer> connectedNodes = new HashSet<>();
        int max = 0;
        for (int nodeID = 1; nodeID < record.size(); nodeID++) {
            connectedNodes.clear();
            for (Integer connectedTo : record.get(nodeID)) {
                if (!record.get(connectedTo).contains(nodeID)) {
                    connectedNodes.add(connectedTo);
                }
            }
            max = Math.max(max, record.get(nodeID).size() - connectedNodes.size());
        }
        return max;
    }
}
