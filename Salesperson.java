public class Salesperson {
    private String salespersonID;
    private String name;
    private String phoneNumber;

    public Salesperson(String salespersonID, String name, String phoneNumber) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void displaySalesperson() {
        System.out.println("Salesperson ID: " + salespersonID);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
