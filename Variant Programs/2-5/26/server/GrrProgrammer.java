package server;

import distributors.Caller;
import server.Database;
import server.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends Database {
  private static final boolean synX2109boolean = false;
  private static final int synX2108int = 0;
  private static final boolean synX2107boolean = true;
  private static final int synX2106int = 1;
  private static final int synX2105int = 2;
  private static final int synX2104int = 0;
  private static final boolean synX2103boolean = true;
  private static final int synX2102int = 1;
  private static final String synX2101String = "NRR:";
  private GrrProcedure grrProcedure;
  private int momentUnexhausted;
  private ArrayDeque<GrrProcedure> cookCue;

  public GrrProgrammer() {
    this.cookCue = (new ArrayDeque<>());
    momentUnexhausted = (Database.PeriodsGigantic);
  }

  public synchronized String workflowCite() {
    return synX2101String;
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) synx283();

    if (this.allanBanner && existingCycle == null) synx284();
    else synx285();
  }

  public synchronized void outgrowthSucceeding(Procedure operation) {
    cookCue.add(new GrrProcedure(operation));
  }

  private synchronized void synx283() {
    grrProcedure.fitSquirtingYear(grrProcedure.sustainGoingThing() + synX2102int);
    momentUnexhausted--;

    if (grrProcedure.sustainGoingThing() == grrProcedure.comeCeoLarger()) {
      grrProcedure.determineWithdrawBeginning(this.fixNewTally());
      this.concludedPractices.addLast(grrProcedure);
      grrProcedure = (null);
      this.allanBanner = (synX2103boolean);
    }

    if (momentUnexhausted == synX2104int && grrProcedure != null) {

      if (cookCue.isEmpty()) {
        momentUnexhausted = (grrProcedure.fetchBeginningMammoth());
      } else {

        if (grrProcedure.fetchBeginningMammoth() > synX2105int) {
          grrProcedure.arrangedSentenceTeleportation(
              grrProcedure.fetchBeginningMammoth() - synX2106int);
        }

        cookCue.addLast(grrProcedure);
        grrProcedure = (null);
        this.allanBanner = (synX2107boolean);
      }
    }
  }

  private synchronized void synx284() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2108int) {
      this.allanBanner = (synX2109boolean);
      this.restAllanPeriods = (Caller.ExpeditiousnessYear);
    }
  }

  private synchronized void synx285() {

    if (grrProcedure == null && !cookCue.isEmpty()) {
      grrProcedure = (cookCue.removeFirst());
      weightFormalities(grrProcedure);
      grrProcedure.dictatedCommenceMeter(this.fixNewTally());
      momentUnexhausted = (grrProcedure.fetchBeginningMammoth());
    }
  }

  private synchronized void synx286(int i) {
    fixExpectations[i] = (new ArrayDeque<>());
  }
}
