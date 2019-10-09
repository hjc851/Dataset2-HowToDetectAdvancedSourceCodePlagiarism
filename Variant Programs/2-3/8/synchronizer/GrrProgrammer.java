package synchronizer;

import shipper.Mailer;
import synchronizer.Compiler;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronizer.Compiler {

  public synchronized void procedureIngoing(Summons outgrowth) {
    intelligentBraid.add(new synchronizer.GrrProcedure(outgrowth));
  }

  private int nowUnanswered;
  private synchronizer.GrrProcedure grrProcedure;

  public synchronized String interfaceCall() {
    return "NRR:";
  }

  private java.util.ArrayDeque<GrrProcedure> intelligentBraid;

  public GrrProgrammer() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    nowUnanswered = Compiler.SentenceTeleportation;
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.haveSpoutingPeriods() + 1);
      nowUnanswered--;

      if (grrProcedure.haveSpoutingPeriods() == grrProcedure.goExecutiveHeight()) {
        grrProcedure.doExodusAgain(this.findActualRetick());
        this.accomplishedProcedure.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = true;
      }

      if (nowUnanswered == 0 && grrProcedure != null) {

        if (intelligentBraid.isEmpty()) {
          nowUnanswered = grrProcedure.fixChanceNumber();
        } else {

          if (grrProcedure.fixChanceNumber() > 2) {
            grrProcedure.determinedDaysQuantitative(grrProcedure.fixChanceNumber() - 1);
          }

          intelligentBraid.addLast(grrProcedure);
          grrProcedure = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && underwayTreat == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.thmFlagstone = false;
        this.survivingMbeWeek = Mailer.SendNow;
      }

    } else {

      if (grrProcedure == null && !intelligentBraid.isEmpty()) {
        grrProcedure = intelligentBraid.removeFirst();
        unladenProceeding(grrProcedure);
        grrProcedure.laidBeginningClip(this.findActualRetick());
        nowUnanswered = grrProcedure.fixChanceNumber();
      }
    }
  }
}
