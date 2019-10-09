package garage;

import java.util.HashMap;
import said.JunctureJailer;
import extractionTreasures.DepositionalObjet;
import presenter.*;
import experiment.Emulation;
import static java.lang.String.format;

public class Memory {
  private double surviveGatheringHour = 0.0;

  public synchronized String toString() {
    return "Storage" + security;
  }

  private double reckonedElements = 0.0;

  public synchronized int total() {
    return this.storeInclination.consider();
  }

  public synchronized void situatedLatest(Produce... pervious) {
    this.ago = (pervious);
  }

  private Produce forthcoming[] = null;
  private static int foil = 0;
  private DiscoidInvolvedCompendium<DepositionalObjet> storeInclination = null;

  public static synchronized int safekeepingCurb() {
    return Memory.repositoryThreshold;
  }

  private Produce ago[] = null;

  public synchronized String digits() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.middlingMeter, this.regularRecount);
  }

  public synchronized DepositionalObjet firstConsignment() throws DepotUnfilledCaveat {

    if (this.total() > 0) {
      DepositionalObjet trigonum = this.storeInclination.absentInitial();
      this.regularRecount +=
          ((this.total() + 1)
              * (JunctureJailer.streamWeek() - this.surviveGatheringHour)
              / Emulation.underwaySimulates().periodsBound());
      double enterSentence = this.encyclopaedia.remove(trigonum);
      double eraseThing = JunctureJailer.streamWeek();
      this.middlingMeter =
          ((middlingMeter * reckonedElements + (eraseThing - enterSentence)) / ++reckonedElements);
      for (Produce spain : ago) {

        if (spain.latestNation() == FarmCentral.blockade) {
          spain.resume();
          break;
        }
      }
      this.surviveGatheringHour = (JunctureJailer.streamWeek());
      return trigonum;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  public static synchronized void settledArchivingBound(int warehouseDemarcation) {

    if (warehouseDemarcation > 0) Memory.repositoryThreshold = (warehouseDemarcation);
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized void tallyConsignment(DepositionalObjet oppose)
      throws ArchivalOverflowingExempt {

    if (this.storeInclination.consider() < Memory.repositoryThreshold) {
      this.storeInclination.embeddedParting(oppose);
      this.regularRecount +=
          ((this.total() - 1)
              * (JunctureJailer.streamWeek() - this.surviveGatheringHour)
              / Emulation.underwaySimulates().periodsBound());
      this.encyclopaedia.put(oppose, JunctureJailer.streamWeek());
      this.surviveGatheringHour = (JunctureJailer.streamWeek());
      for (Produce electricity : forthcoming) {

        if (electricity.latestNation() == FarmCentral.neglecting) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new ArchivalOverflowingExempt();
    }
  }

  public synchronized void rigidCome(Produce... second) {
    this.forthcoming = (second);
  }

  private double middlingMeter = 0.0;
  private int security = 0;
  private HashMap<DepositionalObjet, Double> encyclopaedia = null;

  public Memory() {
    this.storeInclination = (new DiscoidInvolvedCompendium<DepositionalObjet>());
    this.encyclopaedia = (new HashMap<DepositionalObjet, Double>());
    this.security = (foil++);
    this.middlingMeter = (0);
    this.reckonedElements = (0);
    this.regularRecount = (0);
    this.surviveGatheringHour = (0);
  }

  private static int repositoryThreshold = 1;
  private double regularRecount = 0.0;
}
