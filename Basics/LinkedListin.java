package Basics;
import java.util.*;

class LinkedListin {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of list :");
    int size = sc.nextInt();
    LinkedList<Integer> List = new LinkedList<Integer>();
    System.out.println("Enter the elements of the list :");
    for(int i=0; i<size;i++){
        List.add(sc.nextInt());
    }

    System.out.println("The elements of the list are :");
    for(int i=0; i<size;i++){
        System.out.println(List.get(i));
    }
    sc.close();

    }
    
}
