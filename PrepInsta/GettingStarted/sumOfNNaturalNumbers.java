package GettingStarted;
/**
 * Program to Find the Sum of First N Natural Numbers using java
 * https://prepinsta.com/java-program/program-to-find-the-sum-of-first-n-natural-numbers-in-java/
 */
import java.util.Scanner;

public class sumOfNNaturalNumbers {
    public static int usingLoops(int n){
        
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static int usingFormula(int n){
        
        int sum = n*(n+1)/2;
        return sum;
    }
    public static int usingRecursion(int n){
        
        if(n==0)
            return n;
        return n + usingRecursion(n-1);       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Using FOR Loop");
        System.out.println(usingLoops(num));
        System.out.println("Using Formula");
        System.out.println(usingFormula(num));
        System.out.println("Using Recursion");
        System.out.println(usingRecursion(num));
        sc.close();
    }
}
