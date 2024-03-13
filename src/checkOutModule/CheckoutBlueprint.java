package checkOutModule;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CheckoutBlueprint{

    private Scanner collector = new Scanner(System.in);
    private ArrayList<String> itemsBought = new ArrayList<>();
    private ArrayList<Double> numberOfItemsBought = new ArrayList<>();
    private ArrayList<Double> pricePerUnit = new ArrayList<>();
    private String customerName;
    private double discountAllowed;
    private String cashierName;
    private double[] priceList;
    private double totalPriceOfGoods = 0;
    private double customerChange;
    private double discountCalculator;
    private double pricePayable;
    private double amountPaidByCustomer;
    private double valueAddedTax;
    private LocalDateTime currentDateTime = LocalDateTime.now();
    private DateTimeFormatter dateAndTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private String formattedDateTime = currentDateTime.format(dateAndTimeFormat);

    public void takePurchaseDetails() {
        try {
            System.out.print("What is the Customer's name: ");
            customerName = collector.nextLine();
            System.out.print("What did the Customer buy: ");
            String nameOfItem = collector.nextLine();
            itemsBought.add(nameOfItem);
            System.out.print("How many pieces: ");
            double numberOfItem = collector.nextDouble();
            numberOfItemsBought.add(numberOfItem);
            System.out.print("How much per unit: ");
            double pricePerUnitOfItem = collector.nextDouble();
            pricePerUnit.add(pricePerUnitOfItem);
            System.out.print("Add more Items: ");
            String moreItem = collector.next();

            while (!moreItem.equalsIgnoreCase("no")) {

                System.out.print("What did the Customer buy: ");
                nameOfItem = collector.next();
                itemsBought.add(nameOfItem);
                System.out.print("How many pieces: ");
                numberOfItem = collector.nextDouble();
                numberOfItemsBought.add(numberOfItem);
                System.out.print("How much per unit: ");
                pricePerUnitOfItem = collector.nextDouble();
                pricePerUnit.add(pricePerUnitOfItem);
                System.out.print("Add more Items: ");
                moreItem = collector.next();

            }

            System.out.print("What is your name: ");
            cashierName = collector.next();

            System.out.print("How much discount does the customer get: ");
            discountAllowed = collector.nextDouble();

        } catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Please rerun the app");
        }
    }

    public void toCalculate(){

        priceList = new double[itemsBought.size()];

        for (int index = 0; index < priceList.length; index ++){
            Double price = numberOfItemsBought.get(index);
            Double quantity = pricePerUnit.get(index);

            priceList[index] = price * quantity;
        }


        for (double v : priceList) {
            totalPriceOfGoods += v;
        }
        discountCalculator = (discountAllowed * totalPriceOfGoods) / 100;

        valueAddedTax = (totalPriceOfGoods * 17.50) / 100;

        pricePayable = (totalPriceOfGoods + valueAddedTax) - discountCalculator;


    }

    public void displayBeforeCheckout(){

        System.out.printf("""
					  SEMICOLON STORES
					  MAIN BRANCH
					  LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
					  TEL: 03293828343
					  DATE: %s
			   		  Cashier's Name: %S
					  Customer Name: %S
					  =====================================================
					            ITEM     QTY     PRICE          TOTAL(NGN)
					  -----------------------------------------------------
		""", formattedDateTime, cashierName, customerName);
        for(int count = 0; count < priceList.length; count++){
            System.out.printf("""
					              %s      %3.0f    %.2f           %.2f
			""", itemsBought.get(count), numberOfItemsBought.get(count), pricePerUnit.get(count), priceList[count]);
        }
        System.out.printf("""
					  -----------------------------------------------------
						   	  Sub total:              %.2f
							  Discount:               %.2f 
							  VAT @ 17.50%%:          %.2f
					  =====================================================
							  Bill total:		  %.2f
					  =====================================================
					  THIS IS NOT A RECEIPT.
					  KINDLY PAY %.2f FOR THE RECEIPT TO BE GENERATED
					  =====================================================
		""", totalPriceOfGoods, discountCalculator, valueAddedTax, pricePayable, pricePayable);

        System.out.print("How much did the customer give you: ");
        amountPaidByCustomer = collector.nextDouble();

        customerChange = amountPaidByCustomer - pricePayable;

    }

    public void printReceipt(){

        System.out.printf("""
					  SEMICOLON STORES
					  MAIN BRANCH
					  LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
					  TEL: 03293828343
					  DATE: %s
			   		  Cashier's Name: %S
					  Customer Name: %S
					  =====================================================
					            ITEM     QTY     PRICE          TOTAL(NGN)
					  -----------------------------------------------------
		""", formattedDateTime, cashierName, customerName);
        for(int count = 0; count < priceList.length; count++){
            System.out.printf("""
							%s      %3.0f    %.2f            %.2f
			""", itemsBought.get(count), numberOfItemsBought.get(count), pricePerUnit.get(count), priceList[count]);
        }
        System.out.printf("""
					  -----------------------------------------------------
						   	  Sub total:              %.2f
							  Discount:               %.2f 
							  VAT @ 17.50%%:          %.2f
					  =====================================================
							  Bill total:		  %.2f
							  Amount Paid:            %.2f 
							  Balance:		  %.2f
					  =====================================================
					 		THANK YOU FOR YOUR PATRONAGE
					  =====================================================

		""", totalPriceOfGoods, discountCalculator, valueAddedTax, pricePayable, amountPaidByCustomer, customerChange);

    }


}