package outliner;

import responsible.Vendor;
import outliner.Server;
import outliner.Work;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Server {
  public PriorityQueue<Work> ablePecker = null;
  public Comparator<Work> intercomparison = null;

  public TreatedSynchronization() {
    this.intercomparison = (new SystemMatching());
    this.ablePecker = (new PriorityQueue<>(5, intercomparison));
  }

  public class SystemMatching implements Comparator<Work> {

    public synchronized int compare(Work pi, Work a3) {
      int ptKeeping = pi.makeExecutableDimensions() - pi.goMovingClock();
      int p5Odd = a3.makeExecutableDimensions() - a3.goMovingClock();

      if (ptKeeping < p5Odd) {
        return -1;
      }

      if (ptKeeping > p5Odd) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spreadsheetKey() {
    return "SRT:";
  }

  public synchronized void addTock() {

    if (afootSummons != null) synx213();

    if (!ablePecker.isEmpty() && afootSummons != null) synx214();

    if (this.ltsDesignator && afootSummons == null) synx215();
    else synx216();
  }

  public synchronized void proceedingOutbound(Work serve) {
    ablePecker.add(serve);
  }

  private synchronized void synx213() {
    afootSummons.doRushingAgain(afootSummons.goMovingClock() + 1);

    if (afootSummons.goMovingClock() == afootSummons.makeExecutableDimensions()) {
      afootSummons.readyOutletDay(this.sustainThisValidation());
      this.undertookProcedures.addLast(afootSummons);
      afootSummons = (null);
      this.ltsDesignator = (true);
    }
  }

  private synchronized void synx214() {
    int presentUnsold = afootSummons.makeExecutableDimensions() - afootSummons.goMovingClock();
    int spyStill = ablePecker.peek().makeExecutableDimensions() - ablePecker.peek().goMovingClock();

    if (spyStill < presentUnsold) {
      ablePecker.add(afootSummons);
      afootSummons = (null);
      this.ltsDesignator = (true);
    }
  }

  private synchronized void synx215() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.ltsDesignator = (false);
      this.survivingMbeWeek = (Vendor.DeployingOpportunity);
    }
  }

  private synchronized void synx216() {

    if (afootSummons == null && !ablePecker.isEmpty()) {
      afootSummons = (ablePecker.poll());
      offloadProceedings(afootSummons);
      afootSummons.determinedInitiateDays(this.sustainThisValidation());
    }
  }
}
