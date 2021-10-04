package app;

import warehouse.Product;

public class PosYetunde {
    public static void main(String[] args) {
        System.out.println();

        Product product = new Product("Apple", "Fruit", 1.99);
        System.out.println();
        System.out.println("Product Full Details:");
        System.out.println("=====================");
        product.print();

        System.out.println();
    }
}
