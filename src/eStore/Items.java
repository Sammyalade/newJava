package eStore;

public class Items {

    private int quantityOfProductSelected;
    private Product product;

    public Items(int quantityOfProductSelected, Product product){
        this.quantityOfProductSelected = quantityOfProductSelected;
        this.product = product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public void setQuantityOfProductSelected(int quantityOfProductSelected){
        this.quantityOfProductSelected = quantityOfProductSelected;
    }

    public int returnQuantityOfProductSelected(){
        return quantityOfProductSelected;
    }

    public Product returnProduct(){
        return product;
    }
}
