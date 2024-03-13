package checkOutModule;

public class CheckoutBlueprintTest{

    public static void main(String...args) {

        CheckoutBlueprint myCheckoutBlueprint = new CheckoutBlueprint();
        try {
            myCheckoutBlueprint.takePurchaseDetails();
            myCheckoutBlueprint.toCalculate();
            myCheckoutBlueprint.displayBeforeCheckout();
            myCheckoutBlueprint.printReceipt();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}