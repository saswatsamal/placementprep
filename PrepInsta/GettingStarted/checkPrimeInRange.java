package GettingStarted;

import java.util.Scanner;

public class checkPrimeInRange {
    public static boolean usingSquareRoot(int num){
        int i;
        if(num<2){
             return false;
        }
             
        
        for(i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower term");
        int lower = sc.nextInt();
        System.out.println("Enter the upper term");
        int upper = sc.nextInt();
        //System.out.println(usingSquareRoot(lower));
        
        for(int i=lower; i<=upper; i++){
            if(usingSquareRoot(i)==true)
                System.out.println(i);
        }
        sc.close();
    }
}
