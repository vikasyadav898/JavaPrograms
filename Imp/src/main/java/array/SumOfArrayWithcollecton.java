package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfArrayWithcollecton {

	 public static void main(String[] args) {
	        // Define an array
	        Integer[] array = {1, 2, 2, 3, 4, 4, 5};
	        int sum=0;
	        
	        // Convert array to a list
	        List<Integer> list = Arrays.asList(array);
	        
	        // Convert list to a set
	        Set<Integer> set = new HashSet<>(list);
	        for(int num1:set)
	        {
	        	sum+=num1;
	        }
	        
	        // Print the set
	        System.out.println("Set: " + sum);
	    }

}
