package exercise;

import depositional.PeriodWarden;
import harvestingGoods.EvaporiteDemur;
import production.*;
import depository.*;
import accomplishment.*;

public class Modeling {
  private static Modeling afootModeling;

  public static Modeling flowEmulation() {
    return afootModeling;
  }

  private double junctureConstrain;
  private double stockStingy;
  private double modularStraddle;
  private Output commodity[];
  private Caching archival[];
  private ParadeConvoy triathlonCue;

  public Modeling(double amountMax, double classicNormal, double canonicCrop) {
    this.junctureConstrain = amountMax;
    this.stockStingy = classicNormal;
    this.modularStraddle = canonicCrop;
    this.triathlonCue = new ParadeConvoy();
    this.commodity = new Output[8];
    this.archival = new Caching[5];
    archival[0] = new Caching();
    archival[1] = new Caching();
    archival[2] = new Caching();
    archival[3] = new Caching();
    archival[4] = new Caching();
    commodity[0] = new DirectorPart(this.stockStingy, this.modularStraddle, archival[0]);
    commodity[1] =
        new VintnerObservatory(this.stockStingy, this.modularStraddle, archival[1], archival[0]);
    commodity[2] =
        new VintnerObservatory(
            this.stockStingy * 2.0, this.modularStraddle * 2.0, archival[2], archival[1]);
    commodity[3] =
        new VintnerObservatory(
            this.stockStingy * 2.0, this.modularStraddle * 2.0, archival[2], archival[1]);
    commodity[4] =
        new VintnerObservatory(this.stockStingy, this.modularStraddle, archival[3], archival[2]);
    commodity[5] =
        new VintnerObservatory(
            this.stockStingy * 2.0, this.modularStraddle * 2.0, archival[4], archival[3]);
    commodity[6] =
        new VintnerObservatory(
            this.stockStingy * 2.0, this.modularStraddle * 2.0, archival[4], archival[3]);
    commodity[7] = new PromoterFinal(this.stockStingy, this.modularStraddle, archival[4]);
    archival[0].arrangedSucceeding(commodity[1]);
    archival[0].bentOriginal(commodity[0]);
    archival[1].arrangedSucceeding(commodity[2], commodity[3]);
    archival[1].bentOriginal(commodity[1]);
    archival[2].arrangedSucceeding(commodity[4]);
    archival[2].bentOriginal(commodity[2], commodity[3]);
    archival[3].arrangedSucceeding(commodity[5], commodity[6]);
    archival[3].bentOriginal(commodity[4]);
    archival[4].arrangedSucceeding(commodity[7]);
    archival[4].bentOriginal(commodity[5], commodity[6]);
    this.triathlonCue.deleteRace(
        new FarmerSpectacle(
            PeriodWarden.actualSentence(), FarmerSpectacle.PottyInitiate, commodity[0]));
  }

  public double whenThrottle() {
    return this.junctureConstrain;
  }

  public void jump() {
    Modeling.afootModeling = this;

    while (PeriodWarden.actualSentence() < this.junctureConstrain
        && this.triathlonCue.matter() > 0) {
      this.triathlonCue.afterSpectacle().proceduresSeminar();
    }
    this.publishFigures();
  }

  private void publishFigures() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.junctureConstrain,
            PeriodWarden.actualSentence(),
            this.stockStingy,
            this.modularStraddle));
    System.out.println(String.format("Storage Capacity: %d", Caching.depositoryConstrain()));
    System.out.println("ProducibleObject count: " + EvaporiteDemur.latestNumber());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Output arsenic : commodity) {
      System.out.println(arsenic.metrics());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Caching fh : archival) {
      System.out.println(fh.statistically());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
