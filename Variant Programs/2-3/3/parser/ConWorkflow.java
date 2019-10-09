package parser;

import mailer.Responsible;
import parser.Compiler;
import parser.March;
import java.util.ArrayDeque;

public class ConWorkflow extends Compiler {
  private ArrayDeque<March>[] willingStalks;
  private int momentUnexhausted;
  private int rifePrioritizing;

  public ConWorkflow() {
    this.willingStalks = new ArrayDeque[6];

    for (int i = 0; i < willingStalks.length; i++) {
      willingStalks[i] = new ArrayDeque<>();
    }
    momentUnexhausted = BeginningMammoth;
    rifePrioritizing = 0;
  }

  private synchronized March letAheadSummons() {

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        rifePrioritizing = i;
        return willingStalks[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String databaseNickname() {
    return "FB:";
  }

  public synchronized void bpsRetick() {

    if (circulatingServe != null) {
      circulatingServe.doRushingAgain(circulatingServe.becomeContinualOpportunity() + 1);
      momentUnexhausted--;

      if (circulatingServe.becomeContinualOpportunity() == circulatingServe.becomeChiefQuantity()) {
        circulatingServe.doExodusAgain(this.haveCirculatingShudder());
        this.constructedMethodology.addLast(circulatingServe);
        circulatingServe = null;
        this.thmFlagstone = true;
      }

      if (momentUnexhausted == 0 && circulatingServe != null) {

        if (primedIsVacant()) {
          momentUnexhausted = BeginningMammoth;
        } else {
          willingStalks[rifePrioritizing + 1].addLast(circulatingServe);
          circulatingServe = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && circulatingServe == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.thmFlagstone = false;
        this.leavingBrinWhen = Responsible.DischargeDays;
      }

    } else {

      if (circulatingServe == null && !primedIsVacant()) {
        circulatingServe = letAheadSummons();
        consignmentTreat(circulatingServe);
        circulatingServe.fixedBeginsOpportunity(this.haveCirculatingShudder());
        momentUnexhausted = BeginningMammoth;
      }
    }
  }

  public synchronized void methodsElected(March work) {
    willingStalks[0].addLast(work);
  }
}
