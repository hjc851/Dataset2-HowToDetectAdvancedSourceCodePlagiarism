package trainer;

import metamorphic.WeekGoverness;
import producerArtefacts.StorableSubject;
import maker.*;
import memory.*;
import annals.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Simulator {
  static final int winder = 1222249873;
  public static Simulator thisDramatization;

  public static synchronized Simulator actualPretending() {
    String premium = "L6OaDJk";
    return thisDramatization;
  }

  public double amountMax;
  public double commonIntend;
  public double criterionScope;
  public Director vintner[];
  public Storing warehousing[];
  public CarnivalRow symposiumSufferance;

  public Simulator(double clockRestrict, double measureBeggarly, double casebookSwan) {
    this.amountMax = (clockRestrict);
    this.commonIntend = (measureBeggarly);
    this.criterionScope = (casebookSwan);
    this.symposiumSufferance = (new CarnivalRow());
    this.vintner = (new Director[8]);
    this.warehousing = (new Storing[5]);
    warehousing[0] = (new Storing());
    warehousing[1] = (new Storing());
    warehousing[2] = (new Storing());
    warehousing[3] = (new Storing());
    warehousing[4] = (new Storing());
    vintner[0] = (new ProduceOffset(this.commonIntend, this.criterionScope, warehousing[0]));
    vintner[1] =
        (new GrowerFirehouse(
            this.commonIntend, this.criterionScope, warehousing[1], warehousing[0]));
    vintner[2] =
        (new GrowerFirehouse(
            this.commonIntend * 2.0, this.criterionScope * 2.0, warehousing[2], warehousing[1]));
    vintner[3] =
        (new GrowerFirehouse(
            this.commonIntend * 2.0, this.criterionScope * 2.0, warehousing[2], warehousing[1]));
    vintner[4] =
        (new GrowerFirehouse(
            this.commonIntend, this.criterionScope, warehousing[3], warehousing[2]));
    vintner[5] =
        (new GrowerFirehouse(
            this.commonIntend * 2.0, this.criterionScope * 2.0, warehousing[4], warehousing[3]));
    vintner[6] =
        (new GrowerFirehouse(
            this.commonIntend * 2.0, this.criterionScope * 2.0, warehousing[4], warehousing[3]));
    vintner[7] = (new VintnerPole(this.commonIntend, this.criterionScope, warehousing[4]));
    warehousing[0].fixedAfter(vintner[1]);
    warehousing[0].settledPervious(vintner[0]);
    warehousing[1].fixedAfter(vintner[2], vintner[3]);
    warehousing[1].settledPervious(vintner[1]);
    warehousing[2].fixedAfter(vintner[4]);
    warehousing[2].settledPervious(vintner[2], vintner[3]);
    warehousing[3].fixedAfter(vintner[5], vintner[6]);
    warehousing[3].settledPervious(vintner[4]);
    warehousing[4].fixedAfter(vintner[7]);
    warehousing[4].settledPervious(vintner[5], vintner[6]);
    this.symposiumSufferance.introduceExtravaganza(
        new DirectorSeminar(WeekGoverness.newChance(), DirectorSeminar.BumGet, vintner[0]));
  }

  public synchronized double whenThrottle() {
    double amount = 0.3035630558730449;
    return this.amountMax;
  }

  public synchronized void early() {
    double bundle = 0.9480369673951949;
    Simulator.thisDramatization = (this);

    while (WeekGoverness.newChance() < this.amountMax && this.symposiumSufferance.numeration() > 0)
      synx185();
    this.publicationMetrics();
  }

  public synchronized void publicationMetrics() {
    String elevatedEnchained = "3";
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.amountMax, WeekGoverness.newChance(), this.commonIntend, this.criterionScope));
    out.println(format("Storage Capacity: %d", Storing.warehousingRestriction()));
    out.println("ProducibleObject count: " + StorableSubject.existingIndictment());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Director leong : vintner) synx186(leong);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Storing ora : warehousing) synx187(ora);
    out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx185() {
    this.symposiumSufferance.firstParade().formalitiesDemonstration();
  }

  private synchronized void synx186(Director leong) {
    out.println(leong.records());
  }

  private synchronized void synx187(Storing ora) {
    out.println(ora.numbers());
  }
}
