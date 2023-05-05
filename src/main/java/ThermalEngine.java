import java.util.Random;

abstract class ThermalEngine {
    private CarType type;
    private int size;
    private int numberOfCylinders;
    Random r = new Random();

    public ThermalEngine(CarType type, VehicleSize size, int numberOfCylinders) {
        this.type = type;
        this.numberOfCylinders = numberOfCylinders;
        switch (size){
            case SUBCOMPACT -> this.size=r.nextInt(2830-2405) + 2405;
            case COMPACT -> this.size=r.nextInt(3110-2830) + 2830;
            case MID_SIZE -> this.size=r.nextInt(3395-3115) + 3115;
            case LARGE -> this.size=r.nextInt(3800-3400) + 3400;
        }
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

}
