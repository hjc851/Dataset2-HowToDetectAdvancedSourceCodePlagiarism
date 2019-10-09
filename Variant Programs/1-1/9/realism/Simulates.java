package realism;

import ontogenetic.WhenGuard;
import supplyArtefact.PerformableObjection;
import director.*;
import depository.*;
import disc.*;

public class Simulates {
  private static Simulates prevalentRealism;

  public static Simulates typicalTrainer() {
    return prevalentRealism;
  }

  private double clockRestrict;
  private double definitiveSkilled;
  private double standardizedArray;
  private Farm breeder[];
  private Storehouse storeroom[];
  private GalaLine extravaganzaWait;

  public Simulates(double junctureConstrain, double canonicIgnoble, double measureRate) {
    this.clockRestrict = junctureConstrain;
    this.definitiveSkilled = canonicIgnoble;
    this.standardizedArray = measureRate;
    this.extravaganzaWait = new GalaLine();
    this.breeder = new Farm[8];
    this.storeroom = new Storehouse[5];
    storeroom[0] = new Storehouse();
    storeroom[1] = new Storehouse();
    storeroom[2] = new Storehouse();
    storeroom[3] = new Storehouse();
    storeroom[4] = new Storehouse();
    breeder[0] = new FarmRun(this.definitiveSkilled, this.standardizedArray, storeroom[0]);
    breeder[1] =
        new PresenterOutpost(
            this.definitiveSkilled, this.standardizedArray, storeroom[1], storeroom[0]);
    breeder[2] =
        new PresenterOutpost(
            this.definitiveSkilled * 2.0, this.standardizedArray * 2.0, storeroom[2], storeroom[1]);
    breeder[3] =
        new PresenterOutpost(
            this.definitiveSkilled * 2.0, this.standardizedArray * 2.0, storeroom[2], storeroom[1]);
    breeder[4] =
        new PresenterOutpost(
            this.definitiveSkilled, this.standardizedArray, storeroom[3], storeroom[2]);
    breeder[5] =
        new PresenterOutpost(
            this.definitiveSkilled * 2.0, this.standardizedArray * 2.0, storeroom[4], storeroom[3]);
    breeder[6] =
        new PresenterOutpost(
            this.definitiveSkilled * 2.0, this.standardizedArray * 2.0, storeroom[4], storeroom[3]);
    breeder[7] = new FarmExit(this.definitiveSkilled, this.standardizedArray, storeroom[4]);
    storeroom[0].adjustExpected(breeder[1]);
    storeroom[0].primedEarlier(breeder[0]);
    storeroom[1].adjustExpected(breeder[2], breeder[3]);
    storeroom[1].primedEarlier(breeder[1]);
    storeroom[2].adjustExpected(breeder[4]);
    storeroom[2].primedEarlier(breeder[2], breeder[3]);
    storeroom[3].adjustExpected(breeder[5], breeder[6]);
    storeroom[3].primedEarlier(breeder[4]);
    storeroom[4].adjustExpected(breeder[7]);
    storeroom[4].primedEarlier(breeder[5], breeder[6]);
    this.extravaganzaWait.pasteContest(
        new GrowersMeeting(WhenGuard.ongoingMeter(), GrowersMeeting.PotOutset, breeder[0]));
  }

  public double meterCircumscribe() {
    return this.clockRestrict;
  }

  public void initiate() {
    Simulates.prevalentRealism = this;

    while (WhenGuard.ongoingMeter() < this.clockRestrict && this.extravaganzaWait.quantify() > 0) {
      this.extravaganzaWait.laterSymposium().outgrowthTournament();
    }
    this.publicationMetrics();
  }

  private void publicationMetrics() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clockRestrict,
            WhenGuard.ongoingMeter(),
            this.definitiveSkilled,
            this.standardizedArray));
    System.out.println(String.format("Storage Capacity: %d", Storehouse.warehousingRestriction()));
    System.out.println("ProducibleObject count: " + PerformableObjection.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Farm electricity : breeder) {
      System.out.println(electricity.rda());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Storehouse fh : storeroom) {
      System.out.println(fh.digit());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
