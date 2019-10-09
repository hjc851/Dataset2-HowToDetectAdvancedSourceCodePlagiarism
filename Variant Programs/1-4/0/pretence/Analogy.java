package pretence;

import acculturative.MonthBabysitter;
import manufacturedBelongings.ExploitableArtifact;
import farm.*;
import disk.*;
import disc.*;

public class Analogy {
  public disc.CaseWaiting extravaganzaWait;
  public disk.Warehouse depot[];
  public farm.Manufacturer presenter[];
  public double stockRamble;
  public double definitiveSkilled;
  public double opportunityMaximum;
  public static pretence.Analogy theReplication;
  static double yummyArtifacts = 0.4691232001096999;

  public static synchronized pretence.Analogy formerAnalogue() {
    double identification;
    identification = 0.9649847470362273;
    return theReplication;
  }

  public Analogy(double minutesCurb, double canonicIgnoble, double prescriptiveBrowse) {
    this.opportunityMaximum = minutesCurb;
    this.definitiveSkilled = canonicIgnoble;
    this.stockRamble = prescriptiveBrowse;
    this.extravaganzaWait = new disc.CaseWaiting();
    this.presenter = new farm.Manufacturer[8];
    this.depot = new disk.Warehouse[5];
    depot[0] = new disk.Warehouse();
    depot[1] = new disk.Warehouse();
    depot[2] = new disk.Warehouse();
    depot[3] = new disk.Warehouse();
    depot[4] = new disk.Warehouse();
    presenter[0] = new farm.ProductionCommence(this.definitiveSkilled, this.stockRamble, depot[0]);
    presenter[1] =
        new farm.OutputTerminal(this.definitiveSkilled, this.stockRamble, depot[1], depot[0]);
    presenter[2] =
        new farm.OutputTerminal(
            this.definitiveSkilled * 2.0, this.stockRamble * 2.0, depot[2], depot[1]);
    presenter[3] =
        new farm.OutputTerminal(
            this.definitiveSkilled * 2.0, this.stockRamble * 2.0, depot[2], depot[1]);
    presenter[4] =
        new farm.OutputTerminal(this.definitiveSkilled, this.stockRamble, depot[3], depot[2]);
    presenter[5] =
        new farm.OutputTerminal(
            this.definitiveSkilled * 2.0, this.stockRamble * 2.0, depot[4], depot[3]);
    presenter[6] =
        new farm.OutputTerminal(
            this.definitiveSkilled * 2.0, this.stockRamble * 2.0, depot[4], depot[3]);
    presenter[7] = new farm.DirectorWrap(this.definitiveSkilled, this.stockRamble, depot[4]);
    depot[0].placeSoon(presenter[1]);
    depot[0].rigidPreliminary(presenter[0]);
    depot[1].placeSoon(presenter[2], presenter[3]);
    depot[1].rigidPreliminary(presenter[1]);
    depot[2].placeSoon(presenter[4]);
    depot[2].rigidPreliminary(presenter[2], presenter[3]);
    depot[3].placeSoon(presenter[5], presenter[6]);
    depot[3].rigidPreliminary(presenter[4]);
    depot[4].placeSoon(presenter[7]);
    depot[4].rigidPreliminary(presenter[5], presenter[6]);
    this.extravaganzaWait.deleteRace(
        new disc.ProductionFestival(
            acculturative.MonthBabysitter.thisThing(),
            ProductionFestival.BehindRestart,
            presenter[0]));
  }

  public synchronized double monthRestricting() {
    String numbersObjects;
    numbersObjects = "PW9";
    return this.opportunityMaximum;
  }

  public synchronized void begins() {
    double appraise;
    appraise = 0.7454507301736117;
    Analogy.theReplication = this;

    while (acculturative.MonthBabysitter.thisThing() < this.opportunityMaximum
        && this.extravaganzaWait.matter() > 0) synx3();
    this.newspaperSurvey();
  }

  public synchronized void newspaperSurvey() {
    String threshold;
    threshold = "Ox9N9CNgqlTiqjIzsg";
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.opportunityMaximum,
            acculturative.MonthBabysitter.thisThing(),
            this.definitiveSkilled,
            this.stockRamble));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", disk.Warehouse.cacheThrottle()));
    System.out.println(
        "ProducibleObject count: " + manufacturedBelongings.ExploitableArtifact.presentQuantify());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (farm.Manufacturer equally : presenter) synx4(equally);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (disk.Warehouse waffen : depot) synx5(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx3() {
    this.extravaganzaWait.aheadForum().mechanismSummit();
  }

  private synchronized void synx4(Manufacturer equally) {
    System.out.println(equally.stat());
  }

  private synchronized void synx5(Warehouse waffen) {
    System.out.println(waffen.agency());
  }
}
