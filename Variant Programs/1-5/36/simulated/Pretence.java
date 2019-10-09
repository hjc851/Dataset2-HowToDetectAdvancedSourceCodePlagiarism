package simulated;

import jazzy.OpportunityCarer;
import developmentElements.RecoverableTarget;
import supplier.*;
import garage.*;
import best.*;
import static java.lang.System.out;

public class Pretence {
  private static final int synX2318int = 0;
  private static final String synX2317String = " ----------------------------------------------- ";
  private static final String synX2316String = " ----------------------------------------------- ";
  private static final String synX2315String = "Average Count";
  private static final String synX2314String = "Average Time";
  private static final String synX2313String = "Storage ID";
  private static final String synX2312String = "| %-14s | %-12s | %-12s |";
  private static final String synX2311String = " ----------------------------------------------- ";
  private static final String synX2310String = "Storage";
  private static final String synX2309String =
      " ----------------------------------------------------- ";
  private static final String synX2308String =
      "|-----------------------------------------------------|";
  private static final String synX2307String = "Blocked";
  private static final String synX2306String = "Starving";
  private static final String synX2305String = "Production";
  private static final String synX2304String = "Producer ID";
  private static final String synX2303String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2302String =
      " ----------------------------------------------------- ";
  private static final String synX2301String = "Assemblers";
  private static final String synX2300String = "Statistics\n";
  private static final String synX2299String = "ProducibleObject count: ";
  private static final String synX2298String = "Storage Capacity: %d";
  private static final String synX2297String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";

  public synchronized double junctureConstrain() {
    return this.againRestricted;
  }

  public best.ExpositionCola caseWaiting = null;

  public Pretence(double nowRestrictions, double modularLittle, double criterialRank) {
    this.againRestricted = nowRestrictions;
    this.basicThink = modularLittle;
    this.acceptableReach = criterialRank;
    this.caseWaiting = new best.ExpositionCola();
    this.producing = new supplier.Exporter[8];
    this.storehouse = new garage.Depository[5];
    storehouse[0] = new garage.Depository();
    storehouse[1] = new garage.Depository();
    storehouse[2] = new garage.Depository();
    storehouse[3] = new garage.Depository();
    storehouse[4] = new garage.Depository();
    producing[0] = new supplier.SupplierFirst(this.basicThink, this.acceptableReach, storehouse[0]);
    producing[1] =
        new supplier.PresenterOutpost(
            this.basicThink, this.acceptableReach, storehouse[1], storehouse[0]);
    producing[2] =
        new supplier.PresenterOutpost(
            this.basicThink * 2.0, this.acceptableReach * 2.0, storehouse[2], storehouse[1]);
    producing[3] =
        new supplier.PresenterOutpost(
            this.basicThink * 2.0, this.acceptableReach * 2.0, storehouse[2], storehouse[1]);
    producing[4] =
        new supplier.PresenterOutpost(
            this.basicThink, this.acceptableReach, storehouse[3], storehouse[2]);
    producing[5] =
        new supplier.PresenterOutpost(
            this.basicThink * 2.0, this.acceptableReach * 2.0, storehouse[4], storehouse[3]);
    producing[6] =
        new supplier.PresenterOutpost(
            this.basicThink * 2.0, this.acceptableReach * 2.0, storehouse[4], storehouse[3]);
    producing[7] = new supplier.FarmExit(this.basicThink, this.acceptableReach, storehouse[4]);
    storehouse[0].putFuture(producing[1]);
    storehouse[0].adjustFirst(producing[0]);
    storehouse[1].putFuture(producing[2], producing[3]);
    storehouse[1].adjustFirst(producing[1]);
    storehouse[2].putFuture(producing[4]);
    storehouse[2].adjustFirst(producing[2], producing[3]);
    storehouse[3].putFuture(producing[5], producing[6]);
    storehouse[3].adjustFirst(producing[4]);
    storehouse[4].putFuture(producing[7]);
    storehouse[4].adjustFirst(producing[5], producing[6]);
    this.caseWaiting.appendForum(
        new best.ProviderSummit(
            jazzy.OpportunityCarer.previousHour(), ProviderSummit.BumGet, producing[0]));
  }

  public double basicThink = 0.0;

  public synchronized void hardcopyRecords() {
    out.println(
        java.lang.String.format(
            synX2297String,
            this.againRestricted,
            jazzy.OpportunityCarer.previousHour(),
            this.basicThink,
            this.acceptableReach));
    out.println(java.lang.String.format(synX2298String, garage.Depository.safekeepingCurb()));
    out.println(synX2299String + developmentElements.RecoverableTarget.continuingFigures());
    out.println();
    out.println(synX2300String);
    out.println(synX2301String);
    out.println(synX2302String);
    out.println(
        java.lang.String.format(
            synX2303String, synX2304String, synX2305String, synX2306String, synX2307String));
    out.println(synX2308String);
    for (supplier.Exporter arsenic : producing) synx143(arsenic);
    out.println(synX2309String);
    out.println();
    out.println(synX2310String);
    out.println(synX2311String);
    out.println(
        java.lang.String.format(synX2312String, synX2313String, synX2314String, synX2315String));
    out.println(synX2316String);
    for (garage.Depository ora : storehouse) synx144(ora);
    out.println(synX2317String);
  }

  public double acceptableReach = 0.0;
  public static simulated.Pretence thisDramatization = null;

  public static synchronized simulated.Pretence streamMock() {
    return thisDramatization;
  }

  public double againRestricted = 0.0;

  public synchronized void run() {
    Pretence.thisDramatization = this;

    while (jazzy.OpportunityCarer.previousHour() < this.againRestricted
        && this.caseWaiting.matter() > synX2318int) synx145();
    this.hardcopyRecords();
  }

  public supplier.Exporter producing[] = null;
  public garage.Depository storehouse[] = null;

  private synchronized void synx143(Exporter arsenic) {
    out.println(arsenic.numbers());
  }

  private synchronized void synx144(Depository ora) {
    out.println(ora.indicators());
  }

  private synchronized void synx145() {
    this.caseWaiting.lastTournament().proceedingGathering();
  }
}
