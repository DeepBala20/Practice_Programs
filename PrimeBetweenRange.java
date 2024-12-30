// 10 WAP to find a prime number between range (range should be entered by user).
import java.util.Scanner;
public class PrimeBetweenRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int n1 = sc.nextInt();
		System.out.println("Enter last Number");
		int n2 = sc.nextInt();
		int cnt = 0;
		System.out.println("prime numbers between "+n1+"and"+n2+"is : ");
		for(int i = n1;i<=n2;i++){
			for(int j = 2;j < i/2 ; j++){
				if(i % j == 0){
					cnt++;
					break;
				}
			}
			if(cnt == 0){
				System.out.print(i + " ");
			}
			cnt = 0;
		}
	}
}