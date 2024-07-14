package array;
import java.util.Arrays;

public class AllZeroAtLastUsingWhile {

	public static void main(String[] args) {
       
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};
        int n = arr.length;
        int j = 0;
        int i = 0;
        while (i < n) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
            i++;
        }

        // Fill the remaining positions with zeros
        while (j < n) {
            arr[j++] = 0;
        }

        // Print the result
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }

}
