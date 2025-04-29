import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number");
        int n = sc.nextInt();

        int binaryNum = n ;
        int decimalNum = 0;
        int power = 0; 
        
        while(n>0){
            int lastDigit = n%10;
            n = n/10;                  
            decimalNum = decimalNum + (int)(lastDigit * Math.pow(2, power));
            power++;
        }
        System.out.println("decimal of " + binaryNum + " is :" + decimalNum);
    }
}
