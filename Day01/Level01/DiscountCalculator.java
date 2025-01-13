public class DiscountCalculator {
    public static void main(String[] args) {
        double fee = 125000; // Initial fee
        double discountPercent = 10; // Discount percentage

        double discountAmount = (discountPercent / 100) * fee; // Calculate discount
        double discountedFee = fee - discountAmount; // Calculate final discounted fee

        System.out.println("The discount amount is INR " + discountAmount +
                " and the final discounted fee is INR " + discountedFee);
    }
}
