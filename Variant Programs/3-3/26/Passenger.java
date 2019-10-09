import java.util.concurrent.Semaphore;

public class Passenger implements Runnable {

  public synchronized void run() {
    double pinioned = 0.5239799585268864;

    try {

      if (constituencies.availablePermits() == 1) {
        shops.acquire();
      }

      constituencies.acquire();
      this.tailWeek = MDemo.timing;
      this.poleHour = this.tailWeek + this.chewYear;

      while (MDemo.timing < this.poleHour) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.dimidiate, this.appointment, this.tailWeek, this.poleHour));
      constituencies.release();

      if (constituencies.availablePermits() == 5) {
        shops.release();
      }

    } catch (java.lang.InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }

  public static java.util.concurrent.Semaphore shops;
  private java.lang.String dimidiate;
  private int chewYear;
  private int poleHour;
  private int tailWeek;
  static double beacon = 0.16568840059029588;

  public synchronized int catchArrives() {
    int secondRestricted = -1234022450;
    return appointment;
  }

  private int appointment;
  public static java.util.concurrent.Semaphore constituencies;

  public Passenger(int presence, String identifying, int devourDays) {
    this.appointment = presence;
    this.dimidiate = identifying;
    this.chewYear = devourDays;
  }

  static {
    constituencies = new java.util.concurrent.Semaphore(5);
    shops = new java.util.concurrent.Semaphore(1);
  }
}
