package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Graph graph = new Graph(6);
//	    Node nodeA = new Node("A");
//	    Node nodeB = new Node("B");
//	    Node nodeC = new Node("C");
//	    graph.AddNode(nodeA);
//	    graph.AddNode(nodeB);
//	    graph.AddNode(nodeC);
//	    graph.AddEdge(nodeA, nodeB, 5);
//	    graph.AddEdge(nodeB, nodeC, 10);
		Node nodeA = new Node("A");
	    Node nodeB = new Node("B");
	    Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");

		graph.AddNode(nodeA);
		graph.AddNode(nodeB);
		graph.AddNode(nodeC);
		graph.AddNode(nodeD);
		graph.AddNode(nodeE);
		graph.AddNode(nodeF);

		graph.AddEdge(nodeA, nodeB, 14);
		graph.AddEdge(nodeA, nodeC, 9);
		graph.AddEdge(nodeA, nodeD, 7);
		graph.AddEdge(nodeE, nodeC, 11);
		graph.AddEdge(nodeE, nodeD, 15);
		graph.AddEdge(nodeF, nodeB, 9);
		graph.AddEdge(nodeF, nodeE, 6);
		graph.AddEdge(nodeC, nodeB, 2);
		graph.AddEdge(nodeC, nodeD, 10);

	    graph.PrintGraph();
		System.out.println();
	    graph.Dijsktra();
    }
}
