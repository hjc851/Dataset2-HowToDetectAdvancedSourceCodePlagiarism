package experiment;

import ra.ClipSteward;
import productObjective.PhyllosilicatePreclude;
import vintner.*;
import safekeeping.*;
import show.*;

public class Simulator {
  private static Simulator presentAnalog;

  public static Simulator ongoingPretence() {
    return presentAnalog;
  }

  private double meterCircumscribe;
  private double criterialBase;
  private double stockRamble;
  private Presenter produce[];
  private Entrepot warehouse[];
  private FestivalSpooler meetingGlue;

  public Simulator(double momentRestrain, double measureBeggarly, double standardizedArray) {
    this.meterCircumscribe = momentRestrain;
    this.criterialBase = measureBeggarly;
    this.stockRamble = standardizedArray;
    this.meetingGlue = new FestivalSpooler();
    this.produce = new Presenter[8];
    this.warehouse = new Entrepot[5];
    warehouse[0] = new Entrepot();
    warehouse[1] = new Entrepot();
    warehouse[2] = new Entrepot();
    warehouse[3] = new Entrepot();
    warehouse[4] = new Entrepot();
    produce[0] = new PromoterKickoff(this.criterialBase, this.stockRamble, warehouse[0]);
    produce[1] =
        new GrowersFacility(this.criterialBase, this.stockRamble, warehouse[1], warehouse[0]);
    produce[2] =
        new GrowersFacility(
            this.criterialBase * 2.0, this.stockRamble * 2.0, warehouse[2], warehouse[1]);
    produce[3] =
        new GrowersFacility(
            this.criterialBase * 2.0, this.stockRamble * 2.0, warehouse[2], warehouse[1]);
    produce[4] =
        new GrowersFacility(this.criterialBase, this.stockRamble, warehouse[3], warehouse[2]);
    produce[5] =
        new GrowersFacility(
            this.criterialBase * 2.0, this.stockRamble * 2.0, warehouse[4], warehouse[3]);
    produce[6] =
        new GrowersFacility(
            this.criterialBase * 2.0, this.stockRamble * 2.0, warehouse[4], warehouse[3]);
    produce[7] = new CommodityCompleted(this.criterialBase, this.stockRamble, warehouse[4]);
    warehouse[0].doEarly(produce[1]);
    warehouse[0].solidifyingElapsed(produce[0]);
    warehouse[1].doEarly(produce[2], produce[3]);
    warehouse[1].solidifyingElapsed(produce[1]);
    warehouse[2].doEarly(produce[4]);
    warehouse[2].solidifyingElapsed(produce[2], produce[3]);
    warehouse[3].doEarly(produce[5], produce[6]);
    warehouse[3].solidifyingElapsed(produce[4]);
    warehouse[4].doEarly(produce[7]);
    warehouse[4].solidifyingElapsed(produce[5], produce[6]);
    this.meetingGlue.insertionSymposium(
        new DirectorSeminar(ClipSteward.afootHours(), DirectorSeminar.CrapperKickoff, produce[0]));
  }

  public double againRestricted() {
    return this.meterCircumscribe;
  }

  public void startle() {
    Simulator.presentAnalog = this;

    while (ClipSteward.afootHours() < this.meterCircumscribe && this.meetingGlue.numeration() > 0) {
      this.meetingGlue.followingExtravaganza().procedureCase();
    }
    this.newspaperSurvey();
  }

  private void newspaperSurvey() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.meterCircumscribe,
            ClipSteward.afootHours(),
            this.criterialBase,
            this.stockRamble));
    System.out.println(String.format("Storage Capacity: %d", Entrepot.warehousesMinimum()));
    System.out.println("ProducibleObject count: " + PhyllosilicatePreclude.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Presenter leong : produce) {
      System.out.println(leong.rda());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Entrepot fh : warehouse) {
      System.out.println(fh.statistical());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
