public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double subtotal;
    private double tax;

    public Invoice(int invoiceNumber, String customerName, double totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subtotal = totalAmount;
        this.tax = calculateTaxAmount(totalAmount);
    }

    public void printInvoiceSummary() {
        printInvoiceHeader();
        printSubtotal();
        printTaxDetails();
        printTotalAmountWithTax();
    }

    private void printInvoiceHeader() {
        System.out.println("Invoice Details:");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
    }

    private void printSubtotal() {
        System.out.println("Total Amount: " + subtotal);
    }

    private void printTaxDetails() {
        System.out.println("Tax Amount: " + tax);
    }

    private void printTotalAmountWithTax() {
        System.out.println("Amount with Tax: " + getTotalAmountWithTax());
    }

    public double calculateTaxAmount(double totalAmount) {
        return subtotal * 0.15;
    }

    private void recalculateTax() {
        this.tax = calculateTaxAmount(this.subtotal);
    }

    public double getTotalAmountWithTax() {
        return subtotal + tax;
    }

    public void updateCustomerName(String newName) {
        customerName = newName;
    }

    public void applyDiscountAndUpdateTax(double discountPercentage) {
        subtotal = subtotal - (subtotal * discountPercentage / 100);
        recalculateTax();
    }

    public void printDiscountDetails() {
        String formatoprint = String.format("Discount Applied: %.2f \nNew Tax Amount: %.2f \nAmount After Discount: %.2f",
            subtotal, tax, getTotalAmountWithTax());
        System.out.println(formatoprint);
    }

}   