package basic.exercism.carsassemble;

public class CarsAssemble {
    private final static int CARS_EACH_HOUR = 221;
    
    public double productionRatePerHour(int speed) {
        final double rate = switch (speed) {
            case 1, 2, 3, 4 -> 1;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0;
        };

        return rate * speed * CARS_EACH_HOUR;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
