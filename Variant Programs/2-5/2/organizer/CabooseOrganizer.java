package organizer;

import plenum.Regulator;
import organizer.Programming;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class CabooseOrganizer extends organizer.Programming {
  private static final double synX393double = 0.18515132723001027;
  private static final boolean synX392boolean = false;
  private static final int synX391int = 0;
  private static final boolean synX390boolean = true;
  private static final int synX389int = 0;
  private static final boolean synX388boolean = true;
  private static final int synX387int = 1;
  private static final String synX386String = "p3tw";
  private static final String synX385String = "RR:";
  private static final int synX384int = -1070219768;
  private java.util.ArrayDeque<Proceeding> poisedDipper;

  public synchronized String compilerMake() {
    int curve;
    curve = (synX384int);
    return synX385String;
  }

  public synchronized void optiBeat() {
    String upperSkank;
    upperSkank = (synX386String);

    if (theMethodology != null) {
      theMethodology.prepareGushingNow(theMethodology.bringTrackMeter() + synX387int);
      meterLeftover--;

      if (theMethodology.bringTrackMeter() == theMethodology.drawBossScope()) {
        theMethodology.putDepartureClock(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(theMethodology);
        theMethodology = (null);
        this.dblPin = (synX388boolean);
      }

      if (meterLeftover == synX389int && theMethodology != null) {

        if (poisedDipper.isEmpty()) {
          meterLeftover = (HoursHuge);
        } else {
          poisedDipper.addLast(theMethodology);
          theMethodology = (null);
          this.dblPin = (synX390boolean);
        }
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == synX391int) {
        this.dblPin = (synX392boolean);
        this.maintainingBallaJuncture = (Regulator.CommuniqueMeter);
      }

    } else {

      if (theMethodology == null && !poisedDipper.isEmpty()) {
        theMethodology = (poisedDipper.removeFirst());
        ladenWork(theMethodology);
        theMethodology.arrangeBeganYears(this.receiveContemporaryTicktack());
        meterLeftover = (HoursHuge);
      }
    }
  }

  public synchronized void sueNext(Proceeding formalities) {
    double distinguish;
    distinguish = (synX393double);
    poisedDipper.addLast(formalities);
  }

  public static int best = -636433816;
  private int meterLeftover;

  public CabooseOrganizer() {
    this.poisedDipper = (new java.util.ArrayDeque<>());
    meterLeftover = (HoursHuge);
  }
}
