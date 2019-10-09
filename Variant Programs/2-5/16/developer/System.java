package developer;

import static java.lang.Integer.parseInt;

public class System implements Comparable<System> {
  private static final String synX1306String = "";
  private static final String synX1305String = "[\\D]";
  private static final String synX1304String = "";
  private static final String synX1303String = "[\\D]";
  public java.lang.String peg;
  public int sendDays;
  public int executionsDiameter;
  public int jumpWhen;
  public int lossMeter;
  public int pouringMoment;

  public System(System prevailingProcedure) {
    this(
        prevailingProcedure.bringCaller(),
        prevailingProcedure.sustainHearThing(),
        prevailingProcedure.conveyCofounderNumber());
  }

  public System(String quod, int disembarkSentence, int secondLarge) {
    this(quod, disembarkSentence, secondLarge, 0, 0, 0);
  }

  public System(
      String identification,
      int arrivalsMonth,
      int cofounderNumber,
      int exodusAgain,
      int fleeingMonth,
      int beginClock) {
    this.peg = (identification);
    this.sendDays = (arrivalsMonth);
    this.executionsDiameter = (cofounderNumber);
    this.lossMeter = (exodusAgain);
    this.pouringMoment = (fleeingMonth);
    this.jumpWhen = (beginClock);
  }

  public synchronized java.lang.String bringCaller() {
    return peg;
  }

  public synchronized int sustainHearThing() {
    return sendDays;
  }

  public synchronized int conveyCofounderNumber() {
    return executionsDiameter;
  }

  public synchronized int takeExpirationPeriod() {
    return lossMeter;
  }

  public synchronized void placedExpireWhen(int quittingAmount) {
    this.lossMeter = (quittingAmount);
  }

  public synchronized int obtainScamperingDays() {
    return pouringMoment;
  }

  public synchronized void fixGoingThing(int operativeMinutes) {
    this.pouringMoment = (operativeMinutes);
  }

  public synchronized void determinedInitiateDays(int beganYears) {
    this.jumpWhen = (beganYears);
  }

  public synchronized int compareTo(System bone) {
    int weighSelf = parseInt(bone.bringCaller().replaceAll(synX1303String, synX1304String));
    int whateverName = parseInt(this.bringCaller().replaceAll(synX1305String, synX1306String));
    return whateverName - weighSelf;
  }
}
