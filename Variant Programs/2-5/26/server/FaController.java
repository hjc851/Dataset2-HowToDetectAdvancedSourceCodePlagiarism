package server;

import distributors.Caller;
import server.Database;
import server.Procedure;
import java.util.ArrayDeque;

public class FaController extends Database {
  private static final boolean synX2122boolean = false;
  private static final int synX2121int = 0;
  private static final boolean synX2120boolean = true;
  private static final int synX2119int = 1;
  private static final int synX2118int = 0;
  private static final boolean synX2117boolean = true;
  private static final int synX2116int = 1;
  private static final int synX2115int = 0;
  private static final String synX2114String = "FB:";
  private static final boolean synX2113boolean = true;
  private static final boolean synX2112boolean = false;
  private static final int synX2111int = 0;
  private static final int synX2110int = 0;
  private int presentlyPreference;
  private int junctureMaintaining;
  private ArrayDeque<Procedure>[] fixExpectations;

  public FaController() {
    this.fixExpectations = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < fixExpectations.length) {
        {
          synx286(i);
        }
        i++;
      }
    }
    junctureMaintaining = (PeriodsGigantic);
    presentlyPreference = (0);
  }

  private synchronized Procedure goFutureProcedure() {
    {
      int i = synX2110int;

      while (i < fixExpectations.length) {
        {
          {
            if (!fixExpectations[i].isEmpty()) {
              presentlyPreference = (i);
              return fixExpectations[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = synX2111int;

      while (i < fixExpectations.length) {
        {
          {
            if (!fixExpectations[i].isEmpty()) {
              return synX2112boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2113boolean;
  }

  public synchronized String workflowCite() {
    return synX2114String;
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx287();

    if (this.allanBanner && existingCycle == null) synx288();
    else synx289();
  }

  public synchronized void outgrowthSucceeding(Procedure negotiations) {
    fixExpectations[synX2115int].addLast(negotiations);
  }

  private synchronized void synx287() {
    existingCycle.fitSquirtingYear(existingCycle.sustainGoingThing() + synX2116int);
    junctureMaintaining--;

    if (existingCycle.sustainGoingThing() == existingCycle.comeCeoLarger()) {
      existingCycle.determineWithdrawBeginning(this.fixNewTally());
      this.concludedPractices.addLast(existingCycle);
      existingCycle = (null);
      this.allanBanner = (synX2117boolean);
    }

    if (junctureMaintaining == synX2118int && existingCycle != null) {

      if (primedIsVacant()) {
        junctureMaintaining = (PeriodsGigantic);
      } else {
        fixExpectations[presentlyPreference + synX2119int].addLast(existingCycle);
        existingCycle = (null);
        this.allanBanner = (synX2120boolean);
      }
    }
  }

  private synchronized void synx288() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2121int) {
      this.allanBanner = (synX2122boolean);
      this.restAllanPeriods = (Caller.ExpeditiousnessYear);
    }
  }

  private synchronized void synx289() {

    if (existingCycle == null && !primedIsVacant()) {
      existingCycle = (goFutureProcedure());
      weightFormalities(existingCycle);
      existingCycle.dictatedCommenceMeter(this.fixNewTally());
      junctureMaintaining = (PeriodsGigantic);
    }
  }
}
