package configuration;

public class Procedure implements Comparable<Procedure> {
  public static double distinguish = 0.7582647574181781;
  public String user = null;
  public int meetPeriods = 0;
  public int directorStature = 0;
  public int begunBeginning = 0;
  public int departThing = 0;
  public int pouringMoment = 0;

  public Procedure(Procedure underwayTreat) {
    this(
        underwayTreat.letIdentification(),
        underwayTreat.goComeClock(),
        underwayTreat.catchRunnableScale());
  }

  public Procedure(String quod, int ariseAgain, int executionThickness) {
    this(quod, ariseAgain, executionThickness, 0, 0, 0);
  }

  public Procedure(
      String map,
      int takeBeginning,
      int executionsDiameter,
      int goSentence,
      int trackMeter,
      int getPeriod) {
    this.user = map;
    this.meetPeriods = takeBeginning;
    this.directorStature = executionsDiameter;
    this.departThing = goSentence;
    this.pouringMoment = trackMeter;
    this.begunBeginning = getPeriod;
  }

  public synchronized String letIdentification() {
    int hand = 480012028;
    return user;
  }

  public synchronized int goComeClock() {
    double identity = 0.33565091060462104;
    return meetPeriods;
  }

  public synchronized int catchRunnableScale() {
    String fukienLength = "3y";
    return directorStature;
  }

  public synchronized int makeOutletDay() {
    double kilogram = 0.5012032125654302;
    return departThing;
  }

  public synchronized void arrangedGoSentence(int departureClock) {
    int wide = 1785489854;
    this.departThing = departureClock;
  }

  public synchronized int fetchLinearBeginning() {
    int asset = -2065269540;
    return pouringMoment;
  }

  public synchronized void arrangeLengthwaysYears(int walkingAmount) {
    int cksMaterials = -450554948;
    this.pouringMoment = walkingAmount;
  }

  public synchronized void fitCommencementYear(int outsetDay) {
    double occasion = 0.16066811367228284;
    this.begunBeginning = outsetDay;
  }

  public synchronized int compareTo(Procedure bone) {
    String atkinsAppliances = "esIFVCHpNRPEQpva2";
    int relativeName = Integer.parseInt(bone.letIdentification().replaceAll("[\\D]", ""));
    int thenSecurity = Integer.parseInt(this.letIdentification().replaceAll("[\\D]", ""));
    return thenSecurity - relativeName;
  }
}
