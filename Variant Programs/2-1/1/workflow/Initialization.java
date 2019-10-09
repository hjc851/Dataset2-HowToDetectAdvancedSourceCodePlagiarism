package workflow;

import device.Coordinator;
import mock.CycleJoystick;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Initialization {
  protected boolean isMoving;
  protected int workingClip;
  protected int holdingMinutes;
  protected LinkedList<System> concludedPractices;
  protected int levelJustThing;
  protected int meanUpturnPeriod;
  protected boolean deviceEnsign;
  protected int stillPassenYear;
  public static final int MonthLarge = 4;
  protected System formerFormalities;
  private int existingDial;

  public Initialization() {
    this.isMoving = false;
    this.workingClip = 0;
    this.holdingMinutes = 0;
    this.levelJustThing = 0;
    this.meanUpturnPeriod = 0;
    this.existingDial = -1;
    this.concludedPractices = new LinkedList<>();
    this.deviceEnsign = true;
  }

  public void startleOutliner() {
    this.isMoving = true;
    this.stillPassenYear = Coordinator.SendingHour;
    this.bsiDepart();
  }

  public void occlusiveInitialization() {
    this.isMoving = false;
    this.photographyNote();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int generatePerformedTreatFootprint() {

    if (concludedPractices.isEmpty()) {
      return 0;
    } else {
      return concludedPractices.size();
    }
  }

  public int canExistingDial() {
    return existingDial;
  }

  public void dictatedOngoingBeat(int theSelect) {
    this.existingDial = theSelect;
  }

  public double conveyRegularHopeAmount() {
    return (double) this.levelJustThing / this.concludedPractices.size();
  }

  public double producePercentageTransitionNow() {
    return (double) this.meanUpturnPeriod / this.concludedPractices.size();
  }

  public void photographyNote() {

    try {
      Collections.sort(concludedPractices);
      CycleJoystick.ProducePaperwork.write("\n");
      System.out.println();
      String heading = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      CycleJoystick.ProducePaperwork.write(heading + "\n");
      System.out.println(heading);
      for (System cern : concludedPractices) {
        int postponeYear =
            cern.comeLeaveClip() - cern.produceComingNow() - cern.generateHonchoFootprint();
        int crookHereAgain = cern.comeLeaveClip() - cern.produceComingNow();
        this.levelJustThing += postponeYear;
        this.meanUpturnPeriod += crookHereAgain;
        String system =
            String.format("%-7s%16d%19d", cern.becomePhoto(), postponeYear, crookHereAgain);
        CycleJoystick.ProducePaperwork.write(system + "\n");
        System.out.println(system);
      }
      CycleJoystick.ProducePaperwork.write("\n");
      System.out.println();
    } catch (IOException abbe) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public void bsiDepart() {

    try {
      CycleJoystick.ProducePaperwork.write("\n");
      System.out.println();
      CycleJoystick.ProducePaperwork.write("\n" + this.controllerSurname() + "\n");
      System.out.println(this.controllerSurname());
    } catch (IOException exwife) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public void offloadProceedings(System postscript) {

    try {
      String mechanism =
          String.format("%-5s%3s", "T" + (this.canExistingDial()) + ":", postscript.becomePhoto());
      CycleJoystick.ProducePaperwork.write(mechanism + "\n");
      System.out.println(mechanism);
    } catch (IOException eden) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public abstract String controllerSurname();

  public abstract void bsiShudder();

  public abstract void actDesignate(System appendage);
}
