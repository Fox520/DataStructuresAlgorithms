
public class Node <AnyType> {
    private AnyType data;
    private Node next;

    public AnyType getData() {
        return data;
    }

    public void setData(AnyType data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
    public Node(){
        
    }
    public Node(AnyType data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
    
    
    
}
