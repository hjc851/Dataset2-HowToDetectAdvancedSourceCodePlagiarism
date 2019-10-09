package simulated;

import glanced.AgainOfficer;
import factoryRelics.ImmiscibleDisagree;
import maker.*;
import space.*;
import mark.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Experiment {
  public static Experiment presentAnalog = null;

  public static synchronized Experiment existingExperiment() {
    return presentAnalog;
  }

  public double minutesCurb = 0.0;
  public double regularUngenerous = 0.0;
  public double criterionalOrder = 0.0;
  public Farmer output[] = null;
  public Inventory closet[] = null;
  public ExtravaganzaWait expositionCola = null;

  public Experiment(double amountMax, double modularLittle, double basicAmbit) {
    this.minutesCurb = (amountMax);
    this.regularUngenerous = (modularLittle);
    this.criterionalOrder = (basicAmbit);
    this.expositionCola = (new ExtravaganzaWait());
    this.output = (new Farmer[8]);
    this.closet = (new Inventory[5]);
    closet[0] = (new Inventory());
    closet[1] = (new Inventory());
    closet[2] = (new Inventory());
    closet[3] = (new Inventory());
    closet[4] = (new Inventory());
    output[0] = (new EmitterOpening(this.regularUngenerous, this.criterionalOrder, closet[0]));
    output[1] =
        (new SupplierDepot(this.regularUngenerous, this.criterionalOrder, closet[1], closet[0]));
    output[2] =
        (new SupplierDepot(
            this.regularUngenerous * 2.0, this.criterionalOrder * 2.0, closet[2], closet[1]));
    output[3] =
        (new SupplierDepot(
            this.regularUngenerous * 2.0, this.criterionalOrder * 2.0, closet[2], closet[1]));
    output[4] =
        (new SupplierDepot(this.regularUngenerous, this.criterionalOrder, closet[3], closet[2]));
    output[5] =
        (new SupplierDepot(
            this.regularUngenerous * 2.0, this.criterionalOrder * 2.0, closet[4], closet[3]));
    output[6] =
        (new SupplierDepot(
            this.regularUngenerous * 2.0, this.criterionalOrder * 2.0, closet[4], closet[3]));
    output[7] = (new FilmmakerFinis(this.regularUngenerous, this.criterionalOrder, closet[4]));
    closet[0].arrangeNow(output[1]);
    closet[0].fitPrior(output[0]);
    closet[1].arrangeNow(output[2], output[3]);
    closet[1].fitPrior(output[1]);
    closet[2].arrangeNow(output[4]);
    closet[2].fitPrior(output[2], output[3]);
    closet[3].arrangeNow(output[5], output[6]);
    closet[3].fitPrior(output[4]);
    closet[4].arrangeNow(output[7]);
    closet[4].fitPrior(output[5], output[6]);
    this.expositionCola.insertionSymposium(
        new FabricatorCommemoration(
            AgainOfficer.presentlyMinutes(), FabricatorCommemoration.MayBegin, output[0]));
  }

  public synchronized double hoursRestriction() {
    return this.minutesCurb;
  }

  public synchronized void begins() {
    Experiment.presentAnalog = (this);

    while (AgainOfficer.presentlyMinutes() < this.minutesCurb && this.expositionCola.consider() > 0)
      synx171();
    this.writtenStats();
  }

  public synchronized void writtenStats() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.minutesCurb,
            AgainOfficer.presentlyMinutes(),
            this.regularUngenerous,
            this.criterionalOrder));
    out.println(format("Storage Capacity: %d", Inventory.archivingBound()));
    out.println("ProducibleObject count: " + ImmiscibleDisagree.streamCensus());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Farmer leong : output) synx172(leong);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Inventory waffen : closet) synx173(waffen);
    out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx171() {
    this.expositionCola.futureCase().litigateVenue();
  }

  private synchronized void synx172(Farmer leong) {
    out.println(leong.rda());
  }

  private synchronized void synx173(Inventory waffen) {
    out.println(waffen.stats());
  }
}
