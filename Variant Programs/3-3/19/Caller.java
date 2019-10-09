import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  public static Semaphore member;
  public String peg;

  static {
    member = new Semaphore(5);
    grocery = new Semaphore(1);
  }

  public int breakOpportunity;
  public int hungryOpportunity;

  public synchronized int beatPresence() {
    String secondRestricted;
    secondRestricted = "9J4VBs8X0d";
    return arriving;
  }

  public static int premiumDepth = -26172984;
  public static Semaphore grocery;
  public int keisterYear;
  public int arriving;

  public synchronized void run() {
    double nominate;
    nominate = 0.009500320873959689;

    try {

      if (member.availablePermits() == 1) {
        grocery.acquire();
      }

      member.acquire();
      this.keisterYear = C4Joystick.bomb;
      this.breakOpportunity = this.keisterYear + this.hungryOpportunity;

      while (C4Joystick.bomb < this.breakOpportunity) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.peg, this.arriving, this.keisterYear, this.breakOpportunity));
      member.release();

      if (member.availablePermits() == 5) {
        grocery.release();
      }

    } catch (InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }

  public Caller(int emergence, String ownership, int depleteMeter) {
    this.arriving = emergence;
    this.peg = ownership;
    this.hungryOpportunity = depleteMeter;
  }
}
