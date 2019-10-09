package debugging;

import consignor.Plenum;
import debugging.Controller;
import debugging.Methodology;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends debugging.Controller {
  private java.util.PriorityQueue<Methodology> preparedWait = null;
  private java.util.Comparator<Methodology> placebo = null;

  public MinimumController() {
    this.placebo = new NegotiationsWitness();
    this.preparedWait = new java.util.PriorityQueue<>(5, placebo);
  }

  private class NegotiationsWitness implements Comparator<Methodology> {

    public synchronized int compare(Methodology tgf, Methodology a1) {
      int b2Still = tgf.fixCfoProportions() - tgf.produceGushingNow();
      int f2Latter = a1.fixCfoProportions() - a1.produceGushingNow();

      if (b2Still < f2Latter) {
        return -1;
      }

      if (b2Still > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String timerMention() {
    return "SRT:";
  }

  public synchronized void weapMark() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.produceGushingNow() + 1);

      if (presentNegotiations.produceGushingNow() == presentNegotiations.fixCfoProportions()) {
        presentNegotiations.prepareIssueNow(this.bringOngoingBeat());
        this.fulfilledMethod.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ordeBeacon = true;
      }
    }

    if (!preparedWait.isEmpty() && presentNegotiations != null) {
      int previousStay =
          presentNegotiations.fixCfoProportions() - presentNegotiations.produceGushingNow();
      int pokeKeeping =
          preparedWait.peek().fixCfoProportions() - preparedWait.peek().produceGushingNow();

      if (pokeKeeping < previousStay) {
        preparedWait.add(presentNegotiations);
        presentNegotiations = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && presentNegotiations == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.ordeBeacon = false;
        this.leftDeviceClock = Plenum.HitPeriods;
      }

    } else {

      if (presentNegotiations == null && !preparedWait.isEmpty()) {
        presentNegotiations = preparedWait.poll();
        overloadingMechanisms(presentNegotiations);
        presentNegotiations.orderedOriginateChance(this.bringOngoingBeat());
      }
    }
  }

  public synchronized void outgrowthSucceeding(Methodology procedures) {
    preparedWait.add(procedures);
  }
}
