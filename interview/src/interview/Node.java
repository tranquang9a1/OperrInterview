package interview;

public class Node {
	Node next;
	Integer data;
	
	public Node(Integer num) {
		this(num, null);
	}
	
	public Node(Integer data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Integer getData() {
        return this.data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
    
    public boolean hasNext() {
    	return this.next != null;
    }
    
}
