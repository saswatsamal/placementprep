package GettingStarted;
/**
 * Check if a Number is Positive or Negative in Java.
 * https://prepinsta.com/java-program/a-number-is-positive-or-negative-using-java/
 */
import java.util.*;
public class numberPositiveNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0)
            System.out.println("The number is negative");
        else if(a==0)
            System.out.println("The number is zero");
        else 
            System.out.println("The number is positive");
        sc.close();
    }
}