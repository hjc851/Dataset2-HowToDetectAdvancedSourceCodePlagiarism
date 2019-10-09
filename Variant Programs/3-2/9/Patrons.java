import java.util.concurrent.Semaphore;

public class Patrons implements Runnable {
  private int presence;
  private java.lang.String pictures;
  private int dietHour;
  private int fannyPeriod;
  private int coatingPeriod;
  public static java.util.concurrent.Semaphore vacancies = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore memory = new java.util.concurrent.Semaphore(1);

  public Patrons(int dawn, String name, int corrodeSentence) {
    this.presence = dawn;
    this.pictures = name;
    this.dietHour = corrodeSentence;
  }

  public void run() {

    try {

      if (vacancies.availablePermits() == 1) {
        memory.acquire();
      }

      vacancies.acquire();
      this.fannyPeriod = AjFaker.bomb;
      this.coatingPeriod = this.fannyPeriod + this.dietHour;

      while (AjFaker.bomb < this.coatingPeriod) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.pictures, this.presence, this.fannyPeriod, this.coatingPeriod));
      vacancies.release();

      if (vacancies.availablePermits() == 5) {
        memory.release();
      }

    } catch (java.lang.InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }

  public int takeIntroduction() {
    return presence;
  }
}
