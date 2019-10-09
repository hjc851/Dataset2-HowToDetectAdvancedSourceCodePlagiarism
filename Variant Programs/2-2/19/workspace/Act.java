package workspace;

public class Act implements Comparable<Act> {
  private String milad;
  private int hearThing;
  private int programmerSeverity;
  private int kickoffHours;
  private int issueNow;
  private int workingClip;

  public Act(Act presentlyMechanism) {
    this(
        presentlyMechanism.sustainSelf(),
        presentlyMechanism.bringArrivalMeter(),
        presentlyMechanism.arrivePrezWingspan());
  }

  public Act(String est, int occurYears, int prezWingspan) {
    this(est, occurYears, prezWingspan, 0, 0, 0);
  }

  public Act(
      String finger,
      int getClip,
      int directorStature,
      int withdrawBeginning,
      int lengthwaysYears,
      int originateChance) {
    this.milad = finger;
    this.hearThing = getClip;
    this.programmerSeverity = directorStature;
    this.issueNow = withdrawBeginning;
    this.workingClip = lengthwaysYears;
    this.kickoffHours = originateChance;
  }

  public String sustainSelf() {
    return milad;
  }

  public int bringArrivalMeter() {
    return hearThing;
  }

  public int arrivePrezWingspan() {
    return programmerSeverity;
  }

  public int fixWithdrawalChance() {
    return issueNow;
  }

  public void rigidQuittingAmount(int withdrawalChance) {
    this.issueNow = withdrawalChance;
  }

  public int obtainScamperingDays() {
    return workingClip;
  }

  public void rigidWalkingAmount(int flowingSentence) {
    this.workingClip = flowingSentence;
  }

  public void readyOutsetDay(int runJuncture) {
    this.kickoffHours = runJuncture;
  }

  public int compareTo(Act ischium) {
    int collatePicture = Integer.parseInt(ischium.sustainSelf().replaceAll("[\\D]", ""));
    int letIdentification = Integer.parseInt(this.sustainSelf().replaceAll("[\\D]", ""));
    return letIdentification - collatePicture;
  }
}
