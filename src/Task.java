import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Task extends Activity{
  private List<Interval> intervals;
  private int nIntervals;

  /*
  public Task(String name, Project parent){
     this.setName(name);
     this.setParentProject(parent);
  }
  */

  public Task(String name)
  {
    this.setName(name);
    nIntervals=0;
    intervals=new ArrayList<Interval>();
  }
  public Duration TotalTimeSpent(timePeriods period) {
    //  this should return the sum of the durations of all the intervals of the task that fit the period
    switch(period)
    {
      case ALL -> {

      }
    }
    /*
    Duration totalDuration=Duration.ZERO;
    * for(Interval interval:intervals)
    * {
    *   totalDuration.plus(interval.getDuration());
    * }*/
    return Duration.ZERO;
  }
  public void startTask(Clock clock)
  {
    if(!isActive())
    {
      Interval i = new Interval();
      clock.addObserver(i);
      addInterval(i);
      changeState();
    }
    else{
      System.out.print("Cannot start task because it is already active");
    }

  }
  public void stopTask(Clock clock){
    if(isActive())
    {

    }
  };
  public void deleteInterval(Interval i)
  {
    intervals.remove(i);
    nIntervals--;
  }
  public void addInterval(Interval interval)
  {
    intervals.add(interval);
    nIntervals++;
  }
  @Override
  public void printHierarchy() {
    System.out.print(this.getName());
    System.out.print("( Leaf Node)");
  }
}
