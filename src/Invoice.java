import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem item) {
        lineItems.add(item);
    }

    public double calculateTotal() {
        return lineItems.stream()
                .mapToDouble(LineItem::calculateLineItemTotal)
                .sum();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
