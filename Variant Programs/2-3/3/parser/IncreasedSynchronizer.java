package parser;

import mailer.Responsible;
import parser.Compiler;
import parser.March;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends Compiler {
  private PriorityQueue<March> fixJumping;
  private Comparator<March> placebo;

  public IncreasedSynchronizer() {
    this.placebo = new SummonsBenchmark();
    this.fixJumping = new PriorityQueue<>(5, placebo);
  }

  private class SummonsBenchmark implements Comparator<March> {

    public synchronized int compare(March conf, March bl) {
      int confLeft = conf.becomeChiefQuantity() - conf.becomeContinualOpportunity();
      int c2Unresolved = bl.becomeChiefQuantity() - bl.becomeContinualOpportunity();

      if (confLeft < c2Unresolved) {
        return -1;
      }

      if (confLeft > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String databaseNickname() {
    return "SRT:";
  }

  public synchronized void bpsRetick() {

    if (circulatingServe != null) {
      circulatingServe.doRushingAgain(circulatingServe.becomeContinualOpportunity() + 1);

      if (circulatingServe.becomeContinualOpportunity() == circulatingServe.becomeChiefQuantity()) {
        circulatingServe.doExodusAgain(this.haveCirculatingShudder());
        this.constructedMethodology.addLast(circulatingServe);
        circulatingServe = null;
        this.thmFlagstone = true;
      }
    }

    if (!fixJumping.isEmpty() && circulatingServe != null) {
      int prevailingLeft =
          circulatingServe.becomeChiefQuantity() - circulatingServe.becomeContinualOpportunity();
      int glintLeftover =
          fixJumping.peek().becomeChiefQuantity() - fixJumping.peek().becomeContinualOpportunity();

      if (glintLeftover < prevailingLeft) {
        fixJumping.add(circulatingServe);
        circulatingServe = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && circulatingServe == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.thmFlagstone = false;
        this.leavingBrinWhen = Responsible.DischargeDays;
      }

    } else {

      if (circulatingServe == null && !fixJumping.isEmpty()) {
        circulatingServe = fixJumping.poll();
        consignmentTreat(circulatingServe);
        circulatingServe.fixedBeginsOpportunity(this.haveCirculatingShudder());
      }
    }
  }

  public synchronized void methodsElected(March procedure) {
    fixJumping.add(procedure);
  }
}
