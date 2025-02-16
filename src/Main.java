public class Main {
    public static void main(String[] args) {
        // Creating a New Vehicle
        NewVehicle myVehicle = new NewVehicle("12345", "Toyota Camry", "Camry", 2023, "Toyota", 25000.00);
        
        // Creating a Trade-In Vehicle
        TradeInVehicle oldVehicle = new TradeInVehicle("67890", "Honda Civic", "Civic", 2018, "Honda", 15000.00, 5000.00);
        
        // Creating a Salesperson
        Salesperson salesperson = new Salesperson("S001", "John Doe", "123-456-7890");

        // Creating a Customer
        Customer customer = new Customer("C001", "Alice Smith", "123 Main St", "987-654-3210");

        // Creating an Invoice
        Invoice invoice = new Invoice("INV1001", 1500.00, 200.00, 24000.00, 22700.00, "2025-02-16", 5000.00);

        // Creating a Dealer-Installed Option
        DealerInstalledOption option = new DealerInstalledOption("O001", "Sunroof", 1200.00);

        // Display details
        System.out.println("\n--- Vehicle Details ---");
        myVehicle.displayVehicle();

        System.out.println("\n--- Trade-In Vehicle Details ---");
        oldVehicle.displayTradeInVehicle();

        System.out.println("\n--- Salesperson Details ---");
        salesperson.displaySalesperson();

        System.out.println("\n--- Customer Details ---");
        customer.displayInfo();

        System.out.println("\n--- Invoice Details ---");
        invoice.displayInvoice();

        System.out.println("\n--- Dealer-Installed Option ---");
        option.displayOption();
    }
}
