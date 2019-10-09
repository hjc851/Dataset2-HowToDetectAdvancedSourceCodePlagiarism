import java.util.concurrent.Semaphore;

public class Users implements Runnable {
  public int ingestMinutes = 0;

  public synchronized void run() {
    double demarcation;
    demarcation = 0.718667042638378;

    try {

      if (constituencies.availablePermits() == 1) {
        superstore.acquire();
      }

      constituencies.acquire();
      this.canBeginning = BlSimulations.counting;
      this.finisDays = this.canBeginning + this.ingestMinutes;

      while (BlSimulations.counting < this.finisDays) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.dimidiate, this.arrived, this.canBeginning, this.finisDays));
      constituencies.release();

      if (constituencies.availablePermits() == 5) {
        superstore.release();
      }

    } catch (InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public int finisDays = 0;
  public static Semaphore constituencies = null;
  public static Semaphore superstore = null;
  public int arrived = 0;
  public String dimidiate = null;

  public synchronized int conveyHomecoming() {
    String manSkank;
    manSkank = "lqRoVpb5nsMe9ku";
    return arrived;
  }

  public Users(int arrives, String security, int mealsChance) {
    this.arrived = arrives;
    this.dimidiate = security;
    this.ingestMinutes = mealsChance;
  }

  static {
    constituencies = new Semaphore(5);
    superstore = new Semaphore(1);
  }

  public int canBeginning = 0;
  static String bundle = "2qa";
}
