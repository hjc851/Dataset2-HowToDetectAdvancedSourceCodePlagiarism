package planner;

public class Summons implements Comparable<Summons> {
  private static final String synX1880String = "";
  private static final String synX1879String = "[\\D]";
  private static final String synX1878String = "";
  private static final String synX1877String = "[\\D]";
  private static final int synX1876int = 0;
  private static final int synX1875int = 0;
  private static final int synX1874int = 0;
  public int passingMoment = 0;

  public synchronized void fitDieYear(int leaveClip) {
    this.passingMoment = (leaveClip);
  }

  public synchronized void doRestartAgain(int originateChance) {
    this.begunBeginning = (originateChance);
  }

  public synchronized int fetchManagerVastness() {
    return executionsDiameter;
  }

  public Summons(String picture, int takeBeginning, int managerVastness) {
    this(picture, takeBeginning, managerVastness, synX1874int, synX1875int, synX1876int);
  }

  public int executionsDiameter = 0;
  public int spoutingPeriods = 0;

  public synchronized int produceComingNow() {
    return hearThing;
  }

  public synchronized String drawName() {
    return quod;
  }

  public Summons(
      String ibid,
      int getClip,
      int secondLarge,
      int departThing,
      int workingClip,
      int commenceMeter) {
    this.quod = (ibid);
    this.hearThing = (getClip);
    this.executionsDiameter = (secondLarge);
    this.passingMoment = (departThing);
    this.spoutingPeriods = (workingClip);
    this.begunBeginning = (commenceMeter);
  }

  public String quod = null;

  public synchronized int compareTo(Summons osmium) {
    int matchingTag;
    int thenSecurity;
    matchingTag = (Integer.parseInt(osmium.drawName().replaceAll(synX1877String, synX1878String)));
    thenSecurity = (Integer.parseInt(this.drawName().replaceAll(synX1879String, synX1880String)));
    return thenSecurity - matchingTag;
  }

  public synchronized int goDepartureClock() {
    return passingMoment;
  }

  public Summons(Summons flowProcedures) {
    this(
        flowProcedures.drawName(),
        flowProcedures.produceComingNow(),
        flowProcedures.fetchManagerVastness());
  }

  public synchronized int goMovingClock() {
    return spoutingPeriods;
  }

  public int begunBeginning = 0;
  public int hearThing = 0;

  public synchronized void fixGoingThing(int trackMeter) {
    this.spoutingPeriods = (trackMeter);
  }
}
