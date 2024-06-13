package DSA;
import java.lang.Math;
import java.util.Scanner;

class Sqrtfun{
    public static int square(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The square root of " + num + " is " + square(num));
        sc.close();
    }
}

