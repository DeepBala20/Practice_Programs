// 7 WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)
import java.util.Scanner;
public class FiboIterativeAndRecursive{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of step of fibonacci series");
		int n = sc.nextInt();
		FibonacciIterative f1 = new FibonacciIterative(n);
		System.out.println("Iterative method of fibonacci");
		f1.printFiboIte();
		FibonacciRecursive f2 = new FibonacciRecursive();
		System.out.println("Recursive method of fibonacci");
		for(int i=0;i<n;i++){
			System.out.print(f2.RecFibo(i)+",");	
		}
		

	}
}

class FibonacciIterative{
	int n;
	FibonacciIterative(int n){
		this.n = n;
	}
	void printFiboIte(){	
		int n1=0,n2=1,fibo=0 ;
		System.out.print(n1 +","+ n2 +"," );
		for(int i = 0 ; i<n-2;i++){
			fibo = n1+n2;
			System.out.print(fibo+",");
			n1=n2;
			n2=fibo;
		}
	}
}
class FibonacciRecursive{
		int RecFibo(int n) {
		   if(n == 0){
		      return 0;
		   } 
		   else if(n == 1) {
		      return 1;
		   }
		   else {
		      return (RecFibo(n-1) + RecFibo(n-2));
		   }
		}	
}