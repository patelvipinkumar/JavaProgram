package com.java2blog.Numbers;

import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter the two numbers: ");
 
        int number1 = input.nextInt();
        int number2 = input.nextInt();
 
 
        System.out.println("The GCD of two numbers is: " + gcd(number1, number2));
        System.out.println("The LCM of two numbers is: " + lcm(number1, number2));
 
        input.close();  
 
 }
	static int gcd(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
 
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
 
    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }	
    }
}


