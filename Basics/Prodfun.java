package Basics;

class Prodfun {
  
    public static int prod(int c,int d){
        return c*d;
    }

    public static void main(String[] args){
        int product = prod(10,20);
        System.err.println("Product is : " +  product);
    }

}
