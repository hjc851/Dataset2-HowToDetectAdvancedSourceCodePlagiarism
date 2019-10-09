package synchronization;

import retailer.Shipper;
import synchronization.Outliner;
import synchronization.Procedure;
import java.util.ArrayDeque;

public class ApDeveloper extends synchronization.Outliner {

  public ApDeveloper() {
    this.promptCode = new java.util.ArrayDeque[6];

    for (int i = 0; i < promptCode.length; i++) synx66(i);
    hoursRetaining = DaysQuantitative;
    topicalPrioritize = 0;
  }

  public synchronized void methodsElected(Procedure summons) {
    promptCode[0].addLast(summons);
  }

  public ArrayDeque<Procedure>[] promptCode = null;
  public int hoursRetaining = 0;

  public synchronized void weapMark() {

    if (formerFormalities != null) synx67();

    if (this.drieRag && formerFormalities == null) synx68();
    else synx69();
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String initializationPseudonym() {
    return "FB:";
  }

  public synchronized synchronization.Procedure goFutureProcedure() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        topicalPrioritize = i;
        return promptCode[i].poll();
      }
    }
    return null;
  }

  public int topicalPrioritize = 0;

  private synchronized void synx67() {
    formerFormalities.adjustFleeingMonth(formerFormalities.comeWorkingClip() + 1);
    hoursRetaining--;

    if (formerFormalities.comeWorkingClip() == formerFormalities.generateHonchoFootprint()) {
      formerFormalities.arrangedGoSentence(this.sustainThisValidation());
      this.undergoneMethodologies.addLast(formerFormalities);
      formerFormalities = null;
      this.drieRag = true;
    }

    if (hoursRetaining == 0 && formerFormalities != null) {

      if (primedIsVacant()) {
        hoursRetaining = DaysQuantitative;
      } else {
        promptCode[topicalPrioritize + 1].addLast(formerFormalities);
        formerFormalities = null;
        this.drieRag = true;
      }
    }
  }

  private synchronized void synx68() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.drieRag = false;
      this.unsoldDrieBeginning = Shipper.OfficeJuncture;
    }
  }

  private synchronized void synx69() {

    if (formerFormalities == null && !primedIsVacant()) {
      formerFormalities = goFutureProcedure();
      warheadMethod(formerFormalities);
      formerFormalities.situatedCommencesMinutes(this.sustainThisValidation());
      hoursRetaining = DaysQuantitative;
    }
  }
}
