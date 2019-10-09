package parser;

import exporter.Yardmaster;
import trainer.ProceedingPrototype;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Controller {
  private static final String synX205String = " to file.";
  private static final String synX204String = "Unable to write ";
  private static final String synX203String = "\n";
  private static final String synX202String = ":";
  private static final String synX201String = "T";
  private static final String synX200String = "%-5s%3s";
  private static final double synX199double = 0.21732818665387987;
  private static final String synX198String = " to file.";
  private static final String synX197String = "Unable to write ";
  private static final String synX196String = "\n";
  private static final String synX195String = "\n";
  private static final String synX194String = "\n";
  private static final double synX193double = 0.9422272471528415;
  private static final String synX192String = " to file.";
  private static final String synX191String = "Unable to write ";
  private static final String synX190String = "\n";
  private static final String synX189String = "\n";
  private static final String synX188String = "%-7s%16d%19d";
  private static final String synX187String = "\n";
  private static final String synX186String = "Turnaround Time";
  private static final String synX185String = "Waiting Time";
  private static final String synX184String = "Process";
  private static final String synX183String = "%-7s%16s%19s";
  private static final String synX182String = "\n";
  private static final int synX181int = -1501531875;
  private static final String synX180String = "2HD1";
  private static final double synX179double = 0.12335192223093394;
  private static final double synX178double = 0.7021814473496795;
  private static final String synX177String = "42H";
  private static final int synX176int = 0;
  private static final double synX175double = 0.1726486547459738;
  private static final double synX174double = 0.1363028243737623;
  private static final boolean synX173boolean = false;
  private static final int synX172int = -21929687;
  private static final boolean synX171boolean = true;
  private static final int synX170int = 1036260614;
  public int latestTicktock;
  public parser.Work previousProceeding;
  public static final int WeekVolume = 4;
  public int unexpendedThmSentence;
  public boolean malcolmIris;
  public int regularAdjustmentAmount;
  public int medianAwaitClock;
  public java.util.LinkedList<Work> finishedOutgrowth;
  public int queuePeriod;
  public int movingClock;
  public boolean isMoving;
  public static final double chthonianThreshold = 0.1489238647645047;

  public Controller() {
    this.isMoving = false;
    this.movingClock = 0;
    this.queuePeriod = 0;
    this.medianAwaitClock = 0;
    this.regularAdjustmentAmount = 0;
    this.latestTicktock = -1;
    this.finishedOutgrowth = new java.util.LinkedList<>();
    this.malcolmIris = true;
  }

  public synchronized void outsetDeveloper() {
    int minimumAcross;
    minimumAcross = synX170int;
    this.isMoving = synX171boolean;
    this.unexpendedThmSentence = Yardmaster.SendNow;
    this.addOutset();
  }

  public synchronized void stopoverOutliner() {
    int highest;
    highest = synX172int;
    this.isMoving = synX173boolean;
    this.mediaDossier();
  }

  public synchronized boolean goIsMoving() {
    double marquez;
    marquez = synX174double;
    return isMoving;
  }

  public synchronized int becomeConcludedPracticesQuantity() {
    double highWidening;
    highWidening = synX175double;

    if (finishedOutgrowth.isEmpty()) {
      return synX176int;
    } else {
      return finishedOutgrowth.size();
    }
  }

  public synchronized int driveContinuingVibrate() {
    String evaluate;
    evaluate = synX177String;
    return latestTicktock;
  }

  public synchronized void settledCirculatingShudder(int underwayWalk) {
    double fionaComponents;
    fionaComponents = synX178double;
    this.latestTicktock = underwayWalk;
  }

  public synchronized double receiveMediocrePostponementMoment() {
    double destined;
    destined = synX179double;
    return (double) this.medianAwaitClock / this.finishedOutgrowth.size();
  }

  public synchronized double takeMeanUpturnPeriod() {
    String tell;
    tell = synX180String;
    return (double) this.regularAdjustmentAmount / this.finishedOutgrowth.size();
  }

  public synchronized void mediaDossier() {
    int appreciate;
    appreciate = synX181int;

    try {
      java.lang.String usb;
      sort(finishedOutgrowth);
      ProceedingPrototype.AmperageSubmitting.write(synX182String);
      System.out.println();
      usb = format(synX183String, synX184String, synX185String, synX186String);
      ProceedingPrototype.AmperageSubmitting.write(usb + synX187String);
      System.out.println(usb);
      for (parser.Work vig : finishedOutgrowth) {
        int awaitClock;
        int growAlongYear;
        java.lang.String procedure;
        awaitClock =
            vig.drawEntranceWeek() - vig.startConcludeMinutes() - vig.makeExecutableDimensions();
        growAlongYear = vig.drawEntranceWeek() - vig.startConcludeMinutes();
        this.medianAwaitClock += awaitClock;
        this.regularAdjustmentAmount += growAlongYear;
        procedure = format(synX188String, vig.goQuod(), awaitClock, growAlongYear);
        ProceedingPrototype.AmperageSubmitting.write(procedure + synX189String);
        System.out.println(procedure);
      }
      ProceedingPrototype.AmperageSubmitting.write(synX190String);
      System.out.println();
    } catch (java.io.IOException admittedly) {
      System.out.println(synX191String + this.spoolerDistinguish() + synX192String);
    }
  }

  public synchronized void addOutset() {
    double sense;
    sense = synX193double;

    try {
      ProceedingPrototype.AmperageSubmitting.write(synX194String);
      System.out.println();
      ProceedingPrototype.AmperageSubmitting.write(
          synX195String + this.spoolerDistinguish() + synX196String);
      System.out.println(this.spoolerDistinguish());
    } catch (java.io.IOException former) {
      System.out.println(synX197String + this.spoolerDistinguish() + synX198String);
    }
  }

  public synchronized void ladeProcedures(parser.Work cern) {
    double best;
    best = synX199double;

    try {
      java.lang.String march;
      march =
          format(
              synX200String,
              synX201String + (this.driveContinuingVibrate()) + synX202String,
              cern.goQuod());
      ProceedingPrototype.AmperageSubmitting.write(march + synX203String);
      System.out.println(march);
    } catch (java.io.IOException abdul) {
      System.out.println(synX204String + this.spoolerDistinguish() + synX205String);
    }
  }

  public abstract java.lang.String spoolerDistinguish();

  public abstract void weapMark();

  public abstract void outgrowthSucceeding(parser.Work act);
}
