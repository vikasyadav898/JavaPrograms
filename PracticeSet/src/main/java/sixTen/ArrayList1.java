package sixTen;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
        // Creating a list using ArrayList
        List<String> fruits = new ArrayList<String>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println(fruits);
        //fruits.remove("Banana");
        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }
        boolean hasBanana= fruits.contains("Banana");
        System.out.println();
        System.out.println(hasBanana);
        
	}

}
