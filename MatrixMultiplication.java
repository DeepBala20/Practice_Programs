// 13 WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user) 
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m1 and n1 for matrix 1:");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int a[][] = new int[m1][n1];
        for (int i=0;i<m1 ;i++ ) {
            for (int j =0;j<n1 ;j++ ) {
                System.out.println("Enter Element's of matrix 1:");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter m2 and n2 for matrix 2:");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int b[][] = new int[m2][n2];
        for (int i=0;i<m2 ;i++ ) {
            for (int j =0;j<n2 ;j++ ) {
                System.out.println("Enter Element's of matrix 2:");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<m1 ;i++ ) {
            for (int j =0;j<n1 ;j++ ) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<m2 ;i++ ) {
            for (int j =0;j<n2 ;j++ ) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int c[][] = new int[m1][n2];
        if(n1 == m2){
            for(int x=0;x<m1;x++){
                for(int y =0;y<n1;y++ ){
                    for(int z = 0;z<n1;z++){
                        c[x][y] += a[x][z]*b[z][y];           
                    }
                }
            }
        }else{
            System.out.println("Enter Valid Matrix for Multiplication.");
        } 
        System.out.println("your ans is:");
        for (int i=0;i<m1 ;i++ ) {
            for (int j =0;j<n2 ;j++ ) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

