package array;

public class FindMaxIncresingAraay {

	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 4, 3, 5, 6, 7, 8, 9, 1, 2, 3, 4};
	        int n = arr.length;
	        int maxLength = 1;
	        int currentLength = 1;
	        int startIndex = 0;
	        int maxStartIndex = 0;

	        for (int i = 1; i < n; i++) {
	            if (arr[i] > arr[i - 1]) {
	                currentLength++;
	            } else {
	                if (currentLength > maxLength) {
	                    maxLength = currentLength;
	                    maxStartIndex = startIndex;
	                }
	                currentLength = 1;
	                startIndex = i;
	            }
	        }
	        if (currentLength > maxLength) {
	            maxLength = currentLength;
	            maxStartIndex = startIndex;
	        }

	        System.out.print("The longest increasing subarray is: ");
	        for (int i = maxStartIndex; i < maxStartIndex + maxLength; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

}
