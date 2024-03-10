package eStore;

public class BillingInformation {

    private String receiverPhoneNumber;
    private String receiverName;
    private final Address deliveryAddress;
    private final CreditCardInformation cardInformation;

    public BillingInformation(String receiverPhoneNumber, String receiverName, String cityName, String country, String houseNumber, String street, String state, String cardCVV, String cardExpirationYear, String cardExpirationMonth, String cardNumber, String cardName, CardType cardType) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = new Address(cityName, country, houseNumber, street, state);
        this.cardInformation = new CreditCardInformation(cardCVV, cardExpirationYear, cardExpirationMonth, cardNumber, cardName, cardType);
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber){
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public void setReceiverName(String receiverName){
        this.receiverName = receiverName;
    }

    public String getReceiverPhoneNumber(){
        return receiverPhoneNumber;
    }

    public String getDeliveryAddress(){
        return deliveryAddress.toString();
    }

    public String getCardInformation(){
        return cardInformation.toString();
    }

    public String getReceiverName(){
        return receiverName;
    }
}
