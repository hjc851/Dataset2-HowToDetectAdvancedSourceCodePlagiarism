package spooler;

import distributors.Consignor;
import spooler.Compiler;
import spooler.Mechanism;
import java.util.ArrayDeque;

public class CuOutliner extends spooler.Compiler {
  private int actualAnteriority = 0;
  private int beginningUnsold = 0;

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public CuOutliner() {
    this.cookFiles = new java.util.ArrayDeque[6];

    for (int i = 0; i < cookFiles.length; i++) {
      cookFiles[i] = new java.util.ArrayDeque<>();
    }
    beginningUnsold = ThingLibido;
    actualAnteriority = 0;
  }

  public synchronized void bsiShudder() {

    if (rifeSue != null) {
      rifeSue.doRushingAgain(rifeSue.fixFunctionalChance() + 1);
      beginningUnsold--;

      if (rifeSue.fixFunctionalChance() == rifeSue.drivePresidentCapacity()) {
        rifeSue.primedExpirationPeriod(this.driveContinuingVibrate());
        this.finishedOutgrowth.addLast(rifeSue);
        rifeSue = null;
        this.passenInsignia = true;
      }

      if (beginningUnsold == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          beginningUnsold = ThingLibido;
        } else {
          cookFiles[actualAnteriority + 1].addLast(rifeSue);
          rifeSue = null;
          this.passenInsignia = true;
        }
      }
    }

    if (this.passenInsignia && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.passenInsignia = false;
        this.unsoldDrieBeginning = Consignor.CompleteSentence;
      }

    } else {

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = beatTheProceedings();
        overloadingMechanisms(rifeSue);
        rifeSue.fixedBeginsOpportunity(this.driveContinuingVibrate());
        beginningUnsold = ThingLibido;
      }
    }
  }

  public synchronized String synchronizerDescribe() {
    return "FB:";
  }

  private synchronized spooler.Mechanism beatTheProceedings() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        actualAnteriority = i;
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  public synchronized void operationInbound(Mechanism proceedings) {
    cookFiles[0].addLast(proceedings);
  }

  private ArrayDeque<Mechanism>[] cookFiles = null;
}
