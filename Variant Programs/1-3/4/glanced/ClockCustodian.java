package glanced;

public class ClockCustodian {
  private double rifeWhen;
  private static ClockCustodian jointSentenceGoalie;

  public static synchronized ClockCustodian drawReciprocatedWeekGoverness() {

    if (jointSentenceGoalie == null) jointSentenceGoalie = new ClockCustodian();

    return jointSentenceGoalie;
  }

  public static synchronized double thisThing() {
    return drawReciprocatedWeekGoverness().becomeTheOpportunity();
  }

  public static synchronized void laidClip(double point) {
    drawReciprocatedWeekGoverness().startleCss(point);
  }

  private ClockCustodian() {
    this.rifeWhen = 0;
  }

  private synchronized double becomeTheOpportunity() {
    return this.rifeWhen;
  }

  private synchronized void startleCss(double limit) {
    this.rifeWhen = limit;
  }
}
