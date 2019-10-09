package simulate;

import acculturative.PeriodWarden;
import manufacturingPieces.PannonianMatter;
import promoter.*;
import space.*;
import book.*;

public class Simulates {
  public book.GatheringDipper forumFile = null;
  public space.Warehouse warehousing[] = null;
  public promoter.Manufacturers commodity[] = null;
  public double textbookPasture = 0.0;
  public double normativeAwful = 0.0;
  public double daysBoundary = 0.0;
  public static simulate.Simulates previousExercise = null;

  public static synchronized simulate.Simulates prevailingModel() {
    return previousExercise;
  }

  public Simulates(double sentenceConfine, double criterionEntail, double stockRamble) {
    this.daysBoundary = sentenceConfine;
    this.normativeAwful = criterionEntail;
    this.textbookPasture = stockRamble;
    this.forumFile = new book.GatheringDipper();
    this.commodity = new promoter.Manufacturers[8];
    this.warehousing = new space.Warehouse[5];
    warehousing[0] = new space.Warehouse();
    warehousing[1] = new space.Warehouse();
    warehousing[2] = new space.Warehouse();
    warehousing[3] = new space.Warehouse();
    warehousing[4] = new space.Warehouse();
    commodity[0] =
        new promoter.FabricatorStartle(this.normativeAwful, this.textbookPasture, warehousing[0]);
    commodity[1] =
        new promoter.ManufacturersArea(
            this.normativeAwful, this.textbookPasture, warehousing[1], warehousing[0]);
    commodity[2] =
        new promoter.ManufacturersArea(
            this.normativeAwful * 2.0, this.textbookPasture * 2.0, warehousing[2], warehousing[1]);
    commodity[3] =
        new promoter.ManufacturersArea(
            this.normativeAwful * 2.0, this.textbookPasture * 2.0, warehousing[2], warehousing[1]);
    commodity[4] =
        new promoter.ManufacturersArea(
            this.normativeAwful, this.textbookPasture, warehousing[3], warehousing[2]);
    commodity[5] =
        new promoter.ManufacturersArea(
            this.normativeAwful * 2.0, this.textbookPasture * 2.0, warehousing[4], warehousing[3]);
    commodity[6] =
        new promoter.ManufacturersArea(
            this.normativeAwful * 2.0, this.textbookPasture * 2.0, warehousing[4], warehousing[3]);
    commodity[7] =
        new promoter.OperatorConclude(this.normativeAwful, this.textbookPasture, warehousing[4]);
    warehousing[0].adjustExpected(commodity[1]);
    warehousing[0].situatedLatest(commodity[0]);
    warehousing[1].adjustExpected(commodity[2], commodity[3]);
    warehousing[1].situatedLatest(commodity[1]);
    warehousing[2].adjustExpected(commodity[4]);
    warehousing[2].situatedLatest(commodity[2], commodity[3]);
    warehousing[3].adjustExpected(commodity[5], commodity[6]);
    warehousing[3].situatedLatest(commodity[4]);
    warehousing[4].adjustExpected(commodity[7]);
    warehousing[4].situatedLatest(commodity[5], commodity[6]);
    this.forumFile.embedCarnival(
        new book.FarmExposition(
            acculturative.PeriodWarden.presentlyMinutes(),
            FarmExposition.StoolCommencement,
            commodity[0]));
  }

  public synchronized double minutesCurb() {
    return this.daysBoundary;
  }

  public synchronized void opening() {
    Simulates.previousExercise = this;

    while (acculturative.PeriodWarden.presentlyMinutes() < this.daysBoundary
        && this.forumFile.calculate() > 0) {
      this.forumFile.incomingVenue().cycleRace();
    }
    this.typescriptDigit();
  }

  public synchronized void typescriptDigit() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.daysBoundary,
            acculturative.PeriodWarden.presentlyMinutes(),
            this.normativeAwful,
            this.textbookPasture));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", space.Warehouse.depositoryConstrain()));
    System.out.println(
        "ProducibleObject count: " + manufacturingPieces.PannonianMatter.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (promoter.Manufacturers leong : commodity) {
      System.out.println(leong.stats());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (space.Warehouse waffen : warehousing) {
      System.out.println(waffen.survey());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
