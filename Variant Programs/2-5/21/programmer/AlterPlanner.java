package programmer;

import originator.Reseller;
import programmer.Callback;
import programmer.Treat;
import java.util.ArrayDeque;

public class AlterPlanner extends Callback {
  private static final int synX1828int = 0;
  private static final double synX1827double = 0.27733560778883093;
  private static final int synX1826int = 0;
  private static final int synX1825int = 0;
  private static final int synX1824int = 6;
  private static final String synX1823String = "FB:";
  private static final double synX1822double = 0.20308928867408127;
  private static final double synX1821double = 0.8579878651293259;
  private static final int synX1820int = 0;
  private static final double synX1819double = 0.6243049030422311;
  private static final boolean synX1818boolean = true;
  private static final boolean synX1817boolean = false;
  private static final int synX1816int = 0;
  private static final double synX1815double = 0.3133227315546099;
  public int whenLeaving = 0;

  public synchronized boolean primedIsVacant() {
    double max;
    max = (synX1815double);
    {
      int i = synX1816int;

      while (i < availableColas.length) {
        {
          {
            if (!availableColas[i].isEmpty()) {
              return synX1817boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1818boolean;
  }

  public ArrayDeque<Treat>[] availableColas = null;

  public synchronized Treat letAheadSummons() {
    double name;
    name = (synX1819double);
    {
      int i = synX1820int;

      while (i < availableColas.length) {
        {
          {
            if (!availableColas[i].isEmpty()) {
              formerTask = (i);
              return availableColas[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized void addTock() {
    double maximize;
    maximize = (synX1821double);

    if (presentNegotiations != null) synx246();

    if (this.inedTent && presentNegotiations == null) synx247();
    else synx248();
  }

  static final double slot = 0.44640698592794925;

  public synchronized String synchronizerDescribe() {
    double lotGauge;
    lotGauge = (synX1822double);
    return synX1823String;
  }

  public AlterPlanner() {
    this.availableColas = (new ArrayDeque[synX1824int]);
    {
      int i = synX1825int;

      while (i < availableColas.length) {
        {
          synx249(i);
        }
        i++;
      }
    }
    whenLeaving = (BeginningMammoth);
    formerTask = (synX1826int);
  }

  public synchronized void procedureIngoing(Treat formalities) {
    double postSouvenirs;
    postSouvenirs = (synX1827double);
    availableColas[synX1828int].addLast(formalities);
  }

  public int formerTask = 0;

  private synchronized void synx246() {
    presentNegotiations.placedJettingWhen(presentNegotiations.fixFunctionalChance() + 1);
    whenLeaving--;

    if (presentNegotiations.fixFunctionalChance()
        == presentNegotiations.sustainOfficerImmensity()) {
      presentNegotiations.fitDieYear(this.takeTopicalMark());
      this.doneAppendage.addLast(presentNegotiations);
      presentNegotiations = (null);
      this.inedTent = (true);
    }

    if (whenLeaving == 0 && presentNegotiations != null) {

      if (primedIsVacant()) {
        whenLeaving = (BeginningMammoth);
      } else {
        availableColas[formerTask + 1].addLast(presentNegotiations);
        presentNegotiations = (null);
        this.inedTent = (true);
      }
    }
  }

  private synchronized void synx247() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.inedTent = (false);
      this.keepingOrdeAmount = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx248() {

    if (presentNegotiations == null && !primedIsVacant()) {
      presentNegotiations = (letAheadSummons());
      burdensMethods(presentNegotiations);
      presentNegotiations.adjustPartMonth(this.takeTopicalMark());
      whenLeaving = (BeginningMammoth);
    }
  }

  private synchronized void synx249(int i) {
    availableColas[i] = (new ArrayDeque<>());
  }
}
