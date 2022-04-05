/**
 * Program to find N-th Fibonacci Number in Java
 * https://prepinsta.com/java-program/program-to-find-n-th-fibonacci-number/
 */
package GettingStarted;
public class nthFibonacci {
    public static int usingRecursion(int n){
        //base condition
        if(n<=1)
            return n;
        return usingRecursion(n-1)+usingRecursion(n-2);
    }
    public static int usingDP(int n){
        int temp[] = new int[n+1]; //array to store the fibo number
        int i; // for the loop

        temp[0] = 0;
        if(n>0){
            temp[1]=1;
            //loop which will iterate through the number
            for(i=2; i<=n; i++){
                temp[i] = temp[i-1]+temp[i-2];
            }
        }
        return temp[n];
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Using recursion");
        System.out.println(usingRecursion(n));
        System.out.println("Using DP");
        System.out.println(usingDP(n));
    }
}