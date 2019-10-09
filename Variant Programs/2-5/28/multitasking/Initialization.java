package multitasking;

import exporter.Retailer;
import robot.MechanismsManikin;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Initialization {
  private static final String synX2279String = " to file.";
  private static final String synX2278String = "Unable to write ";
  private static final String synX2277String = "\n";
  private static final String synX2276String = ":";
  private static final String synX2275String = "T";
  private static final String synX2274String = "%-5s%3s";
  private static final String synX2273String = " to file.";
  private static final String synX2272String = "Unable to write ";
  private static final String synX2271String = "\n";
  private static final String synX2270String = "\n";
  private static final String synX2269String = "\n";
  private static final String synX2268String = " to file.";
  private static final String synX2267String = "Unable to write ";
  private static final String synX2266String = "\n";
  private static final String synX2265String = "\n";
  private static final String synX2264String = "%-7s%16d%19d";
  private static final String synX2263String = "\n";
  private static final String synX2262String = "Turnaround Time";
  private static final String synX2261String = "Waiting Time";
  private static final String synX2260String = "Process";
  private static final String synX2259String = "%-7s%16s%19s";
  private static final String synX2258String = "\n";
  private static final int synX2257int = 0;
  private static final boolean synX2256boolean = false;
  private static final boolean synX2255boolean = true;
  protected boolean isMoving;
  protected int flyingDay;
  protected int backlogThing;
  protected java.util.LinkedList<Procedures> fulfilledMethod;
  protected int rateQueueYears;
  protected int modalUpswingMonth;
  protected boolean ltsDesignator;
  protected int unexhaustedTelaMoment;
  public static final int DaysQuantitative = 4;
  protected multitasking.Procedures flowProcedures;
  private int typicalGenetic;

  public Initialization() {
    this.isMoving = (false);
    this.flyingDay = (0);
    this.backlogThing = (0);
    this.rateQueueYears = (0);
    this.modalUpswingMonth = (0);
    this.typicalGenetic = (-1);
    this.fulfilledMethod = (new java.util.LinkedList<>());
    this.ltsDesignator = (true);
  }

  public synchronized void commencesController() {
    this.isMoving = (synX2255boolean);
    this.unexhaustedTelaMoment = (Retailer.DeployChance);
    this.bpsGo();
  }

  public synchronized void occlusiveInitialization() {
    this.isMoving = (synX2256boolean);
    this.publishingDescribe();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int developSubmittedTechnologiesStature() {

    if (fulfilledMethod.isEmpty()) {
      return synX2257int;
    } else {
      return fulfilledMethod.size();
    }
  }

  public synchronized int producePrevalentScore() {
    return typicalGenetic;
  }

  public synchronized void preparePrevalentScore(int topicalMark) {
    this.typicalGenetic = (topicalMark);
  }

  public synchronized double generateFairPostponeYear() {
    return (double) this.rateQueueYears / this.fulfilledMethod.size();
  }

  public synchronized double bringMiddlingTurnaboutMeter() {
    return (double) this.modalUpswingMonth / this.fulfilledMethod.size();
  }

  public synchronized void publishingDescribe() {

    try {
      java.util.Collections.sort(fulfilledMethod);
      MechanismsManikin.ProducesFilename.write(synX2258String);
      System.out.println();
      java.lang.String coping =
          java.lang.String.format(synX2259String, synX2260String, synX2261String, synX2262String);
      MechanismsManikin.ProducesFilename.write(coping + synX2263String);
      System.out.println(coping);
      for (multitasking.Procedures postscript : fulfilledMethod) {
        int postponeYear =
            (postscript.receivePassingMoment()
                - postscript.goComeClock()
                - postscript.takeExecutionsDiameter());
        int sprainBehindAmount = postscript.receivePassingMoment() - postscript.goComeClock();
        this.rateQueueYears += (this.rateQueueYears + postponeYear);
        this.modalUpswingMonth += (this.modalUpswingMonth + sprainBehindAmount);
        java.lang.String litigate =
            java.lang.String.format(
                synX2264String, postscript.produceMap(), postponeYear, sprainBehindAmount);
        MechanismsManikin.ProducesFilename.write(litigate + synX2265String);
        System.out.println(litigate);
      }
      MechanismsManikin.ProducesFilename.write(synX2266String);
      System.out.println();
    } catch (java.io.IOException late) {
      System.out.println((synX2267String + this.timerMention() + synX2268String));
    }
  }

  public synchronized void bpsGo() {

    try {
      MechanismsManikin.ProducesFilename.write(synX2269String);
      System.out.println();
      MechanismsManikin.ProducesFilename.write(
          (synX2270String + this.timerMention() + synX2271String));
      System.out.println(this.timerMention());
    } catch (java.io.IOException post) {
      System.out.println((synX2272String + this.timerMention() + synX2273String));
    }
  }

  public synchronized void freightMarch(multitasking.Procedures writes) {

    try {
      java.lang.String negotiations =
          java.lang.String.format(
              synX2274String,
              (synX2275String + (this.producePrevalentScore()) + synX2276String),
              writes.produceMap());
      MechanismsManikin.ProducesFilename.write(negotiations + synX2277String);
      System.out.println(negotiations);
    } catch (java.io.IOException afterwards) {
      System.out.println((synX2278String + this.timerMention() + synX2279String));
    }
  }

  public abstract java.lang.String timerMention();

  public abstract void weapMark();

  public abstract void proceedingsMortar(multitasking.Procedures march);
}
