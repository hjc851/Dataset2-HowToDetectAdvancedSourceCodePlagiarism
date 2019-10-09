package planner;

import static java.lang.Integer.parseInt;

public class Cycle implements Comparable<Cycle> {
  private static final String synX1506String = "";
  private static final String synX1505String = "[\\D]";
  private static final String synX1504String = "";
  private static final String synX1503String = "[\\D]";
  private static final double synX1502double = 0.8002741050127687;
  private static final double synX1501double = 0.5531419514774039;
  private static final double synX1500double = 0.721595323251639;
  private static final int synX1499int = 1359490273;
  private static final double synX1498double = 0.8734411934145551;
  private static final double synX1497double = 0.024536301803548044;
  private static final String synX1496String = "3NJj8PN67pB";
  private static final String synX1495String = "kx66T8VqXC";
  private static final String synX1494String = "xiAP9MPeHqfeLDSQ";
  public int flowingSentence = 0;
  public int lossMeter = 0;
  public int beginningClip = 0;
  public int chiefQuantity = 0;
  public int adoptAmount = 0;
  public java.lang.String pictures = null;
  public static final String fundamental = "eS";

  public Cycle(Cycle formerFormalities) {
    this(
        formerFormalities.conveyTag(),
        formerFormalities.produceComingNow(),
        formerFormalities.arrivePrezWingspan());
  }

  public Cycle(String map, int deliverPeriod, int executableDimensions) {
    this(map, deliverPeriod, executableDimensions, 0, 0, 0);
  }

  public Cycle(
      String identification,
      int sendDays,
      int bossScope,
      int leaveClip,
      int linearBeginning,
      int startleWeek) {
    this.pictures = (identification);
    this.adoptAmount = (sendDays);
    this.chiefQuantity = (bossScope);
    this.lossMeter = (leaveClip);
    this.flowingSentence = (linearBeginning);
    this.beginningClip = (startleWeek);
  }

  public synchronized java.lang.String conveyTag() {
    String roll;
    roll = (synX1494String);
    return pictures;
  }

  public synchronized int produceComingNow() {
    String primal;
    primal = (synX1495String);
    return adoptAmount;
  }

  public synchronized int arrivePrezWingspan() {
    String leaping;
    leaping = (synX1496String);
    return chiefQuantity;
  }

  public synchronized int produceIssueNow() {
    double decreaseThresholds;
    decreaseThresholds = (synX1497double);
    return lossMeter;
  }

  public synchronized void arrangedGoSentence(int goingDays) {
    double lourTreated;
    lourTreated = (synX1498double);
    this.lossMeter = (goingDays);
  }

  public synchronized int startOperativeMinutes() {
    int curve;
    curve = (synX1499int);
    return flowingSentence;
  }

  public synchronized void situatedOperativeMinutes(int functioningPeriod) {
    double symbolic;
    symbolic = (synX1500double);
    this.flowingSentence = (functioningPeriod);
  }

  public synchronized void placeStartleWeek(int jumpWhen) {
    double indicator;
    indicator = (synX1501double);
    this.beginningClip = (jumpWhen);
  }

  public synchronized int compareTo(Cycle centrale) {
    double highRestrict;
    int likenCaller;
    int considerNerfling;
    highRestrict = (synX1502double);
    likenCaller = (parseInt(centrale.conveyTag().replaceAll(synX1503String, synX1504String)));
    considerNerfling = (parseInt(this.conveyTag().replaceAll(synX1505String, synX1506String)));
    return considerNerfling - likenCaller;
  }
}
