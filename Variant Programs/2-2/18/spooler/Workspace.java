package spooler;

import consignor.Limiter;
import sim.ActMock;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  protected boolean isMoving;
  protected int pouringMoment;
  protected int lookingYear;
  protected java.util.LinkedList<March> finishedOutgrowth;
  protected int proportionAwaitsBeginning;
  protected int ordinaryTransformationDay;
  protected boolean thmFlagstone;
  protected int unresolvedLeviChance;
  public static final int MeterMeasure = 4;
  protected spooler.March typicalProceedings;
  private int afootDials;

  public Workspace() {
    this.isMoving = false;
    this.pouringMoment = 0;
    this.lookingYear = 0;
    this.proportionAwaitsBeginning = 0;
    this.ordinaryTransformationDay = 0;
    this.afootDials = -1;
    this.finishedOutgrowth = new java.util.LinkedList<>();
    this.thmFlagstone = true;
  }

  public void kickoffSpooler() {
    this.isMoving = true;
    this.unresolvedLeviChance = Limiter.DeploymentMinutes;
    this.optiCommence();
  }

  public void occlusionDebugging() {
    this.isMoving = false;
    this.printableDocument();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int makeUndertakenMarchDimensions() {

    if (finishedOutgrowth.isEmpty()) {
      return 0;
    } else {
      return finishedOutgrowth.size();
    }
  }

  public int findActualRetick() {
    return afootDials;
  }

  public void markAfootDials(int circulatingShudder) {
    this.afootDials = circulatingShudder;
  }

  public double generateFairPostponeYear() {
    return (double) this.proportionAwaitsBeginning / this.finishedOutgrowth.size();
  }

  public double generateFairRecoveryYear() {
    return (double) this.ordinaryTransformationDay / this.finishedOutgrowth.size();
  }

  public void printableDocument() {

    try {
      java.util.Collections.sort(finishedOutgrowth);
      ActMock.SupplyDocumentation.write("\n");
      System.out.println();
      java.lang.String chapeau =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ActMock.SupplyDocumentation.write(chapeau + "\n");
      System.out.println(chapeau);
      for (spooler.March postscript : finishedOutgrowth) {
        int wantWeek =
            postscript.beatLeavingJuncture()
                - postscript.produceComingNow()
                - postscript.developDirectorStature();
        int convertSomeMeter = postscript.beatLeavingJuncture() - postscript.produceComingNow();
        this.proportionAwaitsBeginning += wantWeek;
        this.ordinaryTransformationDay += convertSomeMeter;
        java.lang.String march =
            java.lang.String.format(
                "%-7s%16d%19d", postscript.catchIbid(), wantWeek, convertSomeMeter);
        ActMock.SupplyDocumentation.write(march + "\n");
        System.out.println(march);
      }
      ActMock.SupplyDocumentation.write("\n");
      System.out.println();
    } catch (java.io.IOException abel) {
      System.out.println("Unable to write " + this.spoolerDistinguish() + " to file.");
    }
  }

  public void optiCommence() {

    try {
      ActMock.SupplyDocumentation.write("\n");
      System.out.println();
      ActMock.SupplyDocumentation.write("\n" + this.spoolerDistinguish() + "\n");
      System.out.println(this.spoolerDistinguish());
    } catch (java.io.IOException admittedly) {
      System.out.println("Unable to write " + this.spoolerDistinguish() + " to file.");
    }
  }

  public void payloadOperation(spooler.March cern) {

    try {
      java.lang.String treat =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.findActualRetick()) + ":", cern.catchIbid());
      ActMock.SupplyDocumentation.write(treat + "\n");
      System.out.println(treat);
    } catch (java.io.IOException tipp) {
      System.out.println("Unable to write " + this.spoolerDistinguish() + " to file.");
    }
  }

  public abstract java.lang.String spoolerDistinguish();

  public abstract void addTock();

  public abstract void outgrowthSucceeding(spooler.March proceedings);
}
