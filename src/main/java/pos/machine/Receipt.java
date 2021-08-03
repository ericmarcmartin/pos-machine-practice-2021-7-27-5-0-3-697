package pos.machine;

import java.util.List;

public class Receipt {
    private List<Item> itemDetail;
    private int totalPrice;

    public Receipt(List<Item> itemDetail, int totalPrice) {
        this.itemDetail = itemDetail;
        this.totalPrice = totalPrice;
    }

    public List<Item> getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(List<Item> itemDetail) {
        this.itemDetail = itemDetail;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
