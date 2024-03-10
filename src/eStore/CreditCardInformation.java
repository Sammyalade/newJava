package eStore;

import java.time.LocalDate;

public class CreditCardInformation {

    private final String cardCVV;
    private final String cardExpirationYear;
    private final String cardExpirationMonth;
    private final String cardNumber;
    private final String cardName;
    private final CardType cardType;

    public CreditCardInformation(String cardCVV, String cardExpirationYear, String cardExpirationMonth, String cardNumber, String cardName, CardType cardType) {
        this.cardCVV = cardCVV;
        this.cardExpirationYear = cardExpirationYear;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardType = cardType;
    }

    public String getCVV(){
        return cardCVV;
    }

    public String getCardExpirationDate(){
        LocalDate expirationDate = LocalDate.of(Integer.parseInt(cardExpirationYear), Integer.parseInt(cardExpirationMonth), 1);
        return expirationDate.toString();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public CardType getCardType() {
        return cardType;
    }


}
