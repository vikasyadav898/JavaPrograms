package test1;

public class AllZeroAtLast {

	public static void moveZeroes(int[] arr) {
		 
        int len = arr.length;
        int count = 0;

        /*
          Traverse an array and first move all non-zeroes element
          at the front.
         */
        for(int i = 0; i < len; i++) {
            if(arr[i] != 0) {
               arr[count++] = arr[i];
             }
         }

         //Now, remaining element is zero.
         while(count < len) {
            arr[count++] = 0;
         }
        
         for(int j = 0; j < len; j++) {
            System.out.print(arr[j] + " ");
         }
    }


  public static void main(String[] args) {

       int arr[] = {1,0,2,3,0,0,0,2,0,0,7,14};
       moveZeroes(arr);
   }

}
