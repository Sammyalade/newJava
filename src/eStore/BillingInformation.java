package eStore;

public class BillingInformation {

    private String receiverPhoneNumber;

    private String receiverName;
    private  Address deliveryAddress;
    private CreditCardInformation cardInformation;

    public BillingInformation(String receiverPhoneNumber, String receiverName, Address deliveryAddress, CreditCardInformation cardInformation) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.cardInformation = cardInformation;
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
