package basic.exercism.needforspeed;

public class NeedForSpeed {
    private final static int BATTERY = 100;

    private int speed;
    private int batteryDrain;
    private int countDriver;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.countDriver = 0;
    }

    public boolean batteryDrained() {
        final int batteryUse = this.countDriver * this.batteryDrain;

        if (BATTERY - batteryUse < this.batteryDrain) {
            return true;
        }

        return this.countDriver * this.batteryDrain >= BATTERY;
    }

    public int distanceDriven() {
        if (this.countDriver * this.batteryDrain >= BATTERY) {
            return (BATTERY / this.batteryDrain) * speed;
        }

        return this.countDriver * speed;
    }

    public void drive() {
        ++this.countDriver;
    }

    public int maxDistanceDriven() {
        return (BATTERY / this.batteryDrain) * this.speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
