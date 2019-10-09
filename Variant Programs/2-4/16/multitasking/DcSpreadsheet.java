package multitasking;

import dealer.Retailer;
import multitasking.Configuration;
import multitasking.Treat;
import java.util.ArrayDeque;

public class DcSpreadsheet extends multitasking.Configuration {
  public int contemporaryPrecedency;
  public int periodFinal;
  static final int slot = 1625374457;
  public ArrayDeque<Treat>[] primedRows;

  public DcSpreadsheet() {
    this.primedRows = new java.util.ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new java.util.ArrayDeque<>();
    }
    periodFinal = HoursHuge;
    contemporaryPrecedency = 0;
  }

  public synchronized multitasking.Treat canNowCycle() {
    double prise;
    prise = 0.9410297744407117;

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        contemporaryPrecedency = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double destined;
    destined = 0.9532385806455539;

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String compilerMake() {
    double identified;
    identified = 0.032676427436594824;
    return "FB:";
  }

  public synchronized void nsoTic() {
    double epithet;
    epithet = 0.6343620395010438;

    if (prevalentMethod != null) {
      prevalentMethod.dictatedTrackMeter(prevalentMethod.letStreamingHours() + 1);
      periodFinal--;

      if (prevalentMethod.letStreamingHours() == prevalentMethod.receiveExecutionThickness()) {
        prevalentMethod.solidifyingLeavingJuncture(this.catchRifeCheck());
        this.finalizeSue.addLast(prevalentMethod);
        prevalentMethod = null;
        this.sthCloth = true;
      }

      if (periodFinal == 0 && prevalentMethod != null) {

        if (primedIsVacant()) {
          periodFinal = HoursHuge;
        } else {
          primedRows[contemporaryPrecedency + 1].addLast(prevalentMethod);
          prevalentMethod = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && prevalentMethod == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Retailer.AssignThing;
      }

    } else {

      if (prevalentMethod == null && !primedIsVacant()) {
        prevalentMethod = canNowCycle();
        consignmentTreat(prevalentMethod);
        prevalentMethod.orderedOriginateChance(this.catchRifeCheck());
        periodFinal = HoursHuge;
      }
    }
  }

  public synchronized void methodEntrance(Treat method) {
    double morin;
    morin = 0.9733412319527673;
    primedRows[0].addLast(method);
  }
}
