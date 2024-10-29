import javax.swing.*;
import java.awt.*;
import java.util.List;

public class InvoiceDisplay extends JFrame {
    private JTextArea textArea;

    public InvoiceDisplay() {
        setTitle("Invoice Display");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        setVisible(true);
    }

    public void displayInvoice(Invoice invoice) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice:\n");
        for (LineItem item : invoice.getLineItems()) {
            sb.append(item.getProduct().getName())
                    .append("\t")
                    .append(item.getQuantity())
                    .append("\t")
                    .append(item.calculateLineItemTotal())
                    .append("\n");
        }
        sb.append("Total: ").append(invoice.calculateTotal());
        textArea.setText(sb.toString());
    }
}
