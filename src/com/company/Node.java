package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Double value;
    private Boolean isVisited;
    private List<Edge> edges;
    private Node previousNode;

    public Node(String name) {
        this.name = name;
        this.value = null;
        this.isVisited = false;
        this.edges = new ArrayList<>();
        this.previousNode = null;
    }

    public void addEdge(Node node, Integer value) {
        //TODO pazec ar jau mazu tokias yra
        Edge edge = new Edge(this, node, value);
        edges.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setVisited() {
        this.isVisited = true;
    }

    public boolean getIsVisited() {
        return isVisited;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node node) {
        this.previousNode = node;
    }
}
