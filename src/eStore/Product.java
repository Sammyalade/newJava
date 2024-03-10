package eStore;

public class Product {

    private String productID;
    private String productName;
    private int price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(String productID, String productName, int price, String productDescription, ProductCategory productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}
