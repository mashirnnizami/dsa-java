package Basics;
import java.util.Scanner;

public class interest {

    public static float interest(float p, float r, float t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
// Suggested code may be subject to a license. Learn more: ~LicenseLog:1330510736.
        System.out.print("Enter the principal amount: ");
        float p = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        float r = sc.nextInt();
        System.out.print("Enter the time period: ");
        float t = sc.nextInt();
        System.out.println("The interest is: " + interest(p, r, t));
        sc.close();
        

    }
    
}
