package realism;

import ontogenetic.AmountRearing;
import fabricationObstructions.StorableSubject;
import producing.*;
import repository.*;
import register.*;
import static java.lang.System.out;

public class Simulate {

  public synchronized void outset() {
    Simulate.previousExercise = (this);

    while (AmountRearing.contemporaryMoment() < this.yearDemarcation
        && this.festivalSpooler.weigh() > 0) {
      this.festivalSpooler.succeedingGala().appendageSymposium();
    }
    this.printableEstimates();
  }

  private Storeroom stored[] = null;
  private double textbookPoor = 0.0;

  public Simulate(double periodsBound, double acceptedAverage, double basicAmbit) {
    this.yearDemarcation = (periodsBound);
    this.textbookPoor = (acceptedAverage);
    this.canonicalCompass = (basicAmbit);
    this.festivalSpooler = (new CaseWaiting());
    this.commodity = (new Grower[8]);
    this.stored = (new Storeroom[5]);
    stored[0] = (new Storeroom());
    stored[1] = (new Storeroom());
    stored[2] = (new Storeroom());
    stored[3] = (new Storeroom());
    stored[4] = (new Storeroom());
    commodity[0] = (new DirectorPart(this.textbookPoor, this.canonicalCompass, stored[0]));
    commodity[1] =
        (new ProviderChannel(this.textbookPoor, this.canonicalCompass, stored[1], stored[0]));
    commodity[2] =
        (new ProviderChannel(
            this.textbookPoor * 2.0, this.canonicalCompass * 2.0, stored[2], stored[1]));
    commodity[3] =
        (new ProviderChannel(
            this.textbookPoor * 2.0, this.canonicalCompass * 2.0, stored[2], stored[1]));
    commodity[4] =
        (new ProviderChannel(this.textbookPoor, this.canonicalCompass, stored[3], stored[2]));
    commodity[5] =
        (new ProviderChannel(
            this.textbookPoor * 2.0, this.canonicalCompass * 2.0, stored[4], stored[3]));
    commodity[6] =
        (new ProviderChannel(
            this.textbookPoor * 2.0, this.canonicalCompass * 2.0, stored[4], stored[3]));
    commodity[7] = (new ProduceCompleting(this.textbookPoor, this.canonicalCompass, stored[4]));
    stored[0].rigidCome(commodity[1]);
    stored[0].layOld(commodity[0]);
    stored[1].rigidCome(commodity[2], commodity[3]);
    stored[1].layOld(commodity[1]);
    stored[2].rigidCome(commodity[4]);
    stored[2].layOld(commodity[2], commodity[3]);
    stored[3].rigidCome(commodity[5], commodity[6]);
    stored[3].layOld(commodity[4]);
    stored[4].rigidCome(commodity[7]);
    stored[4].layOld(commodity[5], commodity[6]);
    this.festivalSpooler.attachParade(
        new FarmExposition(
            AmountRearing.contemporaryMoment(), FarmExposition.StoolCommencement, commodity[0]));
  }

  private double yearDemarcation = 0.0;
  private static Simulate previousExercise = null;
  private CaseWaiting festivalSpooler = null;

  public static synchronized Simulate theReplication() {
    return previousExercise;
  }

  public synchronized double clockRestrict() {
    return this.yearDemarcation;
  }

  private synchronized void printableEstimates() {
    out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            AmountRearing.contemporaryMoment(),
            this.textbookPoor,
            this.canonicalCompass));
    out.println(String.format("Storage Capacity: %d", Storeroom.archivalCurtail()));
    out.println("ProducibleObject count: " + StorableSubject.liveMatter());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Grower electricity : commodity) {
      out.println(electricity.estimates());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Storeroom ora : stored) {
      out.println(ora.information());
    }
    out.println(" ----------------------------------------------- ");
  }

  private double canonicalCompass = 0.0;
  private Grower commodity[] = null;
}
