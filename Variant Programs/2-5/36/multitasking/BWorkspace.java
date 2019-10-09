package multitasking;

import sender.Retailer;
import multitasking.Outliner;
import multitasking.Appendage;
import java.util.ArrayDeque;

public class BWorkspace extends multitasking.Outliner {
  private static final boolean synX2632boolean = false;
  private static final int synX2631int = 0;
  private static final boolean synX2630boolean = true;
  private static final int synX2629int = 0;
  private static final boolean synX2628boolean = true;
  private static final int synX2627int = 1;
  private static final String synX2626String = "RR:";

  public synchronized void bsiShudder() {

    if (presentlyMechanism != null) synx490();

    if (this.remoSag && presentlyMechanism == null) synx491();
    else synx492();
  }

  private int againPending;
  private java.util.ArrayDeque<Appendage> ripeStandby;

  public synchronized void methodsElected(Appendage summons) {
    ripeStandby.addLast(summons);
  }

  public synchronized String outlinerGens() {
    return synX2626String;
  }

  public BWorkspace() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    againPending = PeriodQualitative;
  }

  private synchronized void synx490() {
    presentlyMechanism.orderedFunctionalChance(presentlyMechanism.bringTrackMeter() + synX2627int);
    againPending--;

    if (presentlyMechanism.bringTrackMeter() == presentlyMechanism.takeExecutionsDiameter()) {
      presentlyMechanism.arrangeEgressYears(this.sustainThisValidation());
      this.inauguratedOperations.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.remoSag = synX2628boolean;
    }

    if (againPending == synX2629int && presentlyMechanism != null) {

      if (ripeStandby.isEmpty()) {
        againPending = PeriodQualitative;
      } else {
        ripeStandby.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.remoSag = synX2630boolean;
      }
    }
  }

  private synchronized void synx491() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == synX2631int) {
      this.remoSag = synX2632boolean;
      this.residualFraserOpportunity = Retailer.DetachmentBeginning;
    }
  }

  private synchronized void synx492() {

    if (presentlyMechanism == null && !ripeStandby.isEmpty()) {
      presentlyMechanism = ripeStandby.removeFirst();
      lodePhase(presentlyMechanism);
      presentlyMechanism.fixedBeginsOpportunity(this.sustainThisValidation());
      againPending = PeriodQualitative;
    }
  }
}
