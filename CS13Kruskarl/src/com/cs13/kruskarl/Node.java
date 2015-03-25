package com.cs13.kruskarl;

public class Node {

    private Node parent;
    private String alias;
    private boolean isRoot = false;
    private boolean visited = false;

    /**
     * Ein Knoten mit folgenden Funktionen/Eigenschaften: - kennt Elter-Knoten -
     * kennt duch Iteration durch die Elterknoten den Wurzelknoten - kann
     * entweder Root sein oder nicht - kann entweder schon besucht sein oder
     * nicht
     * 
     * @author Sebastian Wolff
     */
    public Node(String name) {
	alias = name;
	parent = this;
    }

    public Node getRootNode() {

	Node root;

	if (this.isRoot() == true) {
	    root = this;
	} else {
	    root = parent.getRootNode();
	}
	return root;
    }

    public void visit() {
	visited = true;
    }

    public void setParent(Node node) {
	parent = node;
	this.isRoot = false;
    }

    public void setRoot(boolean root) {
	isRoot = root;
    }

    public String getName() {
	return alias;
    }

    public Node getParent() {
	return parent;
    }

    public boolean isRoot() {
	return isRoot;
    }

    public boolean isVisited() {
	return visited;
    }

}
