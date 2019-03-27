
//using regular array to implement a stack

public class MyStack3 {

    private Object[] A;

    private int elementsLength;

    public MyStack3(int num) {
        A = new Object[num];
        elementsLength = 0;
    }

    public void push(Object data) {
        if (elementsLength == A.length) {
            throw new StackOverflowError();
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = data;
                elementsLength++;
                break;
            }
        }
    }

    public Object pop() {
        //if array is full
        if (elementsLength == A.length) {
            Object toReturn = A[A.length - 1];
            A[A.length - 1] = null;
            elementsLength--;
            return toReturn;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
//                should be last element
                if (i == 0) {
                    Object toReturn = A[i];
                    A[i] = null;
                    elementsLength--;
                    return toReturn;
                }

                Object toReturn = A[i - 1];
                A[i - 1] = null;
                elementsLength--;
                return toReturn;
            }
        }
        return null;
    }

    public int size() {
        return A.length;
    }

    @Override
    public String toString() {
        String temp = "";
        for(Object t: A){
            temp = t + "; "+ temp;
        }
        return temp;
    }
    
    
}
