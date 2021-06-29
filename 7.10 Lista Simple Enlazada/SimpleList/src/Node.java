public class Node {
    public int value;
    public Node next;
    public Node(int value) {
        // su codigo aqui
    	this.value = value;
    	this.next = null;
    }
    public int getNode() {
    	return value;
    }
    public void nextNode(Node nxNode) {
    	next = nxNode;
    }
}