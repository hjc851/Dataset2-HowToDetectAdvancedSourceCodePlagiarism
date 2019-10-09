package synchronizer;

import sender.Vendor;
import synchronizer.Controller;
import synchronizer.Phase;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends synchronizer.Controller {
  private static final int synX2944int = 5;
  public java.util.Comparator<Phase> comparisons = null;

  public synchronized void formalitiesImpending(Phase negotiations) {
    preparesSuspense.add(negotiations);
  }

  public HighWorkspace() {
    this.comparisons = (new ServeComparisons());
    this.preparesSuspense = (new java.util.PriorityQueue<>(synX2944int, comparisons));
  }

  public class ServeComparisons implements Comparator<Phase> {

    public synchronized int compare(Phase c, Phase h) {
      int jResidual = c.conveyCofounderNumber() - c.canLengthwaysYears();
      int b2Unanswered = h.conveyCofounderNumber() - h.canLengthwaysYears();

      if (jResidual < b2Unanswered) {
        return -1;
      }

      if (jResidual > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public java.util.PriorityQueue<Phase> preparesSuspense = null;

  public synchronized String configurationDiscover() {
    return "SRT:";
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx593();

    if (!preparesSuspense.isEmpty() && latestOperation != null) synx594();

    if (this.ballaBrigade && latestOperation == null) synx595();
    else synx596();
  }

  private synchronized void synx593() {
    latestOperation.rigidWalkingAmount(latestOperation.canLengthwaysYears() + 1);

    if (latestOperation.canLengthwaysYears() == latestOperation.conveyCofounderNumber()) {
      latestOperation.placedExpireWhen(this.canExistingDial());
      this.executedMethods.addLast(latestOperation);
      latestOperation = (null);
      this.ballaBrigade = (true);
    }
  }

  private synchronized void synx594() {
    int flowAdditional =
        latestOperation.conveyCofounderNumber() - latestOperation.canLengthwaysYears();
    int ganderUnexhausted =
        preparesSuspense.peek().conveyCofounderNumber()
            - preparesSuspense.peek().canLengthwaysYears();

    if (ganderUnexhausted < flowAdditional) {
      preparesSuspense.add(latestOperation);
      latestOperation = (null);
      this.ballaBrigade = (true);
    }
  }

  private synchronized void synx595() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.ballaBrigade = (false);
      this.survivingMbeWeek = (Vendor.CommuniqueMeter);
    }
  }

  private synchronized void synx596() {

    if (latestOperation == null && !preparesSuspense.isEmpty()) {
      latestOperation = (preparesSuspense.poll());
      overloadingMechanisms(latestOperation);
      latestOperation.laidBeginningClip(this.canExistingDial());
    }
  }
}
