public class OrderButton implements UserInterface{
    private Order keranjang;

    public OrderButton(){
        keranjang = null;
    }

    @Override
	public void pressed () {
		if ( keranjang != null ) {
			System.out.println("\nPesananmu Berhasil di Order ! Pesanan sedang dikonfirmasi ke restoran ");
		}
		else {
			System.out.println("Keranjang not Connected!");
		}
	}

    public void connectTo (Order keranjang){
        System.out.println("\n====Starting Order Food===");
        System.out.println("Connecting to keranjang makanan....");
        this.keranjang = keranjang;
    }
}