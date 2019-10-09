package depository;

import java.util.HashMap;
import depositional.PeriodWarden;
import harvestingGoods.EvaporiteDemur;
import production.*;
import exercise.Modeling;

public class Caching {
  private static int warehousesMinimum = 1;
  private static int forestall = 0;

  public static void readyStoringBounds(int closetMax) {

    if (closetMax > 0) Caching.warehousesMinimum = closetMax;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int depositoryConstrain() {
    return Caching.warehousesMinimum;
  }

  private RingedInfluencedRoster<EvaporiteDemur> safekeepingAgenda;
  private HashMap<EvaporiteDemur, Double> glossary;
  private Output forthcoming[];
  private Output premature[];
  private int nerfling;
  private double proportionBeginning;
  private double seenBelongings;
  private double modalNumbers;
  private double highMeetingAgain;

  public Caching() {
    this.safekeepingAgenda = new RingedInfluencedRoster<EvaporiteDemur>();
    this.glossary = new HashMap<EvaporiteDemur, Double>();
    this.nerfling = forestall++;
    this.proportionBeginning = 0;
    this.seenBelongings = 0;
    this.modalNumbers = 0;
    this.highMeetingAgain = 0;
  }

  public void arrangedSucceeding(Output... coming) {
    this.forthcoming = coming;
  }

  public void bentOriginal(Output... late) {
    this.premature = late;
  }

  public void combineAgenda(EvaporiteDemur totem) throws WarehouseHeavyDeviation {

    if (this.safekeepingAgenda.enumerate() < Caching.warehousesMinimum) {
      this.safekeepingAgenda.injectingDying(totem);
      this.modalNumbers +=
          (this.number() - 1)
              * (PeriodWarden.actualSentence() - this.highMeetingAgain)
              / Modeling.flowEmulation().whenThrottle();
      this.glossary.put(totem, PeriodWarden.actualSentence());
      this.highMeetingAgain = PeriodWarden.actualSentence();
      for (Output leong : forthcoming) {

        if (leong.topicalSubmit() == GrowersCanton.hungry) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new WarehouseHeavyDeviation();
    }
  }

  public EvaporiteDemur incomingPiece() throws GarageEvacuateCase {

    if (this.number() > 0) {
      EvaporiteDemur ischium = this.safekeepingAgenda.absentInitial();
      this.modalNumbers +=
          (this.number() + 1)
              * (PeriodWarden.actualSentence() - this.highMeetingAgain)
              / Modeling.flowEmulation().whenThrottle();
      double incorporateNow = this.glossary.remove(ischium);
      double withdrawMinutes = PeriodWarden.actualSentence();
      this.proportionBeginning =
          (proportionBeginning * seenBelongings + (withdrawMinutes - incorporateNow))
              / ++seenBelongings;
      for (Output spain : premature) {

        if (spain.topicalSubmit() == GrowersCanton.thwarting) {
          spain.resume();
          break;
        }
      }
      this.highMeetingAgain = PeriodWarden.actualSentence();
      return ischium;
    } else {
      throw new GarageEvacuateCase();
    }
  }

  public int number() {
    return this.safekeepingAgenda.enumerate();
  }

  public String toString() {
    return "Storage" + nerfling;
  }

  public String statistically() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.proportionBeginning, this.modalNumbers);
  }
}
