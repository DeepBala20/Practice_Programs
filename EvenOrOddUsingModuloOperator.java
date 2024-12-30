// 9 WAP to find whether a number is Odd or Even without using a % operator. 
import java.util.Scanner;
public class EvenOrOddUsingModuloOperator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		EvenOddByLoop(n);
		EvenOddByDivMulti(n);
	}
	static void EvenOddByLoop(int n){
		boolean isEven = true;
		for(int i = 1;i<=n ; i++){
			isEven = !isEven;
		}
		if(isEven){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is Odd");
		}
	}
	static void EvenOddByDivMulti(int n){
		int temp = n;
		if(temp == ((n/2)*2)){
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
}