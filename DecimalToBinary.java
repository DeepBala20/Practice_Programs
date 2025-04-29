import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number");
        int n = sc.nextInt();

        int decimalNum = n ;
        int binaryNum = 0;
        int power = 0; 
        
        while(n>0){
            int digit = n%2;
            n = n/2;
            binaryNum = binaryNum + (int)(digit * Math.pow(10, power));
            power++;
        }
        System.out.println("binary of " + decimalNum + " is :" + binaryNum);
    }
}
