package array;

public class ZeroAtStartArray {

	public static void main(String[] args) {
        int arr[] = {0, 2, 5, 0, 9, 0, 3, 0, 3};
        int arr1[] = new int[arr.length];
        int count = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr1[count--] = arr[i];
            }
        }

        // The remaining elements in arr1 are already zeros

        // Print the result array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}


