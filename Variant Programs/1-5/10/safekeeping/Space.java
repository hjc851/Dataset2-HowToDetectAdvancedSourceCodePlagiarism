package safekeeping;

import java.util.HashMap;
import euphonious.AmountRearing;
import producedItems.FissionableCavil;
import maker.*;
import simulated.Pretence;
import static java.lang.System.out;

public class Space {
  private double closingRaceYears;
  private double ratesFigures;
  private double seenBelongings;
  private double middlingMeter;
  private int security;
  private maker.Production preceding[];
  private maker.Production first[];
  private java.util.HashMap<FissionableCavil, Double> encyclopedia;
  private safekeeping.BroadsheetRelationRosters<FissionableCavil> archivalCompilation;
  private static int stymie = 0;
  private static int shelvingThresholds = 1;

  public static synchronized void fixStoreroomReduce(int depositoryConstrain) {

    if (depositoryConstrain > 0) Space.shelvingThresholds = depositoryConstrain;
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int closetMax() {
    return Space.shelvingThresholds;
  }

  public Space() {
    this.archivalCompilation = new safekeeping.BroadsheetRelationRosters<FissionableCavil>();
    this.encyclopedia = new java.util.HashMap<FissionableCavil, Double>();
    this.security = stymie++;
    this.middlingMeter = 0;
    this.seenBelongings = 0;
    this.ratesFigures = 0;
    this.closingRaceYears = 0;
  }

  public synchronized void placedUpcoming(maker.Production... upcoming) {
    this.first = upcoming;
  }

  public synchronized void putPreceding(maker.Production... prior) {
    this.preceding = prior;
  }

  public synchronized void tallyConsignment(producedItems.FissionableCavil items)
      throws ShelvingRepleteExcluded {

    if (this.archivalCompilation.enumerate() < Space.shelvingThresholds) {
      this.archivalCompilation.enterFinal(items);
      this.ratesFigures +=
          this.ratesFigures
              + (this.consider() - 1)
                  * (euphonious.AmountRearing.thisThing() - this.closingRaceYears)
                  / simulated.Pretence.rifeSimulate().chanceThreshold();
      this.encyclopedia.put(items, euphonious.AmountRearing.thisThing());
      this.closingRaceYears = euphonious.AmountRearing.thisThing();
      for (maker.Production equally : first) {

        if (equally.contemporaryProvince() == MakerLand.pizza) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new safekeeping.ShelvingRepleteExcluded();
    }
  }

  public synchronized producedItems.FissionableCavil closeToken() throws GarageEvacuateCase {

    if (this.consider() > 0) {
      producedItems.FissionableCavil montes;
      double embedWhen;
      double murderDays;
      montes = this.archivalCompilation.takeBeginning();
      this.ratesFigures +=
          this.ratesFigures
              + (this.consider() + 1)
                  * (euphonious.AmountRearing.thisThing() - this.closingRaceYears)
                  / simulated.Pretence.rifeSimulate().chanceThreshold();
      embedWhen = this.encyclopedia.remove(montes);
      murderDays = euphonious.AmountRearing.thisThing();
      this.middlingMeter =
          (middlingMeter * seenBelongings + (murderDays - embedWhen)) / ++seenBelongings;
      for (maker.Production leong : preceding) {

        if (leong.contemporaryProvince() == MakerLand.stalling) {
          leong.unlock();
          break;
        }
      }
      this.closingRaceYears = euphonious.AmountRearing.thisThing();
      return montes;
    } else {
      throw new safekeeping.GarageEvacuateCase();
    }
  }

  public synchronized int consider() {
    return this.archivalCompilation.enumerate();
  }

  public synchronized String toString() {
    return "Storage" + security;
  }

  public synchronized java.lang.String surveys() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.middlingMeter, this.ratesFigures);
  }
}
