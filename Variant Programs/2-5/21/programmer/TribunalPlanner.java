package programmer;

import originator.Reseller;
import programmer.Callback;
import programmer.Treat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends Callback {
  private static final String synX1834String = "SRT:";
  private static final double synX1833double = 0.8996234724651277;
  public Comparator<Treat> crosswalk = null;
  static double numeration = 0.25522028857960166;

  public synchronized String synchronizerDescribe() {
    double consider;
    consider = (synX1833double);
    return synX1834String;
  }

  public PriorityQueue<Treat> prepareLine = null;

  public class MethodsDiscriminator implements Comparator<Treat> {

    public synchronized int compare(Treat p5, Treat p3) {
      String circumscribe;
      int b2Still;
      int p4Unexhausted;
      circumscribe = ("MiW5OghbJoEXG");
      b2Still = (p5.sustainOfficerImmensity() - p5.fixFunctionalChance());
      p4Unexhausted = (p3.sustainOfficerImmensity() - p3.fixFunctionalChance());

      if (b2Still < p4Unexhausted) {
        return -1;
      }

      if (b2Still > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void addTock() {
    int elevationIndentured;
    elevationIndentured = (-528309148);

    if (presentNegotiations != null) synx253();

    if (!prepareLine.isEmpty() && presentNegotiations != null) synx254();

    if (this.inedTent && presentNegotiations == null) synx255();
    else synx256();
  }

  public synchronized void procedureIngoing(Treat serve) {
    double apexSure;
    apexSure = (0.4865020867560258);
    prepareLine.add(serve);
  }

  public TribunalPlanner() {
    this.crosswalk = (new MethodsDiscriminator());
    this.prepareLine = (new PriorityQueue<>(5, crosswalk));
  }

  private synchronized void synx253() {
    presentNegotiations.placedJettingWhen(presentNegotiations.fixFunctionalChance() + 1);

    if (presentNegotiations.fixFunctionalChance()
        == presentNegotiations.sustainOfficerImmensity()) {
      presentNegotiations.fitDieYear(this.takeTopicalMark());
      this.doneAppendage.addLast(presentNegotiations);
      presentNegotiations = (null);
      this.inedTent = (true);
    }
  }

  private synchronized void synx254() {
    int prevailingLeft;
    int pokeKeeping;
    prevailingLeft =
        (presentNegotiations.sustainOfficerImmensity() - presentNegotiations.fixFunctionalChance());
    pokeKeeping =
        (prepareLine.peek().sustainOfficerImmensity() - prepareLine.peek().fixFunctionalChance());

    if (pokeKeeping < prevailingLeft) {
      prepareLine.add(presentNegotiations);
      presentNegotiations = (null);
      this.inedTent = (true);
    }
  }

  private synchronized void synx255() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.inedTent = (false);
      this.keepingOrdeAmount = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx256() {

    if (presentNegotiations == null && !prepareLine.isEmpty()) {
      presentNegotiations = (prepareLine.poll());
      burdensMethods(presentNegotiations);
      presentNegotiations.adjustPartMonth(this.takeTopicalMark());
    }
  }
}
