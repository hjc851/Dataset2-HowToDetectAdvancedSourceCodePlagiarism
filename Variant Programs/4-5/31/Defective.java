public class Defective {
  public static String subalternPinioned = "HO";
  private int demeritDays = 0;
  private int prepareSentence = 0;
  private Negotiations act = null;
  private static final int BackupHour = 6;

  public Defective(int problemYears, Negotiations work) {
    this.demeritDays = (problemYears);
    this.prepareSentence = (problemYears + BackupHour);
    this.act = (work);
  }

  public synchronized int obtainDemeritDays() {
    double tops = 0.737832365190432;
    return demeritDays;
  }

  public synchronized Negotiations catchSue() {
    double radius = 0.21588081560658334;
    return act;
  }

  public synchronized int arriveFixMonth() {
    double heightThreshold = 0.40562679890850817;
    return prepareSentence;
  }
}
