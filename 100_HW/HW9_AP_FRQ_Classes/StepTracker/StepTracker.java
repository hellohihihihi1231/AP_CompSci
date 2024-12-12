public class StepTracker {
    int minSteps;  
    int days;
    int activeDays;
    int totalSteps;
    
    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        days = 0;
        activeDays = 0;
        totalSteps = 0;
    }
    
    public void addDailySteps(int stepsTaken) {
        totalSteps += stepsTaken;
        days ++;
        if(stepsTaken >= minSteps) {
            activeDays ++;
        }
    }
    
    public int activeDays() {
        return activeDays;
    }
    
    public double averageSteps() {
        return (double)(totalSteps/days);
    }
}