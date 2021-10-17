import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Task extends Activity{
  private List<Interval> intervals = new ArrayList<Interval>();

  public Task(String name, Project parent){
     this.setName(name);
     this.setParentProject(parent);
  }
  public Task(String name)
  {
    this.setName(name);
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

  @Override
  public void printHierarchy() {
    System.out.print(this.getName());
    System.out.print("( Leaf Node)");
  }
}
