package programmer;

import originator.Reseller;
import programmer.Callback;
import programmer.Treat;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  private static final double synX1814double = 0.2051626536813539;
  private static final int synX1813int = -1226634755;
  private static final String synX1812String = "NRR:";
  private static final double synX1811double = 0.9286840236152273;

  public GrrProgrammer() {
    this.cookCue = (new ArrayDeque<>());
    opportunityResidual = (Callback.BeginningMammoth);
  }

  static int netherTrammel = -1511413341;
  public int opportunityResidual = 0;

  public synchronized String synchronizerDescribe() {
    double nameBelongings;
    nameBelongings = (synX1811double);
    return synX1812String;
  }

  public synchronized void procedureIngoing(Treat work) {
    int belowReduce;
    belowReduce = (synX1813int);
    cookCue.add(new GrrProcedure(work));
  }

  public GrrProcedure grrProcedure = null;

  public synchronized void addTock() {
    double senateCurb;
    senateCurb = (synX1814double);

    if (grrProcedure != null) synx243();

    if (this.inedTent && presentNegotiations == null) synx244();
    else synx245();
  }

  public ArrayDeque<GrrProcedure> cookCue = null;

  private synchronized void synx243() {
    grrProcedure.placedJettingWhen(grrProcedure.fixFunctionalChance() + 1);
    opportunityResidual--;

    if (grrProcedure.fixFunctionalChance() == grrProcedure.sustainOfficerImmensity()) {
      grrProcedure.fitDieYear(this.takeTopicalMark());
      this.doneAppendage.addLast(grrProcedure);
      grrProcedure = (null);
      this.inedTent = (true);
    }

    if (opportunityResidual == 0 && grrProcedure != null) {

      if (cookCue.isEmpty()) {
        opportunityResidual = (grrProcedure.arriveMonthLarge());
      } else {

        if (grrProcedure.arriveMonthLarge() > 2) {
          grrProcedure.markHoursHuge(grrProcedure.arriveMonthLarge() - 1);
        }

        cookCue.addLast(grrProcedure);
        grrProcedure = (null);
        this.inedTent = (true);
      }
    }
  }

  private synchronized void synx244() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.inedTent = (false);
      this.keepingOrdeAmount = (Reseller.DespatchClock);
    }
  }

  private synchronized void synx245() {

    if (grrProcedure == null && !cookCue.isEmpty()) {
      grrProcedure = (cookCue.removeFirst());
      burdensMethods(grrProcedure);
      grrProcedure.adjustPartMonth(this.takeTopicalMark());
      opportunityResidual = (grrProcedure.arriveMonthLarge());
    }
  }
}
