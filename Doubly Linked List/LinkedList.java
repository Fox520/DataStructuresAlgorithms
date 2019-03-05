
public class LinkedList<AnyType> {

    private Node head;
    //makes it easier to add; rather than looping through all nodes
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(AnyType data) {
        if (tail == null) {
            head = new Node(data, head, head);
            //tail is head because only one node exists
            tail = head;
        } else {
            head = new Node(data, head, tail);
        }

        size++;
    }

    //redundant because add() will make node last
    //remove later
    public void add(AnyType data) {
        if (head != null) {
            //use as cursor
//            Node currentNode = head;
//            while (currentNode.getNext() != null) {
//                currentNode = currentNode.getNext();
//            }
//            //currentNode is now the last at this point
//            currentNode.setNext(new Node(data, null, currentNode));
//            tail = currentNode.getNext();
            Node newNode = new Node(data, null, tail.getPrev());
            tail.setNext(newNode);
            tail = newNode;
            size++;
        } else {
            addFirst(data);
        }

    }

    public void addLast(AnyType data) {
        if (head == null) {
            addFirst(data);
            //head = new Node(data, head);
        } else {
            //create a cursor/tracker
            Node currentNode = head;
            //last node next returns null
            while (currentNode.getNext() != null) {
                //set current node to node being pointed to
                currentNode = currentNode.getNext();
            }
            //currentNode should be the last since getNext() returns null
            currentNode.setNext(new Node(data, null, currentNode.getPrev()));
            tail = currentNode.getNext();//the newly created node
        }
        size++;
    }

    public int size() {
        //use global value
        return size;
    }

    //Returns a node ^-^
    public Node get(int index) {
        //more efficient than calling method everytime
        if (head == null) {
            throw new IndexOutOfBoundsException(index + "");
//            return null;
        }
        if ((index > size) || (index < 0)) {
            throw new IndexOutOfBoundsException(index + "");
//            System.err.println("Index not within size");
//            return null;
        }
        Node currentNode = head;
        int count = 0;
        while (count < size) {
            if (index == count) {
                return currentNode;
            } else {
                //go to next node
                currentNode = currentNode.getNext();
                count += 1;

            }
        }

        return currentNode;
    }

    public Node getLast() {
        if (head != null) {
            return tail;
        }
        return null;
    }

    //return Node at index max - 1
    public Node getBeforeLast() {
        if (head != null && tail != null) {
            return tail.getPrev();
        } else {
            return null;
        }
    }

    //unlink node at specified index by setting node before's next to preceeding
    //node to be removed
    //e.g. A -> B -> C to A -> C
    public void delete(int index) {
        if (head != null) {

            if (index > size || index < 0) {
                throw new IndexOutOfBoundsException(index + "");
            }
            //cant remove head with regular code [else]
            if (index == 0) {
                head = head.getNext();
                if (size == 1) {
                    tail = null;
                }

            } else {
                int count = 0;
                Node currentNode = head;//current node
                Node beforeNode = head; //node before current
                while (count < size()) {
                    if (count == index) {
                        //change beforeNode "next" to node of that after node being removed
                        //this is to skip currentNode
                        beforeNode.setNext(currentNode.getNext());
                        break;
                    } else {
                        beforeNode = currentNode;
                        currentNode = currentNode.getNext();
                        count += 1;
                    }
                }
                //remove Node from memory
                currentNode = null;
                //magic happens here
                //tail is updated when last node is removed
                //set tail to node before the tail
                if (index + 1 == size()) {
                    tail = beforeNode;
                }
            }
            //reduce by one
            size--;
//            System.out.println(beforeNode); this is valid
        } else {
            throw new IndexOutOfBoundsException(index + "");
        }
    }

    public void delete(AnyType data) {
        if (head != null) {
            int count = 0;
            Node currentNode = head;//current node
            Node beforeNode = head; //node before current
            while (count < size()) {
                if (currentNode.getData() == data) {
                    //change beforeNode next to node of that after node being removed
                    //this is to skip currentNode
                    beforeNode.setNext(currentNode.getNext());
                    break;
                } else {
                    beforeNode = currentNode;
                    currentNode = currentNode.getNext();
                    count += 1;
                }
            }
            //remove Node from memory
            currentNode = null;
            //reduce by one
            size--;
//            System.out.println(beforeNode); this is valid
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void insert(int index, AnyType data) {
        if ((index > -1) && (index < size)) {
            if (head != null) {
                int count = 0;
                //bug without this check
                if (index == 0) {
                    addFirst(data);
                } else {
                    Node beforeNode = head;
                    Node currentNode = head;
                    while (count < size) {
                        if (index == count) {
                            //new node to insert; point to current
                            Node t1 = new Node(data, currentNode, currentNode.getPrev());
                            beforeNode.setNext(t1);
                            break;
                        } else {
                            beforeNode = currentNode;
                            currentNode = currentNode.getNext();
                            count++;
                        }
                        size++;
                    }
                }
            } else {
                throw new IndexOutOfBoundsException(index + "");
            }
        } else {
            throw new IndexOutOfBoundsException(index + "");
        }
    }

    //it just works
    public void replace(int index, AnyType data) {
        if ((index > -1) && (index < size)) {
            if (head != null) {
                int count = 0;
                Node currentNode = head;
                Node beforeNode = head;
                while (count < size) {
                    if (count == index) {
                        //make beforeNode point to replacement
                        Node temp = new Node(data, currentNode.getNext(), currentNode.getPrev());
                        beforeNode.setNext(temp);
                        break;
                    } else {
                        beforeNode = currentNode;
                        currentNode = currentNode.getNext();
                        count += 1;
                    }
                }
                //remove Node from memory
                currentNode = null;
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
        //not found if gets here
        //return lower bound minus 1
        return -1;
    }

    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + ", tail=" + tail + '}';
    }

}
