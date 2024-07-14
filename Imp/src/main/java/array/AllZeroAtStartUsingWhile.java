package array;
import java.util.Arrays;
public class AllZeroAtStartUsingWhile {
	public static void main(String[] args) {
        
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

        
        int n = arr.length;
        int j = n - 1; 
        int i = n - 1;
        while (i >= 0) {
            if (arr[i] != 0) {
                arr[j--] = arr[i];
            }
            i--;
        }

       
        while (j >= 0) {
            arr[j--] = 0;
        }

       
        System.out.println("Array after moving zeros to the start: " + Arrays.toString(arr));
    }

}
