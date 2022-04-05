package GettingStarted;

import java.util.Scanner;

public class reverseOfNumber {
    public static void bruteForce(int num, int rev){
        while(num!=0){
            int flag = num%10;
            rev = rev*10 + flag;
            num/=10;
        }
        System.out.println(rev);
    }
    public static int usingRecursion(int num, int rev){
        if(num==0)
            return rev;
        int flag = num%10;
        rev = (rev*10 + flag);
        return usingRecursion(num/10, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev=0;
        System.out.println("Brute force method");
        bruteForce(num, rev);
        System.out.println("Using recursion");
        System.out.println(usingRecursion(num, rev));
        sc.close();
    }
}
