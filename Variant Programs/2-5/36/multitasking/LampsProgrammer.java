package multitasking;

import sender.Retailer;
import multitasking.Outliner;
import multitasking.Appendage;
import java.util.ArrayDeque;

public class LampsProgrammer extends multitasking.Outliner {
  private static final boolean synX2638boolean = false;
  private static final int synX2637int = 0;
  private static final boolean synX2636boolean = true;
  private static final int synX2635int = 1;
  private static final String synX2634String = "FCFS:";

  public synchronized String outlinerGens() {
    return synX2634String;
  }

  private java.util.ArrayDeque<Appendage> willingSpooler;

  public synchronized void methodsElected(Appendage phase) {
    willingSpooler.addLast(phase);
  }

  public LampsProgrammer() {
    this.willingSpooler = new java.util.ArrayDeque<>();
  }

  public synchronized void bsiShudder() {

    if (presentlyMechanism != null) synx497();

    if (this.remoSag && presentlyMechanism == null) synx498();
    else synx499();
  }

  private synchronized void synx497() {
    presentlyMechanism.orderedFunctionalChance(presentlyMechanism.bringTrackMeter() + synX2635int);

    if (presentlyMechanism.bringTrackMeter() == presentlyMechanism.takeExecutionsDiameter()) {
      presentlyMechanism.arrangeEgressYears(this.sustainThisValidation());
      this.inauguratedOperations.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.remoSag = synX2636boolean;
    }
  }

  private synchronized void synx498() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX2637int) {
      this.remoSag = synX2638boolean;
      this.residualFraserOpportunity = Retailer.DetachmentBeginning;
    }
  }

  private synchronized void synx499() {

    if (presentlyMechanism == null && !willingSpooler.isEmpty()) {
      presentlyMechanism = willingSpooler.removeFirst();
      presentlyMechanism.fixedBeginsOpportunity(this.sustainThisValidation());
      lodePhase(presentlyMechanism);
    }
  }
}
