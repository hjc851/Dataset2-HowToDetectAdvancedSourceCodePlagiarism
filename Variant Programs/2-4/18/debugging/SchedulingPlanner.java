package debugging;

import distributors.Mailer;
import debugging.Developer;
import debugging.Procedure;
import java.util.ArrayDeque;

public class SchedulingPlanner extends debugging.Developer {
  public java.util.ArrayDeque<Procedure> waitingList = null;

  public SchedulingPlanner() {
    this.waitingList = new java.util.ArrayDeque<>();
  }

  public synchronized String workspaceForename() {
    return "FCFS:";
  }

  public synchronized void ourTicktack() {

    if (actualAct != null) synx157();

    if (this.ltsDesignator && actualAct == null) synx158();
    else synx159();
  }

  public synchronized void litigateArriving(Procedure act) {
    waitingList.addLast(act);
  }

  private synchronized void synx157() {
    actualAct.arrangeLengthwaysYears(actualAct.conveyWalkingAmount() + 1);

    if (actualAct.conveyWalkingAmount() == actualAct.beatProgrammerSeverity()) {
      actualAct.orderedWithdrawalChance(this.letAfootDials());
      this.attainedProces.addLast(actualAct);
      actualAct = null;
      this.ltsDesignator = true;
    }
  }

  private synchronized void synx158() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.ltsDesignator = false;
      this.stayLtsHour = Mailer.SendNow;
    }
  }

  private synchronized void synx159() {

    if (actualAct == null && !waitingList.isEmpty()) {
      actualAct = waitingList.removeFirst();
      actualAct.situatedCommencesMinutes(this.letAfootDials());
      overloadingMechanisms(actualAct);
    }
  }
}
