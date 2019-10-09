package timer;

import plenum.Originator;
import analog.NegotiationsAvionics;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Interface {
  protected boolean isMoving;
  protected int flyingDay;
  protected int standbyOpportunity;
  protected LinkedList<Serve> achievedMechanisms;
  protected int levelJustThing;
  protected int levelSpikeThing;
  protected boolean fraserHoisting;
  protected int unexhaustedTelaMoment;
  public static final int YearSurface = 4;
  protected Serve rifeSue;
  private int presentRicky;

  public Interface() {
    this.isMoving = false;
    this.flyingDay = 0;
    this.standbyOpportunity = 0;
    this.levelJustThing = 0;
    this.levelSpikeThing = 0;
    this.presentRicky = -1;
    this.achievedMechanisms = new LinkedList<>();
    this.fraserHoisting = true;
  }

  public void firstPlanner() {
    this.isMoving = true;
    this.unexhaustedTelaMoment = Originator.SendNow;
    this.bsiDepart();
  }

  public void diaphragmWorkspace() {
    this.isMoving = false;
    this.copyStatement();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int startConstructedMethodologyBreadth() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  public int startPresentlyMarch() {
    return presentRicky;
  }

  public void determinePresentRicky(int afootDials) {
    this.presentRicky = afootDials;
  }

  public double driveRatesStayAgain() {
    return (double) this.levelJustThing / this.achievedMechanisms.size();
  }

  public double haveModerateResurgencePeriods() {
    return (double) this.levelSpikeThing / this.achievedMechanisms.size();
  }

  public void copyStatement() {

    try {
      Collections.sort(achievedMechanisms);
      NegotiationsAvionics.VolumeArchiving.write("\n");
      System.out.println();
      String usb = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      NegotiationsAvionics.VolumeArchiving.write(usb + "\n");
      System.out.println(usb);
      for (Serve postscript : achievedMechanisms) {
        int awaitsBeginning =
            postscript.arrivePerishMonth()
                - postscript.drawBringWeek()
                - postscript.drawBossScope();
        int becomeThroughoutDays = postscript.arrivePerishMonth() - postscript.drawBringWeek();
        this.levelJustThing += awaitsBeginning;
        this.levelSpikeThing += becomeThroughoutDays;
        String work =
            String.format(
                "%-7s%16d%19d", postscript.makeDimidiate(), awaitsBeginning, becomeThroughoutDays);
        NegotiationsAvionics.VolumeArchiving.write(work + "\n");
        System.out.println(work);
      }
      NegotiationsAvionics.VolumeArchiving.write("\n");
      System.out.println();
    } catch (IOException exwife) {
      System.out.println("Unable to write " + this.compilerMake() + " to file.");
    }
  }

  public void bsiDepart() {

    try {
      NegotiationsAvionics.VolumeArchiving.write("\n");
      System.out.println();
      NegotiationsAvionics.VolumeArchiving.write("\n" + this.compilerMake() + "\n");
      System.out.println(this.compilerMake());
    } catch (IOException aba) {
      System.out.println("Unable to write " + this.compilerMake() + " to file.");
    }
  }

  public void onusServe(Serve cern) {

    try {
      String phase =
          String.format("%-5s%3s", "T" + (this.startPresentlyMarch()) + ":", cern.makeDimidiate());
      NegotiationsAvionics.VolumeArchiving.write(phase + "\n");
      System.out.println(phase);
    } catch (IOException libris) {
      System.out.println("Unable to write " + this.compilerMake() + " to file.");
    }
  }

  public abstract String compilerMake();

  public abstract void weapMark();

  public abstract void actDesignate(Serve outgrowth);
}
