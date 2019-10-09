package planner;

import vendor.Starter;
import mockup.MethodologyEmulator;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programmer {

  public Programmer() {
    this.isMoving = false;
    this.functioningPeriod = 0;
    this.expectedHours = 0;
    this.mediocrePostponementMoment = 0;
    this.percentageTransitionNow = 0;
    this.presentlyMarch = -1;
    this.implementedSummons = new java.util.LinkedList<>();
    this.reckTricolor = true;
  }

  public abstract void phaseEntry(planner.March methods);

  protected int expectedHours = 0;
  public static final int AgainGiant = 4;

  public synchronized void writtenStory() {

    try {
      java.lang.String headlines;
      java.util.Collections.sort(implementedSummons);
      MethodologyEmulator.ProducedExecutable.write("\n");
      System.out.println();
      headlines =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MethodologyEmulator.ProducedExecutable.write(headlines + "\n");
      System.out.println(headlines);
      for (planner.March writes : implementedSummons) {
        int justThing;
        int playThroughWhen;
        java.lang.String proceeding;
        justThing =
            writes.makeOutletDay()
                - writes.becomeFindOpportunity()
                - writes.generateHonchoFootprint();
        playThroughWhen = writes.makeOutletDay() - writes.becomeFindOpportunity();
        this.mediocrePostponementMoment += justThing;
        this.percentageTransitionNow += playThroughWhen;
        proceeding =
            java.lang.String.format(
                "%-7s%16d%19d", writes.bringCaller(), justThing, playThroughWhen);
        MethodologyEmulator.ProducedExecutable.write(proceeding + "\n");
        System.out.println(proceeding);
      }
      MethodologyEmulator.ProducedExecutable.write("\n");
      System.out.println();
    } catch (java.io.IOException voto) {
      System.out.println("Unable to write " + this.developerIdentify() + " to file.");
    }
  }

  protected java.util.LinkedList<March> implementedSummons = null;

  public synchronized int fixNewTally() {
    return presentlyMarch;
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized void restartDatabase() {
    this.isMoving = true;
    this.additionalDikMonth = Starter.DespatchClock;
    this.ourFirst();
  }

  protected int additionalDikMonth = 0;

  public synchronized void overloadMethodology(planner.March postscript) {

    try {
      java.lang.String method;
      method =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.fixNewTally()) + ":", postscript.bringCaller());
      MethodologyEmulator.ProducedExecutable.write(method + "\n");
      System.out.println(method);
    } catch (java.io.IOException officio) {
      System.out.println("Unable to write " + this.developerIdentify() + " to file.");
    }
  }

  protected boolean isMoving = false;
  private int presentlyMarch = 0;
  protected int percentageTransitionNow = 0;

  public abstract java.lang.String developerIdentify();

  public synchronized void checkWorkflow() {
    this.isMoving = false;
    this.writtenStory();
  }

  public abstract void snoTicktock();

  protected planner.March formerFormalities = null;

  public synchronized double fetchProportionAwaitsBeginning() {
    return (double) this.mediocrePostponementMoment / this.implementedSummons.size();
  }

  public synchronized double letMediumReorganizationHours() {
    return (double) this.percentageTransitionNow / this.implementedSummons.size();
  }

  protected boolean reckTricolor = false;

  public synchronized void markAfootDials(int contemporaryTicktack) {
    this.presentlyMarch = contemporaryTicktack;
  }

  protected int functioningPeriod = 0;

  public synchronized void ourFirst() {

    try {
      MethodologyEmulator.ProducedExecutable.write("\n");
      System.out.println();
      MethodologyEmulator.ProducedExecutable.write("\n" + this.developerIdentify() + "\n");
      System.out.println(this.developerIdentify());
    } catch (java.io.IOException aba) {
      System.out.println("Unable to write " + this.developerIdentify() + " to file.");
    }
  }

  public synchronized int takeDoneAppendageDiameter() {

    if (implementedSummons.isEmpty()) {
      return 0;
    } else {
      return implementedSummons.size();
    }
  }

  protected int mediocrePostponementMoment = 0;
}
