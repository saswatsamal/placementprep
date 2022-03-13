package GettingStarted;

import java.util.Scanner;

/**
 * Check Leap Year or not
 * https://prepinsta.com/java-program/leap-year-or-not-using-java/
 */
public class checkLeapYear {
    public static void leapYear(int year){
        int flag = (year%400==0) || (year%4==0 && year%100 != 0)? 1:0;
        if(flag==1)
            System.out.println(year+" is Leap Year");
        else
            System.out.println(year+ " is Not Leap Year");
    }
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leapYear(year);
        sc.close();
    }
}
