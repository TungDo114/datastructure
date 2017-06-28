package tungdo.mlinkedlist;

public class MyLinkedList<E extends Comparable<? super E>> {
	protected Node<E> start;
	protected Node<E> end;
	protected int size;

	public MyLinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void appendFirst(E val) {
		Node<E> newNode = new Node<E>(val, null);
		size++;
		if (start == null) {
			start = newNode;
			end = start;
		} else {
			newNode.nextNode = start;
			start = newNode;
		}
	}

	public void appendLast(E val) {
		Node<E> newNode = new Node<E>(val, null);
		size++;
		if (start == null) {
			start = newNode;
			end = start;
		} else {
			end.nextNode = newNode;
			end = newNode;
		}
	}

	public void appendAt(E val, int pos) {

		if (pos == 0) {
			appendFirst(val);
			return;
		}

		if (pos == size - 1) {
			appendLast(val);
			return;
		}

		Node<E> newNode = new Node<E>(val, null);
		Node<E> currentNode = start;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node<E> tmpNode = currentNode.nextNode;
				currentNode.nextNode = newNode;
				newNode.nextNode = tmpNode;
				size++;
				break;
			}
			currentNode = currentNode.nextNode;
		}
	}

	public void removeAll(E val) {
		Node<E> currentNode = start;
		int position = 0;
		while (position < size) {
			if (currentNode.data.compareTo(val) > 0) {
				removeAt(position);
				position--;
			}
			currentNode = currentNode.nextNode;
			position++;
		}
	}

	public void removeAt(int pos) {
		if (pos < 0 || pos > size)
			return;

		if (start == null)
			return;

		if (pos == 0) {
			start = start.nextNode;
			size--;
			return;
		}

		if (pos == size - 1) {
			Node<E> current = start;
			Node<E> tmp = start;
			while (current != end) {
				tmp = current;
				current = current.nextNode;
			}
			end = tmp;
			end.nextNode = null;
			size--;
			return;
		}

		Node<E> currentNode = start;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node<E> tmp = currentNode.nextNode.nextNode;
				currentNode.nextNode = tmp;
				break;
			}
			currentNode = currentNode.nextNode;
		}
		size--;
	}

	@Override
	public String toString() {
		if (start == null)
			return "[]";
		StringBuilder sb = new StringBuilder();
		String prefix = "";
		Node<E> currentNode = start;
		int count = 0;
		while (count != size) {
			sb.append(prefix);
			prefix = ",";
			sb.append(currentNode.data);
			currentNode = currentNode.nextNode;
			count++;
		}
		return sb.toString();
	}

	class Node<T> {
		protected T data;
		protected Node<T> nextNode;

		public Node(T data, Node<T> nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
	}
}
