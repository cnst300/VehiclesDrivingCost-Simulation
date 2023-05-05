public class PetrolVehicle extends ThermalEngine implements CarMaintenance {
    private int maxSpeed;
    public PetrolVehicle(CarType type, VehicleSize size, int numberOfCylinders, int maxSpeed) {
        super(type, size, numberOfCylinders);
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int insurance() {
        return 1500 + getSize() / 2 + getNumberOfCylinders()/ 10;
    }

    @Override
    public int fuelConsumption() {
        return getMaxSpeed() + getNumberOfCylinders() * 10 + getSize();
    }

    @Override
    public int maintenanceCost() {
        return getMaxSpeed() + getNumberOfCylinders() * 10;
    }

    @Override
    public int cost(int numberOfMonths, int distanceTraveled) {
        return numberOfMonths * (maintenanceCost() + (insurance() / 12)) + (fuelConsumption() * distanceTraveled) / 100;
    }
}
