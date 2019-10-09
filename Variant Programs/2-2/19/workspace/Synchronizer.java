package workspace;

import device.Reseller;
import simulating.MarchDevice;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Synchronizer {
  protected boolean isMoving;
  protected int scamperingDays;
  protected int hopedWeek;
  protected LinkedList<Act> constructedMethodology;
  protected int levelJustThing;
  protected int rateShiftYears;
  protected boolean telaDroop;
  protected int unresolvedLeviChance;
  public static final int ClipQuantity = 4;
  protected Act ongoingWork;
  private int liveTic;

  public Synchronizer() {
    this.isMoving = false;
    this.scamperingDays = 0;
    this.hopedWeek = 0;
    this.levelJustThing = 0;
    this.rateShiftYears = 0;
    this.liveTic = -1;
    this.constructedMethodology = new LinkedList<>();
    this.telaDroop = true;
  }

  public void beginProgrammer() {
    this.isMoving = true;
    this.unresolvedLeviChance = Reseller.DeployingOpportunity;
    this.addOutset();
  }

  public void breakInterface() {
    this.isMoving = false;
    this.reprintingSurvey();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int goAccomplishedProcedureHeight() {

    if (constructedMethodology.isEmpty()) {
      return 0;
    } else {
      return constructedMethodology.size();
    }
  }

  public int fixNewTally() {
    return liveTic;
  }

  public void placeStreamBookmark(int rifeCheck) {
    this.liveTic = rifeCheck;
  }

  public double fetchProportionAwaitsBeginning() {
    return (double) this.levelJustThing / this.constructedMethodology.size();
  }

  public double driveRatesBreakthroughAgain() {
    return (double) this.rateShiftYears / this.constructedMethodology.size();
  }

  public void reprintingSurvey() {

    try {
      Collections.sort(constructedMethodology);
      MarchDevice.ProducingFolders.write("\n");
      System.out.println();
      String letterhead =
          String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MarchDevice.ProducingFolders.write(letterhead + "\n");
      System.out.println(letterhead);
      for (Act writes : constructedMethodology) {
        int awaitedHour =
            writes.fixWithdrawalChance() - writes.bringArrivalMeter() - writes.arrivePrezWingspan();
        int sprainBehindAmount = writes.fixWithdrawalChance() - writes.bringArrivalMeter();
        this.levelJustThing += awaitedHour;
        this.rateShiftYears += sprainBehindAmount;
        String treat =
            String.format("%-7s%16d%19d", writes.sustainSelf(), awaitedHour, sprainBehindAmount);
        MarchDevice.ProducingFolders.write(treat + "\n");
        System.out.println(treat);
      }
      MarchDevice.ProducingFolders.write("\n");
      System.out.println();
    } catch (IOException abdul) {
      System.out.println("Unable to write " + this.workflowCite() + " to file.");
    }
  }

  public void addOutset() {

    try {
      MarchDevice.ProducingFolders.write("\n");
      System.out.println();
      MarchDevice.ProducingFolders.write("\n" + this.workflowCite() + "\n");
      System.out.println(this.workflowCite());
    } catch (IOException vet) {
      System.out.println("Unable to write " + this.workflowCite() + " to file.");
    }
  }

  public void encumbranceSummons(Act postscript) {

    try {
      String march =
          String.format("%-5s%3s", "T" + (this.fixNewTally()) + ":", postscript.sustainSelf());
      MarchDevice.ProducingFolders.write(march + "\n");
      System.out.println(march);
    } catch (IOException aba) {
      System.out.println("Unable to write " + this.workflowCite() + " to file.");
    }
  }

  public abstract String workflowCite();

  public abstract void nbsClick();

  public abstract void methodEntrance(Act outgrowth);
}
