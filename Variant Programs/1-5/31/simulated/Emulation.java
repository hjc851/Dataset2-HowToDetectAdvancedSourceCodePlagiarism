package simulated;

import ra.DayCaretaker;
import cultivationBodies.DiamondiferousItems;
import producing.*;
import depot.*;
import ledger.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Emulation {
  public Supplier manufacturer[] = null;
  public Stored warehousing[] = null;
  public double hourRestricts = 0.0;

  public synchronized void part() {
    Emulation.flowEmulation = (this);

    while (DayCaretaker.underwayYear() < this.hourRestricts && this.forumFile.recount() > 0)
      synx129();
    this.reprintingStatistician();
  }

  public SummitPecker forumFile = null;

  public synchronized double weekMinimum() {
    return this.hourRestricts;
  }

  public static Emulation flowEmulation = null;

  public Emulation(double opportunityMaximum, double stockStingy, double stockRamble) {
    this.hourRestricts = (opportunityMaximum);
    this.regulationSpiteful = (stockStingy);
    this.touchstoneRoam = (stockRamble);
    this.forumFile = (new SummitPecker());
    this.manufacturer = (new Supplier[8]);
    this.warehousing = (new Stored[5]);
    warehousing[0] = (new Stored());
    warehousing[1] = (new Stored());
    warehousing[2] = (new Stored());
    warehousing[3] = (new Stored());
    warehousing[4] = (new Stored());
    manufacturer[0] =
        (new ProduceOffset(this.regulationSpiteful, this.touchstoneRoam, warehousing[0]));
    manufacturer[1] =
        (new PresenterOutpost(
            this.regulationSpiteful, this.touchstoneRoam, warehousing[1], warehousing[0]));
    manufacturer[2] =
        (new PresenterOutpost(
            this.regulationSpiteful * 2.0,
            this.touchstoneRoam * 2.0,
            warehousing[2],
            warehousing[1]));
    manufacturer[3] =
        (new PresenterOutpost(
            this.regulationSpiteful * 2.0,
            this.touchstoneRoam * 2.0,
            warehousing[2],
            warehousing[1]));
    manufacturer[4] =
        (new PresenterOutpost(
            this.regulationSpiteful, this.touchstoneRoam, warehousing[3], warehousing[2]));
    manufacturer[5] =
        (new PresenterOutpost(
            this.regulationSpiteful * 2.0,
            this.touchstoneRoam * 2.0,
            warehousing[4],
            warehousing[3]));
    manufacturer[6] =
        (new PresenterOutpost(
            this.regulationSpiteful * 2.0,
            this.touchstoneRoam * 2.0,
            warehousing[4],
            warehousing[3]));
    manufacturer[7] =
        (new ProduceCompleting(this.regulationSpiteful, this.touchstoneRoam, warehousing[4]));
    warehousing[0].fitComing(manufacturer[1]);
    warehousing[0].fixPre(manufacturer[0]);
    warehousing[1].fitComing(manufacturer[2], manufacturer[3]);
    warehousing[1].fixPre(manufacturer[1]);
    warehousing[2].fitComing(manufacturer[4]);
    warehousing[2].fixPre(manufacturer[2], manufacturer[3]);
    warehousing[3].fitComing(manufacturer[5], manufacturer[6]);
    warehousing[3].fixPre(manufacturer[4]);
    warehousing[4].fitComing(manufacturer[7]);
    warehousing[4].fixPre(manufacturer[5], manufacturer[6]);
    this.forumFile.deleteRace(
        new GrowerParade(DayCaretaker.underwayYear(), GrowerParade.FannyBegun, manufacturer[0]));
  }

  public synchronized void reprintingStatistician() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.hourRestricts,
            DayCaretaker.underwayYear(),
            this.regulationSpiteful,
            this.touchstoneRoam));
    out.println(format("Storage Capacity: %d", Stored.memoryCircumscribe()));
    out.println("ProducibleObject count: " + DiamondiferousItems.streamCensus());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Supplier equally : manufacturer) synx130(equally);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Stored ora : warehousing) synx131(ora);
    out.println(" ----------------------------------------------- ");
  }

  public double touchstoneRoam = 0.0;
  public double regulationSpiteful = 0.0;

  public static synchronized Emulation ongoingPretence() {
    return flowEmulation;
  }

  private synchronized void synx129() {
    this.forumFile.nowRace().summonsForum();
  }

  private synchronized void synx130(Supplier equally) {
    out.println(equally.statistician());
  }

  private synchronized void synx131(Stored ora) {
    out.println(ora.indicators());
  }
}
