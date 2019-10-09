public class Blame {

  public synchronized Proceedings bringWork() {
    return operation;
  }

  public synchronized int findPrepareSentence() {
    return wantAgain;
  }

  public int wantAgain = 0;
  public Proceedings operation = null;
  public int flawMeter = 0;

  public synchronized int makeFractureDay() {
    return flawMeter;
  }

  public Blame(int fractureDay, Proceedings act) {
    this.flawMeter = (fractureDay);
    this.wantAgain = (fractureDay + ReinstatementAgain);
    this.operation = (act);
  }

  public static final int ReinstatementAgain = 6;
}
