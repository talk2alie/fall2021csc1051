package warehouse;
/**
 * Product
 */
public class Product {

    private String name;
    private String category;
    private double salePrice;


    public Product(String name, String category, double salePrice) {
        this.name = name;
        this.category = category;
        this.salePrice = salePrice;
    }
    
    public double getTaxedSalePrice() {
        final double TAX_RATE = 0.07;
        return this.salePrice + this.salePrice * TAX_RATE;
    }

    public void print() {
        System.out.printf("Name:\t\t%s\nCategory:\t%s\nSale Price:\t$%.2f\nTaxed Price:\t$%.2f", name, category, salePrice, getTaxedSalePrice());
        System.out.println();
    }
}