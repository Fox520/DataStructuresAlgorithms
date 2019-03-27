/**
 *
 * @author Lone Wolf
 */

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue1<T> {

    private ArrayList<T> elements;

    public Queue1() {
        elements = new ArrayList<>();
    }

    /**
     * @param data
     * adds the data to end of queue
     */
    public void enqueue(T data) {
        elements.add(data);
    }

    /**
     * returns queue head and remove it
     */
    public T dequeue() {
        if (!(elements.isEmpty())) {

            T toReturn = elements.get(0);
            elements.remove(0);
            return toReturn;

        } else {
            return null;
        }
    }

    /**
     * return head of queue but no removal
     */
    public T peek() {
        if (!(elements.isEmpty())) {
            return elements.get(0);
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * clears the queue
     */
    public void clear() {
        elements.clear();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return "Queue1{" + "elements=" + elements + '}';
    }

}
