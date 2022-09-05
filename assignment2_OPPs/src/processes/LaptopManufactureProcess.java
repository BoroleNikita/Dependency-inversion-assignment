package processes;

public class LaptopManufactureProcess extends GeneralManufacturingProcess {

	public LaptopManufactureProcess(String name) {
		super(name);
	}

	
	protected void assembleDevice() {
		System.out.println("assemble laptop");
	}

	
	protected void testDevice() {
		System.out.println("tested laptop");
		
	}

	
	protected void packageDevice() {
		System.out.println("package laptop");
		
	}

	
	protected void storeDevice() {
		System.out.println("stored laptop");
		
	}

}
