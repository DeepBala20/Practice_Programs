// 12) WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value 
// should be taken from user (Note that you are not allowed to use an array for this)

import java.util.Scanner;
public class MaxMinAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        int n = sc.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,avgtemp=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter value :");
            int temp = sc.nextInt();
            avgtemp = avgtemp+temp;
            if(max <= temp){
                max = temp;
            }
            if(min >= temp){
                min = temp;
            }
        }
        double avg = ((double)avgtemp)/n;
        System.out.println("min : "+min);        
        System.out.println("max : "+max);
        System.out.println("avg : "+avg);

    }
}


