/**
 *
 * @author Lone Wolf
 */

public class LinkedList<AnyType> {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void addFirst(AnyType data) {
		head = new Node(data, head);
	}

	public void addLast(AnyType data) {
		if (head != null) {
			// use as cursor
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			// currentNode is now the last at this point
			currentNode.setNext(new Node(data, null));

		} else {
			head = new Node(data, head);
		}
	}

	public void add(AnyType data) {
		if (head == null) {
			addFirst(data);
			// head = new Node(data, head);
		} else {
			// create a cursor/tracker
			Node currentNode = head;
			// last node next returns null
			while (currentNode.getNext() != null) {
				// set current node to node being pointed to
				currentNode = currentNode.getNext();
			}
			// currentNode should be the last since getNext() returns null
			currentNode.setNext(new Node(data, null));

		}
	}

	public int size() {
		int count = 0;
		if (head == null) {
			return count;
		}
		// head exists; might as well add it now
		count += 1;
		// use a cursor/tracker
		Node currentNode = head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
			count += 1;
		}

		return count;
	}

	// Returns a node ^-^
	public Node get(int index) {
		// more efficient than calling method everytime
		int currentSize = size();
		if (head == null) {
			return null;
		}
		if ((index > currentSize) || (index < 0)) {
			System.err.println("Index not within size");
			return null;
		}
		Node currentNode = head;
		int count = 0;
		while (count < currentSize) {
			if (index == count) {
				return currentNode;
			} else {
				// go to next node
				currentNode = currentNode.getNext();
				count += 1;

			}
		}

		return currentNode;
	}

	public Node getLast() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			return currentNode;
		}
		return null;
	}

	// unlink node at specified index by setting node before's next to preceeding
	// node to be removed
	// e.g. A -> B -> C to A -> C
	public void delete(int index) {
		if (head != null) {
			// cant remove head with regular code [else]
			if (index == 0) {
				head = head.getNext();

			} else {
				int count = 0;
				Node currentNode = head;// current node
				Node beforeNode = head; // node before current
				while (count < size()) {
					if (count == index) {
						// change before next to node of that after node being removed
						// this is to skip currentNode
						beforeNode.setNext(currentNode.getNext());
						break;
					} else {
						beforeNode = currentNode;
						currentNode = currentNode.getNext();
						count += 1;
					}
				}
			}
//            System.out.println(beforeNode); this is valid
		}
	}

	public void delete(AnyType data) {
		if (head != null) {

			int count = 0;
			Node currentNode = head;// current node
			Node beforeNode = head; // node before current
			while (count < size()) {
				if (currentNode.getData() == data) {
					// change before next to node of that after node being removed
					// this is to skip currentNode
					beforeNode.setNext(currentNode.getNext());
					break;
				} else {
					beforeNode = currentNode;
					currentNode = currentNode.getNext();
					count += 1;
				}
			}
//            System.out.println(beforeNode); this is valid
		}
	}

	public void insert(int index, AnyType data) {
		int currentSize = size();
		if ((index > -1) && (index < currentSize)) {
			if (head != null) {
				int count = 0;
				Node beforeNode = head;
				Node currentNode = head;
				while (count < currentSize) {
					if (index == count) {
						// new node to insert; point to current
						Node t1 = new Node(data, currentNode);
						beforeNode.setNext(t1);
						break;
					} else {
						beforeNode = currentNode;
						currentNode = currentNode.getNext();
						count++;
					}
				}
			}
		}

	}

	public void replace(int index, AnyType data) {
		int currentSize = size();
		if ((index > -1) && (index < currentSize)) {
			if (head != null) {
				int count = 0;
				Node currentNode = head;
				Node beforeNode = head;
				while (count < currentSize) {
					if (count == index) {
						// make beforeNode point to replacement
						Node temp = new Node(data, currentNode.getNext());
						beforeNode.setNext(temp);
						break;
					} else {
						beforeNode = currentNode;
						currentNode = currentNode.getNext();
						count += 1;
					}
				}
			}
		}
	}

	public int indexOf(AnyType data) {
		int index = 0;
		if (head != null) {
			Node currentNode = head;
			while (index < size()) {
				if (currentNode.getData() == data) {
					return index;
				}
				currentNode = currentNode.getNext();
				index += 1;
			}
		}
		// not found if gets here
		return -1;
	}

	@Override
	public String toString() {
		return "LinkedList{" + "head=" + head + '}';
	}

}
