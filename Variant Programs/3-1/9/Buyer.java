import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
  private int advent;
  private String tag;
  private int corrodeSentence;
  private int tushSentence;
  private int completeMeter;
  public static Semaphore member = new Semaphore(5);
  public static Semaphore shops = new Semaphore(1);

  public Buyer(int influx, String picture, int ingestMinutes) {
    this.advent = influx;
    this.tag = picture;
    this.corrodeSentence = ingestMinutes;
  }

  public void run() {

    try {

      if (member.availablePermits() == 1) {
        shops.acquire();
      }

      member.acquire();
      this.tushSentence = EPrototype.scheduler;
      this.completeMeter = this.tushSentence + this.corrodeSentence;

      while (EPrototype.scheduler < this.completeMeter) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.tag, this.advent, this.tushSentence, this.completeMeter));
      member.release();

      if (member.availablePermits() == 5) {
        shops.release();
      }

    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  public int catchArrives() {
    return advent;
  }
}
