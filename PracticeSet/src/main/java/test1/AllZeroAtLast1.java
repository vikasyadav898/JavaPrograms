package test1;

public class AllZeroAtLast1 {
	public static void main(String[] args) {
        int[] inputArray = {1, 0, 14, 6, 0, 5, 0, 9};
        swapZerosToFront(inputArray);

        // Print the output array
        System.out.print("Output: {");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void swapZerosToFront(int[] array) {
        int n = array.length;
        int j = n - 1;

        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[j] = array[i];
                j--;
            }
        }

        // Fill remaining positions with zeros
        while (j >= 0) {
            array[j] = 0;
            j--;
        }
    }

}
