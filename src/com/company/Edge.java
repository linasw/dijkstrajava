package com.company;

public class Edge {
    private Node firstNode;
    private Node secondNode;
    private Integer value;

    public Edge(Node firstNode, Node secondNode, Integer value) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.value = value;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getSecondNode() {
        return secondNode;
    }

    public Integer getValue() {
        return value;
    }
}
