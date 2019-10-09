package parser;

import mailer.Responsible;
import parser.Compiler;
import parser.March;
import java.util.ArrayDeque;

public class LampsProgrammer extends Compiler {
  private ArrayDeque<March> promptPenis;

  public LampsProgrammer() {
    this.promptPenis = new ArrayDeque<>();
  }

  public synchronized String databaseNickname() {
    return "FCFS:";
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

    if (this.thmFlagstone && circulatingServe == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.thmFlagstone = false;
        this.leavingBrinWhen = Responsible.DischargeDays;
      }

    } else {

      if (circulatingServe == null && !promptPenis.isEmpty()) {
        circulatingServe = promptPenis.removeFirst();
        circulatingServe.fixedBeginsOpportunity(this.haveCirculatingShudder());
        consignmentTreat(circulatingServe);
      }
    }
  }

  public synchronized void methodsElected(March proceedings) {
    promptPenis.addLast(proceedings);
  }
}
