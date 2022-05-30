public interface Order {
    void connectTo (ManageOrder restoran);
    boolean order();
    boolean isEmpty();
}