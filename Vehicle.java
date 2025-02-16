public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() { return serialNumber; }
    public String getName() { return name; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getManufacturer() { return manufacturer; }
    public double getBaseCost() { return baseCost; }

    public void displayVehicle() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: $" + baseCost);
    }
}
