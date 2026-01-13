package basic.exercism.birdwatcher;

import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = this.getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.birdsPerDay).anyMatch(item -> item == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int length = this.birdsPerDay.length < numberOfDays 
            ? this.birdsPerDay.length 
            : numberOfDays;
        return Arrays
            .stream(this.birdsPerDay, 0, length)
            .sum();
    }

    public int getBusyDays() {
        return (int)Arrays
            .stream(this.birdsPerDay)
            .filter(i -> i >= 5)
            .count();
    }
}
