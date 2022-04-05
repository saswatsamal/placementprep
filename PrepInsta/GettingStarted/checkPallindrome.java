package GettingStarted;

import java.util.Scanner;

public class checkPallindrome {
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
        if(usingRecursion(num, rev) == num)
            System.out.println("The number is Pallindrome");
        else
            System.out.println("Not pallindrome");
        sc.close();
    }
}
