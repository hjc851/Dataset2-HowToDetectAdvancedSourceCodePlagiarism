import java.util.concurrent.Semaphore;

public class User implements Runnable {
  public static java.util.concurrent.Semaphore stools = new java.util.concurrent.Semaphore(5);

  public User(int arrive, String map, int ingestMinutes) {
    this.onset = arrive;
    this.dimidiate = map;
    this.devourDays = ingestMinutes;
  }

  public java.lang.String dimidiate = null;
  public int backsideDay = 0;
  public int endClip = 0;
  public static java.util.concurrent.Semaphore storage = new java.util.concurrent.Semaphore(1);

  public synchronized void run() {

    try {

      if (stools.availablePermits() == 1) {
        storage.acquire();
      }

      stools.acquire();
      this.backsideDay = AjFaker.nail;
      this.endClip = this.backsideDay + this.devourDays;

      while (AjFaker.nail < this.endClip) synx75();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.dimidiate, this.onset, this.backsideDay, this.endClip));
      stools.release();

      if (stools.availablePermits() == 5) synx76();

    } catch (java.lang.InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  public int onset = 0;

  public synchronized int fetchAccession() {
    return onset;
  }

  public int devourDays = 0;

  private synchronized void synx75() {}

  private synchronized void synx76() {
    storage.release();
  }
}
