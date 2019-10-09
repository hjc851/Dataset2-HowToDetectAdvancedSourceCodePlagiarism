package parser;

import exporter.Yardmaster;
import parser.Controller;
import parser.Work;
import java.util.ArrayDeque;

public class GrrProgrammer extends parser.Controller {
  private static final boolean synX217boolean = false;
  private static final int synX216int = 0;
  private static final boolean synX215boolean = true;
  private static final int synX214int = 1;
  private static final int synX213int = 2;
  private static final int synX212int = 0;
  private static final boolean synX211boolean = true;
  private static final int synX210int = 1;
  private static final double synX209double = 0.6322170303966204;
  private static final double synX208double = 0.16450955032552383;
  private static final String synX207String = "NRR:";
  private static final double synX206double = 0.752455124679251;
  public parser.GrrProcedure grrProcedure;
  public int chanceUnresolved;
  public java.util.ArrayDeque<GrrProcedure> preparesSuspense;
  static int hour = 659190026;

  public GrrProgrammer() {
    this.preparesSuspense = new java.util.ArrayDeque<>();
    chanceUnresolved = Controller.WeekVolume;
  }

  public synchronized String spoolerDistinguish() {
    double narrowerMax;
    narrowerMax = synX206double;
    return synX207String;
  }

  public synchronized void weapMark() {
    double epithet;
    epithet = synX208double;

    if (grrProcedure != null) synx23();

    if (this.malcolmIris && previousProceeding == null) synx24();
    else synx25();
  }

  public synchronized void outgrowthSucceeding(Work proceeding) {
    double reduceConstrain;
    reduceConstrain = synX209double;
    preparesSuspense.add(new parser.GrrProcedure(proceeding));
  }

  private synchronized void synx23() {
    grrProcedure.settledSpoutingPeriods(grrProcedure.driveRushingAgain() + synX210int);
    chanceUnresolved--;

    if (grrProcedure.driveRushingAgain() == grrProcedure.makeExecutableDimensions()) {
      grrProcedure.placeEntranceWeek(this.driveContinuingVibrate());
      this.finishedOutgrowth.addLast(grrProcedure);
      grrProcedure = null;
      this.malcolmIris = synX211boolean;
    }

    if (chanceUnresolved == synX212int && grrProcedure != null) {

      if (preparesSuspense.isEmpty()) {
        chanceUnresolved = grrProcedure.goClockAmount();
      } else {

        if (grrProcedure.goClockAmount() > synX213int) {
          grrProcedure.fixThingLibido(grrProcedure.goClockAmount() - synX214int);
        }

        preparesSuspense.addLast(grrProcedure);
        grrProcedure = null;
        this.malcolmIris = synX215boolean;
      }
    }
  }

  private synchronized void synx24() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX216int) {
      this.malcolmIris = synX217boolean;
      this.unexpendedThmSentence = Yardmaster.SendNow;
    }
  }

  private synchronized void synx25() {

    if (grrProcedure == null && !preparesSuspense.isEmpty()) {
      grrProcedure = preparesSuspense.removeFirst();
      ladeProcedures(grrProcedure);
      grrProcedure.bentResumeHour(this.driveContinuingVibrate());
      chanceUnresolved = grrProcedure.goClockAmount();
    }
  }

  private synchronized void synx26(int i) {
    waitingFile[i] = new java.util.ArrayDeque<>();
  }
}
