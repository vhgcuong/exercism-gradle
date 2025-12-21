package basic.exercism.cookyourlasagna;

public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int time) {
        return this.expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int countLevel) {
        return countLevel * 2;
    }

    public int totalTimeInMinutes(int count, int over) {
        return this.preparationTimeInMinutes(count) + over;
    }
}
