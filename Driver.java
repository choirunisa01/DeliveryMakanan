public class Driver implements Delivery{
    private String driverName; 

    public Driver(String driverName) {
		this.driverName = driverName;
	}

    @Override
    public String getDriverName() {
		return this.driverName;
	}
}
