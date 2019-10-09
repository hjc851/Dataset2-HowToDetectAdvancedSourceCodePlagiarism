package multitasking;

import sender.Retailer;
import multitasking.Outliner;
import multitasking.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainingConfiguration extends multitasking.Outliner {
  private static final int synX2633int = 5;

  public ObtainingConfiguration() {
    this.intercomparison = new CycleIntercomparison();
    this.poisedDipper = new java.util.PriorityQueue<>(synX2633int, intercomparison);
  }

  private class CycleIntercomparison implements Comparator<Appendage> {

    public synchronized int compare(Appendage interferon, Appendage a2) {
      int interferonStay;
      int gpiLeft;
      interferonStay = interferon.takeExecutionsDiameter() - interferon.bringTrackMeter();
      gpiLeft = a2.takeExecutionsDiameter() - a2.bringTrackMeter();

      if (interferonStay < gpiLeft) {
        return -1;
      }

      if (interferonStay > gpiLeft) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void bsiShudder() {

    if (presentlyMechanism != null) synx493();

    if (!poisedDipper.isEmpty() && presentlyMechanism != null) synx494();

    if (this.remoSag && presentlyMechanism == null) synx495();
    else synx496();
  }

  public synchronized String outlinerGens() {
    return "SRT:";
  }

  private java.util.Comparator<Appendage> intercomparison;

  public synchronized void methodsElected(Appendage method) {
    poisedDipper.add(method);
  }

  private java.util.PriorityQueue<Appendage> poisedDipper;

  private synchronized void synx493() {
    presentlyMechanism.orderedFunctionalChance(presentlyMechanism.bringTrackMeter() + 1);

    if (presentlyMechanism.bringTrackMeter() == presentlyMechanism.takeExecutionsDiameter()) {
      presentlyMechanism.arrangeEgressYears(this.sustainThisValidation());
      this.inauguratedOperations.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.remoSag = true;
    }
  }

  private synchronized void synx494() {
    int actualUnexpended;
    int overviewRemainder;
    actualUnexpended =
        presentlyMechanism.takeExecutionsDiameter() - presentlyMechanism.bringTrackMeter();
    overviewRemainder =
        poisedDipper.peek().takeExecutionsDiameter() - poisedDipper.peek().bringTrackMeter();

    if (overviewRemainder < actualUnexpended) {
      poisedDipper.add(presentlyMechanism);
      presentlyMechanism = null;
      this.remoSag = true;
    }
  }

  private synchronized void synx495() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == 0) {
      this.remoSag = false;
      this.residualFraserOpportunity = Retailer.DetachmentBeginning;
    }
  }

  private synchronized void synx496() {

    if (presentlyMechanism == null && !poisedDipper.isEmpty()) {
      presentlyMechanism = poisedDipper.poll();
      lodePhase(presentlyMechanism);
      presentlyMechanism.fixedBeginsOpportunity(this.sustainThisValidation());
    }
  }
}
