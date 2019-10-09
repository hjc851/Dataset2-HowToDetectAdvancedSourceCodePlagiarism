import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

  public synchronized int comeComer() {
    return landing;
  }

  private int landing;
  private int bunsHour;
  public static Semaphore spots = new Semaphore(5);
  public static Semaphore entrepot = new Semaphore(1);

  public Consumer(int deployment, String name, int swallowAmount) {
    this.landing = deployment;
    this.self = name;
    this.feedClip = swallowAmount;
  }

  public synchronized void run() {

    try {

      if (spots.availablePermits() == 1) {
        entrepot.acquire();
      }

      spots.acquire();
      this.bunsHour = GAvionics.pushbutton;
      this.concludeChance = this.bunsHour + this.feedClip;

      while (GAvionics.pushbutton < this.concludeChance) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.self, this.landing, this.bunsHour, this.concludeChance));
      spots.release();

      if (spots.availablePermits() == 5) {
        entrepot.release();
      }

    } catch (InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }

  private int concludeChance;
  private String self;
  private int feedClip;
}
