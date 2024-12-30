// 4 WAP to find a factorial of a given integer (iterative and recursive)
import java.util.Scanner;

public class FactorialIterativeAndRecursive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num ");
		int n = sc.nextInt();
		Factorial f1 = new Factorial();
		int a = f1.iterativeFactorial(n);
		System.out.println("Factorial from iterative method: "+a);
		int b = f1.recursiveFactorial(n);
		System.out.println("Factorial from recursive method: "+b);
	}
}

class Factorial{
	int iterativeFactorial(int n){
		int fact =1;
		for(int i=1 ;i<=n ; i++){
			fact = fact * i;
		}
		return fact;
	}

	int recursiveFactorial(int n){
		int fact = n;
		if(n == 1){
			return 1;
		}
		else{
			return fact * recursiveFactorial(n-1);
		}
	}
}