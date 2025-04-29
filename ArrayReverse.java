import java.util.Scanner;
public class ArrayReverse {

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
    public static void reverse(int[] arr){
        int first=0,last=arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element of Array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        scanArray(arr, sc);
        reverse(arr);
        printArray(arr);
    }
}
