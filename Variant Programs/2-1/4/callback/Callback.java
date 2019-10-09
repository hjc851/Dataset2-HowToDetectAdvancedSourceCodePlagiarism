package callback;

import salesperson.Distributors;
import faker.LitigateMimic;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Callback {
  protected boolean isMoving;
  protected int fleeingMonth;
  protected int queuingMoment;
  protected LinkedList<Proceeding> finishedOutgrowth;
  protected int medianAwaitClock;
  protected int rateShiftYears;
  protected boolean dblPin;
  protected int retainingFellyHours;
  public static final int BeginningMammoth = 4;
  protected Proceeding theMethodology;
  private int newTally;

  public Callback() {
    this.isMoving = false;
    this.fleeingMonth = 0;
    this.queuingMoment = 0;
    this.medianAwaitClock = 0;
    this.rateShiftYears = 0;
    this.newTally = -1;
    this.finishedOutgrowth = new LinkedList<>();
    this.dblPin = true;
  }

  public void earlyWorkspace() {
    this.isMoving = true;
    this.retainingFellyHours = Distributors.HitPeriods;
    this.nsoInitiate();
  }

  public void layoverConfiguration() {
    this.isMoving = false;
    this.printersCover();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int obtainFinishedOutgrowthLength() {

    if (finishedOutgrowth.isEmpty()) {
      return 0;
    } else {
      return finishedOutgrowth.size();
    }
  }

  public int goPrevailingClick() {
    return newTally;
  }

  public void placedRifeCheck(int liveTic) {
    this.newTally = liveTic;
  }

  public double obtainIntermediateBideDays() {
    return (double) this.medianAwaitClock / this.finishedOutgrowth.size();
  }

  public double producePercentageTransitionNow() {
    return (double) this.rateShiftYears / this.finishedOutgrowth.size();
  }

  public void printersCover() {

    try {
      Collections.sort(finishedOutgrowth);
      LitigateMimic.TurnoutCharge.write("\n");
      System.out.println();
      String banner = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      LitigateMimic.TurnoutCharge.write(banner + "\n");
      System.out.println(banner);
      for (Proceeding cern : finishedOutgrowth) {
        int deferPeriods =
            cern.conveyQuittingAmount() - cern.generateReachYear() - cern.fixCfoProportions();
        int plowApproximatelySentence = cern.conveyQuittingAmount() - cern.generateReachYear();
        this.medianAwaitClock += deferPeriods;
        this.rateShiftYears += plowApproximatelySentence;
        String methodology =
            String.format(
                "%-7s%16d%19d", cern.obtainEst(), deferPeriods, plowApproximatelySentence);
        LitigateMimic.TurnoutCharge.write(methodology + "\n");
        System.out.println(methodology);
      }
      LitigateMimic.TurnoutCharge.write("\n");
      System.out.println();
    } catch (IOException abbe) {
      System.out.println("Unable to write " + this.serverDiagnose() + " to file.");
    }
  }

  public void nsoInitiate() {

    try {
      LitigateMimic.TurnoutCharge.write("\n");
      System.out.println();
      LitigateMimic.TurnoutCharge.write("\n" + this.serverDiagnose() + "\n");
      System.out.println(this.serverDiagnose());
    } catch (IOException combatants) {
      System.out.println("Unable to write " + this.serverDiagnose() + " to file.");
    }
  }

  public void loaderNegotiations(Proceeding postscript) {

    try {
      String proceeding =
          String.format("%-5s%3s", "T" + (this.goPrevailingClick()) + ":", postscript.obtainEst());
      LitigateMimic.TurnoutCharge.write(proceeding + "\n");
      System.out.println(proceeding);
    } catch (IOException exwife) {
      System.out.println("Unable to write " + this.serverDiagnose() + " to file.");
    }
  }

  public abstract String serverDiagnose();

  public abstract void nsoTic();

  public abstract void appendageEntering(Proceeding procedure);
}
