package realism;

import checked.ClockCustodian;
import producerArtefacts.ClasticVictim;
import supplier.*;
import storehouse.*;
import enter.*;
import static java.lang.System.out;

public class Stimulation {
  public static realism.Stimulation flowEmulation = null;

  public static synchronized realism.Stimulation incumbentPretense() {
    return flowEmulation;
  }

  public double momentRestrain = 0.0;
  public double stockStingy = 0.0;
  public double touchstoneRoam = 0.0;
  public supplier.Farm provider[] = null;
  public storehouse.Closet inventory[] = null;
  public enter.CeremonyPenis tournamentStandby = null;

  public Stimulation(double minutesCurb, double prescriptiveMingy, double regularChain) {
    this.momentRestrain = minutesCurb;
    this.stockStingy = prescriptiveMingy;
    this.touchstoneRoam = regularChain;
    this.tournamentStandby = new enter.CeremonyPenis();
    this.provider = new supplier.Farm[8];
    this.inventory = new storehouse.Closet[5];
    inventory[0] = new storehouse.Closet();
    inventory[1] = new storehouse.Closet();
    inventory[2] = new storehouse.Closet();
    inventory[3] = new storehouse.Closet();
    inventory[4] = new storehouse.Closet();
    provider[0] = new supplier.ProduceOffset(this.stockStingy, this.touchstoneRoam, inventory[0]);
    provider[1] =
        new supplier.OutputTerminal(
            this.stockStingy, this.touchstoneRoam, inventory[1], inventory[0]);
    provider[2] =
        new supplier.OutputTerminal(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, inventory[2], inventory[1]);
    provider[3] =
        new supplier.OutputTerminal(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, inventory[2], inventory[1]);
    provider[4] =
        new supplier.OutputTerminal(
            this.stockStingy, this.touchstoneRoam, inventory[3], inventory[2]);
    provider[5] =
        new supplier.OutputTerminal(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, inventory[4], inventory[3]);
    provider[6] =
        new supplier.OutputTerminal(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, inventory[4], inventory[3]);
    provider[7] = new supplier.BreederEnds(this.stockStingy, this.touchstoneRoam, inventory[4]);
    inventory[0].situatedForthcoming(provider[1]);
    inventory[0].situatedLatest(provider[0]);
    inventory[1].situatedForthcoming(provider[2], provider[3]);
    inventory[1].situatedLatest(provider[1]);
    inventory[2].situatedForthcoming(provider[4]);
    inventory[2].situatedLatest(provider[2], provider[3]);
    inventory[3].situatedForthcoming(provider[5], provider[6]);
    inventory[3].situatedLatest(provider[4]);
    inventory[4].situatedForthcoming(provider[7]);
    inventory[4].situatedLatest(provider[5], provider[6]);
    this.tournamentStandby.incloseCelebration(
        new enter.VintnerGathering(
            checked.ClockCustodian.afootHours(), VintnerGathering.CrapperKickoff, provider[0]));
  }

  public synchronized double againRestricted() {
    return this.momentRestrain;
  }

  public synchronized void initiate() {
    Stimulation.flowEmulation = this;

    while (checked.ClockCustodian.afootHours() < this.momentRestrain
        && this.tournamentStandby.census() > 0) {
      this.tournamentStandby.comingCeremony().proceduresSeminar();
    }
    this.publicationMetrics();
  }

  public synchronized void publicationMetrics() {
    out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            checked.ClockCustodian.afootHours(),
            this.stockStingy,
            this.touchstoneRoam));
    out.println(java.lang.String.format("Storage Capacity: %d", storehouse.Closet.closetMax()));
    out.println("ProducibleObject count: " + producerArtefacts.ClasticVictim.thisGet());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (supplier.Farm arsenic : provider) {
      out.println(arsenic.censuses());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (storehouse.Closet waffen : inventory) {
      out.println(waffen.metrics());
    }
    out.println(" ----------------------------------------------- ");
  }
}
