public class Run {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 0.5);
        Product banana = new Product("Banana", 0.2);

        Invoice invoice = new Invoice();
        invoice.addLineItem(new LineItem(10, apple));
        invoice.addLineItem(new LineItem(15, banana));

        InvoiceDisplay display = new InvoiceDisplay();
        display.displayInvoice(invoice);
    }
}
