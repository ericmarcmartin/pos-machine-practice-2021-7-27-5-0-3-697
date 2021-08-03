package pos.machine;

import java.util.*;
import java.util.stream.Collectors;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        List<Item> itemsWithDetail = convertToItems(barcodes);
        return null;
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
                    Item item = new Item(itemInfo.getName(), quantity, price, quantity * price);
                    itemList.add(item);
                }
            }
        }
        return itemList;
    }
}
