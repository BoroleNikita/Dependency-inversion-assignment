package processes;
//Dependancy Inversion and template pattern....


public class DeviceFactory {
public static void main(String arg[]) {
	GeneralManufacturingProcess manufacture = new SmartphoneManufactureProcess("Iphone process");
	GeneralManufacturingProcess manufacture1 = new LaptopManufactureProcess("Iphone process");
	manufacture.lanuchProcess();
	manufacture1.lanuchProcess();
}
}
