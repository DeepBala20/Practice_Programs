import java.util.*;
public class ArrayLargestAndSmallestElement {
    public static void scanArray( int[] arr , Scanner sc){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter "+ i + "th Element : ");
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray( int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(i!=0) System.out.print(" ,"); 
            System.out.print( + arr[i]);
        }
    }

    public static int maxInArray(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int minInArray(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        scanArray(arr , sc);
        printArray(arr);
        int max = maxInArray(arr);
        int min = minInArray(arr);
        System.out.println("your max and min is : "+ max +"AND"+ min);
    }
}
