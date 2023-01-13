package com.driver;

public class Main {

    public static class Product{
        public static int product(int x, int y) {
            return x+y;
        }
        public static int product(int x, int y, int z) {
            return x+y+z;
        }
        public static double product(double x, double y) {
            return x+y;
        }
    }
public static void main(String[] args){
    Product p = new Product();
    System.out.println(p.product(4,5));
    System.out.println(p.product(4,5,7));
    System.out.println(p.product(4.34,5.6));


}
}

