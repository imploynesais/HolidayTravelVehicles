public class Invoice {
    private String invoiceID;
    private double taxAmount;
    private double licenseFee;
    private double negotiatedPrice;
    private double finalPrice;
    private String date;
    private double tradeInAllowance;

    public Invoice(String invoiceID, double taxAmount, double licenseFee, double negotiatedPrice, 
                   double finalPrice, String date, double tradeInAllowance) {
        this.invoiceID = invoiceID;
        this.taxAmount = taxAmount;
        this.licenseFee = licenseFee;
        this.negotiatedPrice = negotiatedPrice;
        this.finalPrice = finalPrice;
        this.date = date;
        this.tradeInAllowance = tradeInAllowance;
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("License Fee: $" + licenseFee);
        System.out.println("Negotiated Price: $" + negotiatedPrice);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Date: " + date);
        System.out.println("Trade-In Allowance: $" + tradeInAllowance);
    }
}
