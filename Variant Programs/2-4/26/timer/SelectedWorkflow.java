package timer;

import device.Forwarder;
import timer.Workspace;
import timer.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SelectedWorkflow extends Workspace {
  public PriorityQueue<Operation> quickSufferance = null;
  public Comparator<Operation> baseline = null;

  public SelectedWorkflow() {
    this.baseline = new WorkBenchmarking();
    this.quickSufferance = new PriorityQueue<>(5, baseline);
  }

  public class WorkBenchmarking implements Comparator<Operation> {

    public synchronized int compare(Operation fl, Operation n1) {
      int confLeft = fl.arrivePrezWingspan() - fl.conveyWalkingAmount();
      int gUnsold = n1.arrivePrezWingspan() - n1.conveyWalkingAmount();

      if (confLeft < gUnsold) {
        return -1;
      }

      if (confLeft > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizationAppoint() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.bentLengthwiseHour(rifeSue.conveyWalkingAmount() + 1);

      if (rifeSue.conveyWalkingAmount() == rifeSue.arrivePrezWingspan()) {
        rifeSue.fixDepartThing(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }
    }

    if (!quickSufferance.isEmpty() && rifeSue != null) {
      int continuingPending = rifeSue.arrivePrezWingspan() - rifeSue.conveyWalkingAmount();
      int peruseMaintaining =
          quickSufferance.peek().arrivePrezWingspan()
              - quickSufferance.peek().conveyWalkingAmount();

      if (peruseMaintaining < continuingPending) {
        quickSufferance.add(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && rifeSue == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.ballaBrigade = false;
        this.restAllanPeriods = Forwarder.ShipmentClip;
      }

    } else {

      if (rifeSue == null && !quickSufferance.isEmpty()) {
        rifeSue = quickSufferance.poll();
        offloadProceedings(rifeSue);
        rifeSue.markKickoffHours(this.receiveContemporaryTicktack());
      }
    }
  }

  public synchronized void litigateArriving(Operation serve) {
    quickSufferance.add(serve);
  }
}
