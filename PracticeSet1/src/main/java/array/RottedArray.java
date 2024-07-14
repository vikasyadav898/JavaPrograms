package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RottedArray {

	

	    public static void main(String[] args) {
	        int arr[] = {1, 2, 3, 4, 6, 7, 8};
	        int startElement = 4;
	        int n = arr.length;
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        // Convert array to ArrayList
	        for (int num : arr) {
	            list.add(num);
	        }
	        
	        // Find the index of the startElement
	        int startIndex = list.indexOf(startElement);
	        System.out.println(startIndex);
	        
	        
	        Collections.rotate(list, -startIndex);
	        
	        int[] rotatedArray = new int[n];
	        for (int i = 0; i < n; i++) {
	            rotatedArray[i] = list.get(i);
	        }
	        System.out.println(Arrays.toString(rotatedArray));
	    }
	}


