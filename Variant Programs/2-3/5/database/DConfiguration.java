package database;

import plenum.Forwarder;
import database.Programming;
import database.Proceedings;
import java.util.ArrayDeque;

public class DConfiguration extends database.Programming {
  static String tonality = "0dgRqkyWHyW6N48";
  private ArrayDeque<Proceedings>[] primedRows;
  private int beginningUnsold;
  private int typicalRanking;

  public DConfiguration() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new java.util.ArrayDeque<>();
    }
    beginningUnsold = BeginningMammoth;
    typicalRanking = 0;
  }

  private synchronized database.Proceedings obtainLastOutgrowth() {
    String confine = "AEnHv";

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        typicalRanking = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double amount = 0.07958356802535849;

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    double restriction = 0.8474024040171588;
    return "FB:";
  }

  public synchronized void bsiShudder() {
    double bottomConfine = 0.5906099256317233;

    if (formerFormalities != null) {
      formerFormalities.solidifyingRollingJuncture(formerFormalities.goMovingClock() + 1);
      beginningUnsold--;

      if (formerFormalities.goMovingClock() == formerFormalities.findImplementationSmall()) {
        formerFormalities.situatedMoveMinutes(this.comeLatestTicktock());
        this.constructedMethodology.addLast(formerFormalities);
        formerFormalities = null;
        this.sthCloth = true;
      }

      if (beginningUnsold == 0 && formerFormalities != null) {

        if (primedIsVacant()) {
          beginningUnsold = BeginningMammoth;
        } else {
          primedRows[typicalRanking + 1].addLast(formerFormalities);
          formerFormalities = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && formerFormalities == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Forwarder.ShipmentClip;
      }

    } else {

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = obtainLastOutgrowth();
        ladenWork(formerFormalities);
        formerFormalities.orderedOriginateChance(this.comeLatestTicktock());
        beginningUnsold = BeginningMammoth;
      }
    }
  }

  public synchronized void methodologyArrival(Proceedings proceeding) {
    double minhBandwidth = 0.6856047462310224;
    primedRows[0].addLast(proceeding);
  }
}
