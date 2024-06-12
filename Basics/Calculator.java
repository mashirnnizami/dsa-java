package Basics;

import java.util.Scanner;

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
// Suggested code may be subject to a license. Learn more: ~LicenseLog:1104675135.
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float div(int a, int b) {
        return a / b;
    }
    
// Suggested code may be subject to a license. Learn more: ~LicenseLog:618153410.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// Suggested code may be subject to a license. Learn more: ~LicenseLog:1924168984.
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("The sum is: " + sum);
        int p = mul(a, b);
        System.out.println("The product is: " + p);
        int s = sub(a, b);
        System.out.println("The difference is: " + s);
        float d = div(a, b);
        System.out.println("The division is: " + d);
        sc.close();
        
        
    }
}
