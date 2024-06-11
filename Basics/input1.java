package Basics;
import java.util.Scanner;

public class input1 {
    
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = get.nextLine();
        System.out.print("Enter your age :");
        int age = get.nextInt();
        System.out.println("Enter your profession :");
        String profession = get.nextLine();
        System.out.println("Enter your salary :");
        float salary = get.nextFloat();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println("Salary: " + salary);

        get.close();
  
    }
}
