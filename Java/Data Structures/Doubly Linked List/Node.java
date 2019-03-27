/**
 *
 * @author Lone Wolf
 */

public class Node <AnyType> {
    private AnyType data;
    private Node next;
    private Node prev;
    

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

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
   
    public Node(){
        
    }
    public Node(AnyType data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
    
    
    
}
