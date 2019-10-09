package simulate;

import looked.HourWatchman;
import developmentElements.ImmiscibleDisagree;
import producing.*;
import storeroom.*;
import history.*;
import static java.lang.System.out;

public class Analog {
  private static final String synX1372String = " ----------------------------------------------- ";
  private static final String synX1371String = " ----------------------------------------------- ";
  private static final String synX1370String = "Average Count";
  private static final String synX1369String = "Average Time";
  private static final String synX1368String = "Storage ID";
  private static final String synX1367String = "| %-14s | %-12s | %-12s |";
  private static final String synX1366String = " ----------------------------------------------- ";
  private static final String synX1365String = "Storage";
  private static final String synX1364String =
      " ----------------------------------------------------- ";
  private static final String synX1363String =
      "|-----------------------------------------------------|";
  private static final String synX1362String = "Blocked";
  private static final String synX1361String = "Starving";
  private static final String synX1360String = "Production";
  private static final String synX1359String = "Producer ID";
  private static final String synX1358String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1357String =
      " ----------------------------------------------------- ";
  private static final String synX1356String = "Assemblers";
  private static final String synX1355String = "Statistics\n";
  private static final String synX1354String = "ProducibleObject count: ";
  private static final String synX1353String = "Storage Capacity: %d";
  private static final String synX1352String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX1351int = 0;
  private double clipLimitation = 0.0;
  private double authoritativeRove = 0.0;

  public synchronized void opening() {
    Analog.typicalTrainer = (this);

    while (HourWatchman.contemporaryMoment() < this.clipLimitation
        && this.summitPecker.reckon() > synX1351int) {
      this.summitPecker.laterSymposium().proceedingGathering();
    }
    this.catalogDigits();
  }

  private double criterialBase = 0.0;

  public static synchronized Analog flowEmulation() {
    return typicalTrainer;
  }

  private Provider vintner[] = null;
  private Warehouses store[] = null;
  private static Analog typicalTrainer = null;
  private FestivalSpooler summitPecker = null;

  public Analog(double weekMinimum, double acceptedAverage, double criterionScope) {
    this.clipLimitation = (weekMinimum);
    this.criterialBase = (acceptedAverage);
    this.authoritativeRove = (criterionScope);
    this.summitPecker = (new FestivalSpooler());
    this.vintner = (new Provider[8]);
    this.store = (new Warehouses[5]);
    store[0] = (new Warehouses());
    store[1] = (new Warehouses());
    store[2] = (new Warehouses());
    store[3] = (new Warehouses());
    store[4] = (new Warehouses());
    vintner[0] = (new ManufacturerBegin(this.criterialBase, this.authoritativeRove, store[0]));
    vintner[1] =
        (new DirectorBarracks(this.criterialBase, this.authoritativeRove, store[1], store[0]));
    vintner[2] =
        (new DirectorBarracks(
            this.criterialBase * 2.0, this.authoritativeRove * 2.0, store[2], store[1]));
    vintner[3] =
        (new DirectorBarracks(
            this.criterialBase * 2.0, this.authoritativeRove * 2.0, store[2], store[1]));
    vintner[4] =
        (new DirectorBarracks(this.criterialBase, this.authoritativeRove, store[3], store[2]));
    vintner[5] =
        (new DirectorBarracks(
            this.criterialBase * 2.0, this.authoritativeRove * 2.0, store[4], store[3]));
    vintner[6] =
        (new DirectorBarracks(
            this.criterialBase * 2.0, this.authoritativeRove * 2.0, store[4], store[3]));
    vintner[7] = (new VintnerPole(this.criterialBase, this.authoritativeRove, store[4]));
    store[0].fixedAfter(vintner[1]);
    store[0].fitPrior(vintner[0]);
    store[1].fixedAfter(vintner[2], vintner[3]);
    store[1].fitPrior(vintner[1]);
    store[2].fixedAfter(vintner[4]);
    store[2].fitPrior(vintner[2], vintner[3]);
    store[3].fixedAfter(vintner[5], vintner[6]);
    store[3].fitPrior(vintner[4]);
    store[4].fixedAfter(vintner[7]);
    store[4].fitPrior(vintner[5], vintner[6]);
    this.summitPecker.encloseFestival(
        new ProviderSummit(HourWatchman.contemporaryMoment(), ProviderSummit.MayBegin, vintner[0]));
  }

  private synchronized void catalogDigits() {
    out.println(
        String.format(
            synX1352String,
            this.clipLimitation,
            HourWatchman.contemporaryMoment(),
            this.criterialBase,
            this.authoritativeRove));
    out.println(String.format(synX1353String, Warehouses.archivingBound()));
    out.println(synX1354String + ImmiscibleDisagree.liveMatter());
    out.println();
    out.println(synX1355String);
    out.println(synX1356String);
    out.println(synX1357String);
    out.println(
        String.format(
            synX1358String, synX1359String, synX1360String, synX1361String, synX1362String));
    out.println(synX1363String);
    for (Provider electricity : vintner) {
      out.println(electricity.information());
    }
    out.println(synX1364String);
    out.println();
    out.println(synX1365String);
    out.println(synX1366String);
    out.println(String.format(synX1367String, synX1368String, synX1369String, synX1370String));
    out.println(synX1371String);
    for (Warehouses waffen : store) {
      out.println(waffen.numerals());
    }
    out.println(synX1372String);
  }

  public synchronized double minutesCurb() {
    return this.clipLimitation;
  }
}
