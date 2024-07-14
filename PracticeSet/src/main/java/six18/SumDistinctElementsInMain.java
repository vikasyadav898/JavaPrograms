package six18;

public class SumDistinctElementsInMain {
	public static void main(String[] args) {
        int[] array = {5, 1, 8, 4, 9, 1, 5};
        int n = array.length;
        int sumUnique = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the number is a duplicate by comparing it to all previous elements
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Check if the number is a duplicate by comparing it to all subsequent elements
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the number is not a duplicate, add it to the sum
            if (!isDuplicate) {
                sumUnique += array[i];
            }
        }

        System.out.println("Sum of distinct elements: " + sumUnique);  // Output should be 27
    }

}
