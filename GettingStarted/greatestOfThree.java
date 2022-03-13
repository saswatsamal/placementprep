package GettingStarted;
/**
 * Greatest Number Among Three Numbers
 * https://prepinsta.com/java-program/greatest-of-three-numbers-using-java/
 */
public class greatestOfThree {
    public static void usingIfElse(int a, int b, int c){
        if(a>=b && a>=c)
            System.out.println(a+" is greater than others");
        else if(b>=a && b>=c)
            System.out.println(b+" is greater than others");
        else if(c>=a && b>=a)
            System.out.println(c+" is greater than others");
    }
    public static void usingTernary(int a, int b, int c){
        int d, result;
        d = a>b?a:b;
        result = d>c?d:c;
        System.out.println(result+" is the greatest");
    }
    public static void main(String[] args) {
        int a= 1000, b=200, c=30;
        System.out.println("Using if-elseif");
        usingIfElse(a, b, c);
        System.out.println("Using ternary");
        usingTernary(a, b, c);
    }
}