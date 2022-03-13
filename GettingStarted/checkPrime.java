package GettingStarted;

import java.util.Scanner;

public class checkPrime {
    public static void usingNby2(int num){
        int i;
        boolean isPrime = true;
        if(num<2)
            isPrime= false;
        else{
            for(i=2;i<num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        String result = isPrime?"Prime":"Not Prime";
        System.out.println(num+" is "+result);
   }
   public static void usingSquareRoot(int num){
       int i;
       boolean isPrime = true;
        if(num<2){
            isPrime= false;
        }
            
        else{
            for(i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }
    String result = isPrime?"Prime":"Not Prime";
    System.out.println(num+" is "+result);
    }
    public static boolean usingRecursion(int num, int i){
        if(num<2)
            return false;
        if(i==num)
            return true;
        if(num%i==0)
            return false;
        i+=1;
        return usingRecursion(num, i);
    } 
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Using n/2");
        usingNby2(num);
        System.out.println("Using sqrt of n");
        usingSquareRoot(num);
        System.out.println("Using recursion");
        int i=2;
        boolean isPrime = true;
        isPrime= usingRecursion(num, i);
        String result = isPrime?"Prime":"Not Prime";
        System.out.println(num+" is "+result);
        sc.close();
    }
}
