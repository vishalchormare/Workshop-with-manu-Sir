package workshopWithManuSir;

public class LinkList<T> {

	Node<T> head;
	Node<T> tail;

	public void add(T data) {
		Node<T> addNode = new Node<>(data);
		if (head == null) {
			head = addNode;
			tail = addNode;
		} else {
//			tail.next=addNode;
//			tail=tail.next;

			addNode.next = head;
			head = addNode;
		}
	}

	public void display() {

		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data + "-->");
			temp = temp.next;

		}
	}
}
