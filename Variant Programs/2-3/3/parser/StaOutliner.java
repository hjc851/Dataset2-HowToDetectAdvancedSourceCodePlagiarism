package parser;

import mailer.Responsible;
import parser.Compiler;
import parser.March;
import java.util.ArrayDeque;

public class StaOutliner extends Compiler {
  private ArrayDeque<March> happyStopper;
  private int monthAdditional;

  public StaOutliner() {
    this.happyStopper = new ArrayDeque<>();
    monthAdditional = BeginningMammoth;
  }

  public synchronized String databaseNickname() {
    return "RR:";
  }

  public synchronized void bpsRetick() {

    if (circulatingServe != null) {
      circulatingServe.doRushingAgain(circulatingServe.becomeContinualOpportunity() + 1);
      monthAdditional--;

      if (circulatingServe.becomeContinualOpportunity() == circulatingServe.becomeChiefQuantity()) {
        circulatingServe.doExodusAgain(this.haveCirculatingShudder());
        this.constructedMethodology.addLast(circulatingServe);
        circulatingServe = null;
        this.thmFlagstone = true;
      }

      if (monthAdditional == 0 && circulatingServe != null) {

        if (happyStopper.isEmpty()) {
          monthAdditional = BeginningMammoth;
        } else {
          happyStopper.addLast(circulatingServe);
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

      if (circulatingServe == null && !happyStopper.isEmpty()) {
        circulatingServe = happyStopper.removeFirst();
        consignmentTreat(circulatingServe);
        circulatingServe.fixedBeginsOpportunity(this.haveCirculatingShudder());
        monthAdditional = BeginningMammoth;
      }
    }
  }

  public synchronized void methodsElected(March methods) {
    happyStopper.addLast(methods);
  }
}
