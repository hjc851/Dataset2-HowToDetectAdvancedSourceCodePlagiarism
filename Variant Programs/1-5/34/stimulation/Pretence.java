package stimulation;

import ontogenetic.PeriodWarden;
import extractionTreasures.ImmiscibleDisagree;
import farm.*;
import safekeeping.*;
import ledger.*;
import static java.lang.String.format;

public class Pretence {
  private static final String synX2232String = " ----------------------------------------------- ";
  private static final String synX2231String = " ----------------------------------------------- ";
  private static final String synX2230String = "Average Count";
  private static final String synX2229String = "Average Time";
  private static final String synX2228String = "Storage ID";
  private static final String synX2227String = "| %-14s | %-12s | %-12s |";
  private static final String synX2226String = " ----------------------------------------------- ";
  private static final String synX2225String = "Storage";
  private static final String synX2224String =
      " ----------------------------------------------------- ";
  private static final String synX2223String =
      "|-----------------------------------------------------|";
  private static final String synX2222String = "Blocked";
  private static final String synX2221String = "Starving";
  private static final String synX2220String = "Production";
  private static final String synX2219String = "Producer ID";
  private static final String synX2218String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2217String =
      " ----------------------------------------------------- ";
  private static final String synX2216String = "Assemblers";
  private static final String synX2215String = "Statistics\n";
  private static final String synX2214String = "ProducibleObject count: ";
  private static final String synX2213String = "Storage Capacity: %d";
  private static final String synX2212String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX2211int = 0;
  public double againRestricted = 0.0;
  public Warehouses depot[] = null;

  public Pretence(double monthRestricting, double criterionalEquate, double classicalGrade) {
    this.againRestricted = monthRestricting;
    this.classicNormal = criterionalEquate;
    this.regularChain = classicalGrade;
    this.gatheringDipper = new CeremonyPenis();
    this.supplier = new Commodity[8];
    this.depot = new Warehouses[5];
    depot[0] = new Warehouses();
    depot[1] = new Warehouses();
    depot[2] = new Warehouses();
    depot[3] = new Warehouses();
    depot[4] = new Warehouses();
    supplier[0] = new GrowerDepart(this.classicNormal, this.regularChain, depot[0]);
    supplier[1] = new PresenterOutpost(this.classicNormal, this.regularChain, depot[1], depot[0]);
    supplier[2] =
        new PresenterOutpost(this.classicNormal * 2.0, this.regularChain * 2.0, depot[2], depot[1]);
    supplier[3] =
        new PresenterOutpost(this.classicNormal * 2.0, this.regularChain * 2.0, depot[2], depot[1]);
    supplier[4] = new PresenterOutpost(this.classicNormal, this.regularChain, depot[3], depot[2]);
    supplier[5] =
        new PresenterOutpost(this.classicNormal * 2.0, this.regularChain * 2.0, depot[4], depot[3]);
    supplier[6] =
        new PresenterOutpost(this.classicNormal * 2.0, this.regularChain * 2.0, depot[4], depot[3]);
    supplier[7] = new OperatorConclude(this.classicNormal, this.regularChain, depot[4]);
    depot[0].bentNew(supplier[1]);
    depot[0].bentOriginal(supplier[0]);
    depot[1].bentNew(supplier[2], supplier[3]);
    depot[1].bentOriginal(supplier[1]);
    depot[2].bentNew(supplier[4]);
    depot[2].bentOriginal(supplier[2], supplier[3]);
    depot[3].bentNew(supplier[5], supplier[6]);
    depot[3].bentOriginal(supplier[4]);
    depot[4].bentNew(supplier[7]);
    depot[4].bentOriginal(supplier[5], supplier[6]);
    this.gatheringDipper.embedCarnival(
        new FarmExposition(PeriodWarden.formerAmount(), FarmExposition.ButtDepart, supplier[0]));
  }

  public static synchronized Pretence theReplication() {
    return thisDramatization;
  }

  public Commodity supplier[] = null;
  public double regularChain = 0.0;
  public double classicNormal = 0.0;
  public CeremonyPenis gatheringDipper = null;
  public static Pretence thisDramatization = null;

  public synchronized double weekMinimum() {
    return this.againRestricted;
  }

  public synchronized void began() {
    Pretence.thisDramatization = this;

    while (PeriodWarden.formerAmount() < this.againRestricted
        && this.gatheringDipper.reckon() > synX2211int) synx136();
    this.fontFigure();
  }

  public synchronized void fontFigure() {
    System.out.println(
        format(
            synX2212String,
            this.againRestricted,
            PeriodWarden.formerAmount(),
            this.classicNormal,
            this.regularChain));
    System.out.println(format(synX2213String, Warehouses.garageRestricted()));
    System.out.println(synX2214String + ImmiscibleDisagree.streamCensus());
    System.out.println();
    System.out.println(synX2215String);
    System.out.println(synX2216String);
    System.out.println(synX2217String);
    System.out.println(
        format(synX2218String, synX2219String, synX2220String, synX2221String, synX2222String));
    System.out.println(synX2223String);
    for (Commodity equally : supplier) synx137(equally);
    System.out.println(synX2224String);
    System.out.println();
    System.out.println(synX2225String);
    System.out.println(synX2226String);
    System.out.println(format(synX2227String, synX2228String, synX2229String, synX2230String));
    System.out.println(synX2231String);
    for (Warehouses waffen : depot) synx138(waffen);
    System.out.println(synX2232String);
  }

  private synchronized void synx136() {
    this.gatheringDipper.afterSpectacle().marchCelebration();
  }

  private synchronized void synx137(Commodity equally) {
    System.out.println(equally.estimates());
  }

  private synchronized void synx138(Warehouses waffen) {
    System.out.println(waffen.census());
  }
}
