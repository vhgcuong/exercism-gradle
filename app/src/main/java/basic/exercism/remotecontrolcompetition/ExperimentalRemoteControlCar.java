package basic.exercism.remotecontrolcompetition;

public class ExperimentalRemoteControlCar implements RemoteControlCar, Comparable<ExperimentalRemoteControlCar> {

    private int distanceTravelled = 0;

    public void drive() {
        this.distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    @Override
    public int compareTo(ExperimentalRemoteControlCar item) {
        return Integer.compare(distanceTravelled, item.getDistanceTravelled());
    }
}
