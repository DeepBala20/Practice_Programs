// 1 WAP to find a sum of even number into 1D array.
import java.util.Scanner;
public class SumOfEvenNumOfArray{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() ;
        int a[] = new int [n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter Element of array");
            a[i] = scan.nextInt();
        }
        int  sum = 0;
        for (int i =0; i<n ;i++){
            if(a[i]%2 == 0){
                sum = sum+a[i];
            }
        }    
        System.out.println("Sum of Even num is :"+sum);
    }
}