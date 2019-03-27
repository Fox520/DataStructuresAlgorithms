/**
 *
 * @author Lone Wolf
 */
public class Main {

    public static void main(String[] args) {
        //require sort
        System.out.println("Binary Search");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 11};
        System.out.println("Output: " + binarySearch(3, array));
        System.out.println("");

        //does not require sort
        System.out.println("Linear Search");
        int[] linearArray = {2, 69, 10, 75, 16, 58};
        System.out.println("Output: " + linearSearch(69, linearArray));
        System.out.println("");

        System.out.println("Reverse Linear Search");
        int[] reverseArray = {2, 69, 10, 75, 16, 58};
        System.out.println("Output: " + reverseLinearSearch(69, reverseArray));
    }

    public static boolean binarySearch(int value, int[] array) {
        int leftPos = 0;
        int rightPos = array.length - 1; //to stick within bounds
        int breakPoint = 0;
        while (true) {
            
            if(breakPoint > array.length){
                return false;
            }
            
            int midPosition = (int) (leftPos + rightPos) / 2;
            if (array[midPosition] == value) {
                //System.out.println("Found it");
                return true;
            } else if (array[midPosition] > value) {
                // [1,2,3,4,5,6,7]
                //midVal (4) is greater than searchValue (3)
                //so reduce rightPos to below mid pos
                rightPos = midPosition - 1;
            } else if (array[midPosition] < value) {
                leftPos = midPosition + 1;
            }
        }
    }

    public static boolean linearSearch(int value, int[] array) {
        //loopCounter is to compare reverse search with normal
//        int loopCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
//                System.out.println(loopCounter);
                return true;
            }
//            loopCounter++;
        }
        return false;
    }

    public static boolean reverseLinearSearch(int value, int[] array) {
        //loopCounter is to compare reverse search with normal
//        int loopCounter = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == value) {
//                System.out.println(loopCounter);
                return true;
            }
//            loopCounter++;
        }
        return false;
    }
}
