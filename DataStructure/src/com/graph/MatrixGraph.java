package com.graph;

public class MatrixGraph 
{
	int V;
	int E;
	int adjMatrix[][];
public MatrixGraph(int nodes) {
	this.V=nodes;
	this.E=0;
	this.adjMatrix=new int[nodes][nodes];
	
}
private void addEdge(int u,int v)
{
	adjMatrix[u][v]=1;
	adjMatrix[v][u]=1;
	E++;
}
public String toString()
{
	StringBuilder sb=new StringBuilder();
	sb.append(V+" vertices, "+E+"edges "+"\n");
	for (int i = 0; i < V; i++) {
		sb.append(i+": ");
		for (int w : adjMatrix[i]) {
			sb.append(w+": ");	
		}
		sb.append("\n");
	}
return	sb.toString();
}
public static void main(String[] args) {
	MatrixGraph graph=new MatrixGraph(4);
	graph.addEdge(0, 1);
	graph.addEdge(1, 2);
	graph.addEdge(2, 3);
	graph.addEdge(3, 0);
	System.out.println(graph);
}
}
