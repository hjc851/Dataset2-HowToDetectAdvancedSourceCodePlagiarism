package acculturative;

public class YearWarder {
  private static acculturative.YearWarder presentedAmountRearing;

  public static synchronized acculturative.YearWarder beatCollaborativeJunctureJailer() {

    if (presentedAmountRearing == null) presentedAmountRearing = new acculturative.YearWarder();

    return presentedAmountRearing;
  }

  public static synchronized double flowMonth() {
    return beatCollaborativeJunctureJailer().haveCirculatingPeriods();
  }

  public static synchronized void doAgain(double direct) {
    beatCollaborativeJunctureJailer().springEfp(direct);
  }

  private double newChance;

  private YearWarder() {
    this.newChance = 0;
  }

  private synchronized double haveCirculatingPeriods() {
    return this.newChance;
  }

  private synchronized void springEfp(double threshold) {
    this.newChance = threshold;
  }
}
