package GraphWithMatrixImpl;

import GraphInterface.Graph;
import GraphWithNode.GraphWithMatrixNode;

import java.util.ArrayList;
import java.util.List;

public class GraphWithMatrixImpl implements Graph {
    private final List<GraphWithMatrixNode> nodes;
    private final int[][] adjacencyMatrix;

    public GraphWithMatrixImpl(int vertexCnt) {
        nodes = new ArrayList<>(vertexCnt);
        adjacencyMatrix = new int[vertexCnt][vertexCnt];
    }

    @Override
    public void add(GraphWithMatrixNode a, GraphWithMatrixNode b) {
        int idxA = nodes.indexOf(a);
        int idxB = nodes.indexOf(b);
        if (idxA != -1 && idxB != -1){
            adjacencyMatrix[idxA][idxB] = 1;
            adjacencyMatrix[idxB][idxA] = 1;
        }
    }

    @Override
    public void remove(GraphWithMatrixNode a, GraphWithMatrixNode b) {
        int idxA = nodes.indexOf(a);
        int idxB = nodes.indexOf(b);
        if (idxA != -1 && idxB != -1) {
            adjacencyMatrix[idxA][idxB] = 0;
            adjacencyMatrix[idxB][idxA] = 0;
        }
    }

    @Override
    public List<GraphWithMatrixNode> findAllRelatedNode(GraphWithMatrixNode a) {
        List<GraphWithMatrixNode> relatedNodes = new ArrayList<>();
        int idxA = nodes.indexOf(a);
        if (idxA != -1) {
            for (int i = 0; i < nodes.size(); i++) {
                if (adjacencyMatrix[idxA][i] == 1) {
                    relatedNodes.add(nodes.get(i));
                }
            }
        }
        return relatedNodes;
    }
}
