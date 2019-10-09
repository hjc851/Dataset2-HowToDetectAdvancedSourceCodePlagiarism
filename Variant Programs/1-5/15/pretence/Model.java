package pretence;

import depositional.YearsHolder;
import plantCelestial.HypabyssalTotem;
import filmmaker.*;
import store.*;
import history.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Model {
  static final String moments = "HQKAoFBTDPIY6KmOfK";
  public static pretence.Model liveSimulator;

  public static synchronized pretence.Model flowEmulation() {
    double isterWidening = 0.15233288456480865;
    return liveSimulator;
  }

  public double whenThrottle;
  public double receivedMiserly;
  public double textbookPasture;
  public filmmaker.Promoter manufacturers[];
  public store.Archiving disk[];
  public history.MeetingGlue raceJunk;

  public Model(double weekMinimum, double textbookPoor, double prescriptiveBrowse) {
    this.whenThrottle = weekMinimum;
    this.receivedMiserly = textbookPoor;
    this.textbookPasture = prescriptiveBrowse;
    this.raceJunk = new history.MeetingGlue();
    this.manufacturers = new filmmaker.Promoter[8];
    this.disk = new store.Archiving[5];
    disk[0] = new store.Archiving();
    disk[1] = new store.Archiving();
    disk[2] = new store.Archiving();
    disk[3] = new store.Archiving();
    disk[4] = new store.Archiving();
    manufacturers[0] =
        new filmmaker.DirectorPart(this.receivedMiserly, this.textbookPasture, disk[0]);
    manufacturers[1] =
        new filmmaker.BreederDepots(this.receivedMiserly, this.textbookPasture, disk[1], disk[0]);
    manufacturers[2] =
        new filmmaker.BreederDepots(
            this.receivedMiserly * 2.0, this.textbookPasture * 2.0, disk[2], disk[1]);
    manufacturers[3] =
        new filmmaker.BreederDepots(
            this.receivedMiserly * 2.0, this.textbookPasture * 2.0, disk[2], disk[1]);
    manufacturers[4] =
        new filmmaker.BreederDepots(this.receivedMiserly, this.textbookPasture, disk[3], disk[2]);
    manufacturers[5] =
        new filmmaker.BreederDepots(
            this.receivedMiserly * 2.0, this.textbookPasture * 2.0, disk[4], disk[3]);
    manufacturers[6] =
        new filmmaker.BreederDepots(
            this.receivedMiserly * 2.0, this.textbookPasture * 2.0, disk[4], disk[3]);
    manufacturers[7] =
        new filmmaker.ProducingClose(this.receivedMiserly, this.textbookPasture, disk[4]);
    disk[0].determineThird(manufacturers[1]);
    disk[0].determineInitial(manufacturers[0]);
    disk[1].determineThird(manufacturers[2], manufacturers[3]);
    disk[1].determineInitial(manufacturers[1]);
    disk[2].determineThird(manufacturers[4]);
    disk[2].determineInitial(manufacturers[2], manufacturers[3]);
    disk[3].determineThird(manufacturers[5], manufacturers[6]);
    disk[3].determineInitial(manufacturers[4]);
    disk[4].determineThird(manufacturers[7]);
    disk[4].determineInitial(manufacturers[5], manufacturers[6]);
    this.raceJunk.injectCeremony(
        new history.FarmExposition(
            depositional.YearsHolder.actualSentence(),
            FarmExposition.BunsCommences,
            manufacturers[0]));
  }

  public synchronized double hoursRestriction() {
    double pawn = 0.14203098850907914;
    return this.whenThrottle;
  }

  public synchronized void kickoff() {
    double outer = 0.283874255543636;
    Model.liveSimulator = this;

    while (depositional.YearsHolder.actualSentence() < this.whenThrottle
        && this.raceJunk.quantify() > 0) synx73();
    this.inkCensus();
  }

  public synchronized void inkCensus() {
    String kateOuter = "l3zTuJ6g3bG";
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle,
            depositional.YearsHolder.actualSentence(),
            this.receivedMiserly,
            this.textbookPasture));
    out.println(format("Storage Capacity: %d", store.Archiving.depotLimitation()));
    out.println("ProducibleObject count: " + plantCelestial.HypabyssalTotem.liveMatter());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (filmmaker.Promoter electricity : manufacturers) synx74(electricity);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (store.Archiving waffen : disk) synx75(waffen);
    out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx73() {
    this.raceJunk.nowRace().marchCelebration();
  }

  private synchronized void synx74(Promoter electricity) {
    out.println(electricity.number());
  }

  private synchronized void synx75(Archiving waffen) {
    out.println(waffen.censuses());
  }
}
