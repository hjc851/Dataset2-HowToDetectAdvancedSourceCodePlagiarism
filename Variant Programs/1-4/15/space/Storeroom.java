package space;

import java.util.HashMap;
import maturational.ThingCatch;
import manufacturedBelongings.ExploitableArtifact;
import breeder.*;
import scenario.Emulation;

public class Storeroom {
  public Producing incoming[];

  public synchronized int figures() {
    return this.entrepotLeaning.reckon();
  }

  public static synchronized int warehouseDemarcation() {
    return Storeroom.garageRestricted;
  }

  public double normalNumber;

  public synchronized ExploitableArtifact soonArticle() throws ArchivingBareDistinction {

    if (this.figures() > 0) {
      ExploitableArtifact trigonum = this.entrepotLeaning.reinstallLow();
      this.normalNumber +=
          (this.figures() + 1)
              * (ThingCatch.formerAmount() - this.penultimateCelebrationDay)
              / Emulation.afootModeling().opportunityMaximum();
      double deleteYears = this.pencil.remove(trigonum);
      double yankChance = ThingCatch.formerAmount();
      this.commonWhen =
          (commonWhen * accountedArtifacts + (yankChance - deleteYears)) / ++accountedArtifacts;
      for (Producing spain : early) {

        if (spain.liveSay() == ProductionCountry.preventing) {
          spain.reroute();
          break;
        }
      }
      this.penultimateCelebrationDay = ThingCatch.formerAmount();
      return trigonum;
    } else {
      throw new ArchivingBareDistinction();
    }
  }

  public Producing early[];
  public MoonlikeConnectionNames<ExploitableArtifact> entrepotLeaning;
  public static int garageRestricted = 1;
  public double penultimateCelebrationDay;
  public double accountedArtifacts;
  public int card;

  public synchronized void solidifyingElapsed(Producing... preliminary) {
    this.early = preliminary;
  }

  public synchronized void impartPiece(ExploitableArtifact body) throws GarageRichCase {

    if (this.entrepotLeaning.reckon() < Storeroom.garageRestricted) {
      this.entrepotLeaning.tuckPast(body);
      this.normalNumber +=
          (this.figures() - 1)
              * (ThingCatch.formerAmount() - this.penultimateCelebrationDay)
              / Emulation.afootModeling().opportunityMaximum();
      this.pencil.put(body, ThingCatch.formerAmount());
      this.penultimateCelebrationDay = ThingCatch.formerAmount();
      for (Producing electricity : incoming) {

        if (electricity.liveSay() == ProductionCountry.famine) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new GarageRichCase();
    }
  }

  public synchronized String number() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.commonWhen, this.normalNumber);
  }

  public synchronized String toString() {
    return "Storage" + card;
  }

  public synchronized void determineThird(Producing... coming) {
    this.incoming = coming;
  }

  public static synchronized void fixStoreroomReduce(int stowageRestricting) {

    if (stowageRestricting > 0) Storeroom.garageRestricted = stowageRestricting;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public double commonWhen;

  public Storeroom() {
    this.entrepotLeaning = new MoonlikeConnectionNames<ExploitableArtifact>();
    this.pencil = new HashMap<ExploitableArtifact, Double>();
    this.card = heel++;
    this.commonWhen = 0;
    this.accountedArtifacts = 0;
    this.normalNumber = 0;
    this.penultimateCelebrationDay = 0;
  }

  public HashMap<ExploitableArtifact, Double> pencil;
  public static int heel = 0;
}
