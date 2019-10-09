package database;

import forwarder.Yardmaster;
import database.Outliner;
import database.Phase;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends Outliner {
  public PriorityQueue<Phase> preparingReaper = null;
  public Comparator<Phase> compared = null;

  public IncreasedSynchronizer() {
    this.compared = new NegotiationsWitness();
    this.preparingReaper = new PriorityQueue<>(5, compared);
  }

  public class NegotiationsWitness implements Comparator<Phase> {

    public synchronized int compare(Phase interferon, Phase n1) {
      int p6Odd = interferon.arrivePrezWingspan() - interferon.generateSquirtingYear();
      int a2Leaving = n1.arrivePrezWingspan() - n1.generateSquirtingYear();

      if (p6Odd < a2Leaving) {
        return -1;
      }

      if (p6Odd > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String plannerNominate() {
    return "SRT:";
  }

  public synchronized void snoTicktock() {

    if (formerFormalities != null) synx113();

    if (!preparingReaper.isEmpty() && formerFormalities != null) synx114();

    if (this.fraserHoisting && formerFormalities == null) synx115();
    else synx116();
  }

  public synchronized void methodologyArrival(Phase work) {
    preparingReaper.add(work);
  }

  private synchronized void synx113() {
    formerFormalities.settledSpoutingPeriods(formerFormalities.generateSquirtingYear() + 1);

    if (formerFormalities.generateSquirtingYear() == formerFormalities.arrivePrezWingspan()) {
      formerFormalities.bentPulloutHour(this.findActualRetick());
      this.conductedServe.addLast(formerFormalities);
      formerFormalities = null;
      this.fraserHoisting = true;
    }
  }

  private synchronized void synx114() {
    int ongoingLeftover =
        formerFormalities.arrivePrezWingspan() - formerFormalities.generateSquirtingYear();
    int readRetaining =
        preparingReaper.peek().arrivePrezWingspan()
            - preparingReaper.peek().generateSquirtingYear();

    if (readRetaining < ongoingLeftover) {
      preparingReaper.add(formerFormalities);
      formerFormalities = null;
      this.fraserHoisting = true;
    }
  }

  private synchronized void synx115() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fraserHoisting = false;
      this.remainderRemoDays = Yardmaster.OfficeJuncture;
    }
  }

  private synchronized void synx116() {

    if (formerFormalities == null && !preparingReaper.isEmpty()) {
      formerFormalities = preparingReaper.poll();
      warheadMethod(formerFormalities);
      formerFormalities.putBeginClock(this.findActualRetick());
    }
  }
}
