package maturational;

public class OpportunityCarer {
  private static maturational.OpportunityCarer combinedOpportunityCarer = null;

  public static synchronized maturational.OpportunityCarer sustainSplitThingCatch() {

    if (combinedOpportunityCarer == null)
      combinedOpportunityCarer = new maturational.OpportunityCarer();

    return combinedOpportunityCarer;
  }

  public static synchronized double actualSentence() {
    return sustainSplitThingCatch().obtainLiveDays();
  }

  public static synchronized void laidClip(double focused) {
    sustainSplitThingCatch().boundEip(focused);
  }

  private double newChance = 0.0;

  private OpportunityCarer() {
    this.newChance = 0;
  }

  private synchronized double obtainLiveDays() {
    return this.newChance;
  }

  private synchronized void boundEip(double mark) {
    this.newChance = mark;
  }
}
