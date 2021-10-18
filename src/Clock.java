import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends Observable {
  private static Timer timer=new Timer();
  public void startTimer()
  {
    TimerTask task = new TimerTask() {
      @Override
      public void run() {
        synchronized (this)
        {
          tick();
        }
      }
    };
    timer.scheduleAtFixedRate(task,Date.from(Instant.now()),1000);
  }
  public void tick()
  {
    setChanged();
    notifyObservers(LocalDateTime.now());
  }
}
