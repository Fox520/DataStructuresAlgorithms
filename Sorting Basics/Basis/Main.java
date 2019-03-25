public class Main{
    public static void main(String[] args) {
        String testMethod = "selection";
        switch(testMethod){
            case "selection":
                //testing selection sort
                int[] unsortedSelection = {5, 3, 1, 2, 4, 10, 0};
                for (int A : selectionSort(unsortedSelection)) {
                    System.out.print(A + " ");
                }
                break;

            case "insertion":
                //testing insertion sort
                int[] unsortedInsertion = {5, 3, 1, 2, 4, 10, 0};
                for (int A : sortInsert(unsortedInsertion)) {
                    System.out.print(A + " ");
                }
                break;
        }
        
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length - 1;
        //no need to sort array with 1 item
        //already trivially sorted
        if (n <= 0) {
            return array;
        } else {
            //i is the furthest left unsorted element
            for (int i = 0; i < n; i++) {
                int min = i;
                //the i+1 & <= is important
                //as we comparing starting from the elements ahead of i
                //the <= is to reach the end of the array
                for (int j = i + 1; j <= n; j++) {
                    //find min index
                    if (array[j] > array[min]) {
                        min = j;
                    }
                }
                //swap if min is not same as i
                if(i != min){
                    int temp = array[i];
                    array[i] = array[min];
                    array[min] = temp;
                }else{
                    // System.out.println("i ["+i+"] == min ["+min+"]");
                }
                
            }
            return array;
        }
    }

    //followed pseudocode on wikipedia (https://en.wikipedia.org/wiki/Insertion_sort)
    public static int[] sortInsert(int[] A) {
        //0 is trivially sorted
        int i = 1;
        while (i < A.length) {
            int j = i;
            while (j > 0 && A[j - 1] > A[j]) {
                int temp = A[j - 1];
                A[j - 1] = A[j];
                A[j] = temp;
                j--;
            }
            i++;
        }
        return A;
    }
}