package sixEight;

public class ShiftAllZeroAtStart {

	public static void main(String[] args) {
        int arr[] = {0, 2, 5, 9, 0, 1, 0};

        System.out.println("Old Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Use two pointers technique to shift zeros to the start
        int j =arr.length-1; // Pointer for placing non-zero elements

        // Iterate through the array from the end to the beginning
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j--;
            }
        }

        // Fill the remaining elements at the start with zero
        for (int i = 0; i <= j; i++) {
            arr[i] = 0;
        }

        System.out.println("New Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
