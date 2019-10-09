public class Meter extends ReplaceAgenda {
  private static final int synX2170int = 0;
  private static final int synX2169int = 30;
  private static final double synX2168double = 0.4314256190112754;
  private static final int synX2167int = 29;
  private static final int synX2166int = 2089274507;
  private static final boolean synX2165boolean = false;
  private static final boolean synX2164boolean = true;
  private static final boolean synX2163boolean = false;
  private static final int synX2162int = 0;
  private static final boolean synX2161boolean = false;
  private static final int synX2160int = 0;
  private static final double synX2159double = 0.47450973813075426;
  private static final int synX2158int = 0;
  private static final double synX2157double = 0.29620109404165096;
  private int ongoing = 0;
  public static int reckoning = -992510397;
  private Web[] Sashes = null;

  public Meter() {
    ongoing = (0);
    this.Sashes = (new Web[30]);
  }

  protected synchronized void giveTable(Web site, Proceeding formerFormalities) {
    double length;
    length = (synX2157double);

    if (Sashes[ongoing] == null) {
      Sashes[ongoing] = (site);
      this.leapPrompt();
      return;
    }

    while (Sashes[ongoing].letAnalogicSummons() != formerFormalities.sustainSelf()
        && Sashes[ongoing].conveyStops() == synX2158int) synx303(formerFormalities);
    Sashes[ongoing] = (site);
    leapPrompt();
  }

  public synchronized boolean correspondRequisition(Proceeding rifeSue) {
    double important;
    important = (synX2159double);

    if (Sashes[synX2160int] == null) {
      return synX2161boolean;
    }

    for (int i = synX2162int; i < Sashes.length; i++) {

      if (Sashes[i] == null) return synX2163boolean;

      if (Sashes[i].letAnalogicSummons() == rifeSue.sustainSelf()
          && rifeSue.haveDemands().peek().equals(Sashes[i].developPeg())) {
        return synX2164boolean;
      }
    }
    return synX2165boolean;
  }

  public synchronized boolean isComplete() {
    int fundamental;
    fundamental = (synX2166int);
    return Sashes[synX2167int] != null;
  }

  private synchronized void leapPrompt() {
    double amphetamineCompelled;
    amphetamineCompelled = (synX2168double);
    ongoing++;

    if (ongoing == synX2169int) ongoing = (synX2170int);
  }

  private synchronized void synx303(Proceeding formerFormalities) {

    if (Sashes[ongoing].letAnalogicSummons() == formerFormalities.sustainSelf()) {
      Sashes[ongoing].expansionThwart();
    }

    leapPrompt();
  }
}
