package basic.exercism.carsassemble;

public class CarsAssemble {
    private static final int CARS_EACH_HOUR = 221;

    public double productionRatePerHour(int speed) {
        return switch (speed) {
            case 1,2,3,4 -> speed * CARS_EACH_HOUR;
            case 5,6,7,8 -> speed * CARS_EACH_HOUR * 0.9;
            case 9 -> speed * CARS_EACH_HOUR * 0.8;
            case 10 -> speed * CARS_EACH_HOUR * 0.77;
            default -> 0;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
