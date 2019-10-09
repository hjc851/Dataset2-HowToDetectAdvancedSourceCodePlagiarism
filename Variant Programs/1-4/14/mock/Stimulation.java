package mock;

import metamorphic.NowDoorman;
import producerArtefacts.TuronianOpposes;
import maker.*;
import disk.*;
import tally.*;

public class Stimulation {
  public maker.Publisher manufacturers[];

  public synchronized double periodsBound() {
    return this.meterCircumscribe;
  }

  public static mock.Stimulation formerAnalogue;
  public disk.Entrepot storeroom[];
  public double touchstoneRoam;

  public Stimulation(double opportunityMaximum, double classicNormal, double canonicalCompass) {
    this.meterCircumscribe = opportunityMaximum;
    this.stockStingy = classicNormal;
    this.touchstoneRoam = canonicalCompass;
    this.commemorationBraid = new tally.SymposiumSufferance();
    this.manufacturers = new maker.Publisher[8];
    this.storeroom = new disk.Entrepot[5];
    storeroom[0] = new disk.Entrepot();
    storeroom[1] = new disk.Entrepot();
    storeroom[2] = new disk.Entrepot();
    storeroom[3] = new disk.Entrepot();
    storeroom[4] = new disk.Entrepot();
    manufacturers[0] =
        new maker.OutputCommencement(this.stockStingy, this.touchstoneRoam, storeroom[0]);
    manufacturers[1] =
        new maker.SupplierDepot(this.stockStingy, this.touchstoneRoam, storeroom[1], storeroom[0]);
    manufacturers[2] =
        new maker.SupplierDepot(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, storeroom[2], storeroom[1]);
    manufacturers[3] =
        new maker.SupplierDepot(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, storeroom[2], storeroom[1]);
    manufacturers[4] =
        new maker.SupplierDepot(this.stockStingy, this.touchstoneRoam, storeroom[3], storeroom[2]);
    manufacturers[5] =
        new maker.SupplierDepot(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, storeroom[4], storeroom[3]);
    manufacturers[6] =
        new maker.SupplierDepot(
            this.stockStingy * 2.0, this.touchstoneRoam * 2.0, storeroom[4], storeroom[3]);
    manufacturers[7] =
        new maker.EmitterCompletes(this.stockStingy, this.touchstoneRoam, storeroom[4]);
    storeroom[0].determinedLast(manufacturers[1]);
    storeroom[0].fitPrior(manufacturers[0]);
    storeroom[1].determinedLast(manufacturers[2], manufacturers[3]);
    storeroom[1].fitPrior(manufacturers[1]);
    storeroom[2].determinedLast(manufacturers[4]);
    storeroom[2].fitPrior(manufacturers[2], manufacturers[3]);
    storeroom[3].determinedLast(manufacturers[5], manufacturers[6]);
    storeroom[3].fitPrior(manufacturers[4]);
    storeroom[4].determinedLast(manufacturers[7]);
    storeroom[4].fitPrior(manufacturers[5], manufacturers[6]);
    this.commemorationBraid.installCeremonies(
        new tally.CommodityRace(
            metamorphic.NowDoorman.latestClip(), CommodityRace.JohnPart, manufacturers[0]));
  }

  public double meterCircumscribe;
  public tally.SymposiumSufferance commemorationBraid;

  public static synchronized mock.Stimulation topicalSimulated() {
    return formerAnalogue;
  }

  public double stockStingy;

  public synchronized void jump() {
    Stimulation.formerAnalogue = this;

    while (metamorphic.NowDoorman.latestClip() < this.meterCircumscribe
        && this.commemorationBraid.calculation() > 0) synx45();
    this.fontFigure();
  }

  public synchronized void fontFigure() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.meterCircumscribe,
            metamorphic.NowDoorman.latestClip(),
            this.stockStingy,
            this.touchstoneRoam));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", disk.Entrepot.diskTrammel()));
    System.out.println(
        "ProducibleObject count: " + producerArtefacts.TuronianOpposes.rifeNumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (maker.Publisher spain : manufacturers) synx46(spain);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (disk.Entrepot waffen : storeroom) synx47(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx45() {
    this.commemorationBraid.theExposition().procedureCase();
  }

  private synchronized void synx46(Publisher spain) {
    System.out.println(spain.stats());
  }

  private synchronized void synx47(Entrepot waffen) {
    System.out.println(waffen.information());
  }
}
