package debugging;

import distributors.Mailer;
import debugging.Developer;
import debugging.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends debugging.Developer {
  public debugging.GrrProcedure grrProcedure = null;
  public int dayOdd = 0;
  public java.util.ArrayDeque<GrrProcedure> prepareLine = null;

  public GrrProgrammer() {
    this.prepareLine = new java.util.ArrayDeque<>();
    dayOdd = Developer.PeriodQualitative;
  }

  public synchronized String workspaceForename() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) synx143();

    if (this.ltsDesignator && actualAct == null) synx144();
    else synx145();
  }

  public synchronized void litigateArriving(Procedure system) {
    prepareLine.add(new debugging.GrrProcedure(system));
  }

  private synchronized void synx143() {
    grrProcedure.arrangeLengthwaysYears(grrProcedure.conveyWalkingAmount() + 1);
    dayOdd--;

    if (grrProcedure.conveyWalkingAmount() == grrProcedure.beatProgrammerSeverity()) {
      grrProcedure.orderedWithdrawalChance(this.letAfootDials());
      this.attainedProces.addLast(grrProcedure);
      grrProcedure = null;
      this.ltsDesignator = true;
    }

    if (dayOdd == 0 && grrProcedure != null) {

      if (prepareLine.isEmpty()) {
        dayOdd = grrProcedure.receiveMomentAmounts();
      } else {

        if (grrProcedure.receiveMomentAmounts() > 2) {
          grrProcedure.placedWhenValue(grrProcedure.receiveMomentAmounts() - 1);
        }

        prepareLine.addLast(grrProcedure);
        grrProcedure = null;
        this.ltsDesignator = true;
      }
    }
  }

  private synchronized void synx144() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.ltsDesignator = false;
      this.stayLtsHour = Mailer.SendNow;
    }
  }

  private synchronized void synx145() {

    if (grrProcedure == null && !prepareLine.isEmpty()) {
      grrProcedure = prepareLine.removeFirst();
      overloadingMechanisms(grrProcedure);
      grrProcedure.situatedCommencesMinutes(this.letAfootDials());
      dayOdd = grrProcedure.receiveMomentAmounts();
    }
  }

  private synchronized void synx146(int i) {
    gonnaCarpark[i] = new java.util.ArrayDeque<>();
  }
}
