//5. WAP to find a summation of a digit of a given number. (Iterative and recursive) 
import java.util.Scanner;
public class SumOfDigitIterativeAndRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        SumIterative s1 = new SumIterative(n);
        s1.printSum();
        SumRecursive s2 = new SumRecursive();
        int sum = s2.RecSum(n);
        System.out.println("Sum of digit of number is "+sum);
    }
}

class SumIterative{
    int n,x,sum;
    SumIterative(int n){
        this.n = n;
    }
    void printSum(){
        while (n!=0){
            x = n%10;
            n = n/10;
            sum = sum+x;
        }
        System.out.println("Sum of digit of number is "+sum);
    }
}

class SumRecursive{
    int x,sum;
    int RecSum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10 + RecSum(n/10);
        }
    }
}