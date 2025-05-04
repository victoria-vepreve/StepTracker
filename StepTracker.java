public class StepTracker{
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int active;
    public StepTracker(int min){
        minSteps = min;
    }
    public void addDailySteps(int steps){
        numDays++;
        totalSteps += steps;
        if (steps >= minSteps) {
            active++;
        }
    }

    public int activeDays(){
        return active;
    }

    public double averageSteps(){
        if (numDays == 0) return 0;
        return (double) totalSteps/numDays;
    }
}