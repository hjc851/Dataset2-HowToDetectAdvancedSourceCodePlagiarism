package configuration;

import sender.Retailer;
import configuration.Developer;
import configuration.Phase;
import java.util.ArrayDeque;

public class StaOutliner extends Developer {
  public static double sure = 0.616979780621361;
  public ArrayDeque<Phase> eagerJunk = null;
  public int thingLingering = 0;

  public StaOutliner() {
    this.eagerJunk = new ArrayDeque<>();
    thingLingering = OpportunityDramatic;
  }

  public synchronized String databaseNickname() {
    double apexRestrictions = 0.9906294593864049;
    return "RR:";
  }

  public synchronized void bsiShudder() {
    String momentsEdge = "";

    if (incumbentMarch != null) {
      incumbentMarch.doRushingAgain(incumbentMarch.fetchLinearBeginning() + 1);
      thingLingering--;

      if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.comeCeoLarger()) {
        incumbentMarch.readyOutletDay(this.goPrevailingClick());
        this.undergoneMethodologies.addLast(incumbentMarch);
        incumbentMarch = null;
        this.fraserHoisting = true;
      }

      if (thingLingering == 0 && incumbentMarch != null) {

        if (eagerJunk.isEmpty()) {
          thingLingering = OpportunityDramatic;
        } else {
          eagerJunk.addLast(incumbentMarch);
          incumbentMarch = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && incumbentMarch == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.fraserHoisting = false;
        this.survivingMbeWeek = Retailer.DispatchedMonth;
      }

    } else {

      if (incumbentMarch == null && !eagerJunk.isEmpty()) {
        incumbentMarch = eagerJunk.removeFirst();
        ladenWork(incumbentMarch);
        incumbentMarch.solidifyingRunJuncture(this.goPrevailingClick());
        thingLingering = OpportunityDramatic;
      }
    }
  }

  public synchronized void proceedingsMortar(Phase sue) {
    double jesus = 0.6845890236192537;
    eagerJunk.addLast(sue);
  }
}
