package workshopWithManuSir;

public class Stack<T> {

	LinkList linklist;

	public Stack() {
		this.linklist = new LinkList<>();
	}

	public void push(T data) {
		linklist.add(data);
		System.out.println(data + "is pushed in stack" );
	}
}
