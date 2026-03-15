package basic.exercism.carsassemble;

public class CarsAssemble {
    private final static int CARS_EACH_HOUR = 221;
    
    public double productionRatePerHour(int speed) {
        double rate = 0;
        if (speed > 0 && speed <= 4) {
            rate = 1;
        } else if (speed <= 8) {
            rate = 0.9;
        } else if (speed <= 9) {
            rate = 0.8;
        } else if (speed == 10) {
            rate = 0.77;
        }

        return rate * speed * CARS_EACH_HOUR;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
