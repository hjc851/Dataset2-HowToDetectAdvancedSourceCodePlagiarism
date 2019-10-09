import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Subscriber implements Runnable {
  private static final int synX963int = 5;
  private static final String synX962String = "%-10s%10s%10s%10s";
  private static final int synX961int = 1;
  private static final double synX960double = 0.722887092735103;
  private static final int synX959int = 1656944860;

  public synchronized int fixInauguration() {
    int destined;
    destined = synX959int;
    return appearance;
  }

  public int bunsHour = 0;
  public static Semaphore spaces = new Semaphore(5);

  public synchronized void run() {
    double integral;
    integral = synX960double;

    try {

      if (spaces.availablePermits() == synX961int) {
        memory.acquire();
      }

      spaces.acquire();
      this.bunsHour = P1Simulating.register;
      this.terminusWhen = this.bunsHour + this.depleteMeter;

      while (P1Simulating.register < this.terminusWhen) synx105();
      out.println(
          format(synX962String, this.card, this.appearance, this.bunsHour, this.terminusWhen));
      spaces.release();

      if (spaces.availablePermits() == synX963int) synx106();

    } catch (InterruptedException admittedly) {
      out.println(admittedly.toString());
    }
  }

  public int terminusWhen = 0;
  public int depleteMeter = 0;
  public String card = null;
  static final double infernalCertain = 0.20832410439765914;
  public int appearance = 0;

  public Subscriber(int arrives, String identifying, int rustDay) {
    this.appearance = arrives;
    this.card = identifying;
    this.depleteMeter = rustDay;
  }

  public static Semaphore memory = new Semaphore(1);

  private synchronized void synx105() {}

  private synchronized void synx106() {
    memory.release();
  }
}
