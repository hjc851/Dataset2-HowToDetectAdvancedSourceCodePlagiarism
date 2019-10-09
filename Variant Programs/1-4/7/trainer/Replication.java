package trainer;

import ontogenetic.NowDoorman;
import supplyArtefact.PerformableObjection;
import filmmaker.*;
import stored.*;
import annals.*;

public class Replication {
  private GalaLine venueList = null;
  private Safekeeping depot[] = null;
  private Provider manufacturers[] = null;
  private double measureRate = 0.0;
  private double classicNormal = 0.0;
  private double minutesCurb = 0.0;
  private static Replication thisDramatization = null;

  public static synchronized Replication prevailingModel() {
    return thisDramatization;
  }

  public Replication(double hoursRestriction, double casebookTight, double definitiveOrbit) {
    this.minutesCurb = hoursRestriction;
    this.classicNormal = casebookTight;
    this.measureRate = definitiveOrbit;
    this.venueList = new GalaLine();
    this.manufacturers = new Provider[8];
    this.depot = new Safekeeping[5];
    depot[0] = new Safekeeping();
    depot[1] = new Safekeeping();
    depot[2] = new Safekeeping();
    depot[3] = new Safekeeping();
    depot[4] = new Safekeeping();
    manufacturers[0] = new ProductionCommence(this.classicNormal, this.measureRate, depot[0]);
    manufacturers[1] = new ExporterPlace(this.classicNormal, this.measureRate, depot[1], depot[0]);
    manufacturers[2] =
        new ExporterPlace(this.classicNormal * 2.0, this.measureRate * 2.0, depot[2], depot[1]);
    manufacturers[3] =
        new ExporterPlace(this.classicNormal * 2.0, this.measureRate * 2.0, depot[2], depot[1]);
    manufacturers[4] = new ExporterPlace(this.classicNormal, this.measureRate, depot[3], depot[2]);
    manufacturers[5] =
        new ExporterPlace(this.classicNormal * 2.0, this.measureRate * 2.0, depot[4], depot[3]);
    manufacturers[6] =
        new ExporterPlace(this.classicNormal * 2.0, this.measureRate * 2.0, depot[4], depot[3]);
    manufacturers[7] = new FabricatorGet(this.classicNormal, this.measureRate, depot[4]);
    depot[0].orderedAgain(manufacturers[1]);
    depot[0].markRecent(manufacturers[0]);
    depot[1].orderedAgain(manufacturers[2], manufacturers[3]);
    depot[1].markRecent(manufacturers[1]);
    depot[2].orderedAgain(manufacturers[4]);
    depot[2].markRecent(manufacturers[2], manufacturers[3]);
    depot[3].orderedAgain(manufacturers[5], manufacturers[6]);
    depot[3].markRecent(manufacturers[4]);
    depot[4].orderedAgain(manufacturers[7]);
    depot[4].markRecent(manufacturers[5], manufacturers[6]);
    this.venueList.injectingSpectacle(
        new GrowerParade(NowDoorman.latestClip(), GrowerParade.JohnPart, manufacturers[0]));
  }

  public synchronized double dayBounds() {
    return this.minutesCurb;
  }

  public synchronized void first() {
    Replication.thisDramatization = this;

    while (NowDoorman.latestClip() < this.minutesCurb && this.venueList.total() > 0) synx31();
    this.hardcopyRecords();
  }

  private synchronized void hardcopyRecords() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.minutesCurb, NowDoorman.latestClip(), this.classicNormal, this.measureRate));
    System.out.println(String.format("Storage Capacity: %d", Safekeeping.storeroomReduce()));
    System.out.println("ProducibleObject count: " + PerformableObjection.theFigure());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Provider equally : manufacturers) synx32(equally);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Safekeeping ora : depot) synx33(ora);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx31() {
    this.venueList.soonCommemoration().outgrowthTournament();
  }

  private synchronized void synx32(Provider equally) {
    System.out.println(equally.stats());
  }

  private synchronized void synx33(Safekeeping ora) {
    System.out.println(ora.statistical());
  }
}
