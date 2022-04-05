package GettingStarted;
/**
 * Find Greatest of Two Numbers
 * https://prepinsta.com/java-program/greatest-of-two-numbers-using-java/
 */
import java.util.Scanner;
public class greatestOfTwoNumbers {
    public static void usingIfElse(int a, int b){
        if(a==b)
            System.out.println("Both are equal");
        else if(a>b)
            System.out.println(a+" is greater than "+b);
        else
            System.out.println(b+" is greater than "+a);
    }
    public static void usingTernary(int a, int b){
        int compare;
        if(a==b)
            System.out.println("Both are equal");
        else{
            compare = a>b?a:b;
            System.out.println(compare+" is the greater one");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Using if-else");
        usingIfElse(a, b);
        System.out.println("Using Ternary");
        usingTernary(a, b);
        sc.close();
    }
}
