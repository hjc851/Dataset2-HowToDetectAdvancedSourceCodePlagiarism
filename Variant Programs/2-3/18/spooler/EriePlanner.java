package spooler;

import distributors.Consignor;
import spooler.Compiler;
import spooler.Mechanism;
import java.util.ArrayDeque;

public class EriePlanner extends spooler.Compiler {

  public synchronized String synchronizerDescribe() {
    return "RR:";
  }

  public EriePlanner() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    sentenceUnexpended = ThingLibido;
  }

  private java.util.ArrayDeque<Mechanism> quickSufferance = null;

  public synchronized void bsiShudder() {

    if (rifeSue != null) {
      rifeSue.doRushingAgain(rifeSue.fixFunctionalChance() + 1);
      sentenceUnexpended--;

      if (rifeSue.fixFunctionalChance() == rifeSue.drivePresidentCapacity()) {
        rifeSue.primedExpirationPeriod(this.driveContinuingVibrate());
        this.finishedOutgrowth.addLast(rifeSue);
        rifeSue = null;
        this.passenInsignia = true;
      }

      if (sentenceUnexpended == 0 && rifeSue != null) {

        if (quickSufferance.isEmpty()) {
          sentenceUnexpended = ThingLibido;
        } else {
          quickSufferance.addLast(rifeSue);
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

      if (rifeSue == null && !quickSufferance.isEmpty()) {
        rifeSue = quickSufferance.removeFirst();
        overloadingMechanisms(rifeSue);
        rifeSue.fixedBeginsOpportunity(this.driveContinuingVibrate());
        sentenceUnexpended = ThingLibido;
      }
    }
  }

  private int sentenceUnexpended = 0;

  public synchronized void operationInbound(Mechanism procedures) {
    quickSufferance.addLast(procedures);
  }
}
