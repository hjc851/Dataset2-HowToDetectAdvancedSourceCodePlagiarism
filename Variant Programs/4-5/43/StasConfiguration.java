import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StasConfiguration extends Spooler {
  private static final int synX2434int = 0;
  private static final int synX2433int = 0;
  private static final String synX2432String = "UuR8XBxnR1AUjmx";
  private static final int synX2431int = 1412602903;
  private static final double synX2430double = 8.166308910763087E-4;
  private static final int synX2429int = -970891726;
  private static final int synX2428int = -331859759;
  public int sentenceUnexpended;
  public java.util.ArrayDeque<Responsibility> liabilityGlue;
  public java.util.ArrayDeque<Formalities> primedWaiting;
  static final String amount = "4F";

  public StasConfiguration() {
    this.primedWaiting = (new java.util.ArrayDeque<>());
    this.liabilityGlue = (new java.util.ArrayDeque<>());
    sentenceUnexpended = (ThingLibido);
  }

  public synchronized void nsoTic() {
    int distinguish;
    java.util.List<Responsibility> blunders;
    distinguish = (synX2428int);
    blunders = (new java.util.LinkedList<>());
    for (Responsibility f : liabilityGlue) synx342(f, blunders);
    for (Responsibility liability : blunders) synx343(liability);

    if (previousProceeding != null) synx344();

    if (previousProceeding == null && !primedWaiting.isEmpty()) synx345();

    this.campaignSoonComplaint();
  }

  public synchronized void nextSue(Formalities operation) {
    int respect;
    respect = (synX2429int);
    primedWaiting.addLast(operation);
  }

  public synchronized Formalities quickAppendage() {
    double deptSpan;
    deptSpan = (synX2430double);
    return primedWaiting.removeFirst();
  }

  public synchronized void campaignSoonComplaint() {
    int guarantee;
    guarantee = (synX2431int);

    if (this.previousProceeding == null) {
      return;
    }

    while (!substitutesApproaches.tabAsked(this.previousProceeding)) {
      this.getTableCriticize();
      sentenceUnexpended = (ThingLibido);

      if (!primedWaiting.isEmpty()) synx346();
      else {
        previousProceeding = (null);
        return;
      }
    }
    previousProceeding.outgrowthLastSuggestion();
  }

  public synchronized void getTableCriticize() {
    String northRestriction;
    Responsibility f;
    northRestriction = (synX2432String);
    f = (new Responsibility(this.goPrevailingClick(), previousProceeding));
    liabilityGlue.add(f);
    previousProceeding.receiveDefect().add(f);
  }

  private synchronized void synx342(Responsibility f, java.util.List<Responsibility> blunders) {

    if (f.takeQuickPeriod() == this.goPrevailingClick()) blunders.add(f);
  }

  private synchronized void synx343(Responsibility liability) {
    liabilityGlue.remove(liability);
    substitutesApproaches.createAddendum(
        new Web(
            liability.canCycle().haveDemands().peek(),
            liability.canCycle().produceMap(),
            synX2433int),
        liability.canCycle());

    if (!primedWaiting.contains(liability.canCycle())) {
      this.nextSue(liability.canCycle());
    }
  }

  private synchronized void synx344() {
    sentenceUnexpended--;

    if (previousProceeding.isEnded()) {
      previousProceeding.placeEntranceWeek(this.goPrevailingClick());
      this.executedMethods.addLast(previousProceeding);
      previousProceeding = (null);
    }

    if (sentenceUnexpended == synX2434int && previousProceeding != null) {

      if (primedWaiting.isEmpty()) {
        sentenceUnexpended = (ThingLibido);
      } else {
        this.nextSue(previousProceeding);
        previousProceeding = (null);
      }
    }
  }

  private synchronized void synx345() {
    previousProceeding = (this.quickAppendage());
    sentenceUnexpended = (ThingLibido);
  }

  private synchronized void synx346() {
    previousProceeding = (quickAppendage());
  }
}
