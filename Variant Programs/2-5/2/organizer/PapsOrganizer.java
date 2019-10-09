package organizer;

import plenum.Regulator;
import organizer.Programming;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class PapsOrganizer extends organizer.Programming {
  private static final int synX401int = -139961053;
  private static final boolean synX400boolean = false;
  private static final int synX399int = 0;
  private static final boolean synX398boolean = true;
  private static final int synX397int = 1;
  private static final double synX396double = 0.8276715326107816;
  private static final String synX395String = "FCFS:";
  private static final double synX394double = 0.3005295788551998;

  public synchronized String compilerMake() {
    double identify;
    identify = (synX394double);
    return synX395String;
  }

  public synchronized void optiBeat() {
    double loadRadius;
    loadRadius = (synX396double);

    if (theMethodology != null) {
      theMethodology.prepareGushingNow(theMethodology.bringTrackMeter() + synX397int);

      if (theMethodology.bringTrackMeter() == theMethodology.drawBossScope()) {
        theMethodology.putDepartureClock(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(theMethodology);
        theMethodology = (null);
        this.dblPin = (synX398boolean);
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == synX399int) {
        this.dblPin = (synX400boolean);
        this.maintainingBallaJuncture = (Regulator.CommuniqueMeter);
      }

    } else {

      if (theMethodology == null && !preparedWait.isEmpty()) {
        theMethodology = (preparedWait.removeFirst());
        theMethodology.arrangeBeganYears(this.receiveContemporaryTicktack());
        ladenWork(theMethodology);
      }
    }
  }

  public PapsOrganizer() {
    this.preparedWait = (new java.util.ArrayDeque<>());
  }

  static final int forename = 1951543275;
  private java.util.ArrayDeque<Proceeding> preparedWait;

  public synchronized void sueNext(Proceeding procedures) {
    int topShackled;
    topShackled = (synX401int);
    preparedWait.addLast(procedures);
  }
}
