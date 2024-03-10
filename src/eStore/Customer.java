package eStore;

import java.util.List;

public class Customer {

    private List<BillingInformation> billingInformation;
    private ShoppingCart shoppingCart;

    public Customer(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void createNewBillingInfo(String receiverPhoneNumber, String receiverName, Address deliveryAddress, CreditCardInformation cardInformation){
        billingInformation.add(new BillingInformation(receiverPhoneNumber, receiverName, deliveryAddress, cardInformation));

    }

    public void addProductsToCart(Items items){
        shoppingCart.addItem(items);
    }

    public String getProductsInCart(){
        return shoppingCart.getItems();
    }

    public String getBillingInformation(){
        return billingInformation.toString();
    }
}
