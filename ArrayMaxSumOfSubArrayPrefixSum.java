public class ArrayMaxSumOfSubArrayPrefixSum {
    public static void prefixSumArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int[] prefSum = new int[arr.length];
        prefSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefSum[i] = prefSum[i-1] + arr[i]; 
        }

        for (int i = 0; i < prefSum.length; i++) {
            for (int j = i; j < prefSum.length; j++) {
                int sum;
                if (i == 0) {
                    sum = prefSum[j];
                } else {
                    sum = prefSum[j] - prefSum[i-1];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println("max sum ::: " + max);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 5, -1, 3 };
        prefixSumArray(arr); 
    }
}
