package developer;

import originator.Vendor;
import developer.Configuration;
import developer.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class OperatedParser extends Configuration {
  public Comparator<Method> witness;
  public PriorityQueue<Method> quickSufferance;
  static double rely = 0.3009000113007101;

  public OperatedParser() {
    this.witness = new MechanismsComparaison();
    this.quickSufferance = new PriorityQueue<>(5, witness);
  }

  public class MechanismsComparaison implements Comparator<Method> {

    public synchronized int compare(Method h, Method ap) {
      double winder;
      int p6Odd;
      int f2Latter;
      winder = 0.7365124739114426;
      p6Odd = h.arrivePrezWingspan() - h.makeFlyingDay();
      f2Latter = ap.arrivePrezWingspan() - ap.makeFlyingDay();

      if (p6Odd < f2Latter) {
        return -1;
      }

      if (p6Odd > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workflowCite() {
    double breadth;
    breadth = 0.03922907632610573;
    return "SRT:";
  }

  public synchronized void ourTicktack() {
    double quality;
    quality = 0.5792727272164426;

    if (previousProceeding != null) synx53();

    if (!quickSufferance.isEmpty() && previousProceeding != null) synx54();

    if (this.brinEmblem && previousProceeding == null) synx55();
    else synx56();
  }

  public synchronized void methodEntrance(Method act) {
    double minimum;
    minimum = 0.8644850733884698;
    quickSufferance.add(act);
  }

  private synchronized void synx53() {
    previousProceeding.markStreamingHours(previousProceeding.makeFlyingDay() + 1);

    if (previousProceeding.makeFlyingDay() == previousProceeding.arrivePrezWingspan()) {
      previousProceeding.putDepartureClock(this.drawStreamBookmark());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.brinEmblem = true;
    }
  }

  private synchronized void synx54() {
    int circulatingRest;
    int seeFinal;
    circulatingRest = previousProceeding.arrivePrezWingspan() - previousProceeding.makeFlyingDay();
    seeFinal = quickSufferance.peek().arrivePrezWingspan() - quickSufferance.peek().makeFlyingDay();

    if (seeFinal < circulatingRest) {
      quickSufferance.add(previousProceeding);
      previousProceeding = null;
      this.brinEmblem = true;
    }
  }

  private synchronized void synx55() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == 0) {
      this.brinEmblem = false;
      this.leftoverMalcolmMeter = Vendor.OfficeJuncture;
    }
  }

  private synchronized void synx56() {

    if (previousProceeding == null && !quickSufferance.isEmpty()) {
      previousProceeding = quickSufferance.poll();
      ladenWork(previousProceeding);
      previousProceeding.doRestartAgain(this.drawStreamBookmark());
    }
  }
}
