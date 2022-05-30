import java.util.ArrayList;

public class Keranjang implements Order{
    private ManageOrder restoran;
    private ArrayList <Pesanan> menu;

    public Keranjang () {
        restoran = null;
        menu = new ArrayList<> ();
    }

    @Override
    public void connectTo (ManageOrder restoran) {
        System.out.println("Connecting to resto...");
        System.out.println("Pesananmu Sudah dikonfirmasi oleh restoran");
        System.out.println("Pesanan telah masuk ke restoran : "+ restoran.getRestoName());
        System.out.println ("============================================");
    }

    @Override
    public boolean order() {
        boolean checkPemesanan = true; 

        if( !isEmpty() && restoran != null) {
            System.out.println("\nStarting order"+menu.size());
        }else{
            System.out.println("Order failed!"); 
        }
        return checkPemesanan;

    }

    @Override 
    public boolean isEmpty() {
        return menu.size() == 0;
    }

    public void addPesanan(Pesanan pesanan) {
        System.out.println(pesanan.getMenuId()+" Berhasil Dimasukkan ke keranjang ...");
        System.out.println("Silahkan klik pesan untuk Order"); 
        System.out.println ("============================================");
        this.menu.add (pesanan);
    }
}
