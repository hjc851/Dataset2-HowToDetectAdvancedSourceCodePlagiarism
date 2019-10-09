package compiler;

import coordinator.Shipper;
import emulator.NegotiationsAvionics;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spooler {
  protected boolean isMoving;
  protected int workingClip;
  protected int hopeChance;
  protected LinkedList<Procedure> accomplishedProcedure;
  protected int normLookSentence;
  protected int levelSpikeThing;
  protected boolean inedTent;
  protected int survivingMbeWeek;
  public static final int WhenValue = 4;
  protected Procedure streamPhase;
  private int incumbentTock;

  public Spooler() {
    this.isMoving = false;
    this.workingClip = 0;
    this.hopeChance = 0;
    this.normLookSentence = 0;
    this.levelSpikeThing = 0;
    this.incumbentTock = -1;
    this.accomplishedProcedure = new LinkedList<>();
    this.inedTent = true;
  }

  public void beginsCallback() {
    this.isMoving = true;
    this.survivingMbeWeek = Shipper.ExpeditiousnessYear;
    this.bsiDepart();
  }

  public void blockageCallback() {
    this.isMoving = false;
    this.impressPaper();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int conveyFulfilledMethodNumber() {

    if (accomplishedProcedure.isEmpty()) {
      return 0;
    } else {
      return accomplishedProcedure.size();
    }
  }

  public int letAfootDials() {
    return incumbentTock;
  }

  public void fixedTheSelect(int thisValidation) {
    this.incumbentTock = thisValidation;
  }

  public double arriveModalComeMonth() {
    return (double) this.normLookSentence / this.accomplishedProcedure.size();
  }

  public double arriveModalUpswingMonth() {
    return (double) this.levelSpikeThing / this.accomplishedProcedure.size();
  }

  public void impressPaper() {

    try {
      Collections.sort(accomplishedProcedure);
      NegotiationsAvionics.CropData.write("\n");
      System.out.println();
      String bay = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      NegotiationsAvionics.CropData.write(bay + "\n");
      System.out.println(bay);
      for (Procedure cern : accomplishedProcedure) {
        int notJuncture =
            cern.makeOutletDay() - cern.makeReceiveDay() - cern.beatProgrammerSeverity();
        int tourBesideJuncture = cern.makeOutletDay() - cern.makeReceiveDay();
        this.normLookSentence += notJuncture;
        this.levelSpikeThing += tourBesideJuncture;
        String proceedings =
            String.format("%-7s%16d%19d", cern.conveyTag(), notJuncture, tourBesideJuncture);
        NegotiationsAvionics.CropData.write(proceedings + "\n");
        System.out.println(proceedings);
      }
      NegotiationsAvionics.CropData.write("\n");
      System.out.println();
    } catch (IOException abel) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public void bsiDepart() {

    try {
      NegotiationsAvionics.CropData.write("\n");
      System.out.println();
      NegotiationsAvionics.CropData.write("\n" + this.debuggingPatronymic() + "\n");
      System.out.println(this.debuggingPatronymic());
    } catch (IOException con) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public void ladenWork(Procedure writes) {

    try {
      String phase =
          String.format("%-5s%3s", "T" + (this.letAfootDials()) + ":", writes.conveyTag());
      NegotiationsAvionics.CropData.write(phase + "\n");
      System.out.println(phase);
    } catch (IOException former) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public abstract String debuggingPatronymic();

  public abstract void optiBeat();

  public abstract void litigateArriving(Procedure formalities);
}
