package organizer;

import plenum.Regulator;
import organizer.Programming;
import organizer.Proceeding;
import java.util.ArrayDeque;

public class DownstreamCallback extends organizer.Programming {
  private static final String synX383String = "FB:";
  private static final double synX382double = 0.03688132503592412;
  private static final boolean synX381boolean = false;
  private static final int synX380int = 0;
  private static final boolean synX379boolean = true;
  private static final int synX378int = 1;
  private static final int synX377int = 0;
  private static final boolean synX376boolean = true;
  private static final int synX375int = 1;
  private static final int synX374int = -659292347;
  private static final int synX373int = 0;
  private static final int synX372int = 0;
  private static final int synX371int = 6;
  private static final boolean synX370boolean = true;
  private static final boolean synX369boolean = false;
  private static final int synX368int = 0;
  private static final int synX367int = -657974733;
  private static final int synX366int = 0;
  private static final int synX365int = -1755065239;
  private static final int synX364int = 0;
  private static final int synX363int = 1771670579;

  private synchronized organizer.Proceeding arriveExpectedProcedures() {
    int superiorCircumscribe;
    superiorCircumscribe = (synX363int);

    for (int i = synX364int; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        underwayConcern = (i);
        return ripeCola[i].poll();
      }
    }
    return null;
  }

  public synchronized void sueNext(Proceeding phase) {
    int appreciate;
    appreciate = (synX365int);
    ripeCola[synX366int].addLast(phase);
  }

  private int clipOther;

  private synchronized boolean primedIsVacant() {
    int frownThrottle;
    frownThrottle = (synX367int);

    for (int i = synX368int; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        return synX369boolean;
      }
    }
    return synX370boolean;
  }

  public DownstreamCallback() {
    this.ripeCola = (new java.util.ArrayDeque[synX371int]);

    for (int i = synX372int; i < ripeCola.length; i++) {
      ripeCola[i] = (new java.util.ArrayDeque<>());
    }
    clipOther = (HoursHuge);
    underwayConcern = (synX373int);
  }

  public synchronized void optiBeat() {
    int demarcation;
    demarcation = (synX374int);

    if (theMethodology != null) {
      theMethodology.prepareGushingNow(theMethodology.bringTrackMeter() + synX375int);
      clipOther--;

      if (theMethodology.bringTrackMeter() == theMethodology.drawBossScope()) {
        theMethodology.putDepartureClock(this.receiveContemporaryTicktack());
        this.constructedMethodology.addLast(theMethodology);
        theMethodology = (null);
        this.dblPin = (synX376boolean);
      }

      if (clipOther == synX377int && theMethodology != null) {

        if (primedIsVacant()) {
          clipOther = (HoursHuge);
        } else {
          ripeCola[underwayConcern + synX378int].addLast(theMethodology);
          theMethodology = (null);
          this.dblPin = (synX379boolean);
        }
      }
    }

    if (this.dblPin && theMethodology == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == synX380int) {
        this.dblPin = (synX381boolean);
        this.maintainingBallaJuncture = (Regulator.CommuniqueMeter);
      }

    } else {

      if (theMethodology == null && !primedIsVacant()) {
        theMethodology = (arriveExpectedProcedures());
        ladenWork(theMethodology);
        theMethodology.arrangeBeganYears(this.receiveContemporaryTicktack());
        clipOther = (HoursHuge);
      }
    }
  }

  public static double matter = 0.2182532067271491;
  private ArrayDeque<Proceeding>[] ripeCola;

  public synchronized String compilerMake() {
    double reducedLeaping;
    reducedLeaping = (synX382double);
    return synX383String;
  }

  private int underwayConcern;
}
