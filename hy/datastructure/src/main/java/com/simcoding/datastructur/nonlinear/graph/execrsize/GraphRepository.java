package com.simcoding.datastructur.nonlinear.graph.execrsize;

import java.util.List;

public interface GraphRepository<V> {

    void connectNode(V to, V target);
    void removeConnection(V to, V target);
    List<V> FindAllRelatedNode(V target);

}
