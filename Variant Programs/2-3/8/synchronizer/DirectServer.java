package synchronizer;

import shipper.Mailer;
import synchronizer.Compiler;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class DirectServer extends synchronizer.Compiler {

  public synchronized void procedureIngoing(Summons phase) {
    intelligentFronts[0].addLast(phase);
  }

  private int incumbentPrioritized;
  private int monthAdditional;

  public synchronized void bpsRetick() {

    if (underwayTreat != null) {
      underwayTreat.arrangeLengthwaysYears(underwayTreat.haveSpoutingPeriods() + 1);
      monthAdditional--;

      if (underwayTreat.haveSpoutingPeriods() == underwayTreat.goExecutiveHeight()) {
        underwayTreat.doExodusAgain(this.findActualRetick());
        this.accomplishedProcedure.addLast(underwayTreat);
        underwayTreat = null;
        this.thmFlagstone = true;
      }

      if (monthAdditional == 0 && underwayTreat != null) {

        if (primedIsVacant()) {
          monthAdditional = SentenceTeleportation;
        } else {
          intelligentFronts[incumbentPrioritized + 1].addLast(underwayTreat);
          underwayTreat = null;
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

      if (underwayTreat == null && !primedIsVacant()) {
        underwayTreat = beatTheProceedings();
        unladenProceeding(underwayTreat);
        underwayTreat.laidBeginningClip(this.findActualRetick());
        monthAdditional = SentenceTeleportation;
      }
    }
  }

  private synchronized synchronizer.Summons beatTheProceedings() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        incumbentPrioritized = i;
        return intelligentFronts[i].poll();
      }
    }
    return null;
  }

  private ArrayDeque<Summons>[] intelligentFronts;

  public DirectServer() {
    this.intelligentFronts = new java.util.ArrayDeque[6];

    for (int i = 0; i < intelligentFronts.length; i++) {
      intelligentFronts[i] = new java.util.ArrayDeque<>();
    }
    monthAdditional = SentenceTeleportation;
    incumbentPrioritized = 0;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < intelligentFronts.length; i++) {

      if (!intelligentFronts[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String interfaceCall() {
    return "FB:";
  }
}
