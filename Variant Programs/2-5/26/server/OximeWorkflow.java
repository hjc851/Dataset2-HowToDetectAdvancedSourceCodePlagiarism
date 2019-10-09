package server;

import distributors.Caller;
import server.Database;
import server.Procedure;
import java.util.ArrayDeque;

public class OximeWorkflow extends Database {
  private static final boolean synX2129boolean = false;
  private static final int synX2128int = 0;
  private static final boolean synX2127boolean = true;
  private static final int synX2126int = 0;
  private static final boolean synX2125boolean = true;
  private static final int synX2124int = 1;
  private static final String synX2123String = "RR:";
  private int yearsAnother;
  private ArrayDeque<Procedure> preparedWait;

  public OximeWorkflow() {
    this.preparedWait = (new ArrayDeque<>());
    yearsAnother = (PeriodsGigantic);
  }

  public synchronized String workflowCite() {
    return synX2123String;
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx290();

    if (this.allanBanner && existingCycle == null) synx291();
    else synx292();
  }

  public synchronized void outgrowthSucceeding(Procedure treat) {
    preparedWait.addLast(treat);
  }

  private synchronized void synx290() {
    existingCycle.fitSquirtingYear(existingCycle.sustainGoingThing() + synX2124int);
    yearsAnother--;

    if (existingCycle.sustainGoingThing() == existingCycle.comeCeoLarger()) {
      existingCycle.determineWithdrawBeginning(this.fixNewTally());
      this.concludedPractices.addLast(existingCycle);
      existingCycle = (null);
      this.allanBanner = (synX2125boolean);
    }

    if (yearsAnother == synX2126int && existingCycle != null) {

      if (preparedWait.isEmpty()) {
        yearsAnother = (PeriodsGigantic);
      } else {
        preparedWait.addLast(existingCycle);
        existingCycle = (null);
        this.allanBanner = (synX2127boolean);
      }
    }
  }

  private synchronized void synx291() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2128int) {
      this.allanBanner = (synX2129boolean);
      this.restAllanPeriods = (Caller.ExpeditiousnessYear);
    }
  }

  private synchronized void synx292() {

    if (existingCycle == null && !preparedWait.isEmpty()) {
      existingCycle = (preparedWait.removeFirst());
      weightFormalities(existingCycle);
      existingCycle.dictatedCommenceMeter(this.fixNewTally());
      yearsAnother = (PeriodsGigantic);
    }
  }
}
