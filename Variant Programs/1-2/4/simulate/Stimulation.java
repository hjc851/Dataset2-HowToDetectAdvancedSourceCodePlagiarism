package simulate;

import lapse.DaysHandler;
import producesJewels.ExtractableObjective;
import production.*;
import repository.*;
import read.*;

public class Stimulation {
  private static Stimulation typicalTrainer;

  public static Stimulation circulatingSimulating() {
    return typicalTrainer;
  }

  private double periodsBound;
  private double normativeAwful;
  private double authoritativeRove;
  private Fabricator commodity[];
  private Storeroom disk[];
  private CelebrationBacklog paradeConvoy;

  public Stimulation(double thingReduce, double criterionalEquate, double measureRate) {
    this.periodsBound = thingReduce;
    this.normativeAwful = criterionalEquate;
    this.authoritativeRove = measureRate;
    this.paradeConvoy = new CelebrationBacklog();
    this.commodity = new Fabricator[8];
    this.disk = new Storeroom[5];
    disk[0] = new Storeroom();
    disk[1] = new Storeroom();
    disk[2] = new Storeroom();
    disk[3] = new Storeroom();
    disk[4] = new Storeroom();
    commodity[0] = new VintnerResume(this.normativeAwful, this.authoritativeRove, disk[0]);
    commodity[1] =
        new GrowersFacility(this.normativeAwful, this.authoritativeRove, disk[1], disk[0]);
    commodity[2] =
        new GrowersFacility(
            this.normativeAwful * 2.0, this.authoritativeRove * 2.0, disk[2], disk[1]);
    commodity[3] =
        new GrowersFacility(
            this.normativeAwful * 2.0, this.authoritativeRove * 2.0, disk[2], disk[1]);
    commodity[4] =
        new GrowersFacility(this.normativeAwful, this.authoritativeRove, disk[3], disk[2]);
    commodity[5] =
        new GrowersFacility(
            this.normativeAwful * 2.0, this.authoritativeRove * 2.0, disk[4], disk[3]);
    commodity[6] =
        new GrowersFacility(
            this.normativeAwful * 2.0, this.authoritativeRove * 2.0, disk[4], disk[3]);
    commodity[7] = new ProducingClose(this.normativeAwful, this.authoritativeRove, disk[4]);
    disk[0].fitComing(commodity[1]);
    disk[0].readyFormer(commodity[0]);
    disk[1].fitComing(commodity[2], commodity[3]);
    disk[1].readyFormer(commodity[1]);
    disk[2].fitComing(commodity[4]);
    disk[2].readyFormer(commodity[2], commodity[3]);
    disk[3].fitComing(commodity[5], commodity[6]);
    disk[3].readyFormer(commodity[4]);
    disk[4].fitComing(commodity[7]);
    disk[4].readyFormer(commodity[5], commodity[6]);
    this.paradeConvoy.incorporatedRally(
        new VintnerGathering(
            DaysHandler.ongoingMeter(), VintnerGathering.DerriereBegins, commodity[0]));
  }

  public double clipLimitation() {
    return this.periodsBound;
  }

  public void initiate() {
    Stimulation.typicalTrainer = this;

    while (DaysHandler.ongoingMeter() < this.periodsBound && this.paradeConvoy.consider() > 0) {
      this.paradeConvoy.thirdCeremonies().appendageSymposium();
    }
    this.impressStatistical();
  }

  private void impressStatistical() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            DaysHandler.ongoingMeter(),
            this.normativeAwful,
            this.authoritativeRove));
    System.out.println(String.format("Storage Capacity: %d", Storeroom.garageRestricted()));
    System.out.println("ProducibleObject count: " + ExtractableObjective.contemporaryReckoning());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Fabricator arsenic : commodity) {
      System.out.println(arsenic.estimates());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Storeroom ora : disk) {
      System.out.println(ora.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
