package application.model;

public class HikingHistorydata {

	private Node h;

	public HikingHistorydata() {
		h = new Node(); // this we made a dummy node
		h.l = null; // and set the value of dummy node to null
		h.next = null;
	}

	public boolean insert(HikingHistory newListing) {
		Node n = new Node();

		Node q = h;// This will point to the duumy node ;
		Node p = h.next;// this will point to the first node of the list ;

		if (n == null)

			return false;// this will check if n has some value or not
		else {
			while (p != null && p.l.compareTo(newListing.getTrail_name()) < 0) {// this line will help to check the the new
																			// insert string is biiger or smaller then
																			// the old one

				q = p;// This code help to trail in case for last or first node.

				p = p.next;// this code will help to go next node in the list

			}

			n.next = p;
			if (p != null)// this will check for special casse if p is null in starting.
				p.back = n;
			q.next = n;

			n.back = q;

			n.l = newListing.deepcopy();
			return true;

		}
	}

	public HikingHistory fetch(String targetKey)

	{
		Node q = h;// this will point to the dummy node
		Node p = h.next;// this will point towars the first the node of linked list

		while (p != null && (p.l.compareTo(targetKey) < 0)) {
			q = p;// this will help to trail q and p till end of the node
			p = p.next;
		}
		if (p != null && (p.l.compareTo(targetKey) == 0))
			return p.l.deepcopy();
		else
			return null;
	}

	public boolean delete(String targetKey) {
		Node q = h;
		Node p = h.next;

		while (p != null && (p.l.compareTo(targetKey) < 0)) {

			q = p;
			p = p.next;
			if (p != null)// special case;
				p.back = q;
		}
		if (p != null && (p.l.compareTo(targetKey) == 0)) {
			q.next = p.next;// this will help to jump the node which got delete from linked list
			return true;
		} else
			return false;
	}

	public boolean update(String targetKey, HikingHistory newListing) {
		if (delete(targetKey) == false)
			return false;
		else if (insert(newListing) == false)
			return false;
		return true;
	}

	public class Node {
		private HikingHistory l;
		private Node next;
		private Node back;

		public Node() {
		}
	}

	public String toString() {
		String r = "";
		Node next = h.next;
		while (next != null) {
			r += next.l + "\n";
			next = next.next;
		}
		return r;
	}

	public HikingHistory[]toArray(){ // this method
		
		int size =0;
		
		Node next = h.next;
		while (next != null) {
			
			size++;
			
			next = next.next;
		}
		HikingHistory[]history = new HikingHistory[size];
		
		 next = h.next;
		  size =0;
		  
		while (next != null) {
			
			history[size++] = next.l;
			
			next = next.next;
		}
		return history;
		
	}
}
