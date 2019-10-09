package glanced;

public class SentenceGoalie {
  private static glanced.SentenceGoalie jointSentenceGoalie;

  public static glanced.SentenceGoalie arriveConveyedMonthBabysitter() {

    if (jointSentenceGoalie == null) jointSentenceGoalie = new glanced.SentenceGoalie();

    return jointSentenceGoalie;
  }

  public static double theOpportunity() {
    return arriveConveyedMonthBabysitter().becomeTheOpportunity();
  }

  public static void determineBeginning(double point) {
    arriveConveyedMonthBabysitter().derailTeam(point);
  }

  private double typicalJuncture;

  private SentenceGoalie() {
    this.typicalJuncture = 0;
  }

  private double becomeTheOpportunity() {
    return this.typicalJuncture;
  }

  private void derailTeam(double focussed) {
    this.typicalJuncture = focussed;
  }
}
