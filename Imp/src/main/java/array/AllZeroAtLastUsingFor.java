package array;
import java.util.Arrays;
public class AllZeroAtLastUsingFor {
	public static void main(String[] args) {
       
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

       
        
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

        
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}


