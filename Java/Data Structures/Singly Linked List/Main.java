/**
 *
 * @author Lone Wolf
 */

public class Main {

    
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<>();
        LL.add("Plane");
        LL.add("Car");
        LL.add("Boat");
        System.out.println(LL);
        LL.addFirst("Motorbike");
        System.out.println(LL);
        
        System.out.println("Size: "+LL.size());
        
        System.out.println(LL.get(3));
        

        //[Motorbike, Plane, Car, Boat]
        //[Motorbike, Plane, Boat]
        LL.delete(2);
        System.out.println(LL);
        
        // [Motorbike, (Horse), Plane, Boat]
        LL.insert(1, "Horse");
        System.out.println(LL);
        
        //[Motorbike, Horse, Plane, Boat]
        //[Motorbike, (Bicycle), Plane, Boat]
        LL.replace(1, "Bicycle");
        System.out.println(LL);
        
        //[Motorbike, Bicycle, Plane, Boat]
        //[Motorbike, Plane, Boat]
        LL.delete("Bicycle");
        System.out.println(LL);
        
        System.out.println(LL.indexOf("Plane"));
        
        LL.addLast("Donkey");
        System.out.println(LL);
        
        //get last node
        System.out.println(LL.getLast());
        
    }
    
}
