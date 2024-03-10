package eStore;

import java.util.List;

public class Customer implements UserType{

    private List<BillingInformation> billingInformation;
    private ShoppingCart shoppingCart;

    public Customer(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void createNewBillingInfo(String receiverPhoneNumber, String receiverName, String cityName, String country, String houseNumber, String street, String state, String cardCVV, String cardExpirationYear, String cardExpirationMonth, String cardNumber, String cardName, CardType cardType){
        billingInformation.add(new BillingInformation( receiverPhoneNumber, receiverName, cityName, country, houseNumber, street, state, cardCVV, cardExpirationYear, cardExpirationMonth, cardNumber, cardName, cardType));
    }

    public void removeBillingInformation(BillingInformation billingInformationToRemove){
        billingInformation.removeIf(billingInfo -> billingInfo.equals(billingInformationToRemove));
    }

    public void removeItemInShoppingCart(Items itemToRemove){
        shoppingCart.removeItems(itemToRemove);
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
