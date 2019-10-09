package simulated;

import euphonious.AmountRearing;
import producedItems.FissionableCavil;
import maker.*;
import safekeeping.*;
import histories.*;
import static java.lang.System.out;

public class Pretence {
  private histories.TournamentStandby celebrationBacklog;
  private safekeeping.Space storing[];
  private maker.Production filmmaker[];
  private double definitiveOrbit;
  private double authoritativeHateful;
  private double clockRestrict;
  private static simulated.Pretence ongoingPretence;

  public static synchronized simulated.Pretence rifeSimulate() {
    return ongoingPretence;
  }

  public Pretence(double weekMinimum, double canonicalSmall, double stockRamble) {
    this.clockRestrict = weekMinimum;
    this.authoritativeHateful = canonicalSmall;
    this.definitiveOrbit = stockRamble;
    this.celebrationBacklog = new histories.TournamentStandby();
    this.filmmaker = new maker.Production[8];
    this.storing = new safekeeping.Space[5];
    storing[0] = new safekeeping.Space();
    storing[1] = new safekeeping.Space();
    storing[2] = new safekeeping.Space();
    storing[3] = new safekeeping.Space();
    storing[4] = new safekeeping.Space();
    filmmaker[0] =
        new maker.PublisherJump(this.authoritativeHateful, this.definitiveOrbit, storing[0]);
    filmmaker[1] =
        new maker.CommodityBroadcaster(
            this.authoritativeHateful, this.definitiveOrbit, storing[1], storing[0]);
    filmmaker[2] =
        new maker.CommodityBroadcaster(
            this.authoritativeHateful * 2.0, this.definitiveOrbit * 2.0, storing[2], storing[1]);
    filmmaker[3] =
        new maker.CommodityBroadcaster(
            this.authoritativeHateful * 2.0, this.definitiveOrbit * 2.0, storing[2], storing[1]);
    filmmaker[4] =
        new maker.CommodityBroadcaster(
            this.authoritativeHateful, this.definitiveOrbit, storing[3], storing[2]);
    filmmaker[5] =
        new maker.CommodityBroadcaster(
            this.authoritativeHateful * 2.0, this.definitiveOrbit * 2.0, storing[4], storing[3]);
    filmmaker[6] =
        new maker.CommodityBroadcaster(
            this.authoritativeHateful * 2.0, this.definitiveOrbit * 2.0, storing[4], storing[3]);
    filmmaker[7] =
        new maker.BreederEnds(this.authoritativeHateful, this.definitiveOrbit, storing[4]);
    storing[0].placedUpcoming(filmmaker[1]);
    storing[0].putPreceding(filmmaker[0]);
    storing[1].placedUpcoming(filmmaker[2], filmmaker[3]);
    storing[1].putPreceding(filmmaker[1]);
    storing[2].placedUpcoming(filmmaker[4]);
    storing[2].putPreceding(filmmaker[2], filmmaker[3]);
    storing[3].placedUpcoming(filmmaker[5], filmmaker[6]);
    storing[3].putPreceding(filmmaker[4]);
    storing[4].placedUpcoming(filmmaker[7]);
    storing[4].putPreceding(filmmaker[5], filmmaker[6]);
    this.celebrationBacklog.enterGala(
        new histories.BreederCeremonies(
            euphonious.AmountRearing.thisThing(), BreederCeremonies.BacksideStartle, filmmaker[0]));
  }

  public synchronized double chanceThreshold() {
    return this.clockRestrict;
  }

  public synchronized void offset() {
    Pretence.ongoingPretence = this;

    while (euphonious.AmountRearing.thisThing() < this.clockRestrict
        && this.celebrationBacklog.figures() > 0) synx59();
    this.publicationsStatistically();
  }

  private synchronized void publicationsStatistically() {
    out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clockRestrict,
            euphonious.AmountRearing.thisThing(),
            this.authoritativeHateful,
            this.definitiveOrbit));
    out.println(java.lang.String.format("Storage Capacity: %d", safekeeping.Space.closetMax()));
    out.println("ProducibleObject count: " + producedItems.FissionableCavil.thisGet());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (maker.Production electricity : filmmaker) synx60(electricity);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (safekeeping.Space ora : storing) synx61(ora);
    out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx59() {
    this.celebrationBacklog.succeedingGala().serveParade();
  }

  private synchronized void synx60(Production electricity) {
    out.println(electricity.survey());
  }

  private synchronized void synx61(Space ora) {
    out.println(ora.surveys());
  }
}
