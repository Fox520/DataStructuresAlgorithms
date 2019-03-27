/**
 *
 * @author Lone Wolf
 */

import java.util.ArrayList;

//using ArrayList to implement a stack
public class MyStack <T> {
    
    private ArrayList<T> AL;
    
    public MyStack(){
        AL = new ArrayList<T>();
    }
    
    public void push(T data){
        AL.add(data);
    }
    
    public T pop(){
        if(!(AL.isEmpty())){
            return AL.remove(AL.size() - 1);
        }else{
            return null;
        }
    }
    
    public T peek(){
        if(!(AL.isEmpty())){
            return AL.get(AL.size() - 1);
        }else{
            return null;
        }
    }
    
    public boolean empty(){
        return AL.isEmpty();
    }

    @Override
    public String toString() {
        return "MyStack{" + "AL=" + AL + '}';
    }
    
    
    
}
