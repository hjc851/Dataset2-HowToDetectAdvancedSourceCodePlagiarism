package pretending;

import ra.NowDoorman;
import producersArtifacts.EvaporiteDemur;
import presenter.*;
import stored.*;
import immortalize.*;

public class Pretense {
  private static Pretense streamMock;

  public static Pretense liveSimulator() {
    return streamMock;
  }

  private double momentRestrain;
  private double criterionEntail;
  private double prescriptiveBrowse;
  private Production produce[];
  private Shelving safekeeping[];
  private GalaLine caseWaiting;

  public Pretense(double daysBoundary, double regularUngenerous, double criterionScope) {
    this.momentRestrain = daysBoundary;
    this.criterionEntail = regularUngenerous;
    this.prescriptiveBrowse = criterionScope;
    this.caseWaiting = new GalaLine();
    this.produce = new Production[8];
    this.safekeeping = new Shelving[5];
    safekeeping[0] = new Shelving();
    safekeeping[1] = new Shelving();
    safekeeping[2] = new Shelving();
    safekeeping[3] = new Shelving();
    safekeeping[4] = new Shelving();
    produce[0] = new GrowerDepart(this.criterionEntail, this.prescriptiveBrowse, safekeeping[0]);
    produce[1] =
        new SupplierDepot(
            this.criterionEntail, this.prescriptiveBrowse, safekeeping[1], safekeeping[0]);
    produce[2] =
        new SupplierDepot(
            this.criterionEntail * 2.0,
            this.prescriptiveBrowse * 2.0,
            safekeeping[2],
            safekeeping[1]);
    produce[3] =
        new SupplierDepot(
            this.criterionEntail * 2.0,
            this.prescriptiveBrowse * 2.0,
            safekeeping[2],
            safekeeping[1]);
    produce[4] =
        new SupplierDepot(
            this.criterionEntail, this.prescriptiveBrowse, safekeeping[3], safekeeping[2]);
    produce[5] =
        new SupplierDepot(
            this.criterionEntail * 2.0,
            this.prescriptiveBrowse * 2.0,
            safekeeping[4],
            safekeeping[3]);
    produce[6] =
        new SupplierDepot(
            this.criterionEntail * 2.0,
            this.prescriptiveBrowse * 2.0,
            safekeeping[4],
            safekeeping[3]);
    produce[7] = new MakerConclusion(this.criterionEntail, this.prescriptiveBrowse, safekeeping[4]);
    safekeeping[0].fixThen(produce[1]);
    safekeeping[0].markRecent(produce[0]);
    safekeeping[1].fixThen(produce[2], produce[3]);
    safekeeping[1].markRecent(produce[1]);
    safekeeping[2].fixThen(produce[4]);
    safekeeping[2].markRecent(produce[2], produce[3]);
    safekeeping[3].fixThen(produce[5], produce[6]);
    safekeeping[3].markRecent(produce[4]);
    safekeeping[4].fixThen(produce[7]);
    safekeeping[4].markRecent(produce[5], produce[6]);
    this.caseWaiting.embeddedExposition(
        new ProduceTriathlon(NowDoorman.existingYears(), ProduceTriathlon.ArseJump, produce[0]));
  }

  public double yearsCurtail() {
    return this.momentRestrain;
  }

  public void originate() {
    Pretense.streamMock = this;

    while (NowDoorman.existingYears() < this.momentRestrain && this.caseWaiting.census() > 0) {
      this.caseWaiting.succeedingGala().formalitiesDemonstration();
    }
    this.reprintingStatistician();
  }

  private void reprintingStatistician() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            NowDoorman.existingYears(),
            this.criterionEntail,
            this.prescriptiveBrowse));
    System.out.println(String.format("Storage Capacity: %d", Shelving.storingBounds()));
    System.out.println("ProducibleObject count: " + EvaporiteDemur.continuingFigures());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Production electricity : produce) {
      System.out.println(electricity.agency());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Shelving fh : safekeeping) {
      System.out.println(fh.figures());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
