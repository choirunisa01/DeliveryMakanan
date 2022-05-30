public class Main {
    public static void main(String[] args) {
        Resto resto = new Resto ("Minang Mananti");
        Driver driver = new Driver ("Budi");

        Keranjang keranjang = new Keranjang();
        OrderButton button = new OrderButton();

        button.connectTo(keranjang);
        keranjang.addPesanan(new Pesanan ("Nasi Padang Rendang"));
        button.pressed();

        keranjang.connectTo(resto);
        resto.connectTo(driver);
    }
    
}
