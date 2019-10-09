package programmer;

import originator.Reseller;
import programmer.Callback;
import programmer.Treat;
import java.util.ArrayDeque;

public class FDebugging extends Callback {
  private static final String synX1832String = "RR:";
  private static final double synX1831double = 0.22513058054242252;
  private static final int synX1830int = -1212646545;
  private static final double synX1829double = 0.2518281660798972;

  public synchronized void procedureIngoing(Treat negotiations) {
    double number;
    number = (synX1829double);
    promptPenis.addLast(negotiations);
  }

  public synchronized void addTock() {
    int beacon;
    beacon = (synX1830int);

    if (presentNegotiations != null) synx250();

    if (this.inedTent && presentNegotiations == null) synx251();
    else synx252();
  }

  static String calculation = "ezt7K";

  public FDebugging() {
    this.promptPenis = (new ArrayDeque<>());
    nowUnanswered = (BeginningMammoth);
  }

  public ArrayDeque<Treat> promptPenis = null;

  public synchronized String synchronizerDescribe() {
    double juniorRestriction;
    juniorRestriction = (synX1831double);
    return synX1832String;
  }

  public int nowUnanswered = 0;

  private synchronized void synx250() {
    presentNegotiations.placedJettingWhen(presentNegotiations.fixFunctionalChance() + 1);
    nowUnanswered--;

    if (presentNegotiations.fixFunctionalChance()
        == presentNegotiations.sustainOfficerImmensity()) {
      presentNegotiations.fitDieYear(this.takeTopicalMark());
      this.doneAppendage.addLast(presentNegotiations);
      presentNegotiations = (null);
      this.inedTent = (true);
    }

    if (nowUnanswered == 0 && presentNegotiations != null) {

      if (promptPenis.isEmpty()) {
        nowUnanswered = (BeginningMammoth);
      } else {
        promptPenis.addLast(presentNegotiations);
        presentNegotiations = (null);
        this.inedTent = (true);
      }
    }
  }

  private synchronized void synx251() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.inedTent = (false);
      this.keepingOrdeAmount = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx252() {

    if (presentNegotiations == null && !promptPenis.isEmpty()) {
      presentNegotiations = (promptPenis.removeFirst());
      burdensMethods(presentNegotiations);
      presentNegotiations.adjustPartMonth(this.takeTopicalMark());
      nowUnanswered = (BeginningMammoth);
    }
  }
}
