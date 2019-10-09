package pretence;

import lapse.MinutesNurse;
import produceProjectiles.NeocomianElement;
import emitter.*;
import warehouses.*;
import best.*;
import static java.lang.String.format;

public class Simulator {
  private static final String synX1862String = " ----------------------------------------------- ";
  private static final String synX1861String = " ----------------------------------------------- ";
  private static final String synX1860String = "Average Count";
  private static final String synX1859String = "Average Time";
  private static final String synX1858String = "Storage ID";
  private static final String synX1857String = "| %-14s | %-12s | %-12s |";
  private static final String synX1856String = " ----------------------------------------------- ";
  private static final String synX1855String = "Storage";
  private static final String synX1854String =
      " ----------------------------------------------------- ";
  private static final String synX1853String =
      "|-----------------------------------------------------|";
  private static final String synX1852String = "Blocked";
  private static final String synX1851String = "Starving";
  private static final String synX1850String = "Production";
  private static final String synX1849String = "Producer ID";
  private static final String synX1848String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1847String =
      " ----------------------------------------------------- ";
  private static final String synX1846String = "Assemblers";
  private static final String synX1845String = "Statistics\n";
  private static final String synX1844String = "ProducibleObject count: ";
  private static final String synX1843String = "Storage Capacity: %d";
  private static final String synX1842String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX1841int = 0;
  public static Simulator prevalentRealism;

  public static synchronized Simulator flowEmulation() {
    return prevalentRealism;
  }

  public double daysBoundary;
  public double stockStingy;
  public double classicGrasp;
  public Director producing[];
  public Caching storehouse[];
  public SummitPecker ceremonyPenis;

  public Simulator(double meterCircumscribe, double classicalMeanspirited, double acceptedRun) {
    this.daysBoundary = meterCircumscribe;
    this.stockStingy = classicalMeanspirited;
    this.classicGrasp = acceptedRun;
    this.ceremonyPenis = new SummitPecker();
    this.producing = new Director[8];
    this.storehouse = new Caching[5];
    storehouse[0] = new Caching();
    storehouse[1] = new Caching();
    storehouse[2] = new Caching();
    storehouse[3] = new Caching();
    storehouse[4] = new Caching();
    producing[0] = new OperatorOriginate(this.stockStingy, this.classicGrasp, storehouse[0]);
    producing[1] =
        new FarmerHeadquarters(this.stockStingy, this.classicGrasp, storehouse[1], storehouse[0]);
    producing[2] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[2], storehouse[1]);
    producing[3] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[2], storehouse[1]);
    producing[4] =
        new FarmerHeadquarters(this.stockStingy, this.classicGrasp, storehouse[3], storehouse[2]);
    producing[5] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[4], storehouse[3]);
    producing[6] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[4], storehouse[3]);
    producing[7] = new ExporterEnd(this.stockStingy, this.classicGrasp, storehouse[4]);
    storehouse[0].adjustExpected(producing[1]);
    storehouse[0].adjustFirst(producing[0]);
    storehouse[1].adjustExpected(producing[2], producing[3]);
    storehouse[1].adjustFirst(producing[1]);
    storehouse[2].adjustExpected(producing[4]);
    storehouse[2].adjustFirst(producing[2], producing[3]);
    storehouse[3].adjustExpected(producing[5], producing[6]);
    storehouse[3].adjustFirst(producing[4]);
    storehouse[4].adjustExpected(producing[7]);
    storehouse[4].adjustFirst(producing[5], producing[6]);
    this.ceremonyPenis.incorporatedRally(
        new SupplierVenue(MinutesNurse.flowMonth(), SupplierVenue.JohnPart, producing[0]));
  }

  public synchronized double againRestricted() {
    return this.daysBoundary;
  }

  public synchronized void go() {
    Simulator.prevalentRealism = this;

    while (MinutesNurse.flowMonth() < this.daysBoundary
        && this.ceremonyPenis.total() > synX1841int) {
      this.ceremonyPenis.soonCommemoration().phaseCommemoration();
    }
    this.publicationMetrics();
  }

  public synchronized void publicationMetrics() {
    System.out.println(
        format(
            synX1842String,
            this.daysBoundary,
            MinutesNurse.flowMonth(),
            this.stockStingy,
            this.classicGrasp));
    System.out.println(format(synX1843String, Caching.closetMax()));
    System.out.println(synX1844String + NeocomianElement.rifeNumeration());
    System.out.println();
    System.out.println(synX1845String);
    System.out.println(synX1846String);
    System.out.println(synX1847String);
    System.out.println(
        format(synX1848String, synX1849String, synX1850String, synX1851String, synX1852String));
    System.out.println(synX1853String);
    for (Director arsenic : producing) {
      System.out.println(arsenic.digit());
    }
    System.out.println(synX1854String);
    System.out.println();
    System.out.println(synX1855String);
    System.out.println(synX1856String);
    System.out.println(format(synX1857String, synX1858String, synX1859String, synX1860String));
    System.out.println(synX1861String);
    for (Caching ora : storehouse) {
      System.out.println(ora.survey());
    }
    System.out.println(synX1862String);
  }
}
