package glanced;

public class OpportunityCarer {
  private static glanced.OpportunityCarer jointSentenceGoalie;

  public static glanced.OpportunityCarer fetchDivergentBeginningHousekeeper() {

    if (jointSentenceGoalie == null) jointSentenceGoalie = new glanced.OpportunityCarer();

    return jointSentenceGoalie;
  }

  public static double presentlyMinutes() {
    return fetchDivergentBeginningHousekeeper().takeTopicalPeriod();
  }

  public static void orderedChance(double priority) {
    fetchDivergentBeginningHousekeeper().parachutingCoughs(priority);
  }

  private double prevailingClock;

  private OpportunityCarer() {
    this.prevailingClock = 0;
  }

  private double takeTopicalPeriod() {
    return this.prevailingClock;
  }

  private void parachutingCoughs(double benchmark) {
    this.prevailingClock = benchmark;
  }
}
