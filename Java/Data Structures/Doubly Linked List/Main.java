
public class Main {

    public static void main(String[] args) {
        boolean test = false;
        //whether to run tests or not
        if (test) {
            testCases();
        } else {
            LinkedList<String> LL = new LinkedList<>();
            LL.add("Bike");
            LL.add("Plane");
            LL.add("Car");
            LL.add("Boat");
            LL.add("Motorbike");
            System.out.println(LL);
            LL.delete(4);
            System.out.println(LL);
            System.exit(0);
            System.out.println(LL);
            System.out.println("Size: " + LL.size());
            System.out.println(LL.get(3));
//        //[Motorbike, Plane, Car, Boat]
//        //[Motorbike, Plane, Boat]
            LL.delete(2);
            System.out.println(LL);
//        // [Motorbike, (Horse), Plane, Boat]
            LL.insert(1, "Horse");
            System.out.println(LL);
//        //[Motorbike, Horse, Plane, Boat]
//        //[Motorbike, (Bicycle), Plane, Boat]
            LL.replace(1, "Bicycle");
            System.out.println(LL);
//        //[Motorbike, Bicycle, Plane, Boat]
            //[Motorbike, Plane, Boat]
            LL.delete("Bicycle");
            System.out.println(LL);
            System.out.println(LL.indexOf("Plane"));
            LL.addLast("Donkey");
            System.out.println(LL);
            //get last node
            System.out.println(LL.getLast());
            LL.addLast("Last One");
            System.out.println(LL);
            //last node
            System.out.println(LL.getLast());
            //node before last
            System.out.println(LL.getBeforeLast());
        }

    }

    public static void testCases() {
        LinkedList<String> myList = new LinkedList<>();
        assert myList.size() == 0;

        //ensure an exception is thrown if we get get
        //from an empty list
        boolean ex = false;
        try {
            myList.get(0);
        } catch (IndexOutOfBoundsException e) {
            assert e.getMessage().equals("0");
            ex = true;
        }
        assert ex;

        //ensure we can add an element to the empty list
        //and that the list size increases by one
        myList.addFirst("Windhoek");
        assert myList.get(0).getData() == "Windhoek";
        assert myList.size() == 1;

        //ensure we can add an element to the head of the list
        //ensure the get method returns the correct element
        //ensure the size increments
        myList.addFirst("Swakopmund");
        assert myList.get(0).getData() == "Swakopmund";
        assert myList.size() == 2;

        //ensure we can add an element to the tail of the list
        //ensure the get method returns the correct element
        //ensure the size increments
        myList.add("Walvis Bay");
        assert myList.get(2).getData() == "Walvis Bay";
        assert myList.size() == 3;

        //ensure an exception is thrown if we try to insert to a position indx
        //that does not exist
        ex = false;
        try {
            myList.insert(100, "Eros");
        } catch (IndexOutOfBoundsException e) {
            assert e.getMessage().equals("100");
            ex = true;
        }
        assert ex;

        //ensure we can insert an element at the head of the list
        //ensure the get method returns the correct element
        //ensure the size increments
        myList.insert(0, "Okahandja");
        assert myList.get(0).getData() == "Okahandja";
        assert myList.size() == 4;

        //ensure we can insert an element in the middle of the list
        //ensure the get method returns the correct element
        //ensure the size increments
        myList.insert(2, "Avis");
        assert myList.get(2).getData() == "Avis";
        assert myList.size() == 5;

        //ensure an exception is thrown if we try to delete from a 
        //position indx that does not exist
        ex = false;
        try {
            myList.delete(100);
        } catch (IndexOutOfBoundsException e) {
            assert e.getMessage().equals("100");
            ex = true;
        }
        assert ex;

        //delete test case won't work because
        //nothing is returned

    }

}
