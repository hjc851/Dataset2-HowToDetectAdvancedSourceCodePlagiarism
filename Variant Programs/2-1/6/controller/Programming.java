package controller;

import regulator.Consignor;
import manikin.AppendageBrake;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programming {
  protected boolean isMoving;
  protected int lengthwiseHour;
  protected int expectingDays;
  protected LinkedList<Formalities> finalizationTechniques;
  protected int fairPostponeYear;
  protected int modalUpswingMonth;
  protected boolean benzSwag;
  protected int otherDblClip;
  public static final int DaySum = 4;
  protected Formalities afootSummons;
  private int latestTicktock;

  public Programming() {
    this.isMoving = false;
    this.lengthwiseHour = 0;
    this.expectingDays = 0;
    this.fairPostponeYear = 0;
    this.modalUpswingMonth = 0;
    this.latestTicktock = -1;
    this.finalizationTechniques = new LinkedList<>();
    this.benzSwag = true;
  }

  public void startleOutliner() {
    this.isMoving = true;
    this.otherDblClip = Consignor.MailAmount;
    this.weapGet();
  }

  public void quitProgramming() {
    this.isMoving = false;
    this.typescriptComplaint();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int generatePerformedTreatFootprint() {

    if (finalizationTechniques.isEmpty()) {
      return 0;
    } else {
      return finalizationTechniques.size();
    }
  }

  public int receiveContemporaryTicktack() {
    return latestTicktock;
  }

  public void dictatedOngoingBeat(int formerGene) {
    this.latestTicktock = formerGene;
  }

  public double bringMiddlingExpectMeter() {
    return (double) this.fairPostponeYear / this.finalizationTechniques.size();
  }

  public double fixRatioReboundChance() {
    return (double) this.modalUpswingMonth / this.finalizationTechniques.size();
  }

  public void typescriptComplaint() {

    try {
      Collections.sort(finalizationTechniques);
      AppendageBrake.TurnoutCharge.write("\n");
      System.out.println();
      String chapeau = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      AppendageBrake.TurnoutCharge.write(chapeau + "\n");
      System.out.println(chapeau);
      for (Formalities writes : finalizationTechniques) {
        int holdDay =
            writes.developPulloutHour()
                - writes.fixHappenChance()
                - writes.receiveExecutionThickness();
        int tourBesideJuncture = writes.developPulloutHour() - writes.fixHappenChance();
        this.fairPostponeYear += holdDay;
        this.modalUpswingMonth += tourBesideJuncture;
        String act =
            String.format("%-7s%16d%19d", writes.bringCaller(), holdDay, tourBesideJuncture);
        AppendageBrake.TurnoutCharge.write(act + "\n");
        System.out.println(act);
      }
      AppendageBrake.TurnoutCharge.write("\n");
      System.out.println();
    } catch (IOException late) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public void weapGet() {

    try {
      AppendageBrake.TurnoutCharge.write("\n");
      System.out.println();
      AppendageBrake.TurnoutCharge.write("\n" + this.debuggingPatronymic() + "\n");
      System.out.println(this.debuggingPatronymic());
    } catch (IOException abel) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public void encumbranceSummons(Formalities cern) {

    try {
      String methodology =
          String.format(
              "%-5s%3s", "T" + (this.receiveContemporaryTicktack()) + ":", cern.bringCaller());
      AppendageBrake.TurnoutCharge.write(methodology + "\n");
      System.out.println(methodology);
    } catch (IOException tipp) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public abstract String debuggingPatronymic();

  public abstract void bpsRetick();

  public abstract void phaseEntry(Formalities summons);
}
