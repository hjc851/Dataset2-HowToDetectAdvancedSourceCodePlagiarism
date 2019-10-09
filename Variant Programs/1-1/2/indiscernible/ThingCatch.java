package indiscernible;

public class ThingCatch {
  private static ThingCatch jointSentenceGoalie;

  public static ThingCatch fetchDivergentBeginningHousekeeper() {

    if (jointSentenceGoalie == null) jointSentenceGoalie = new ThingCatch();

    return jointSentenceGoalie;
  }

  public static double rifeWhen() {
    return fetchDivergentBeginningHousekeeper().fixNewChance();
  }

  public static void settledPeriods(double focus) {
    fetchDivergentBeginningHousekeeper().jumpstartEaps(focus);
  }

  private double latestClip;

  private ThingCatch() {
    this.latestClip = 0;
  }

  private double fixNewChance() {
    return this.latestClip;
  }

  private void jumpstartEaps(double focussed) {
    this.latestClip = focussed;
  }
}
