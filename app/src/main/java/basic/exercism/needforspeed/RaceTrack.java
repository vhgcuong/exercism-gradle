package basic.exercism.needforspeed;

public class RaceTrack {
    private int distance;
    
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.speed * (100 / car.batteryDrain) >= this.distance;
    }
}
