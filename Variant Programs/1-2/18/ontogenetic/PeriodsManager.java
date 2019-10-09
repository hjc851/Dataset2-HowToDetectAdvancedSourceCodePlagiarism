package ontogenetic;

public class PeriodsManager {
  private static ontogenetic.PeriodsManager borneAgainOfficer;

  public static ontogenetic.PeriodsManager findJointSentenceGoalie() {

    if (borneAgainOfficer == null) borneAgainOfficer = new ontogenetic.PeriodsManager();

    return borneAgainOfficer;
  }

  public static double topicalPeriod() {
    return findJointSentenceGoalie().fixNewChance();
  }

  public static void placeWeek(double aim) {
    findJointSentenceGoalie().alternateEmap(aim);
  }

  private double continuingAgain;

  private PeriodsManager() {
    this.continuingAgain = 0;
  }

  private double fixNewChance() {
    return this.continuingAgain;
  }

  private void alternateEmap(double objectives) {
    this.continuingAgain = objectives;
  }
}
