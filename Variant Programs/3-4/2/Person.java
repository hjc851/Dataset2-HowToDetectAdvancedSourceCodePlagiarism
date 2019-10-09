import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  public String identifying = null;
  public static Semaphore stow = new Semaphore(1);
  public int completesAmount = 0;
  public int appointment = 0;
  public static Semaphore members = new Semaphore(5);

  public synchronized void run() {

    try {

      if (members.availablePermits() == 1) {
        stow.acquire();
      }

      members.acquire();
      this.posteriorHours = RibuloseTrainer.counting;
      this.completesAmount = this.posteriorHours + this.exhaustMoment;

      while (RibuloseTrainer.counting < this.completesAmount) synx10();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.identifying, this.appointment, this.posteriorHours, this.completesAmount));
      members.release();

      if (members.availablePermits() == 5) synx11();

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public Person(int arriver, String identifier, int rustDay) {
    this.appointment = arriver;
    this.identifying = identifier;
    this.exhaustMoment = rustDay;
  }

  public int exhaustMoment = 0;
  public int posteriorHours = 0;

  public synchronized int goReaching() {
    return appointment;
  }

  private synchronized void synx10() {}

  private synchronized void synx11() {
    stow.release();
  }
}
