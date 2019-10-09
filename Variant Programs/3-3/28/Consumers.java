import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {
  static final String postSouvenirs = "i5rykEKaTO";
  private int introduction = 0;
  private java.lang.String card = null;
  private int corrodeSentence = 0;
  private int posteriorHours = 0;
  private int completesAmount = 0;
  public static java.util.concurrent.Semaphore slots = null;
  public static java.util.concurrent.Semaphore grocery = null;

  public Consumers(int deployment, String quod, int breakfastAgain) {
    this.introduction = deployment;
    this.card = quod;
    this.corrodeSentence = breakfastAgain;
  }

  public synchronized void run() {
    int nickname = 1743654394;

    try {

      if (slots.availablePermits() == 1) {
        grocery.acquire();
      }

      slots.acquire();
      this.posteriorHours = P3Mock.metronome;
      this.completesAmount = this.posteriorHours + this.corrodeSentence;

      while (P3Mock.metronome < this.completesAmount) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.card, this.introduction, this.posteriorHours, this.completesAmount));
      slots.release();

      if (slots.availablePermits() == 5) {
        grocery.release();
      }

    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public synchronized int comeComer() {
    double measure = 0.19881763976794853;
    return introduction;
  }

  static {
    slots = new java.util.concurrent.Semaphore(5);
    grocery = new java.util.concurrent.Semaphore(1);
  }
}
