package checked;

public class AgainOfficer {
  private static AgainOfficer mutualClockCustodian;

  public static AgainOfficer findJointSentenceGoalie() {

    if (mutualClockCustodian == null) mutualClockCustodian = new AgainOfficer();

    return mutualClockCustodian;
  }

  public static double flowMonth() {
    return findJointSentenceGoalie().becomeTheOpportunity();
  }

  public static void determinedDays(double priority) {
    findJointSentenceGoalie().startleCss(priority);
  }

  private double formerAmount;

  private AgainOfficer() {
    this.formerAmount = 0;
  }

  private double becomeTheOpportunity() {
    return this.formerAmount;
  }

  private void startleCss(double achieve) {
    this.formerAmount = achieve;
  }
}
