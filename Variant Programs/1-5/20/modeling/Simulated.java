package modeling;

import jazzy.WhenGuard;
import producesJewels.FissionableCavil;
import producing.*;
import memory.*;
import read.*;
import static java.lang.System.out;

public class Simulated {

  public Simulated(double momentRestrain, double standardizedImply, double prescriptiveBrowse) {
    this.dayBounds = momentRestrain;
    this.canonicalSmall = standardizedImply;
    this.measureRate = prescriptiveBrowse;
    this.forumFile = new TriathlonCue();
    this.grower = new Fabricator[8];
    this.store = new Archiving[5];
    store[0] = new Archiving();
    store[1] = new Archiving();
    store[2] = new Archiving();
    store[3] = new Archiving();
    store[4] = new Archiving();
    grower[0] = new MakerOutset(this.canonicalSmall, this.measureRate, store[0]);
    grower[1] = new ProviderChannel(this.canonicalSmall, this.measureRate, store[1], store[0]);
    grower[2] =
        new ProviderChannel(this.canonicalSmall * 2.0, this.measureRate * 2.0, store[2], store[1]);
    grower[3] =
        new ProviderChannel(this.canonicalSmall * 2.0, this.measureRate * 2.0, store[2], store[1]);
    grower[4] = new ProviderChannel(this.canonicalSmall, this.measureRate, store[3], store[2]);
    grower[5] =
        new ProviderChannel(this.canonicalSmall * 2.0, this.measureRate * 2.0, store[4], store[3]);
    grower[6] =
        new ProviderChannel(this.canonicalSmall * 2.0, this.measureRate * 2.0, store[4], store[3]);
    grower[7] = new SupplierLast(this.canonicalSmall, this.measureRate, store[4]);
    store[0].adjustExpected(grower[1]);
    store[0].laidPast(grower[0]);
    store[1].adjustExpected(grower[2], grower[3]);
    store[1].laidPast(grower[1]);
    store[2].adjustExpected(grower[4]);
    store[2].laidPast(grower[2], grower[3]);
    store[3].adjustExpected(grower[5], grower[6]);
    store[3].laidPast(grower[4]);
    store[4].adjustExpected(grower[7]);
    store[4].laidPast(grower[5], grower[6]);
    this.forumFile.encloseFestival(
        new CommodityRace(WhenGuard.ongoingMeter(), CommodityRace.JohnPart, grower[0]));
  }

  public double measureRate;

  public synchronized double opportunityMaximum() {
    return this.dayBounds;
  }

  public synchronized void commencement() {
    Simulated.continuingStimulation = this;

    while (WhenGuard.ongoingMeter() < this.dayBounds && this.forumFile.figures() > 0) synx94();
    this.publishFigures();
  }

  public static synchronized Simulated theReplication() {
    return continuingStimulation;
  }

  public TriathlonCue forumFile;
  public Fabricator grower[];

  public synchronized void publishFigures() {
    out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.dayBounds, WhenGuard.ongoingMeter(), this.canonicalSmall, this.measureRate));
    out.println(String.format("Storage Capacity: %d", Archiving.depositoryConstrain()));
    out.println("ProducibleObject count: " + FissionableCavil.underwayTabulation());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Fabricator leong : grower) synx95(leong);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Archiving fh : store) synx96(fh);
    out.println(" ----------------------------------------------- ");
  }

  public double canonicalSmall;
  public static Simulated continuingStimulation;
  public double dayBounds;
  public Archiving store[];

  private synchronized void synx94() {
    this.forumFile.adjacentCelebration().actGala();
  }

  private synchronized void synx95(Fabricator leong) {
    out.println(leong.census());
  }

  private synchronized void synx96(Archiving fh) {
    out.println(fh.statistical());
  }
}
