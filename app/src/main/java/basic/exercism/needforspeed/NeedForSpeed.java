package basic.exercism.needforspeed;

public class NeedForSpeed {

    private int speed, batteryDrain;
    private int distance = 0;
    private int battery = 100;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.battery -= this.batteryDrain;
            this.distance += this.speed;
        }
    }

    public int maxRace() {
        return (100 / this.batteryDrain) * speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
