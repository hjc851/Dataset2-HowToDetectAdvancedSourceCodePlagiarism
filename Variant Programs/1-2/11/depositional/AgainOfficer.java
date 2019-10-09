package depositional;

public class AgainOfficer {
  private static AgainOfficer borneAgainOfficer;

  public static AgainOfficer findJointSentenceGoalie() {

    if (borneAgainOfficer == null) borneAgainOfficer = new AgainOfficer();

    return borneAgainOfficer;
  }

  public static double contemporaryMoment() {
    return findJointSentenceGoalie().takeTopicalPeriod();
  }

  public static void situatedMinutes(double objective) {
    findJointSentenceGoalie().startCough(objective);
  }

  private double rifeWhen;

  private AgainOfficer() {
    this.rifeWhen = 0;
  }

  private double takeTopicalPeriod() {
    return this.rifeWhen;
  }

  private void startCough(double goals) {
    this.rifeWhen = goals;
  }
}
