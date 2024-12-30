// 3 WAP to find a Factor of a given number (iterative and recursive)
import java.util.Scanner;

public class FactorIterativeAndRecursive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num ");
		int n = sc.nextInt();
		Factor f1 = new Factor();
		System.out.println("Factor's from iterative method: ");
		f1.iterativeFactor(n);
		System.out.println("Factor's from recursive method: ");
		f1.recursiveFactor(n,1);
	}
}

class Factor{
	void iterativeFactor(int n){
		for(int i=1 ;i<=n ; i++){
			if(n%i == 0){
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	void recursiveFactor(int n,int i){
		if(i>n){
			return;
		}
		if(n%i == 0){
			System.out.print(i);
			System.out.print(" ");
		}
		i++;
		recursiveFactor(n, i);
	}
}