package javaprogrammeweek7;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)   where:   (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    public static void armstrongNumber(){
        int num, number, digit, total = 0;
        System.out.println("Enter 3 Digit Number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for(;number!=0;number /= 10)
        {
            digit = number % 10;
            total = total + digit*digit*digit;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

    public static void main(String[] args) {
        armstrongNumber();
    }
}
