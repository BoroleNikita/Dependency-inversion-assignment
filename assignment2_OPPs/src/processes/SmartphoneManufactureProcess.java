package processes;

public class SmartphoneManufactureProcess extends GeneralManufacturingProcess{
	
	public SmartphoneManufactureProcess(String name) {
		super(name);
	}
	
	
	protected void assembleDevice() {
		System.out.println("assemble smartphone");
	}
	protected void testDevice() {
		System.out.println("tested smartphone");
		
	}
	protected void packageDevice() {
		
		System.out.println("package smartphone");
	}
	protected void storeDevice() {
		System.out.println("stored smartphone");
		
	}
	

}
