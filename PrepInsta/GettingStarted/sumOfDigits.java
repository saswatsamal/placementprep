package GettingStarted;

import java.util.Scanner;

public class sumOfDigits {
    public static void bruteForce(int num, int sum){
        while(num!=0){
            sum+= num%10;
            num = num /10;
        }
        System.out.println(sum);
    }
    //Using Recursion
    public static int usingRecursion(int num, int sum){
        if(num==0)
            return sum;
        sum += num%10;
        return usingRecursion(num/10, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("Brute force method");
        bruteForce(num, sum);
        System.out.println("Using recursion");
        System.out.println(usingRecursion(num, sum));
        sc.close();
    }
}
