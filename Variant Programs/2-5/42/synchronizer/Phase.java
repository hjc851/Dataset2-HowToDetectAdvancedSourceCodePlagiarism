package synchronizer;

import static java.lang.Integer.parseInt;

public class Phase implements Comparable<Phase> {
  private static final String synX2901String = "";
  private static final String synX2900String = "[\\D]";
  private static final String synX2899String = "";
  private static final String synX2898String = "[\\D]";
  private static final int synX2897int = 0;
  private static final int synX2896int = 0;
  private static final int synX2895int = 0;

  public synchronized void placedExpireWhen(int perishMonth) {
    this.issueNow = (perishMonth);
  }

  public Phase(String picture, int getClip, int veepDensity) {
    this(picture, getClip, veepDensity, synX2895int, synX2896int, synX2897int);
  }

  public synchronized java.lang.String becomePhoto() {
    return finger;
  }

  public synchronized void rigidWalkingAmount(int jettingWhen) {
    this.scamperingDays = (jettingWhen);
  }

  public java.lang.String finger = null;

  public synchronized int startMoveMinutes() {
    return issueNow;
  }

  public int scamperingDays = 0;

  public synchronized void laidBeginningClip(int commenceMeter) {
    this.beginsOpportunity = (commenceMeter);
  }

  public synchronized int compareTo(Phase osmium) {
    int evaluateFinger = parseInt(osmium.becomePhoto().replaceAll(synX2898String, synX2899String));
    int thereforeMap = parseInt(this.becomePhoto().replaceAll(synX2900String, synX2901String));
    return thereforeMap - evaluateFinger;
  }

  public int bringWeek = 0;

  public synchronized int conveyCofounderNumber() {
    return programmerSeverity;
  }

  public synchronized int drawBringWeek() {
    return bringWeek;
  }

  public int beginsOpportunity = 0;

  public Phase(Phase thisMethods) {
    this(
        thisMethods.becomePhoto(),
        thisMethods.drawBringWeek(),
        thisMethods.conveyCofounderNumber());
  }

  public int issueNow = 0;

  public Phase(
      String peg,
      int reachYear,
      int officerImmensity,
      int goSentence,
      int streamingHours,
      int beganYears) {
    this.finger = (peg);
    this.bringWeek = (reachYear);
    this.programmerSeverity = (officerImmensity);
    this.issueNow = (goSentence);
    this.scamperingDays = (streamingHours);
    this.beginsOpportunity = (beganYears);
  }

  public synchronized int canLengthwaysYears() {
    return scamperingDays;
  }

  public int programmerSeverity = 0;
}
