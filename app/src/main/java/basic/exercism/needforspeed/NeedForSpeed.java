package basic.exercism.needforspeed;

public class NeedForSpeed {
    private static final int MAX_BATTERY = 100;

    private final int speed, batteryDrain;
    private int distance = 0;
    private int battery = MAX_BATTERY;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }

        battery -= batteryDrain;
        distance += speed;
    }

    public int maxDistance() {
        return (MAX_BATTERY / batteryDrain) * speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
