import java.util.concurrent.Semaphore;

public class Subscribers implements Runnable {
  private int arrived;
  private String card;
  private int chowHours;
  private int posteriorHours;
  private int endClip;
  public static Semaphore stools = new Semaphore(5);
  public static Semaphore reposition = new Semaphore(1);

  public Subscribers(int accession, String ibid, int hungryOpportunity) {
    this.arrived = accession;
    this.card = ibid;
    this.chowHours = hungryOpportunity;
  }

  public void run() {

    try {

      if (stools.availablePermits() == 1) {
        reposition.acquire();
      }

      stools.acquire();
      this.posteriorHours = P3Mock.timekeeping;
      this.endClip = this.posteriorHours + this.chowHours;

      while (P3Mock.timekeeping < this.endClip) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.card, this.arrived, this.posteriorHours, this.endClip));
      stools.release();

      if (stools.availablePermits() == 5) {
        reposition.release();
      }

    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public int developAppearance() {
    return arrived;
  }
}
