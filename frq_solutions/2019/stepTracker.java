public class StepTracker{
  private int countStep;
  private int totalStep;
  private int activeCount;
  private int dayCount;


  public StepTracker(int count){
    countStep = count;
    totalStep = 0;
    activeCount = 0;
    dayCount = 0;
  }
  public void addDailySteps(int countStep)
   if(totalStep == 0){
     totalStep += countStep;
     activateCount++;
   }
    activeCount++;

  public double averageStep(){
    if(dayCount == 0){
       return 0;
    }
    if(dayCount > 0){
      return totalStep / dayCount;
    }
  }
  public int activeDays(){
    return activeCount;
  }
}
