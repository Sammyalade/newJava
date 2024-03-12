package eStore;

import java.util.List;

public class Customer extends User{

    private List<BillingInformation> billingInfo;
    private ShoppingCart shoppingCart;

    public Customer(int age, String emailAddress, String homeAddress, String name, String password, String phoneNumber){
        super(age, emailAddress, homeAddress, name, password, phoneNumber);
    }

    public void createNewBillingInfo(String receiverPhoneNumber, String receiverName, String cityName, String country, String houseNumber, String street, String state, String cardCVV, String cardExpirationYear, String cardExpirationMonth, String cardNumber, String cardName, CardType cardType){
        billingInfo.add(new BillingInformation( receiverPhoneNumber, receiverName, cityName, country, houseNumber, street, state, cardCVV, cardExpirationYear, cardExpirationMonth, cardNumber, cardName, cardType));
    }

    public void removeBillingInformation(BillingInformation billingInformationToRemove){
        billingInfo.removeIf(billingInfo -> billingInfo.equals(billingInformationToRemove));
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

    public String getBillingInfo(){
        return billingInfo.toString();
    }
}
