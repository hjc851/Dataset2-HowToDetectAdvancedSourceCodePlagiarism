import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  private int dietHour;
  private int visit;
  private int keisterYear;
  public static Semaphore depot = new Semaphore(1);
  private String name;
  private int completesAmount;

  public synchronized int letAdvent() {
    return visit;
  }

  public synchronized void run() {

    try {

      if (chairs.availablePermits() == 1) {
        depot.acquire();
      }

      chairs.acquire();
      this.keisterYear = C2Sim.pushbutton;
      this.completesAmount = this.keisterYear + this.dietHour;

      while (C2Sim.pushbutton < this.completesAmount) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.name, this.visit, this.keisterYear, this.completesAmount));
      chairs.release();

      if (chairs.availablePermits() == 5) {
        depot.release();
      }

    } catch (InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }

  public static Semaphore chairs = new Semaphore(5);

  public Caller(int onset, String ownership, int sandwichesThing) {
    this.visit = onset;
    this.name = ownership;
    this.dietHour = sandwichesThing;
  }
}
