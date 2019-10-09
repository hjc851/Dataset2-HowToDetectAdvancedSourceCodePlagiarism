package parser;

import mailer.Responsible;
import faker.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Compiler {
  protected boolean isMoving;
  protected int spoutingPeriods;
  protected int awaitsWhen;
  protected LinkedList<March> constructedMethodology;
  protected int normLookSentence;
  protected int overallDownturnMinutes;
  protected boolean thmFlagstone;
  protected int leavingBrinWhen;
  public static final int BeginningMammoth = 4;
  protected March circulatingServe;
  private int typicalGenetic;

  public Compiler() {
    this.isMoving = false;
    this.spoutingPeriods = 0;
    this.awaitsWhen = 0;
    this.normLookSentence = 0;
    this.overallDownturnMinutes = 0;
    this.typicalGenetic = -1;
    this.constructedMethodology = new LinkedList<>();
    this.thmFlagstone = true;
  }

  public synchronized void kickoffSpooler() {
    this.isMoving = true;
    this.leavingBrinWhen = Responsible.DischargeDays;
    this.bsiDepart();
  }

  public synchronized void quitProgramming() {
    this.isMoving = false;
    this.paperReputation();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int generatePerformedTreatFootprint() {

    if (constructedMethodology.isEmpty()) {
      return 0;
    } else {
      return constructedMethodology.size();
    }
  }

  public synchronized int haveCirculatingShudder() {
    return typicalGenetic;
  }

  public synchronized void bentPreviousAnswer(int contemporaryTicktack) {
    this.typicalGenetic = contemporaryTicktack;
  }

  public synchronized double producePercentageTakeNow() {
    return (double) this.normLookSentence / this.constructedMethodology.size();
  }

  public synchronized double bringMiddlingTurnaboutMeter() {
    return (double) this.overallDownturnMinutes / this.constructedMethodology.size();
  }

  public synchronized void paperReputation() {

    try {
      Collections.sort(constructedMethodology);
      SummonsFaker.ExportationPapers.write("\n");
      System.out.println();
      String chaired = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SummonsFaker.ExportationPapers.write(chaired + "\n");
      System.out.println(chaired);
      for (March writes : constructedMethodology) {
        int bideDays =
            writes.takeExpirationPeriod() - writes.makeReceiveDay() - writes.becomeChiefQuantity();
        int actOutsidePeriods = writes.takeExpirationPeriod() - writes.makeReceiveDay();
        this.normLookSentence += bideDays;
        this.overallDownturnMinutes += actOutsidePeriods;
        String methodology =
            String.format("%-7s%16d%19d", writes.catchIbid(), bideDays, actOutsidePeriods);
        SummonsFaker.ExportationPapers.write(methodology + "\n");
        System.out.println(methodology);
      }
      SummonsFaker.ExportationPapers.write("\n");
      System.out.println();
    } catch (IOException afterwards) {
      System.out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void bsiDepart() {

    try {
      SummonsFaker.ExportationPapers.write("\n");
      System.out.println();
      SummonsFaker.ExportationPapers.write("\n" + this.databaseNickname() + "\n");
      System.out.println(this.databaseNickname());
    } catch (IOException past) {
      System.out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void consignmentTreat(March cern) {

    try {
      String treat =
          String.format("%-5s%3s", "T" + (this.haveCirculatingShudder()) + ":", cern.catchIbid());
      SummonsFaker.ExportationPapers.write(treat + "\n");
      System.out.println(treat);
    } catch (IOException aba) {
      System.out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public abstract String databaseNickname();

  public abstract void bpsRetick();

  public abstract void methodsElected(March formalities);
}
