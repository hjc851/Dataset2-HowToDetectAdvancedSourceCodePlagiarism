package database;

import vendor.Originator;
import mockup.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Outliner {
  protected boolean isMoving = false;
  protected int flyingDay = 0;
  protected int intendingYears = 0;
  protected java.util.LinkedList<Proceeding> doneAppendage = null;
  protected int levelJustThing = 0;
  protected int regularAdjustmentAmount = 0;
  protected boolean fellyAlert = false;
  protected int additionalDikMonth = 0;
  public static final int AgainGiant = 4;
  protected database.Proceeding afootSummons = null;
  private int theSelect = 0;

  public Outliner() {
    this.isMoving = false;
    this.flyingDay = 0;
    this.intendingYears = 0;
    this.levelJustThing = 0;
    this.regularAdjustmentAmount = 0;
    this.theSelect = -1;
    this.doneAppendage = new java.util.LinkedList<>();
    this.fellyAlert = true;
  }

  public synchronized void offsetCompiler() {
    this.isMoving = true;
    this.additionalDikMonth = Originator.RoutingWeek;
    this.optiCommence();
  }

  public synchronized void arrestCompiler() {
    this.isMoving = false;
    this.reprintingSurvey();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int haveConductedServeLarge() {

    if (doneAppendage.isEmpty()) {
      return 0;
    } else {
      return doneAppendage.size();
    }
  }

  public synchronized int goPrevailingClick() {
    return theSelect;
  }

  public synchronized void doContinuingVibrate(int underwayWalk) {
    this.theSelect = underwayWalk;
  }

  public synchronized double becomeApproximatelyLingerOpportunity() {
    return (double) this.levelJustThing / this.doneAppendage.size();
  }

  public synchronized double sustainLevelSpikeThing() {
    return (double) this.regularAdjustmentAmount / this.doneAppendage.size();
  }

  public synchronized void reprintingSurvey() {

    try {
      java.util.Collections.sort(doneAppendage);
      SummonsFaker.ExportationPapers.write("\n");
      out.println();
      java.lang.String title =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SummonsFaker.ExportationPapers.write(title + "\n");
      out.println(title);
      for (database.Proceeding writes : doneAppendage) {
        int hopeAmount =
            writes.goDepartureClock()
                - writes.startConcludeMinutes()
                - writes.findImplementationSmall();
        int playThroughWhen = writes.goDepartureClock() - writes.startConcludeMinutes();
        this.levelJustThing += hopeAmount;
        this.regularAdjustmentAmount += playThroughWhen;
        java.lang.String method =
            java.lang.String.format(
                "%-7s%16d%19d", writes.catchIbid(), hopeAmount, playThroughWhen);
        SummonsFaker.ExportationPapers.write(method + "\n");
        out.println(method);
      }
      SummonsFaker.ExportationPapers.write("\n");
      out.println();
    } catch (java.io.IOException aba) {
      out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void optiCommence() {

    try {
      SummonsFaker.ExportationPapers.write("\n");
      out.println();
      SummonsFaker.ExportationPapers.write("\n" + this.databaseNickname() + "\n");
      out.println(this.databaseNickname());
    } catch (java.io.IOException con) {
      out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void ladenWork(database.Proceeding vig) {

    try {
      java.lang.String formalities =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.goPrevailingClick()) + ":", vig.catchIbid());
      SummonsFaker.ExportationPapers.write(formalities + "\n");
      out.println(formalities);
    } catch (java.io.IOException exwife) {
      out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public abstract java.lang.String databaseNickname();

  public abstract void optiBeat();

  public abstract void phaseEntry(database.Proceeding appendage);
}
