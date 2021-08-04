package pos.machine;

import java.util.*;
import java.util.stream.Collectors;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        List<Item> itemsWithDetail = convertToItems(barcodes);
        Receipt receipt = calculateReceipt(itemsWithDetail);

        return renderReceipt(receipt);
    }

    private String renderReceipt(Receipt receipt) {
        String printedReceipt = spliceItemsDetails(receipt);
        printedReceipt += spliceReceipt(receipt);
        return printedReceipt;
    }

    private String spliceReceipt(Receipt receipt) {
        return "----------------------\n" +
                "Total: " + receipt.getTotalPrice() + " (yuan)" +
                "\n**********************";
    }

    private String spliceItemsDetails(Receipt receipt) {
        String itemsDetail = "***<store earning no money>Receipt***\n";
        for (Item item : receipt.getItemDetail()) {
            itemsDetail += "Name: " + item.getName() + ", " + "Quantity: " + item.getQuantity() + ", " + "Unit price: "
                    + item.getUnitPrice() + " (yuan), Subtotal: " + item.getSubTotal() + " (yuan)\n";
        }
        return itemsDetail;
    }

    private Receipt calculateTotalPrice(List<Item> itemsWithDetail, int totalPrice) {
        for (Item item : itemsWithDetail) {
            totalPrice += item.getSubTotal();
        }
        return new Receipt(itemsWithDetail, totalPrice);
    }

    private Receipt calculateReceipt(List<Item> itemsWithDetail) {
        int totalPrice = 0;
        return calculateTotalPrice(itemsWithDetail, totalPrice);
    }

    private List<Item> convertToItems(List<String> barcodes) {
        List<ItemInfo> itemInfoList = ItemDataLoader.loadAllItemInfos();
        List<Item> itemList = new ArrayList<>();
        List<String> distinctBarcodes = barcodes.stream()
                .distinct()
                .collect(Collectors.toList());
        for (String barcode : distinctBarcodes) {
            for (ItemInfo itemInfo : itemInfoList) {
                if (barcode.equals(itemInfo.getBarcode())) {
                    int quantity = Collections.frequency(barcodes, barcode);
                    int price = itemInfo.getPrice();
                    int subTotal = calculateItemsSubtotal(quantity, price);
                    Item item = new Item(itemInfo.getName(), quantity, price, subTotal);
                    itemList.add(item);
                }
            }
        }
        return itemList;
    }

    private int calculateItemsSubtotal(int quantity, int price) {
        return quantity * price;
    }
}
