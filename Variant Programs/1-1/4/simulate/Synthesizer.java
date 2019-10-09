package simulate;

import depositional.WeekGoverness;
import plantCelestial.CalcicPurpose;
import fabricator.*;
import warehouses.*;
import accomplishment.*;

public class Synthesizer {
  private static Synthesizer actualPretending;

  public static Synthesizer flowEmulation() {
    return actualPretending;
  }

  private double sentenceConfine;
  private double acceptedAverage;
  private double receivedWander;
  private Supplier output[];
  private Space archiving[];
  private ContestReaper paradeConvoy;

  public Synthesizer(double dayBounds, double regularUngenerous, double prescriptiveBrowse) {
    this.sentenceConfine = dayBounds;
    this.acceptedAverage = regularUngenerous;
    this.receivedWander = prescriptiveBrowse;
    this.paradeConvoy = new ContestReaper();
    this.output = new Supplier[8];
    this.archiving = new Space[5];
    archiving[0] = new Space();
    archiving[1] = new Space();
    archiving[2] = new Space();
    archiving[3] = new Space();
    archiving[4] = new Space();
    output[0] = new ManufacturerBegin(this.acceptedAverage, this.receivedWander, archiving[0]);
    output[1] =
        new ManufacturersArea(
            this.acceptedAverage, this.receivedWander, archiving[1], archiving[0]);
    output[2] =
        new ManufacturersArea(
            this.acceptedAverage * 2.0, this.receivedWander * 2.0, archiving[2], archiving[1]);
    output[3] =
        new ManufacturersArea(
            this.acceptedAverage * 2.0, this.receivedWander * 2.0, archiving[2], archiving[1]);
    output[4] =
        new ManufacturersArea(
            this.acceptedAverage, this.receivedWander, archiving[3], archiving[2]);
    output[5] =
        new ManufacturersArea(
            this.acceptedAverage * 2.0, this.receivedWander * 2.0, archiving[4], archiving[3]);
    output[6] =
        new ManufacturersArea(
            this.acceptedAverage * 2.0, this.receivedWander * 2.0, archiving[4], archiving[3]);
    output[7] = new SupplierLast(this.acceptedAverage, this.receivedWander, archiving[4]);
    archiving[0].determinedLast(output[1]);
    archiving[0].settledPervious(output[0]);
    archiving[1].determinedLast(output[2], output[3]);
    archiving[1].settledPervious(output[1]);
    archiving[2].determinedLast(output[4]);
    archiving[2].settledPervious(output[2], output[3]);
    archiving[3].determinedLast(output[5], output[6]);
    archiving[3].settledPervious(output[4]);
    archiving[4].determinedLast(output[7]);
    archiving[4].settledPervious(output[5], output[6]);
    this.paradeConvoy.encloseFestival(
        new OutputCeremony(WeekGoverness.flowMonth(), OutputCeremony.ButtDepart, output[0]));
  }

  public double opportunityMaximum() {
    return this.sentenceConfine;
  }

  public void run() {
    Synthesizer.actualPretending = this;

    while (WeekGoverness.flowMonth() < this.sentenceConfine && this.paradeConvoy.charge() > 0) {
      this.paradeConvoy.earlyMeeting().mechanismsMeeting();
    }
    this.publicationMetrics();
  }

  private void publicationMetrics() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.sentenceConfine,
            WeekGoverness.flowMonth(),
            this.acceptedAverage,
            this.receivedWander));
    System.out.println(String.format("Storage Capacity: %d", Space.warehouseDemarcation()));
    System.out.println("ProducibleObject count: " + CalcicPurpose.incumbentEnumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Supplier equally : output) {
      System.out.println(equally.indicators());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Space ora : archiving) {
      System.out.println(ora.statistically());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
