import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
  private static Project rootProject=new Project("root");
  private static Clock clock= new Clock();
  public static void main(String[] args)
  {
    testClock();
    testCreateHierarchy();
  }

  public static void testClock()
  {
    Interval i1 = new Interval();
    Interval i2 = new Interval();
    Interval i3 = new Interval();
    clock.addObserver(i1);
    clock.addObserver(i2);
    clock.addObserver(i3);
    clock.startTimer();
  }
  public static void testCreateHierarchy()
  {
    // TOP LEVEL(0)
    Project softwareDesign = new Project("software design");
    Project softwareTesting = new Project("software testing");
    Project databases = new Project("databases");
    Project tasktransportation = new Project("task transportation");
    rootProject.addActivity(softwareDesign);
    rootProject.addActivity(softwareTesting);
    rootProject.addActivity(databases);
    rootProject.addActivity(tasktransportation);

    // LEVEL 1
    Project problems = new Project("problems");
    Project projectTimeTracker = new Project("project time tracker");
    softwareDesign.addActivity(problems);
    softwareDesign.addActivity(projectTimeTracker);

    // LEVEL 2
    Task firstList = new Task("first list");
    Task secondList = new Task("second list");
    problems.addActivity(firstList);
    problems.addActivity(secondList);
    Task readHandout = new Task("read handout");
    Task firstMilestone = new Task("first milestone");
    projectTimeTracker.addActivity(readHandout);
    projectTimeTracker.addActivity(firstMilestone);
    //PRINTING
    rootProject.printHierarchy();

  }

  public void readDataFromJSON()
  {

  }
  public void saveDataToJSON()
  {

  }
  public Duration TotalTimeSpent(Activity activity, timePeriods period)
  {
     return activity.TotalTimeSpent(period);
  }
}
