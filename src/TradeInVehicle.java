public class TradeInVehicle extends Vehicle {
    private double tradeInAllowance;

    public TradeInVehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost, double tradeInAllowance) {
        super(serialNumber, name, model, year, manufacturer, baseCost);
        this.tradeInAllowance = tradeInAllowance;
    }

    public void displayTradeInVehicle() {
        super.displayVehicle();
        System.out.println("Trade-In Allowance: $" + tradeInAllowance);
    }
}
