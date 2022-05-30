public class Resto implements ManageOrder {
    private Delivery driver; 
    private String restoName; 

    public Resto(String restoName) {
		this.restoName = restoName;
	}

    public Delivery getDriver() {
        return driver;
    }

    public void setDriver(Delivery driver) {
        this.driver = driver;
    }

    @Override
    public String getRestoName() {
		return this.restoName;
	}

    @Override
    public boolean checkOrder(){
        boolean checkPesanan = true; 

        if(checkPesanan = true){
            System.out.println("Pesananmu sudah dikonfirmasi oleh resto\n");
            System.out.println("Pesanan Sedang di siapkan");
        }else{
            System.out.println("Pesananmu sedang kosong"); 
        }
        return checkPesanan;    
    }

    @Override
    public void connectTo (Delivery driver){
        System.out.println("\nConnecting to driver ...");
        System.out.println("Driver berhasil ditemukan : "+ driver.getDriverName());
        System.out.println("Driver sedang menuju restoran\n");
        System.out.println("Pesananmu sudah selesai, Driver sedang menuju ke tempatmu\n");

    }
}