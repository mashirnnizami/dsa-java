package Basics;
import java.util.*;

public class Arrayinput {
    
    public static void main(String[] args) {
// Suggested code may be subject to a license. Learn more: ~LicenseLog:820675272.
        Scanner sc = new Scanner(System.in);
// Suggested code may be subject to a license. Learn more: ~LicenseLog:4058204031.
        System.out.print("Enter the size of the array:");
// Suggested code may be subject to a license. Learn more: ~LicenseLog:2289020398.
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
        sc.close();


    }
}
