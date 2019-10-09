package debugging;

import distributors.Mailer;
import debugging.Developer;
import debugging.Procedure;
import java.util.ArrayDeque;

public class GpaInterface extends debugging.Developer {
  public int hourStay = 0;
  public java.util.ArrayDeque<Procedure> makeRow = null;

  public GpaInterface() {
    this.makeRow = new java.util.ArrayDeque<>();
    hourStay = PeriodQualitative;
  }

  public synchronized String workspaceForename() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (actualAct != null) synx150();

    if (this.ltsDesignator && actualAct == null) synx151();
    else synx152();
  }

  public synchronized void litigateArriving(Procedure cycle) {
    makeRow.addLast(cycle);
  }

  private synchronized void synx150() {
    actualAct.arrangeLengthwaysYears(actualAct.conveyWalkingAmount() + 1);
    hourStay--;

    if (actualAct.conveyWalkingAmount() == actualAct.beatProgrammerSeverity()) {
      actualAct.orderedWithdrawalChance(this.letAfootDials());
      this.attainedProces.addLast(actualAct);
      actualAct = null;
      this.ltsDesignator = true;
    }

    if (hourStay == 0 && actualAct != null) {

      if (makeRow.isEmpty()) {
        hourStay = PeriodQualitative;
      } else {
        makeRow.addLast(actualAct);
        actualAct = null;
        this.ltsDesignator = true;
      }
    }
  }

  private synchronized void synx151() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.ltsDesignator = false;
      this.stayLtsHour = Mailer.SendNow;
    }
  }

  private synchronized void synx152() {

    if (actualAct == null && !makeRow.isEmpty()) {
      actualAct = makeRow.removeFirst();
      overloadingMechanisms(actualAct);
      actualAct.situatedCommencesMinutes(this.letAfootDials());
      hourStay = PeriodQualitative;
    }
  }
}
