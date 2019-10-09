package organizer;

import plenum.Regulator;
import organizer.Programming;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends organizer.Programming {
  private static final String synX362String = "NRR:";
  private static final double synX361double = 0.08597493855078953;
  private static final String synX360String = "F4";
  private static final boolean synX359boolean = false;
  private static final int synX358int = 0;
  private static final boolean synX357boolean = true;
  private static final int synX356int = 1;
  private static final int synX355int = 2;
  private static final int synX354int = 0;
  private static final boolean synX353boolean = true;
  private static final int synX352int = 1;
  private static final String synX351String = "Ypu";
  private int chanceUnresolved;
  private java.util.ArrayDeque<GrrProcedure> happyStopper;
  private organizer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.happyStopper = (new java.util.ArrayDeque<>());
    chanceUnresolved = (Programming.HoursHuge);
  }

  public synchronized void optiBeat() {
    String advert;
    advert = (synX351String);

    if (grrProcedure != null) {
      grrProcedure.prepareGushingNow(grrProcedure.bringTrackMeter() + synX352int);
      chanceUnresolved--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.drawBossScope()) {
        grrProcedure.putDepartureClock(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(grrProcedure);
        grrProcedure = (null);
        this.dblPin = (synX353boolean);
      }

      if (chanceUnresolved == synX354int && grrProcedure != null) {

        if (happyStopper.isEmpty()) {
          chanceUnresolved = (grrProcedure.obtainDaysQuantitative());
        } else {

          if (grrProcedure.obtainDaysQuantitative() > synX355int) {
            grrProcedure.arrangedSentenceTeleportation(
                grrProcedure.obtainDaysQuantitative() - synX356int);
          }

          happyStopper.addLast(grrProcedure);
          grrProcedure = (null);
          this.dblPin = (synX357boolean);
        }
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == synX358int) {
        this.dblPin = (synX359boolean);
        this.maintainingBallaJuncture = (Regulator.CommuniqueMeter);
      }

    } else {

      if (grrProcedure == null && !happyStopper.isEmpty()) {
        grrProcedure = (happyStopper.removeFirst());
        ladenWork(grrProcedure);
        grrProcedure.arrangeBeganYears(this.receiveContemporaryTicktack());
        chanceUnresolved = (grrProcedure.obtainDaysQuantitative());
      }
    }
  }

  public synchronized void sueNext(Proceeding act) {
    String lessMagnitude;
    lessMagnitude = (synX360String);
    happyStopper.add(new organizer.GrrProcedure(act));
  }

  public synchronized String compilerMake() {
    double pivotal;
    pivotal = (synX361double);
    return synX362String;
  }

  public static final double heightConfine = 0.4234950609788488;
}
