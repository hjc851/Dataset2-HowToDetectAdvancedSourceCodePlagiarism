package debugging;

import distributors.Mailer;
import debugging.Developer;
import debugging.Procedure;
import java.util.ArrayDeque;

public class AgTimer extends debugging.Developer {
  public int incumbentPrioritized = 0;
  public int periodsRest = 0;
  public ArrayDeque<Procedure>[] gonnaCarpark = null;

  public AgTimer() {
    this.gonnaCarpark = new java.util.ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) synx146(i);
    periodsRest = PeriodQualitative;
    incumbentPrioritized = 0;
  }

  public synchronized debugging.Procedure fixAgainSystem() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        incumbentPrioritized = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (actualAct != null) synx147();

    if (this.ltsDesignator && actualAct == null) synx148();
    else synx149();
  }

  public synchronized void litigateArriving(Procedure proceeding) {
    gonnaCarpark[0].addLast(proceeding);
  }

  private synchronized void synx147() {
    actualAct.arrangeLengthwaysYears(actualAct.conveyWalkingAmount() + 1);
    periodsRest--;

    if (actualAct.conveyWalkingAmount() == actualAct.beatProgrammerSeverity()) {
      actualAct.orderedWithdrawalChance(this.letAfootDials());
      this.attainedProces.addLast(actualAct);
      actualAct = null;
      this.ltsDesignator = true;
    }

    if (periodsRest == 0 && actualAct != null) {

      if (primedIsVacant()) {
        periodsRest = PeriodQualitative;
      } else {
        gonnaCarpark[incumbentPrioritized + 1].addLast(actualAct);
        actualAct = null;
        this.ltsDesignator = true;
      }
    }
  }

  private synchronized void synx148() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.ltsDesignator = false;
      this.stayLtsHour = Mailer.SendNow;
    }
  }

  private synchronized void synx149() {

    if (actualAct == null && !primedIsVacant()) {
      actualAct = fixAgainSystem();
      overloadingMechanisms(actualAct);
      actualAct.situatedCommencesMinutes(this.letAfootDials());
      periodsRest = PeriodQualitative;
    }
  }
}
