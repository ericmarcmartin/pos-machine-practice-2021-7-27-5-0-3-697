package pos.machine;

public class Main {
    public static void main(String[] args) {
        PosMachine posMachine = new PosMachine();
        posMachine.printReceipt(ItemDataLoader.loadBarcodes());
    }
}
