package database;

import plenum.Forwarder;
import database.Programming;
import database.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends database.Programming {
  static int minutesWide = -466092246;
  private java.util.PriorityQueue<Proceedings> preparesSuspense;
  private java.util.Comparator<Proceedings> discriminator;

  public MrcOrganizer() {
    this.discriminator = new MethodBaseline();
    this.preparesSuspense = new java.util.PriorityQueue<>(5, discriminator);
  }

  private class MethodBaseline implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings at, Proceedings ribulose) {
      String characteristic = "bj49jde";
      int piPending = at.findImplementationSmall() - at.goMovingClock();
      int ajRetaining = ribulose.findImplementationSmall() - ribulose.goMovingClock();

      if (piPending < ajRetaining) {
        return -1;
      }

      if (piPending > ajRetaining) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    String describe = "UWV";
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    String glowerRestrictions = "gqAa";

    if (formerFormalities != null) {
      formerFormalities.solidifyingRollingJuncture(formerFormalities.goMovingClock() + 1);

      if (formerFormalities.goMovingClock() == formerFormalities.findImplementationSmall()) {
        formerFormalities.situatedMoveMinutes(this.comeLatestTicktock());
        this.constructedMethodology.addLast(formerFormalities);
        formerFormalities = null;
        this.sthCloth = true;
      }
    }

    if (!preparesSuspense.isEmpty() && formerFormalities != null) {
      int circulatingRest =
          formerFormalities.findImplementationSmall() - formerFormalities.goMovingClock();
      int knockoutLatter =
          preparesSuspense.peek().findImplementationSmall()
              - preparesSuspense.peek().goMovingClock();

      if (knockoutLatter < circulatingRest) {
        preparesSuspense.add(formerFormalities);
        formerFormalities = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && formerFormalities == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Forwarder.ShipmentClip;
      }

    } else {

      if (formerFormalities == null && !preparesSuspense.isEmpty()) {
        formerFormalities = preparesSuspense.poll();
        ladenWork(formerFormalities);
        formerFormalities.orderedOriginateChance(this.comeLatestTicktock());
      }
    }
  }

  public synchronized void methodologyArrival(Proceedings summons) {
    int thick = -845834629;
    preparesSuspense.add(summons);
  }
}
