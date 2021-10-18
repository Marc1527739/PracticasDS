import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Observable;
import java.util.Observer;

public class Interval implements Observer {
  private Task parentTask;
  private LocalDateTime start;
  private LocalDateTime end;
  private Duration duration;

  public Interval()
  {
    start=LocalDateTime.now();
    end=null;
    duration=null;
  }

  @Override
  public void update(Observable o, Object arg) {
    end = (LocalDateTime)arg;
    duration = Duration.between(start,end);
    System.out.print(duration.toNanos()+"\n");
  }
}
