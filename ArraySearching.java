import java.util.*;
public class ArraySearching {

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static int binarySearch(int[] arr, int search) {
        // sortArray(arr); // optional, if array not sorted beforehand
    
        int first = 0;
        int last = arr.length - 1;
    
        while (first <= last) {
            int mid = (first + last) / 2;
            
            if (arr[mid] == search) {
                return mid;
            } else if (search < arr[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
    
        return -1; // not found
    }

    public static int linearSearch(int[] arr , int search){
        int key = -1;
        
        for(int i=0; i<arr.length ; i++){
            if(arr[i] == search){
                key = i;
                break;
            }
        }

        return key;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter algorithm to Search");
        System.out.println("1. for Linear Search ");
        System.out.println("2. for Binary Search (if you choose this then pls enter the sorted array)");
        int choice = sc.nextInt();
        System.out.println("enter N (size of array):");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i =0 ; i < arr.length ; i++){
            System.out.println("Enter "+ i + "th Element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element to search : ");
        int search = sc.nextInt();

        

        if(choice == 1){
            System.out.println("Selected algo is LinearSearch ");
            int res = linearSearch(arr,search);
            if(res != -1 ){
                System.out.println("Your Element is At " + res + "th Index");
            }
            else{
                System.out.println("Your Element is not found in Array");
            }
        }
        else if(choice == 2){
            System.out.println("Selected algo is BinarySearch ");
            int res = binarySearch(arr,search);
            if(res != -1 ){
                System.out.println("Your Element is At " + res + "th Index");
            }
            else{
                System.out.println("Your Element is not found in Array");
            }
        }
        else{
            System.out.println("please choice proper algorithm..");
        }

    }
}
