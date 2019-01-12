package com.company;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private Integer numberOfNodes;
    private List<Node> nodes;

    public Graph(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        this.nodes = new ArrayList<>(numberOfNodes);
    }

    public void PrintGraph() {
        for(Node node : nodes) {
            System.out.println("Node " + node.getName() + " has those edges: ");
            for(Edge edge : node.getEdges()) {
                System.out.println("\tName: " + edge.getSecondNode().getName() + " with value: " + edge.getValue());
            }
        }
    }

    public void AddNode(Node node) {
        //TODO check ar jau tokias name egzistuoja
        nodes.add(node);
    }

    public void AddEdge(Node firstNode, Node secondNode, Integer value) {
         if (nodes.contains(firstNode) && nodes.contains(secondNode)) {
             Node firstTemp = nodes.get(nodes.indexOf(firstNode));
             Node secondTemp = nodes.get(nodes.indexOf(secondNode));

             firstTemp.addEdge(secondTemp, value);
             secondTemp.addEdge(firstTemp, value);
         }
         else System.out.println("Ner tokiu nodu");
    }

    public void Dijsktra() {
        List<Node> notVisitedNodes = new ArrayList<>(nodes);
        List<Node> visitedNodes = new ArrayList<>(numberOfNodes);
        Node startingNode = notVisitedNodes.get(0);
        for (Node node : notVisitedNodes) {
            node.setValue(Double.POSITIVE_INFINITY);
        }
        startingNode.setValue(0.0);
        while (!notVisitedNodes.isEmpty()) {
            Node currentNode = GetSmallestValue(notVisitedNodes);
            notVisitedNodes.remove(currentNode);
            visitedNodes.add(currentNode);
            for (Edge edge : currentNode.getEdges()) {
                if (visitedNodes.contains(edge.getSecondNode())) continue;
                if (currentNode.getValue() + edge.getValue() < edge.getSecondNode().getValue()) {
                    edge.getSecondNode().setValue(currentNode.getValue() + edge.getValue());
                    edge.getSecondNode().setPreviousNode(currentNode);
                }
            }
        }

        for (Node node : visitedNodes) {
            if (node == visitedNodes.get(0)) continue;
            System.out.println("Distance from the source to node " + node.getName() + " is: " + node.getValue());
            System.out.println("\tHis previous node is: " + node.getPreviousNode().getName());
        }
    }

    private Node GetSmallestValue(List<Node> nodes) {
        Node smallestNode = nodes.get(0);
        for (Node node : nodes) {
            if (node.getValue() < smallestNode.getValue())
                smallestNode = node;
        }

        return smallestNode;
    }
}
