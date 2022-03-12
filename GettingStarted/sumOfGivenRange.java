package GettingStarted;
/**
 * Sum of the Numbers in a Given Range in Java
 * https://prepinsta.com/java-program/sum-of-numbers-in-a-given-range-using-java/
 */
import java.util.Scanner;
public class sumOfGivenRange {
    public static int usingLoops(int a, int b){
        
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
    public static int usingFormula(int a, int b){
        
        int sum = b*(b+1)/2 - a*(a+1)/2 +a;
        return sum;
    }
    public static int usingRecursion(int sum, int a, int b){
        
        if(a>b)
            return sum;
        return a + usingRecursion(sum, a+1,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        System.out.println("Using FOR Loop");
        System.out.println(usingLoops(a,b));
        System.out.println("Using Formula");
        System.out.println(usingFormula(a,b));
        System.out.println("Using Recursion");
        System.out.println(usingRecursion(sum,a,b));
        sc.close();
}
}