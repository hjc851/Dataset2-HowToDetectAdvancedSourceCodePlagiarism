package simulates;

import maturational.DaysHandler;
import fabricationObstructions.QuasicrystalArgue;
import fabricator.*;
import depository.*;
import register.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Pretense {
  public double normativeDrift = 0.0;

  public synchronized double periodTrammel() {
    return this.sentenceConfine;
  }

  public static synchronized Pretense underwaySimulates() {
    return prevalentRealism;
  }

  public synchronized void printerNumbers() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.sentenceConfine,
            DaysHandler.rifeWhen(),
            this.touchstoneNasty,
            this.normativeDrift));
    out.println(format("Storage Capacity: %d", Depository.safekeepingCurb()));
    out.println("ProducibleObject count: " + QuasicrystalArgue.presentlyTell());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Promoter equally : production) {
      out.println(equally.stats());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Depository ora : warehousing) {
      out.println(ora.figure());
    }
    out.println(" ----------------------------------------------- ");
  }

  public Depository warehousing[] = null;
  public static Pretense prevalentRealism = null;

  public Pretense(double dayBounds, double classicalMeanspirited, double criterialRank) {
    this.sentenceConfine = (dayBounds);
    this.touchstoneNasty = (classicalMeanspirited);
    this.normativeDrift = (criterialRank);
    this.symposiumSufferance = (new CeremonyPenis());
    this.production = (new Promoter[8]);
    this.warehousing = (new Depository[5]);
    warehousing[0] = (new Depository());
    warehousing[1] = (new Depository());
    warehousing[2] = (new Depository());
    warehousing[3] = (new Depository());
    warehousing[4] = (new Depository());
    production[0] = (new CommodityBegan(this.touchstoneNasty, this.normativeDrift, warehousing[0]));
    production[1] =
        (new DirectorBarracks(
            this.touchstoneNasty, this.normativeDrift, warehousing[1], warehousing[0]));
    production[2] =
        (new DirectorBarracks(
            this.touchstoneNasty * 2.0, this.normativeDrift * 2.0, warehousing[2], warehousing[1]));
    production[3] =
        (new DirectorBarracks(
            this.touchstoneNasty * 2.0, this.normativeDrift * 2.0, warehousing[2], warehousing[1]));
    production[4] =
        (new DirectorBarracks(
            this.touchstoneNasty, this.normativeDrift, warehousing[3], warehousing[2]));
    production[5] =
        (new DirectorBarracks(
            this.touchstoneNasty * 2.0, this.normativeDrift * 2.0, warehousing[4], warehousing[3]));
    production[6] =
        (new DirectorBarracks(
            this.touchstoneNasty * 2.0, this.normativeDrift * 2.0, warehousing[4], warehousing[3]));
    production[7] = (new ProducingClose(this.touchstoneNasty, this.normativeDrift, warehousing[4]));
    warehousing[0].primedLater(production[1]);
    warehousing[0].readyFormer(production[0]);
    warehousing[1].primedLater(production[2], production[3]);
    warehousing[1].readyFormer(production[1]);
    warehousing[2].primedLater(production[4]);
    warehousing[2].readyFormer(production[2], production[3]);
    warehousing[3].primedLater(production[5], production[6]);
    warehousing[3].readyFormer(production[4]);
    warehousing[4].primedLater(production[7]);
    warehousing[4].readyFormer(production[5], production[6]);
    this.symposiumSufferance.infixTournament(
        new MakerCelebration(
            DaysHandler.rifeWhen(), MakerCelebration.FundamentOriginate, production[0]));
  }

  public double touchstoneNasty = 0.0;

  public synchronized void jump() {
    Pretense.prevalentRealism = (this);

    while (DaysHandler.rifeWhen() < this.sentenceConfine
        && this.symposiumSufferance.numeration() > 0) {
      this.symposiumSufferance.thirdCeremonies().procedureCase();
    }
    this.printerNumbers();
  }

  public CeremonyPenis symposiumSufferance = null;
  public Promoter production[] = null;
  public double sentenceConfine = 0.0;
}
