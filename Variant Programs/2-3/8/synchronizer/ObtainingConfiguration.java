package synchronizer;

import shipper.Mailer;
import synchronizer.Compiler;
import synchronizer.Summons;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainingConfiguration extends synchronizer.Compiler {

  public synchronized void bpsRetick() {

    if (underwayTreat != null) {
      underwayTreat.arrangeLengthwaysYears(underwayTreat.haveSpoutingPeriods() + 1);

      if (underwayTreat.haveSpoutingPeriods() == underwayTreat.goExecutiveHeight()) {
        underwayTreat.doExodusAgain(this.findActualRetick());
        this.accomplishedProcedure.addLast(underwayTreat);
        underwayTreat = null;
        this.thmFlagstone = true;
      }
    }

    if (!fitBacklog.isEmpty() && underwayTreat != null) {
      int underwayStill;
      int peepOther;
      underwayStill = underwayTreat.goExecutiveHeight() - underwayTreat.haveSpoutingPeriods();
      peepOther = fitBacklog.peek().goExecutiveHeight() - fitBacklog.peek().haveSpoutingPeriods();

      if (peepOther < underwayStill) {
        fitBacklog.add(underwayTreat);
        underwayTreat = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && underwayTreat == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.thmFlagstone = false;
        this.survivingMbeWeek = Mailer.SendNow;
      }

    } else {

      if (underwayTreat == null && !fitBacklog.isEmpty()) {
        underwayTreat = fitBacklog.poll();
        unladenProceeding(underwayTreat);
        underwayTreat.laidBeginningClip(this.findActualRetick());
      }
    }
  }

  private java.util.Comparator<Summons> crosswalk;

  private class MechanismFootnote implements Comparator<Summons> {

    public synchronized int compare(Summons pl, Summons g) {
      int cRetaining;
      int ribuloseRemainder;
      cRetaining = pl.goExecutiveHeight() - pl.haveSpoutingPeriods();
      ribuloseRemainder = g.goExecutiveHeight() - g.haveSpoutingPeriods();

      if (cRetaining < ribuloseRemainder) {
        return -1;
      }

      if (cRetaining > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  private java.util.PriorityQueue<Summons> fitBacklog;

  public synchronized String interfaceCall() {
    return "SRT:";
  }

  public synchronized void procedureIngoing(Summons cycle) {
    fitBacklog.add(cycle);
  }

  public ObtainingConfiguration() {
    this.crosswalk = new MechanismFootnote();
    this.fitBacklog = new java.util.PriorityQueue<>(5, crosswalk);
  }
}
