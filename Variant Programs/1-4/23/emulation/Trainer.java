package emulation;

import said.BeginningHousekeeper;
import producesJewels.DepositionalObjet;
import grower.*;
import safekeeping.*;
import tape.*;

public class Trainer {
  private tape.CelebrationBacklog festivalSpooler = null;
  private safekeeping.Store warehousing[] = null;
  private grower.Output emitter[] = null;
  private double canonicalCompass = 0.0;
  private double regularUngenerous = 0.0;
  private double monthRestricting = 0.0;
  private static emulation.Trainer theReplication = null;

  public static synchronized emulation.Trainer contemporaryFeigning() {
    return theReplication;
  }

  public Trainer(double periodsBound, double classicalMeanspirited, double basicAmbit) {
    this.monthRestricting = periodsBound;
    this.regularUngenerous = classicalMeanspirited;
    this.canonicalCompass = basicAmbit;
    this.festivalSpooler = new tape.CelebrationBacklog();
    this.emitter = new grower.Output[8];
    this.warehousing = new safekeeping.Store[5];
    warehousing[0] = new safekeeping.Store();
    warehousing[1] = new safekeeping.Store();
    warehousing[2] = new safekeeping.Store();
    warehousing[3] = new safekeeping.Store();
    warehousing[4] = new safekeeping.Store();
    emitter[0] =
        new grower.OperatorOriginate(this.regularUngenerous, this.canonicalCompass, warehousing[0]);
    emitter[1] =
        new grower.ProviderChannel(
            this.regularUngenerous, this.canonicalCompass, warehousing[1], warehousing[0]);
    emitter[2] =
        new grower.ProviderChannel(
            this.regularUngenerous * 2.0,
            this.canonicalCompass * 2.0,
            warehousing[2],
            warehousing[1]);
    emitter[3] =
        new grower.ProviderChannel(
            this.regularUngenerous * 2.0,
            this.canonicalCompass * 2.0,
            warehousing[2],
            warehousing[1]);
    emitter[4] =
        new grower.ProviderChannel(
            this.regularUngenerous, this.canonicalCompass, warehousing[3], warehousing[2]);
    emitter[5] =
        new grower.ProviderChannel(
            this.regularUngenerous * 2.0,
            this.canonicalCompass * 2.0,
            warehousing[4],
            warehousing[3]);
    emitter[6] =
        new grower.ProviderChannel(
            this.regularUngenerous * 2.0,
            this.canonicalCompass * 2.0,
            warehousing[4],
            warehousing[3]);
    emitter[7] =
        new grower.GrowerTerminate(this.regularUngenerous, this.canonicalCompass, warehousing[4]);
    warehousing[0].laidFollowing(emitter[1]);
    warehousing[0].solidifyingElapsed(emitter[0]);
    warehousing[1].laidFollowing(emitter[2], emitter[3]);
    warehousing[1].solidifyingElapsed(emitter[1]);
    warehousing[2].laidFollowing(emitter[4]);
    warehousing[2].solidifyingElapsed(emitter[2], emitter[3]);
    warehousing[3].laidFollowing(emitter[5], emitter[6]);
    warehousing[3].solidifyingElapsed(emitter[4]);
    warehousing[4].laidFollowing(emitter[7]);
    warehousing[4].solidifyingElapsed(emitter[5], emitter[6]);
    this.festivalSpooler.incorporateTriathlon(
        new tape.ProductionFestival(
            said.BeginningHousekeeper.streamWeek(), ProductionFestival.FannyBegun, emitter[0]));
  }

  public synchronized double minutesCurb() {
    return this.monthRestricting;
  }

  public synchronized void resume() {
    Trainer.theReplication = this;

    while (said.BeginningHousekeeper.streamWeek() < this.monthRestricting
        && this.festivalSpooler.figure() > 0) {
      this.festivalSpooler.upcomingCarnival().phaseCommemoration();
    }
    this.mediaAgency();
  }

  private synchronized void mediaAgency() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.monthRestricting,
            said.BeginningHousekeeper.streamWeek(),
            this.regularUngenerous,
            this.canonicalCompass));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", safekeeping.Store.depositoryConstrain()));
    System.out.println(
        "ProducibleObject count: " + producesJewels.DepositionalObjet.prevailingTally());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (grower.Output spain : emitter) {
      System.out.println(spain.digit());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (safekeeping.Store fh : warehousing) {
      System.out.println(fh.stat());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
