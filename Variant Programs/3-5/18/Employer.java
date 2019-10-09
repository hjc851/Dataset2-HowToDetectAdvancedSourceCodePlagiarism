import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Employer implements Runnable {
  private static final int synX374int = 2090472975;
  private static final int synX373int = 5;
  private static final String synX372String = "%-10s%10s%10s%10s";
  private static final int synX371int = 1;
  private static final double synX370double = 0.5358641770538277;

  public synchronized void run() {
    double namDetail;
    namDetail = synX370double;

    try {

      if (members.availablePermits() == synX371int) {
        deli.acquire();
      }

      members.acquire();
      this.canBeginning = HManikin.nail;
      this.conclusionDay = this.canBeginning + this.foodYears;

      while (HManikin.nail < this.conclusionDay) {}
      System.out.println(
          format(synX372String, this.nerfling, this.arrive, this.canBeginning, this.conclusionDay));
      members.release();

      if (members.availablePermits() == synX373int) {
        deli.release();
      }

    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public int foodYears = 0;
  public java.lang.String nerfling = null;
  public static java.util.concurrent.Semaphore members = new java.util.concurrent.Semaphore(5);
  public int arrive = 0;
  public int conclusionDay = 0;

  public Employer(int arriver, String picture, int exhaustMoment) {
    this.arrive = arriver;
    this.nerfling = picture;
    this.foodYears = exhaustMoment;
  }

  static final String list = "SUR85PwosAstPuf5";
  public int canBeginning = 0;

  public synchronized int canAppointment() {
    int fukkianeseHeight;
    fukkianeseHeight = synX374int;
    return arrive;
  }

  public static java.util.concurrent.Semaphore deli = new java.util.concurrent.Semaphore(1);
}
