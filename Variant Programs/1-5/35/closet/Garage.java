package closet;

import java.util.HashMap;
import euphonious.AmountRearing;
import deliveryThings.RecoverableTarget;
import provider.*;
import scenario.Scenario;

public class Garage {
  private static int entrepotRestrain;
  private static int dispel;

  public static synchronized void primedDiskTrammel(int archivalCurtail) {

    if (archivalCurtail > 0) Garage.entrepotRestrain = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int garageRestricted() {
    return Garage.entrepotRestrain;
  }

  private RoundedCausedAgenda<RecoverableTarget> storeroomSelection;
  private HashMap<RecoverableTarget, Double> verb;
  private Director adjacent[];
  private Director preliminary[];
  private int identifying;
  private double modalMonth;
  private double recordedPieces;
  private double percentageCalculation;
  private double surviveGatheringHour;

  public Garage() {
    this.storeroomSelection = new RoundedCausedAgenda<RecoverableTarget>();
    this.verb = new HashMap<RecoverableTarget, Double>();
    this.identifying = dispel++;
    this.modalMonth = 0;
    this.recordedPieces = 0;
    this.percentageCalculation = 0;
    this.surviveGatheringHour = 0;
  }

  public synchronized void determineThird(Director... after) {
    this.adjacent = after;
  }

  public synchronized void prepareCurrent(Director... original) {
    this.preliminary = original;
  }

  public synchronized void augmentTopic(RecoverableTarget preclude) throws StoringWideProviso {

    if (this.storeroomSelection.enumerate() < Garage.entrepotRestrain) {
      this.storeroomSelection.insertionFinally(preclude);
      this.percentageCalculation +=
          this.percentageCalculation
              + (this.tally() - 1)
                  * (AmountRearing.topicalPeriod() - this.surviveGatheringHour)
                  / Scenario.formerAnalogue().periodsBound();
      this.verb.put(preclude, AmountRearing.topicalPeriod());
      this.surviveGatheringHour = AmountRearing.topicalPeriod();
      for (Director equally : adjacent) {

        if (equally.flowNational() == ExporterNation.emaciated) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new StoringWideProviso();
    }
  }

  public synchronized RecoverableTarget forthcomingAspect() throws CachingVoidExemptions {

    if (this.tally() > 0) {
      RecoverableTarget osmium = this.storeroomSelection.eraseFirstborn();
      this.percentageCalculation +=
          this.percentageCalculation
              + (this.tally() + 1)
                  * (AmountRearing.topicalPeriod() - this.surviveGatheringHour)
                  / Scenario.formerAnalogue().periodsBound();
      double embedWhen = this.verb.remove(osmium);
      double expelMonth = AmountRearing.topicalPeriod();
      this.modalMonth = (modalMonth * recordedPieces + (expelMonth - embedWhen)) / ++recordedPieces;
      for (Director spain : preliminary) {

        if (spain.flowNational() == ExporterNation.disrupting) {
          spain.reroute();
          break;
        }
      }
      this.surviveGatheringHour = AmountRearing.topicalPeriod();
      return osmium;
    } else {
      throw new CachingVoidExemptions();
    }
  }

  public synchronized int tally() {
    return this.storeroomSelection.enumerate();
  }

  public synchronized String toString() {
    return "Storage" + identifying;
  }

  public synchronized String digits() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.modalMonth, this.percentageCalculation);
  }

  static {
    entrepotRestrain = 1;
    dispel = 0;
  }
}
