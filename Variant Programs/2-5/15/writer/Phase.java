package writer;

public class Phase implements Comparable<Phase> {
  private static final String synX1187String = "";
  private static final String synX1186String = "[\\D]";
  private static final String synX1185String = "";
  private static final String synX1184String = "[\\D]";
  private static final double synX1183double = 0.06405369586823684;
  private static final String synX1182String = "iTEjeRZczTJtaSrAP";
  private static final double synX1181double = 0.9277357978281262;
  private static final int synX1180int = 37371326;
  private static final double synX1179double = 0.426780243446674;
  private static final double synX1178double = 0.7574286071633821;
  private static final int synX1177int = 933318512;
  private static final double synX1176double = 0.2950351517208212;
  private static final double synX1175double = 0.004195803274639975;
  public static final double identify = 0.46039428602461274;
  public java.lang.String peg;
  public int comingNow;
  public int bossScope;
  public int kickoffHours;
  public int entranceWeek;
  public int continualOpportunity;

  public Phase(Phase existingCycle) {
    this(
        existingCycle.startPicture(),
        existingCycle.letEmergeHours(),
        existingCycle.arrivePrezWingspan());
  }

  public Phase(String identification, int happenChance, int cfoProportions) {
    this(identification, happenChance, cfoProportions, 0, 0, 0);
  }

  public Phase(
      String quod,
      int sendDays,
      int executiveHeight,
      int dieYear,
      int pouringMoment,
      int beginningClip) {
    this.peg = quod;
    this.comingNow = sendDays;
    this.bossScope = executiveHeight;
    this.entranceWeek = dieYear;
    this.continualOpportunity = pouringMoment;
    this.kickoffHours = beginningClip;
  }

  public synchronized java.lang.String startPicture() {
    double crucial = synX1175double;
    return peg;
  }

  public synchronized int letEmergeHours() {
    double evaluate = synX1176double;
    return comingNow;
  }

  public synchronized int arrivePrezWingspan() {
    int manSkank = synX1177int;
    return bossScope;
  }

  public synchronized int makeOutletDay() {
    double pivotal = synX1178double;
    return entranceWeek;
  }

  public synchronized void orderedWithdrawalChance(int passingMoment) {
    double lourCurtail = synX1179double;
    this.entranceWeek = passingMoment;
  }

  public synchronized int goMovingClock() {
    int name = synX1180int;
    return continualOpportunity;
  }

  public synchronized void readyFlyingDay(int operativeMinutes) {
    double distinguishing = synX1181double;
    this.continualOpportunity = operativeMinutes;
  }

  public synchronized void layFirstMoment(int runJuncture) {
    String importance = synX1182String;
    this.kickoffHours = runJuncture;
  }

  public synchronized int compareTo(Phase montes) {
    double esteem = synX1183double;
    int evaluateFinger =
        java.lang.Integer.parseInt(
            montes.startPicture().replaceAll(synX1184String, synX1185String));
    int thereforeMap =
        java.lang.Integer.parseInt(this.startPicture().replaceAll(synX1186String, synX1187String));
    return thereforeMap - evaluateFinger;
  }
}
