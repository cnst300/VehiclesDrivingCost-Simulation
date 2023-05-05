public class ElectricVehicle implements CarMaintenance{
    private CarType type;
    private int batteryCapacity;
    private int batteryPower;


    public ElectricVehicle(int batteryCapacity, int batteryPower) {
        this.batteryCapacity = batteryCapacity;
        this.batteryPower = batteryPower;
        this.type=CarType.ELECTRIC;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    @Override
    public int insurance() {
        return 1000 + getBatteryCapacity();
    }

    @Override
    public int fuelConsumption() {
        return getBatteryPower() * 2;
    }

    @Override
    public int maintenanceCost() {
        return 500;
    }

    @Override
    public int cost(int numberOfMonths, int distanceTraveled) {
        return numberOfMonths * (maintenanceCost() + (insurance() / 12)) + (fuelConsumption() * distanceTraveled) / 100;
    }
}
