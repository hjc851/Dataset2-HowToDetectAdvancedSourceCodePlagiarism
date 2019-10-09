package debugging;

import distributors.Mailer;
import debugging.Developer;
import debugging.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TdsProgramming extends debugging.Developer {
  public java.util.Comparator<Procedure> contrast = null;
  public java.util.PriorityQueue<Procedure> availableFile = null;

  public TdsProgramming() {
    this.contrast = new AppendageCompared();
    this.availableFile = new java.util.PriorityQueue<>(5, contrast);
  }

  public class AppendageCompared implements Comparator<Procedure> {

    public synchronized int compare(Procedure tgf, Procedure f2) {
      int eAdditional;
      int p3Unexpended;
      eAdditional = tgf.beatProgrammerSeverity() - tgf.conveyWalkingAmount();
      p3Unexpended = f2.beatProgrammerSeverity() - f2.conveyWalkingAmount();

      if (eAdditional < p3Unexpended) {
        return -1;
      }

      if (eAdditional > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (actualAct != null) synx153();

    if (!availableFile.isEmpty() && actualAct != null) synx154();

    if (this.ltsDesignator && actualAct == null) synx155();
    else synx156();
  }

  public synchronized void litigateArriving(Procedure work) {
    availableFile.add(work);
  }

  private synchronized void synx153() {
    actualAct.arrangeLengthwaysYears(actualAct.conveyWalkingAmount() + 1);

    if (actualAct.conveyWalkingAmount() == actualAct.beatProgrammerSeverity()) {
      actualAct.orderedWithdrawalChance(this.letAfootDials());
      this.attainedProces.addLast(actualAct);
      actualAct = null;
      this.ltsDesignator = true;
    }
  }

  private synchronized void synx154() {
    int presentUnsold;
    int previewLingering;
    presentUnsold = actualAct.beatProgrammerSeverity() - actualAct.conveyWalkingAmount();
    previewLingering =
        availableFile.peek().beatProgrammerSeverity() - availableFile.peek().conveyWalkingAmount();

    if (previewLingering < presentUnsold) {
      availableFile.add(actualAct);
      actualAct = null;
      this.ltsDesignator = true;
    }
  }

  private synchronized void synx155() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.ltsDesignator = false;
      this.stayLtsHour = Mailer.SendNow;
    }
  }

  private synchronized void synx156() {

    if (actualAct == null && !availableFile.isEmpty()) {
      actualAct = availableFile.poll();
      overloadingMechanisms(actualAct);
      actualAct.situatedCommencesMinutes(this.letAfootDials());
    }
  }
}
