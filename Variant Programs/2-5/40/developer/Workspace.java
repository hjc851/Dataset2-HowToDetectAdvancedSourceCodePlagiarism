package developer;

import device.Mailer;
import simulated.OutgrowthTrainer;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  private static final String synX2831String = " to file.";
  private static final String synX2830String = "Unable to write ";
  private static final String synX2829String = "\n";
  private static final String synX2828String = ":";
  private static final String synX2827String = "T";
  private static final String synX2826String = "%-5s%3s";
  private static final String synX2825String = " to file.";
  private static final String synX2824String = "Unable to write ";
  private static final String synX2823String = "\n";
  private static final String synX2822String = "\n";
  private static final String synX2821String = "\n";
  private static final String synX2820String = " to file.";
  private static final String synX2819String = "Unable to write ";
  private static final String synX2818String = "\n";
  private static final String synX2817String = "\n";
  private static final String synX2816String = "%-7s%16d%19d";
  private static final String synX2815String = "\n";
  private static final String synX2814String = "Turnaround Time";
  private static final String synX2813String = "Waiting Time";
  private static final String synX2812String = "Process";
  private static final String synX2811String = "%-7s%16s%19s";
  private static final String synX2810String = "\n";
  private static final int synX2809int = 0;
  private static final boolean synX2808boolean = false;
  private static final boolean synX2807boolean = true;
  public boolean isMoving;
  public int spoutingPeriods;
  public int hopingMeter;
  public java.util.LinkedList<System> submittedTechnologies;
  public int avgWantWeek;
  public int ratesBreakthroughAgain;
  public boolean ordeBeacon;
  public int unexpendedThmSentence;
  public static final int PeriodsGigantic = 4;
  public developer.System latestOperation;
  public int latestTicktock;

  public Workspace() {
    this.isMoving = (false);
    this.spoutingPeriods = (0);
    this.hopingMeter = (0);
    this.avgWantWeek = (0);
    this.ratesBreakthroughAgain = (0);
    this.latestTicktock = (-1);
    this.submittedTechnologies = (new java.util.LinkedList<>());
    this.ordeBeacon = (true);
  }

  public synchronized void beginsCallback() {
    this.isMoving = (synX2807boolean);
    this.unexpendedThmSentence = (Mailer.CompleteSentence);
    this.weapGet();
  }

  public synchronized void quitProgramming() {
    this.isMoving = (synX2808boolean);
    this.publicationsFindings();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int makeUndertakenMarchDimensions() {

    if (submittedTechnologies.isEmpty()) {
      return synX2809int;
    } else {
      return submittedTechnologies.size();
    }
  }

  public synchronized int letAfootDials() {
    return latestTicktock;
  }

  public synchronized void laidLatestTicktock(int presentlyMarch) {
    this.latestTicktock = (presentlyMarch);
  }

  public synchronized double drawAvgWantWeek() {
    return (double) this.avgWantWeek / this.submittedTechnologies.size();
  }

  public synchronized double fixRatioReboundChance() {
    return (double) this.ratesBreakthroughAgain / this.submittedTechnologies.size();
  }

  public synchronized void publicationsFindings() {

    try {
      java.util.Collections.sort(submittedTechnologies);
      OutgrowthTrainer.EfficiencyDocket.write(synX2810String);
      System.out.println();
      java.lang.String banner =
          java.lang.String.format(synX2811String, synX2812String, synX2813String, synX2814String);
      OutgrowthTrainer.EfficiencyDocket.write(banner + synX2815String);
      System.out.println(banner);
      for (developer.System vig : submittedTechnologies) {
        int awaitClock = (vig.canEgressYears() - vig.haveMeetPeriods() - vig.catchRunnableScale());
        int fermentFromChance = vig.canEgressYears() - vig.haveMeetPeriods();
        this.avgWantWeek += (this.avgWantWeek + awaitClock);
        this.ratesBreakthroughAgain += (this.ratesBreakthroughAgain + fermentFromChance);
        java.lang.String proceedings =
            java.lang.String.format(
                synX2816String, vig.bringCaller(), awaitClock, fermentFromChance);
        OutgrowthTrainer.EfficiencyDocket.write(proceedings + synX2817String);
        System.out.println(proceedings);
      }
      OutgrowthTrainer.EfficiencyDocket.write(synX2818String);
      System.out.println();
    } catch (java.io.IOException appointed) {
      System.out.println((synX2819String + this.workspaceForename() + synX2820String));
    }
  }

  public synchronized void weapGet() {

    try {
      OutgrowthTrainer.EfficiencyDocket.write(synX2821String);
      System.out.println();
      OutgrowthTrainer.EfficiencyDocket.write(
          (synX2822String + this.workspaceForename() + synX2823String));
      System.out.println(this.workspaceForename());
    } catch (java.io.IOException officio) {
      System.out.println((synX2824String + this.workspaceForename() + synX2825String));
    }
  }

  public synchronized void weightFormalities(developer.System writes) {

    try {
      java.lang.String mechanisms =
          java.lang.String.format(
              synX2826String,
              (synX2827String + (this.letAfootDials()) + synX2828String),
              writes.bringCaller());
      OutgrowthTrainer.EfficiencyDocket.write(mechanisms + synX2829String);
      System.out.println(mechanisms);
    } catch (java.io.IOException abbe) {
      System.out.println((synX2830String + this.workspaceForename() + synX2831String));
    }
  }

  public abstract java.lang.String workspaceForename();

  public abstract void nbsClick();

  public abstract void negotiationsNew(developer.System methodology);
}
