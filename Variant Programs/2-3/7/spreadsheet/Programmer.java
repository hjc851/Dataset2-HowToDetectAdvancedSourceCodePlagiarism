package spreadsheet;

import plenum.Distributors;
import trainer.WorkSimulating;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programmer {
  public boolean isMoving = false;
  public int operativeMinutes = 0;
  public int hopeChance = 0;
  public LinkedList<Operation> fulfilledMethod = null;
  public int levelJustThing = 0;
  public int meanUpturnPeriod = 0;
  public boolean allanBanner = false;
  public int restAllanPeriods = 0;
  public static final int PeriodQualitative = 4;
  public Operation afootSummons = null;
  public int newTally = 0;

  public Programmer() {
    this.isMoving = false;
    this.operativeMinutes = 0;
    this.hopeChance = 0;
    this.levelJustThing = 0;
    this.meanUpturnPeriod = 0;
    this.newTally = -1;
    this.fulfilledMethod = new LinkedList<>();
    this.allanBanner = true;
  }

  public synchronized void kickoffSpooler() {
    this.isMoving = true;
    this.restAllanPeriods = Distributors.DeploymentMinutes;
    this.nsoInitiate();
  }

  public synchronized void quitProgramming() {
    this.isMoving = false;
    this.inkBulletin();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int sustainCarriedMechanismImmensity() {

    if (fulfilledMethod.isEmpty()) {
      return 0;
    } else {
      return fulfilledMethod.size();
    }
  }

  public synchronized int producePrevalentScore() {
    return newTally;
  }

  public synchronized void markAfootDials(int existingDial) {
    this.newTally = existingDial;
  }

  public synchronized double makeOrdinaryHoldDay() {
    return (double) this.levelJustThing / this.fulfilledMethod.size();
  }

  public synchronized double comeNormalReversalClip() {
    return (double) this.meanUpturnPeriod / this.fulfilledMethod.size();
  }

  public synchronized void inkBulletin() {

    try {
      Collections.sort(fulfilledMethod);
      WorkSimulating.InputInitiate.write("\n");
      System.out.println();
      String commutator =
          String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      WorkSimulating.InputInitiate.write(commutator + "\n");
      System.out.println(commutator);
      for (Operation vig : fulfilledMethod) {
        int seeWhen = vig.goDepartureClock() - vig.drawBringWeek() - vig.fixCfoProportions();
        int fermentFromChance = vig.goDepartureClock() - vig.drawBringWeek();
        this.levelJustThing += seeWhen;
        this.meanUpturnPeriod += fermentFromChance;
        String proceedings =
            String.format("%-7s%16d%19d", vig.drawName(), seeWhen, fermentFromChance);
        WorkSimulating.InputInitiate.write(proceedings + "\n");
        System.out.println(proceedings);
      }
      WorkSimulating.InputInitiate.write("\n");
      System.out.println();
    } catch (IOException abe) {
      System.out.println("Unable to write " + this.callbackConstitute() + " to file.");
    }
  }

  public synchronized void nsoInitiate() {

    try {
      WorkSimulating.InputInitiate.write("\n");
      System.out.println();
      WorkSimulating.InputInitiate.write("\n" + this.callbackConstitute() + "\n");
      System.out.println(this.callbackConstitute());
    } catch (IOException abdul) {
      System.out.println("Unable to write " + this.callbackConstitute() + " to file.");
    }
  }

  public synchronized void unladenProceeding(Operation postscript) {

    try {
      String phase =
          String.format(
              "%-5s%3s", "T" + (this.producePrevalentScore()) + ":", postscript.drawName());
      WorkSimulating.InputInitiate.write(phase + "\n");
      System.out.println(phase);
    } catch (IOException con) {
      System.out.println("Unable to write " + this.callbackConstitute() + " to file.");
    }
  }

  public abstract String callbackConstitute();

  public abstract void optiBeat();

  public abstract void methodEntrance(Operation cycle);
}
