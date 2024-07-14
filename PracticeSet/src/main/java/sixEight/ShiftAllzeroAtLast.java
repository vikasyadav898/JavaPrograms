package sixEight;

public class ShiftAllzeroAtLast {

	public static void main(String[] args) {
        int arr[] = {0 , 2, 5, 9, 0, 1, 0};

        System.out.println("Old Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Use two pointers technique to shift zeros
        int j = 0; // Pointer for placing non-zero elements

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j++;
            }
        }

        System.out.println("New Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
