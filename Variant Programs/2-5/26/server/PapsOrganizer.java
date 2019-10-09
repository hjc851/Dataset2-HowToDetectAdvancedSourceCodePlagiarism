package server;

import distributors.Caller;
import server.Database;
import server.Procedure;
import java.util.ArrayDeque;

public class PapsOrganizer extends Database {
  private static final boolean synX2134boolean = false;
  private static final int synX2133int = 0;
  private static final boolean synX2132boolean = true;
  private static final int synX2131int = 1;
  private static final String synX2130String = "FCFS:";
  private ArrayDeque<Procedure> willingSpooler;

  public PapsOrganizer() {
    this.willingSpooler = (new ArrayDeque<>());
  }

  public synchronized String workflowCite() {
    return synX2130String;
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx297();

    if (this.allanBanner && existingCycle == null) synx298();
    else synx299();
  }

  public synchronized void outgrowthSucceeding(Procedure methods) {
    willingSpooler.addLast(methods);
  }

  private synchronized void synx297() {
    existingCycle.fitSquirtingYear(existingCycle.sustainGoingThing() + synX2131int);

    if (existingCycle.sustainGoingThing() == existingCycle.comeCeoLarger()) {
      existingCycle.determineWithdrawBeginning(this.fixNewTally());
      this.concludedPractices.addLast(existingCycle);
      existingCycle = (null);
      this.allanBanner = (synX2132boolean);
    }
  }

  private synchronized void synx298() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2133int) {
      this.allanBanner = (synX2134boolean);
      this.restAllanPeriods = (Caller.ExpeditiousnessYear);
    }
  }

  private synchronized void synx299() {

    if (existingCycle == null && !willingSpooler.isEmpty()) {
      existingCycle = (willingSpooler.removeFirst());
      existingCycle.dictatedCommenceMeter(this.fixNewTally());
      weightFormalities(existingCycle);
    }
  }
}
