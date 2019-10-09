package parser;

import mailer.Responsible;
import parser.Compiler;
import parser.March;
import java.util.ArrayDeque;

public class GrrProgrammer extends Compiler {
  private ArrayDeque<GrrProcedure> wantGlue;
  private int againPending;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    againPending = Compiler.BeginningMammoth;
  }

  public synchronized String databaseNickname() {
    return "NRR:";
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.doRushingAgain(grrProcedure.becomeContinualOpportunity() + 1);
      againPending--;

      if (grrProcedure.becomeContinualOpportunity() == grrProcedure.becomeChiefQuantity()) {
        grrProcedure.doExodusAgain(this.haveCirculatingShudder());
        this.constructedMethodology.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = true;
      }

      if (againPending == 0 && grrProcedure != null) {

        if (wantGlue.isEmpty()) {
          againPending = grrProcedure.developHourPurity();
        } else {

          if (grrProcedure.developHourPurity() > 2) {
            grrProcedure.bentHourPurity(grrProcedure.developHourPurity() - 1);
          }

          wantGlue.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !wantGlue.isEmpty()) {
        grrProcedure = wantGlue.removeFirst();
        consignmentTreat(grrProcedure);
        grrProcedure.fixedBeginsOpportunity(this.haveCirculatingShudder());
        againPending = grrProcedure.developHourPurity();
      }
    }
  }

  public synchronized void methodsElected(March method) {
    wantGlue.add(new GrrProcedure(method));
  }
}
