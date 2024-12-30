// 11 WAP to find weather given number is Armstrong number is not. 
import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		double arm=0;
		int temp=n,temp2=1;
		int digit = Integer.toString(temp).length(); 
		while(temp!=0){
			int x = temp%10;
			arm = arm+(Math.pow(x,digit));
			temp = temp/10;
		}
		if(arm == n){
			System.out.println("num is armstrong");
		}
		else{
			System.out.println("num is not armstrong");
		}
	}
}