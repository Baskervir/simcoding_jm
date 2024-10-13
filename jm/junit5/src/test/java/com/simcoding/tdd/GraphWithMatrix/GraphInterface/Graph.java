package GraphInterface;

import GraphWithNode.GraphWithMatrixNode;

import java.util.List;

public interface Graph {
    void add(GraphWithMatrixNode a, GraphWithMatrixNode b);
    void remove(GraphWithMatrixNode a, GraphWithMatrixNode b);
    List<GraphWithMatrixNode> findAllRelatedNode(GraphWithMatrixNode a);
}
