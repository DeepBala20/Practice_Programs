public class ArrayMaxSumOfSubArrayKadaneAlgo {
    public static void kadaneAlgo(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println("Max ::: "+max);
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(arr);
    }
}

//for all negative numbers...

// public class ArrayMaxSumOfSubArrayKadaneAlgo {
//     public static void kadaneAlgo(int[] arr){
//         int max = arr[0];
//         int sum = arr[0];
        
//         for (int i = 1; i < arr.length; i++) {
//             sum = Math.max(arr[i], sum + arr[i]);
//             max = Math.max(max, sum);
//         }
//         System.out.println("Max ::: " + max);
//     }

//     public static void main(String[] args) {
//         int[] arr = {-3, -2, 5, -4, 4, -1, -2, 3};
//         kadaneAlgo(arr); // Output: Max ::: 6  (from subarray: [5, -4, 4, -1, -2, 3])
//     }
// }