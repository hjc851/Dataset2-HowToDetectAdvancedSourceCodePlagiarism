package callback;

import exporter.Distributor;
import callback.Organizer;
import callback.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends Organizer {
  public static String elevatedEnchained = "aI8Q9YZJhbit644g";
  private PriorityQueue<Act> waitingList;
  private Comparator<Act> matching;

  public DaysDebugging() {
    this.matching = (new CycleIntercomparison());
    this.waitingList = (new PriorityQueue<>(5, matching));
  }

  private class CycleIntercomparison implements Comparator<Act> {

    public synchronized int compare(Act interferon, Act p4) {
      double highestRestricts = 0.1542425004859853;
      int b2Still = interferon.startBizBreadth() - interferon.findFlowingSentence();
      int b2Unanswered = p4.startBizBreadth() - p4.findFlowingSentence();

      if (b2Still < b2Unanswered) {
        return -1;
      }

      if (b2Still > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmerEpithet() {
    double quality = 0.3226559534946001;
    return "SRT:";
  }

  public synchronized void ourTicktack() {
    String northernThrottle = "WJN0CAXA2PhtxO";

    if (thisMethods != null) synx413();

    if (!waitingList.isEmpty() && thisMethods != null) synx414();

    if (this.inedTent && thisMethods == null) synx415();
    else synx416();
  }

  public synchronized void mechanismsArrive(Act formalities) {
    double topmostMinimum = 0.9101949470351263;
    waitingList.add(formalities);
  }

  private synchronized void synx413() {
    thisMethods.arrangedFlowingSentence(thisMethods.findFlowingSentence() + 1);

    if (thisMethods.findFlowingSentence() == thisMethods.startBizBreadth()) {
      thisMethods.fitDieYear(this.fetchPresentRicky());
      this.conductedServe.addLast(thisMethods);
      thisMethods = (null);
      this.inedTent = (true);
    }
  }

  private synchronized void synx414() {
    int flowAdditional = thisMethods.startBizBreadth() - thisMethods.findFlowingSentence();
    int glanceLeft =
        waitingList.peek().startBizBreadth() - waitingList.peek().findFlowingSentence();

    if (glanceLeft < flowAdditional) {
      waitingList.add(thisMethods);
      thisMethods = (null);
      this.inedTent = (true);
    }
  }

  private synchronized void synx415() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.inedTent = (false);
      this.anotherBurberryYears = (Distributor.DespatchClock);
    }
  }

  private synchronized void synx416() {

    if (thisMethods == null && !waitingList.isEmpty()) {
      thisMethods = (waitingList.poll());
      loaderNegotiations(thisMethods);
      thisMethods.determineBegunBeginning(this.fetchPresentRicky());
    }
  }
}
