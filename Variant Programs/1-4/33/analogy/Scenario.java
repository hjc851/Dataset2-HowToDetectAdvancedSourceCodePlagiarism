package analogy;

import lapse.JunctureJailer;
import manufacturedBelongings.MinableOppose;
import production.*;
import warehouses.*;
import track.*;

public class Scenario {
  public CaseWaiting paradeConvoy = null;
  public Repository storeroom[] = null;
  public Presenter fabricator[] = null;
  public double prescriptiveBrowse = 0.0;
  public double touchstoneNasty = 0.0;
  public double whenThrottle = 0.0;
  public static Scenario topicalSimulated = null;

  public static synchronized Scenario typicalTrainer() {
    return topicalSimulated;
  }

  public Scenario(double againRestricted, double regulationSpiteful, double criterionScope) {
    this.whenThrottle = againRestricted;
    this.touchstoneNasty = regulationSpiteful;
    this.prescriptiveBrowse = criterionScope;
    this.paradeConvoy = new CaseWaiting();
    this.fabricator = new Presenter[8];
    this.storeroom = new Repository[5];
    storeroom[0] = new Repository();
    storeroom[1] = new Repository();
    storeroom[2] = new Repository();
    storeroom[3] = new Repository();
    storeroom[4] = new Repository();
    fabricator[0] = new EmitterOpening(this.touchstoneNasty, this.prescriptiveBrowse, storeroom[0]);
    fabricator[1] =
        new PresenterOutpost(
            this.touchstoneNasty, this.prescriptiveBrowse, storeroom[1], storeroom[0]);
    fabricator[2] =
        new PresenterOutpost(
            this.touchstoneNasty * 2.0, this.prescriptiveBrowse * 2.0, storeroom[2], storeroom[1]);
    fabricator[3] =
        new PresenterOutpost(
            this.touchstoneNasty * 2.0, this.prescriptiveBrowse * 2.0, storeroom[2], storeroom[1]);
    fabricator[4] =
        new PresenterOutpost(
            this.touchstoneNasty, this.prescriptiveBrowse, storeroom[3], storeroom[2]);
    fabricator[5] =
        new PresenterOutpost(
            this.touchstoneNasty * 2.0, this.prescriptiveBrowse * 2.0, storeroom[4], storeroom[3]);
    fabricator[6] =
        new PresenterOutpost(
            this.touchstoneNasty * 2.0, this.prescriptiveBrowse * 2.0, storeroom[4], storeroom[3]);
    fabricator[7] =
        new GrowerTerminate(this.touchstoneNasty, this.prescriptiveBrowse, storeroom[4]);
    storeroom[0].placedUpcoming(fabricator[1]);
    storeroom[0].putPreceding(fabricator[0]);
    storeroom[1].placedUpcoming(fabricator[2], fabricator[3]);
    storeroom[1].putPreceding(fabricator[1]);
    storeroom[2].placedUpcoming(fabricator[4]);
    storeroom[2].putPreceding(fabricator[2], fabricator[3]);
    storeroom[3].placedUpcoming(fabricator[5], fabricator[6]);
    storeroom[3].putPreceding(fabricator[4]);
    storeroom[4].placedUpcoming(fabricator[7]);
    storeroom[4].putPreceding(fabricator[5], fabricator[6]);
    this.paradeConvoy.injectedGathering(
        new ManufacturerCase(
            JunctureJailer.formerAmount(), ManufacturerCase.GetCommence, fabricator[0]));
  }

  public synchronized double opportunityMaximum() {
    return this.whenThrottle;
  }

  public synchronized void early() {
    Scenario.topicalSimulated = this;

    while (JunctureJailer.formerAmount() < this.whenThrottle && this.paradeConvoy.reckon() > 0) {
      this.paradeConvoy.comeDemonstration().methodsRally();
    }
    this.publishingStat();
  }

  public synchronized void publishingStat() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle,
            JunctureJailer.formerAmount(),
            this.touchstoneNasty,
            this.prescriptiveBrowse));
    System.out.println(String.format("Storage Capacity: %d", Repository.archivingBound()));
    System.out.println("ProducibleObject count: " + MinableOppose.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Presenter leong : fabricator) {
      System.out.println(leong.rda());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Repository ora : storeroom) {
      System.out.println(ora.numerals());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
