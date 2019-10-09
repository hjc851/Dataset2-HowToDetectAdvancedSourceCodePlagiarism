package dramatization;

import indiscernible.ThingCatch;
import manufacturedBelongings.PannonianMatter;
import provider.*;
import shelving.*;
import commemorate.*;
import static java.lang.String.format;

public class Realism {
  public Stored space[] = null;
  public double criterionScope = 0.0;
  public static Realism previousExercise = null;
  public MeetingGlue symposiumSufferance = null;
  public Growers exporter[] = null;

  public static synchronized Realism presentlySynthesizer() {
    return previousExercise;
  }

  public synchronized void printersData() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.chanceThreshold,
            ThingCatch.theOpportunity(),
            this.definitiveSkilled,
            this.criterionScope));
    System.out.println(format("Storage Capacity: %d", Stored.storedBoundary()));
    System.out.println("ProducibleObject count: " + PannonianMatter.afootCharge());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Growers leong : exporter) synx178(leong);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Stored fh : space) synx179(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  public synchronized double thingReduce() {
    return this.chanceThreshold;
  }

  public Realism(double weekMinimum, double prescriptiveMingy, double standardizedArray) {
    this.chanceThreshold = (weekMinimum);
    this.definitiveSkilled = (prescriptiveMingy);
    this.criterionScope = (standardizedArray);
    this.symposiumSufferance = (new MeetingGlue());
    this.exporter = (new Growers[8]);
    this.space = (new Stored[5]);
    space[0] = (new Stored());
    space[1] = (new Stored());
    space[2] = (new Stored());
    space[3] = (new Stored());
    space[4] = (new Stored());
    exporter[0] = (new OperatorOriginate(this.definitiveSkilled, this.criterionScope, space[0]));
    exporter[1] =
        (new ManufacturerBase(this.definitiveSkilled, this.criterionScope, space[1], space[0]));
    exporter[2] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.criterionScope * 2.0, space[2], space[1]));
    exporter[3] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.criterionScope * 2.0, space[2], space[1]));
    exporter[4] =
        (new ManufacturerBase(this.definitiveSkilled, this.criterionScope, space[3], space[2]));
    exporter[5] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.criterionScope * 2.0, space[4], space[3]));
    exporter[6] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.criterionScope * 2.0, space[4], space[3]));
    exporter[7] = (new FabricatorGet(this.definitiveSkilled, this.criterionScope, space[4]));
    space[0].layIncoming(exporter[1]);
    space[0].bentOriginal(exporter[0]);
    space[1].layIncoming(exporter[2], exporter[3]);
    space[1].bentOriginal(exporter[1]);
    space[2].layIncoming(exporter[4]);
    space[2].bentOriginal(exporter[2], exporter[3]);
    space[3].layIncoming(exporter[5], exporter[6]);
    space[3].bentOriginal(exporter[4]);
    space[4].layIncoming(exporter[7]);
    space[4].bentOriginal(exporter[5], exporter[6]);
    this.symposiumSufferance.pasteContest(
        new PresenterSymposium(
            ThingCatch.theOpportunity(), PresenterSymposium.PotOutset, exporter[0]));
  }

  public double definitiveSkilled = 0.0;
  public double chanceThreshold = 0.0;

  public synchronized void get() {
    Realism.previousExercise = (this);

    while (ThingCatch.theOpportunity() < this.chanceThreshold
        && this.symposiumSufferance.total() > 0) synx180();
    this.printersData();
  }

  private synchronized void synx178(Growers leong) {
    System.out.println(leong.figures());
  }

  private synchronized void synx179(Stored fh) {
    System.out.println(fh.numbers());
  }

  private synchronized void synx180() {
    this.symposiumSufferance.incomingVenue().procedureCase();
  }
}
