import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
  private static Project rootProject=new Project("root",null);
  public static void main(String[] args)
  {
    testCreateHierarchy();

  }

  public static void testCreateHierarchy()
  {
    // TOP LEVEL(0)
    Project softwareDesign = new Project("software design",null);
    Project softwareTesting = new Project("software testing",null);
    Project databases = new Project("databases",null);
    Project tasktransportation = new Project("task transportation", null);
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
    Task firstList = new Task("first list",problems);
    Task secondList = new Task("second list",problems);
    problems.addActivity(firstList);
    problems.addActivity(secondList);
    Task readHandout = new Task("read handout",projectTimeTracker);
    Task firstMilestone = new Task("first milestone",projectTimeTracker);
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
