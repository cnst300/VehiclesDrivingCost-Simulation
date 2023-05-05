public class DieselVehicle extends ThermalEngine implements CarMaintenance{
    public DieselVehicle(CarType type, VehicleSize size, int numberOfCylinders) {
        super(type, size, numberOfCylinders);
    }

    @Override
    public int insurance() {
        return 1700 + getNumberOfCylinders() * 10;
    }

    @Override
    public int fuelConsumption() {
        return getSize();
    }

    @Override
    public int maintenanceCost() {
        return 250 + getNumberOfCylinders() * 7;
    }

    @Override
    public int cost(int numberOfMonths, int distanceTraveled) {
        return numberOfMonths * (maintenanceCost() + (insurance() / 12)) + (fuelConsumption() * distanceTraveled) / 100;
    }
}
