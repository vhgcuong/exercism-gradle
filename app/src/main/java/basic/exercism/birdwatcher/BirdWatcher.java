package basic.exercism.birdwatcher;

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
        for (int item: this.birdsPerDay) {
            if (item == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int length = this.birdsPerDay.length < numberOfDays 
            ? this.birdsPerDay.length 
            : numberOfDays;
        int count = 0;
        for (int i=0; i < length; i++) {
            count += this.birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int value: this.birdsPerDay) {
            if (value >= 5) {
                ++count;
            }
        }
        return count;
    }
}
