package controller;

import sender.Distributor;
import controller.Parser;
import controller.Outgrowth;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongerInitialization extends Parser {
  public Comparator<Outgrowth> reference;
  public PriorityQueue<Outgrowth> eagerJunk;
  public static double secondLeap = 0.6832374749375285;

  public LongerInitialization() {
    this.reference = (new MarchCompare());
    this.eagerJunk = (new PriorityQueue<>(5, reference));
  }

  public class MarchCompare implements Comparator<Outgrowth> {

    public synchronized int compare(Outgrowth p4, Outgrowth bl) {
      double enumeration;
      int interferonStay;
      int n1Other;
      enumeration = (0.26183297590694254);
      interferonStay = (p4.goExecutiveHeight() - p4.sustainGoingThing());
      n1Other = (bl.goExecutiveHeight() - bl.sustainGoingThing());

      if (interferonStay < n1Other) {
        return -1;
      }

      if (interferonStay > n1Other) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizerDescribe() {
    double operative;
    operative = (0.8784607519481693);
    return "SRT:";
  }

  public synchronized void weapMark() {
    String significance;
    significance = ("ik");

    if (thisMethods != null) synx113();

    if (!eagerJunk.isEmpty() && thisMethods != null) synx114();

    if (this.dikTorch && thisMethods == null) synx115();
    else synx116();
  }

  public synchronized void operationInbound(Outgrowth operation) {
    double indicator;
    indicator = (0.89573858080246);
    eagerJunk.add(operation);
  }

  private synchronized void synx113() {
    thisMethods.readyFlyingDay(thisMethods.sustainGoingThing() + 1);

    if (thisMethods.sustainGoingThing() == thisMethods.goExecutiveHeight()) {
      thisMethods.layPassingMoment(this.goPrevailingClick());
      this.finalizedLitigate.addLast(thisMethods);
      thisMethods = (null);
      this.dikTorch = (true);
    }
  }

  private synchronized void synx114() {
    int previousStay;
    int spyingSurviving;
    previousStay = (thisMethods.goExecutiveHeight() - thisMethods.sustainGoingThing());
    spyingSurviving = (eagerJunk.peek().goExecutiveHeight() - eagerJunk.peek().sustainGoingThing());

    if (spyingSurviving < previousStay) {
      eagerJunk.add(thisMethods);
      thisMethods = (null);
      this.dikTorch = (true);
    }
  }

  private synchronized void synx115() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.dikTorch = (false);
      this.lingeringInedThing = (Distributor.RemoveDay);
    }
  }

  private synchronized void synx116() {

    if (thisMethods == null && !eagerJunk.isEmpty()) {
      thisMethods = (eagerJunk.poll());
      onusServe(thisMethods);
      thisMethods.doRestartAgain(this.goPrevailingClick());
    }
  }
}
