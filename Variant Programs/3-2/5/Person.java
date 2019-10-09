import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  private int arrived;
  private String quod;
  private int corrodeSentence;
  private int bottomThing;
  private int endingThing;
  public static Semaphore stools = new Semaphore(5);
  public static Semaphore storage = new Semaphore(1);

  public Person(int arriver, String est, int devourDays) {
    this.arrived = arriver;
    this.quod = est;
    this.corrodeSentence = devourDays;
  }

  public void run() {

    try {

      if (stools.availablePermits() == 1) {
        storage.acquire();
      }

      stools.acquire();
      this.bottomThing = P5Device.preset;
      this.endingThing = this.bottomThing + this.corrodeSentence;

      while (P5Device.preset < this.endingThing) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.quod, this.arrived, this.bottomThing, this.endingThing));
      stools.release();

      if (stools.availablePermits() == 5) {
        storage.release();
      }

    } catch (InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  public int becomeDeployment() {
    return arrived;
  }
}
