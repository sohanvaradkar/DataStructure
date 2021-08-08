package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class ListGraph {
	
	int V;
	int E;
	LinkedList<Integer>[] adj;
	public ListGraph(int nodes) {
		this.V=nodes;
		this.E=0;
		this.adj=new LinkedList[nodes];
		for (int i = 0; i < V; i++) {
			adj[i]=new LinkedList<>();
		}
		
	}
	private void addEdge(int u,int v)
	{
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		ListGraph g=new ListGraph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		// 4
		System.out.println(g);

	}

}
