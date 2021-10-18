import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Project extends Activity{
  private List<Activity> activities = new ArrayList<Activity>();
  /*public Project(String name, Project parentProject){
    this.setName(name);
    this.setParentProject(parentProject);
  }*/
  public Project(String name)
  {
    this.setName(name);
  }
  public void addActivity(Activity act)
  {
    activities.add(act);
    act.setParentProject(this);
  }
  public List<Activity> getActivities(){return activities;}
  @Override
  public Duration TotalTimeSpent(timePeriods period) {
    Duration totalTime = Duration.ZERO;
    for (Activity act:activities) {
      totalTime.plus(act.TotalTimeSpent(period));
    }
    return totalTime;
  }
  public void printHierarchy()
  {

    for(Activity a:activities) {
      a.printHierarchy();
    }
    System.out.print( "\n<----"+this.getName());
  }
}
