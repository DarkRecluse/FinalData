

public class LinkedList {
	private DataItem first;

	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(DataItem newDataItem) {
		newDataItem.next = first;
		first = newDataItem;
	}
	
	public DataItem deleteFirst() {
		DataItem temp = first;
		first = first.next;
		
		return temp;
	}
	
	public void displayList() {
		System.out.println("List:");
		DataItem current = first;
		while( current != null ) {
			System.out.println(current);
			current = current.next;
		}
	}

}
