package Basics;

import java.util.Scanner;

class Mulfun {
    public static int prod(int a,int b){
        return a*b;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the first number:");
        int b=sc.nextInt();
        int multi = prod(a,b);
        System.out.println("The product is: " + multi);
       sc.close();
    }
    }
