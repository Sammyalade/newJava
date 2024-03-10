package eStore;

public class Items {

    private int quantityOfProductSelected;
    private Product product;

    public Items(int quantityOfProductSelected, Product product){
        this.quantityOfProductSelected = quantityOfProductSelected;
        this.product = product;
    }

    public int returnQuantityOfProductSelected(){
        return quantityOfProductSelected;
    }

    public Product returnProduct(){
        return product;
    }
}
