package interview;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(1);
		linkedlist.add(3);
		linkedlist.add(2);
		linkedlist.add(6);
		linkedlist.add(102);
		linkedlist.add(4);
		linkedlist.add(7);
		linkedlist.add(81);
		linkedlist.add(4);
		linkedlist.add(1324);
		System.out.println("===BEFORE===");
		System.out.println(linkedlist);
		System.out.println("===APPEND VALUE 4444 ===");
		linkedlist.add(4444);
		System.out.println(linkedlist);
		System.out.println("===REMOVE TAIL===");
		linkedlist.removeTail();
		System.out.println(linkedlist);
		System.out.println("===REMOVE VALUE GREATER THAN 100 ===");
		linkedlist.removeElementGreatThanValue(100);
		System.out.println(linkedlist);
		
	}
}
