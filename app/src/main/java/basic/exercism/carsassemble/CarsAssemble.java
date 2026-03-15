package basic.exercism.carsassemble;

public class CarsAssemble {
    private final static int CARS_EACH_HOUR = 221;
    
    public double productionRatePerHour(final int speed) {
        return successRate(speed) * speed * CARS_EACH_HOUR;
    }

    public int workingItemsPerMinute(final int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    private double successRate(final int speed) {
        return switch (speed) {
            case 1, 2, 3, 4 -> 1.0;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0.0;
        };
    }
}
