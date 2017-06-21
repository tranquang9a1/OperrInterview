package interview;


public class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		tail = null;
		head = null;
		size = 0;
	}
	

	public void add(Integer num, int index) {

	    if (index > size) {
	        throw new IllegalArgumentException("The index [" + index
	                + "] is greater than the currentent size [" + size + "].");
	    } else {
	        Node temp = new Node(num);
	        Node current = getNode(index);

	        if (index == 0) {
	            temp.setNext(head);
	            head = temp;
	            tail = head;
	        } else {
	            temp.setNext(current.getNext());
	            current.setNext(temp);
	        }

	        if ( index == size - 1 ) {
	            tail.setNext(temp);
	            tail = temp;
	        }

	    }

	    size++;
	}

	public void add(Integer num) {
	    add(num, size);
	}
	
	public void remove(int index) {

	    if (index == 0) {
	        head = head.getNext();
	    } else {
	        getNode(index).setNext(getNode(index).getNext().getNext());
	    }

	    this.size--;
	}
	
	public void removeTail() {
		remove(size - 1);
	}
	
	
	
	public void removeElementGreatThanValue(Integer num) {
		Node node = head;
		int index = 0;
		while (node != null) {
			if (node.getData() > num) {
				remove(index);
				index--;
			}
			index++;
			node = node.getNext();
			
		}
	}
	
	private Node getNode(int index) {

	    if ( index > size ) {
	        throw new IllegalArgumentException("The index [" + index + "] is greater than the current size [" + size + "].");
	    }
	    Node current = head;
	    for (int i = 1; i < index; i++) {
	        current = current.getNext();
	    }

	    return current;
	}


	@Override
	public String toString() {
		String result = "";
        Node current = head;
        while(current != null){
            result += current.data + ", ";
            current = current.getNext();
        }
        return "List: " + result;
	}
}
