package basic.exercism.jedlikstoycar;

public class JedliksToyCar {
    private int driven = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.driven);
    }

    public String batteryDisplay() {
        return this.battery > 0 
            ? String.format("Battery at %d%%", this.battery) 
            : String.format("Battery empty");
    }

    public void drive() {
        if (this.battery > 0) {
            this.driven += 20;
            this.battery -= 1;
        } else {
            this.battery = 0;
        }
        
    }
}
