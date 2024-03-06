package wagesPerDay;

public class WagePerDayCalculator {

    public int returnWage(int parcelDelivered, int basePay){
        checkSuccessfulDelivery(parcelDelivered);
    }

    private static int checkSuccessfulDelivery(int parcelDelivered) {
        if (parcelDelivered > 0 && parcelDelivered < 50) {
           return calculateDeliveriesLessThan50(parcelDelivered);
        } else if (parcelDelivered >= 50 && parcelDelivered < 60) {
            return calculateDeliveriesLessThanSixtyPercent(parcelDelivered);
        } else if (parcelDelivered >= 60 && parcelDelivered < 70) {
            return calculateDeliveriesLessThanSeventyPercent(parcelDelivered);
        } else if (parcelDelivered >= 70 && parcelDelivered <= 100) {
            return calculateDeliveriesGreaterThanSeventyPercent(parcelDelivered);
        } else {
           throw new RuntimeException("Incorrect percentage");
        }
    }


    private static int calculateDeliveriesGreaterThanSeventyPercent(int parcelDelivered) {
        return parcelDelivered * 500;
    }

    private static int calculateDeliveriesLessThanSeventyPercent(int parcelDelivered) {
        return parcelDelivered * 250;
    }

    private static int calculateDeliveriesLessThanSixtyPercent(int parcelDelivered) {
        return parcelDelivered * 200;
    }

    private static int calculateDeliveriesLessThan50(int parcelDelivered) {
        return parcelDelivered * 160;
    }
}