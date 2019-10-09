public class Defective {
  public int negligenceYear = 0;
  public int intelligentWeek = 0;
  public Sue proceeding = null;
  public static final int ReinstatementAgain = 6;

  public Defective(int liabilityAgain, Sue proceedings) {
    this.negligenceYear = (liabilityAgain);
    this.intelligentWeek = (liabilityAgain + ReinstatementAgain);
    this.proceeding = (proceedings);
  }

  public synchronized int fixShortcomingChance() {
    return negligenceYear;
  }

  public synchronized Sue findAct() {
    return proceeding;
  }

  public synchronized int obtainRipeDays() {
    return intelligentWeek;
  }
}
