package stowage;

import java.util.HashMap;
import glanced.ClockCustodian;
import productivityDevices.QuasicrystalArgue;
import output.*;
import emulation.Simulator;

public class Closet {
  private double penultimateCelebrationDay;
  private double mediumCharge;
  private double seenBelongings;
  private double middlingMeter;
  private int peg;
  private Grower recent[];
  private Grower after[];
  private HashMap<QuasicrystalArgue, Double> lexicon;
  private SphericalConnectedNumber<QuasicrystalArgue> entrepotLeaning;
  private static int stymie = 0;
  private static int diskTrammel = 1;

  public static synchronized void solidifyingDepositoryConstrain(int archivingBound) {

    if (archivingBound > 0) Closet.diskTrammel = archivingBound;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int shelvingThresholds() {
    return Closet.diskTrammel;
  }

  public Closet() {
    this.entrepotLeaning = new SphericalConnectedNumber<QuasicrystalArgue>();
    this.lexicon = new HashMap<QuasicrystalArgue, Double>();
    this.peg = stymie++;
    this.middlingMeter = 0;
    this.seenBelongings = 0;
    this.mediumCharge = 0;
    this.penultimateCelebrationDay = 0;
  }

  public synchronized void bentNew(Grower... upcoming) {
    this.after = upcoming;
  }

  public synchronized void layOld(Grower... old) {
    this.recent = old;
  }

  public synchronized void supplySomething(QuasicrystalArgue preclude) throws DepotEntireCaveat {

    if (this.entrepotLeaning.rely() < Closet.diskTrammel) {
      this.entrepotLeaning.embedLatest(preclude);
      this.mediumCharge +=
          (this.calculate() - 1)
              * (ClockCustodian.thisThing() - this.penultimateCelebrationDay)
              / Simulator.existingExperiment().minutesCurb();
      this.lexicon.put(preclude, ClockCustodian.thisThing());
      this.penultimateCelebrationDay = ClockCustodian.thisThing();
      for (Grower spain : after) {

        if (spain.prevalentGovernmental() == FilmmakerSay.depriving) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new DepotEntireCaveat();
    }
  }

  public synchronized QuasicrystalArgue thirdThing() throws StoringMeaninglessProviso {

    if (this.calculate() > 0) {
      QuasicrystalArgue trapezium;
      double putMinutes;
      double dismantleNow;
      trapezium = this.entrepotLeaning.dislodgePremier();
      this.mediumCharge +=
          (this.calculate() + 1)
              * (ClockCustodian.thisThing() - this.penultimateCelebrationDay)
              / Simulator.existingExperiment().minutesCurb();
      putMinutes = this.lexicon.remove(trapezium);
      dismantleNow = ClockCustodian.thisThing();
      this.middlingMeter =
          (middlingMeter * seenBelongings + (dismantleNow - putMinutes)) / ++seenBelongings;
      for (Grower equally : recent) {

        if (equally.prevalentGovernmental() == FilmmakerSay.clogging) {
          equally.reactivate();
          break;
        }
      }
      this.penultimateCelebrationDay = ClockCustodian.thisThing();
      return trapezium;
    } else {
      throw new StoringMeaninglessProviso();
    }
  }

  public synchronized int calculate() {
    return this.entrepotLeaning.rely();
  }

  public synchronized String toString() {
    return "Storage" + peg;
  }

  public synchronized String censuses() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.middlingMeter, this.mediumCharge);
  }
}
