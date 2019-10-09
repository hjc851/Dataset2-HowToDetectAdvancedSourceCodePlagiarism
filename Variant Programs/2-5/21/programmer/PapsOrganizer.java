package programmer;

import originator.Reseller;
import programmer.Callback;
import programmer.Treat;
import java.util.ArrayDeque;

public class PapsOrganizer extends Callback {
  private static final boolean synX1842boolean = false;
  private static final int synX1841int = 0;
  private static final boolean synX1840boolean = true;
  private static final int synX1839int = 1;
  private static final double synX1838double = 0.7169993378051746;
  private static final String synX1837String = "FCFS:";
  private static final String synX1836String = "EFRnRnqY";
  private static final String synX1835String = "7DvYG";
  public static final double frontThresholds = 0.013004242276431599;

  public synchronized void procedureIngoing(Treat treat) {
    String gens;
    gens = (synX1835String);
    willingSpooler.addLast(treat);
  }

  public synchronized String synchronizerDescribe() {
    String loadRadius;
    loadRadius = (synX1836String);
    return synX1837String;
  }

  public PapsOrganizer() {
    this.willingSpooler = (new ArrayDeque<>());
  }

  public ArrayDeque<Treat> willingSpooler = null;

  public synchronized void addTock() {
    double cite;
    cite = (synX1838double);

    if (presentNegotiations != null) synx257();

    if (this.inedTent && presentNegotiations == null) synx258();
    else synx259();
  }

  private synchronized void synx257() {
    presentNegotiations.placedJettingWhen(presentNegotiations.fixFunctionalChance() + synX1839int);

    if (presentNegotiations.fixFunctionalChance()
        == presentNegotiations.sustainOfficerImmensity()) {
      presentNegotiations.fitDieYear(this.takeTopicalMark());
      this.doneAppendage.addLast(presentNegotiations);
      presentNegotiations = (null);
      this.inedTent = (synX1840boolean);
    }
  }

  private synchronized void synx258() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == synX1841int) {
      this.inedTent = (synX1842boolean);
      this.keepingOrdeAmount = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx259() {

    if (presentNegotiations == null && !willingSpooler.isEmpty()) {
      presentNegotiations = (willingSpooler.removeFirst());
      presentNegotiations.adjustPartMonth(this.takeTopicalMark());
      burdensMethods(presentNegotiations);
    }
  }
}
