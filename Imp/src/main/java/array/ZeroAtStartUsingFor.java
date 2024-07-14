package array;
import java.util.Arrays;
public class ZeroAtStartUsingFor {
	public static void main(String[] args) {
       
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

        
 
        int j = arr.length - 1; 
        for (int i = arr.length- 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j--] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            arr[i] = 0;
        }

     
        System.out.println("Array after moving zeros to the start: " + Arrays.toString(arr));
    }

}
