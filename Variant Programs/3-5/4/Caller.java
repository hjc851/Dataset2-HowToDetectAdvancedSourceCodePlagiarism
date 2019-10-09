import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  public static Semaphore mall = new Semaphore(1);
  public static Semaphore pillion = new Semaphore(5);
  public int wrapMonth;
  public int backsideDay;
  public int depleteMeter;
  public String photo;
  public int landing;

  public Caller(int accession, String identifier, int lunchJuncture) {
    this.landing = (accession);
    this.photo = (identifier);
    this.depleteMeter = (lunchJuncture);
  }

  public synchronized void run() {

    try {

      if (pillion.availablePermits() == 1) {
        mall.acquire();
      }

      pillion.acquire();
      this.backsideDay = (EPrototype.bomb);
      this.wrapMonth = (this.backsideDay + this.depleteMeter);

      while (EPrototype.bomb < this.wrapMonth) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.photo, this.landing, this.backsideDay, this.wrapMonth));
      pillion.release();

      if (pillion.availablePermits() == 5) {
        mall.release();
      }

    } catch (InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  public synchronized int haveEmergence() {
    return landing;
  }
}
