package GettingStarted;

/**
 * Check Whether a Number is Even or Odd in Java
 * https://prepinsta.com/java-program/a-number-is-even-or-odd-using-java/
 */
import java.util.*;
public class checkEvenOdd {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%2==0)
        System.out.println("The number is even");
    else
        System.out.println("The number is odd");
    sc.close();
}
    
}