import java.util.Scanner;

public class ArrayPairsAndSubArrays {
     public static void scanArray( int[] arr , Scanner sc){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter "+ i + "th Element : ");
            arr[i] = sc.nextInt();
        }
    }
    public static void printPairsInArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print(" ("+ arr[i] +","+ arr[j] +")");
            }
            System.out.println("");
        }
    }
    public static void printSubArraysInArray(int[] arr){
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] +", ");
                }
                ts++;
                System.out.println();   
            }
            System.out.println("");
        }
        System.out.println("Total SubArrays :" + ts) ;
    }
    public static void maxSumOfSubArrayInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                int sum = 0;
                for (int j = i; j <= k; j++) {               
                    sum = sum + arr[j];
                }           
                if(sum > max){
                    max = sum;
                }
            } 
        }        
        System.out.println("the max sum of sub arrays is :" +max);
    }
    public static void minSumOfSubArrayInArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i; k < arr.length; k++) {
                int sum = 0;
                for (int j = i; j <= k; j++) {               
                    sum = sum + arr[j];
                }
                if(sum < min){
                    min = sum;
                }
            }  
        }        
        System.out.println("the min sum of sub arrays is :" +min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element of Array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        scanArray(arr, sc);
        printPairsInArray(arr);
        printSubArraysInArray(arr);
        maxSumOfSubArrayInArray(arr);
        minSumOfSubArrayInArray(arr);

    }
}
