// 8 WAP to find a total odd and total even digit of a given number.
import java.util.Scanner;
public class TotalEvenAndOddDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int cntOdd = 0,cntEven = 0;
		while(n!=0){
			int x = n%10;
			if(x % 2 == 0){
				cntEven ++;
			}
			else{
				cntOdd ++;
			}
			n = n/10;
		}
		System.out.println("total even digit are : "+cntEven);
		System.out.println("total odd digit are : "+cntOdd);		
	}
}

