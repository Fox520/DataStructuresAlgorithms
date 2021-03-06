/**
 *
 * @author Lone Wolf
 */

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        testQueue();
    }

    public static void testQueue(){
        Queue1 q = new Queue1();
        q.enqueue("first");
        q.enqueue("second");
        q.enqueue("third");
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        
    }
    
    public static void withArrayList() {
        MyStack<String> m = new MyStack();
        System.out.println(m.empty());
        m.push("hello");
        System.out.println(m);
        m.push("friend");
        m.push("buddy");
        System.out.println(m);
        System.out.println(m.peek());
        System.out.println(m.empty());
    }

    public static void withLinkedList() {
        MyStack2<String> m = new MyStack2<>();
        m.push("first");
        m.push("second");
        m.push("third");
        System.out.println(m.peek());
        System.out.println(m.empty());
        System.out.println(m);

    }

    public static void withClassicArray() {
        MyStack3 m3 = new MyStack3(3);
        m3.push("first");
        m3.push("second");
        m3.push("third");
        System.out.println(m3);
        System.out.println(m3.pop());
        System.out.println(m3.pop());
        System.out.println(m3.pop());
        System.out.println(m3.pop());
        System.out.println(m3.pop());
        System.out.println(m3);
    }

}
