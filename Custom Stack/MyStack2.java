
import java.util.LinkedList;

//using LinkedList to implement a stack

public class MyStack2 <T>{
    
    private LinkedList<T> LL;
    
    public MyStack2(){
        LL = new LinkedList<>();
    }
    
    public void push(T data){
        LL.add(data);
    }
    
    public T pop(){
        if(!LL.isEmpty()){
            //because count starts at 0
            return LL.remove(LL.size()-1);
        }else{
            return null;
        }
    }
    
    public T peek(){
        if(!LL.isEmpty()){
            return LL.get(LL.size()-1);
        }else{
            return null;
        }
    }
    
    public boolean empty(){
        return LL.isEmpty();
    }

    @Override
    public String toString() {
        return "MyStack2{" + "LL=" + LL + '}';
    }
    
    
    
}
