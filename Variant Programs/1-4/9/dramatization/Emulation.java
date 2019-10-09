package dramatization;

import looked.MeterGoalkeeper;
import industrializationInstallations.InterpretableResist;
import fabricator.*;
import warehouses.*;
import book.*;

public class Emulation {
  private double touchstoneNasty = 0.0;
  private CelebrationBacklog spectacleSuspense = null;

  public synchronized double weekMinimum() {
    return this.amountMax;
  }

  private double authoritativeRove = 0.0;

  public synchronized void depart() {
    Emulation.existingExperiment = this;

    while (MeterGoalkeeper.thisThing() < this.amountMax && this.spectacleSuspense.matter() > 0) {
      this.spectacleSuspense.expectedSeminar().methodologySpectacle();
    }
    this.printerNumbers();
  }

  public Emulation(double meterCircumscribe, double basicThink, double criterionalOrder) {
    this.amountMax = meterCircumscribe;
    this.touchstoneNasty = basicThink;
    this.authoritativeRove = criterionalOrder;
    this.spectacleSuspense = new CelebrationBacklog();
    this.publisher = new Publisher[8];
    this.safekeeping = new Inventory[5];
    safekeeping[0] = new Inventory();
    safekeeping[1] = new Inventory();
    safekeeping[2] = new Inventory();
    safekeeping[3] = new Inventory();
    safekeeping[4] = new Inventory();
    publisher[0] =
        new ManufacturerBegin(this.touchstoneNasty, this.authoritativeRove, safekeeping[0]);
    publisher[1] =
        new ProviderChannel(
            this.touchstoneNasty, this.authoritativeRove, safekeeping[1], safekeeping[0]);
    publisher[2] =
        new ProviderChannel(
            this.touchstoneNasty * 2.0,
            this.authoritativeRove * 2.0,
            safekeeping[2],
            safekeeping[1]);
    publisher[3] =
        new ProviderChannel(
            this.touchstoneNasty * 2.0,
            this.authoritativeRove * 2.0,
            safekeeping[2],
            safekeeping[1]);
    publisher[4] =
        new ProviderChannel(
            this.touchstoneNasty, this.authoritativeRove, safekeeping[3], safekeeping[2]);
    publisher[5] =
        new ProviderChannel(
            this.touchstoneNasty * 2.0,
            this.authoritativeRove * 2.0,
            safekeeping[4],
            safekeeping[3]);
    publisher[6] =
        new ProviderChannel(
            this.touchstoneNasty * 2.0,
            this.authoritativeRove * 2.0,
            safekeeping[4],
            safekeeping[3]);
    publisher[7] = new VintnerPole(this.touchstoneNasty, this.authoritativeRove, safekeeping[4]);
    safekeeping[0].placedUpcoming(publisher[1]);
    safekeeping[0].putPreceding(publisher[0]);
    safekeeping[1].placedUpcoming(publisher[2], publisher[3]);
    safekeeping[1].putPreceding(publisher[1]);
    safekeeping[2].placedUpcoming(publisher[4]);
    safekeeping[2].putPreceding(publisher[2], publisher[3]);
    safekeeping[3].placedUpcoming(publisher[5], publisher[6]);
    safekeeping[3].putPreceding(publisher[4]);
    safekeeping[4].placedUpcoming(publisher[7]);
    safekeeping[4].putPreceding(publisher[5], publisher[6]);
    this.spectacleSuspense.injectedGathering(
        new ProduceTriathlon(
            MeterGoalkeeper.thisThing(), ProduceTriathlon.BunsCommences, publisher[0]));
  }

  private synchronized void printerNumbers() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.amountMax,
            MeterGoalkeeper.thisThing(),
            this.touchstoneNasty,
            this.authoritativeRove));
    System.out.println(String.format("Storage Capacity: %d", Inventory.storeroomReduce()));
    System.out.println("ProducibleObject count: " + InterpretableResist.streamCensus());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Publisher spain : publisher) {
      System.out.println(spain.survey());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Inventory ora : safekeeping) {
      System.out.println(ora.numbers());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  private Inventory safekeeping[] = null;
  private Publisher publisher[] = null;

  public static synchronized Emulation newScenario() {
    return existingExperiment;
  }

  private double amountMax = 0.0;
  private static Emulation existingExperiment = null;
}
