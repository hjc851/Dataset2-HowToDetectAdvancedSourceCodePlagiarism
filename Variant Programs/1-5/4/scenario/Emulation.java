package scenario;

import euphonious.AgainOfficer;
import developmentElements.PhyllosilicatePreclude;
import fabricator.*;
import warehouse.*;
import register.*;
import static java.lang.System.out;

public class Emulation {

  public synchronized double againRestricted() {
    return this.daysBoundary;
  }

  public register.CeremoniesDragon gatheringDipper;
  public warehouse.Storehouse disk[];
  public double daysBoundary;
  public static scenario.Emulation incumbentPretense;
  public double measureBeggarly;

  public synchronized void reprintingStatistician() {
    out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.daysBoundary,
            euphonious.AgainOfficer.continuingAgain(),
            this.measureBeggarly,
            this.normativeDrift));
    out.println(
        java.lang.String.format("Storage Capacity: %d", warehouse.Storehouse.stowageRestricting()));
    out.println(
        "ProducibleObject count: "
            + developmentElements.PhyllosilicatePreclude.prevalentCalculation());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (fabricator.Output spain : farmer) synx24(spain);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (warehouse.Storehouse fh : disk) synx25(fh);
    out.println(" ----------------------------------------------- ");
  }

  public Emulation(double weekMinimum, double standardizedImply, double regulationGraze) {
    this.daysBoundary = (weekMinimum);
    this.measureBeggarly = (standardizedImply);
    this.normativeDrift = (regulationGraze);
    this.gatheringDipper = (new register.CeremoniesDragon());
    this.farmer = (new fabricator.Output[8]);
    this.disk = (new warehouse.Storehouse[5]);
    disk[0] = (new warehouse.Storehouse());
    disk[1] = (new warehouse.Storehouse());
    disk[2] = (new warehouse.Storehouse());
    disk[3] = (new warehouse.Storehouse());
    disk[4] = (new warehouse.Storehouse());
    farmer[0] =
        (new fabricator.ProductionCommence(this.measureBeggarly, this.normativeDrift, disk[0]));
    farmer[1] =
        (new fabricator.FarmStn(this.measureBeggarly, this.normativeDrift, disk[1], disk[0]));
    farmer[2] =
        (new fabricator.FarmStn(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, disk[2], disk[1]));
    farmer[3] =
        (new fabricator.FarmStn(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, disk[2], disk[1]));
    farmer[4] =
        (new fabricator.FarmStn(this.measureBeggarly, this.normativeDrift, disk[3], disk[2]));
    farmer[5] =
        (new fabricator.FarmStn(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, disk[4], disk[3]));
    farmer[6] =
        (new fabricator.FarmStn(
            this.measureBeggarly * 2.0, this.normativeDrift * 2.0, disk[4], disk[3]));
    farmer[7] =
        (new fabricator.ManufacturerFinale(this.measureBeggarly, this.normativeDrift, disk[4]));
    disk[0].placeSoon(farmer[1]);
    disk[0].bentOriginal(farmer[0]);
    disk[1].placeSoon(farmer[2], farmer[3]);
    disk[1].bentOriginal(farmer[1]);
    disk[2].placeSoon(farmer[4]);
    disk[2].bentOriginal(farmer[2], farmer[3]);
    disk[3].placeSoon(farmer[5], farmer[6]);
    disk[3].bentOriginal(farmer[4]);
    disk[4].placeSoon(farmer[7]);
    disk[4].bentOriginal(farmer[5], farmer[6]);
    this.gatheringDipper.tuckCase(
        new register.SupplierVenue(
            euphonious.AgainOfficer.continuingAgain(), SupplierVenue.PrivyEarly, farmer[0]));
  }

  public static synchronized scenario.Emulation actualPretending() {
    return incumbentPretense;
  }

  public fabricator.Output farmer[];
  public double normativeDrift;

  public synchronized void kickoff() {
    Emulation.incumbentPretense = (this);

    while (euphonious.AgainOfficer.continuingAgain() < this.daysBoundary
        && this.gatheringDipper.census() > 0) synx26();
    this.reprintingStatistician();
  }

  private synchronized void synx24(Output spain) {
    out.println(spain.numerals());
  }

  private synchronized void synx25(Storehouse fh) {
    out.println(fh.statistical());
  }

  private synchronized void synx26() {
    this.gatheringDipper.comingCeremony().outgrowthTournament();
  }
}
