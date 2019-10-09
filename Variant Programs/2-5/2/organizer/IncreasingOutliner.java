package organizer;

import plenum.Regulator;
import organizer.Programming;
import organizer.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends organizer.Programming {
  private java.util.Comparator<Proceeding> compared;

  private class MarchCompare implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding tgf, Proceeding f2) {
      String briEquipment;
      int mLatter;
      int ribuloseRemainder;
      briEquipment = ("Cj5rBxqmw2C");
      mLatter = (tgf.drawBossScope() - tgf.bringTrackMeter());
      ribuloseRemainder = (f2.drawBossScope() - f2.bringTrackMeter());

      if (mLatter < ribuloseRemainder) {
        return -1;
      }

      if (mLatter > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void optiBeat() {
    String kilogram;
    kilogram = ("kbUoTygwoEJS7mEFDP");

    if (theMethodology != null) {
      theMethodology.prepareGushingNow(theMethodology.bringTrackMeter() + 1);

      if (theMethodology.bringTrackMeter() == theMethodology.drawBossScope()) {
        theMethodology.putDepartureClock(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(theMethodology);
        theMethodology = (null);
        this.dblPin = (true);
      }
    }

    if (!preppedDragon.isEmpty() && theMethodology != null) {
      int theResidual;
      int seeFinal;
      theResidual = (theMethodology.drawBossScope() - theMethodology.bringTrackMeter());
      seeFinal = (preppedDragon.peek().drawBossScope() - preppedDragon.peek().bringTrackMeter());

      if (seeFinal < theResidual) {
        preppedDragon.add(theMethodology);
        theMethodology = (null);
        this.dblPin = (true);
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.dblPin = (false);
        this.maintainingBallaJuncture = (Regulator.CommuniqueMeter);
      }

    } else {

      if (theMethodology == null && !preppedDragon.isEmpty()) {
        theMethodology = (preppedDragon.poll());
        ladenWork(theMethodology);
        theMethodology.arrangeBeganYears(this.receiveContemporaryTicktack());
      }
    }
  }

  public synchronized void sueNext(Proceeding appendage) {
    String upper;
    upper = ("");
    preppedDragon.add(appendage);
  }

  static final double appraise = 0.93228802776376;

  public synchronized String compilerMake() {
    double elevatedEnchained;
    elevatedEnchained = (0.7283482147545511);
    return "SRT:";
  }

  private java.util.PriorityQueue<Proceeding> preppedDragon;

  public IncreasingOutliner() {
    this.compared = (new MarchCompare());
    this.preppedDragon = (new java.util.PriorityQueue<>(5, compared));
  }
}
