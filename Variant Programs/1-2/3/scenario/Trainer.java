package scenario;

import indiscernible.YearsHolder;
import fabricationObstructions.UseableItem;
import breeder.*;
import store.*;
import register.*;

public class Trainer {
  private static scenario.Trainer prevalentRealism;

  public static scenario.Trainer presentlySynthesizer() {
    return prevalentRealism;
  }

  private double sentenceConfine;
  private double acceptedAverage;
  private double modularStraddle;
  private breeder.Breeder filmmaker[];
  private store.Entrepot stored[];
  private register.CommemorationBraid venueList;

  public Trainer(double beginningThresholds, double regularUngenerous, double stockRamble) {
    this.sentenceConfine = beginningThresholds;
    this.acceptedAverage = regularUngenerous;
    this.modularStraddle = stockRamble;
    this.venueList = new register.CommemorationBraid();
    this.filmmaker = new breeder.Breeder[8];
    this.stored = new store.Entrepot[5];
    stored[0] = new store.Entrepot();
    stored[1] = new store.Entrepot();
    stored[2] = new store.Entrepot();
    stored[3] = new store.Entrepot();
    stored[4] = new store.Entrepot();
    filmmaker[0] = new breeder.PresenterGet(this.acceptedAverage, this.modularStraddle, stored[0]);
    filmmaker[1] =
        new breeder.PresenterOutpost(
            this.acceptedAverage, this.modularStraddle, stored[1], stored[0]);
    filmmaker[2] =
        new breeder.PresenterOutpost(
            this.acceptedAverage * 2.0, this.modularStraddle * 2.0, stored[2], stored[1]);
    filmmaker[3] =
        new breeder.PresenterOutpost(
            this.acceptedAverage * 2.0, this.modularStraddle * 2.0, stored[2], stored[1]);
    filmmaker[4] =
        new breeder.PresenterOutpost(
            this.acceptedAverage, this.modularStraddle, stored[3], stored[2]);
    filmmaker[5] =
        new breeder.PresenterOutpost(
            this.acceptedAverage * 2.0, this.modularStraddle * 2.0, stored[4], stored[3]);
    filmmaker[6] =
        new breeder.PresenterOutpost(
            this.acceptedAverage * 2.0, this.modularStraddle * 2.0, stored[4], stored[3]);
    filmmaker[7] =
        new breeder.FilmmakerFinis(this.acceptedAverage, this.modularStraddle, stored[4]);
    stored[0].laidFollowing(filmmaker[1]);
    stored[0].determineInitial(filmmaker[0]);
    stored[1].laidFollowing(filmmaker[2], filmmaker[3]);
    stored[1].determineInitial(filmmaker[1]);
    stored[2].laidFollowing(filmmaker[4]);
    stored[2].determineInitial(filmmaker[2], filmmaker[3]);
    stored[3].laidFollowing(filmmaker[5], filmmaker[6]);
    stored[3].determineInitial(filmmaker[4]);
    stored[4].laidFollowing(filmmaker[7]);
    stored[4].determineInitial(filmmaker[5], filmmaker[6]);
    this.venueList.incorporateTriathlon(
        new register.CommodityRace(
            indiscernible.YearsHolder.latestClip(), CommodityRace.BehindRestart, filmmaker[0]));
  }

  public double junctureConstrain() {
    return this.sentenceConfine;
  }

  public void startle() {
    Trainer.prevalentRealism = this;

    while (indiscernible.YearsHolder.latestClip() < this.sentenceConfine
        && this.venueList.calculate() > 0) {
      this.venueList.newGathering().phaseCommemoration();
    }
    this.inkCensus();
  }

  private void inkCensus() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.sentenceConfine,
            indiscernible.YearsHolder.latestClip(),
            this.acceptedAverage,
            this.modularStraddle));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", store.Entrepot.stowageRestricting()));
    System.out.println(
        "ProducibleObject count: " + fabricationObstructions.UseableItem.ongoingEnumerate());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (breeder.Breeder leong : filmmaker) {
      System.out.println(leong.survey());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (store.Entrepot ora : stored) {
      System.out.println(ora.numerals());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
