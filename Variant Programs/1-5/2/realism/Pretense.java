package realism;

import euphonious.SentenceGoalie;
import productivityDevices.PannonianMatter;
import produce.*;
import safekeeping.*;
import ledger.*;
import static java.lang.System.out;

public class Pretense {
  private static final String synX306String = " ----------------------------------------------- ";
  private static final String synX305String = " ----------------------------------------------- ";
  private static final String synX304String = "Average Count";
  private static final String synX303String = "Average Time";
  private static final String synX302String = "Storage ID";
  private static final String synX301String = "| %-14s | %-12s | %-12s |";
  private static final String synX300String = " ----------------------------------------------- ";
  private static final String synX299String = "Storage";
  private static final String synX298String =
      " ----------------------------------------------------- ";
  private static final String synX297String =
      "|-----------------------------------------------------|";
  private static final String synX296String = "Blocked";
  private static final String synX295String = "Starving";
  private static final String synX294String = "Production";
  private static final String synX293String = "Producer ID";
  private static final String synX292String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX291String =
      " ----------------------------------------------------- ";
  private static final String synX290String = "Assemblers";
  private static final String synX289String = "Statistics\n";
  private static final String synX288String = "ProducibleObject count: ";
  private static final String synX287String = "Storage Capacity: %d";
  private static final String synX286String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final double synX285double = 0.7012741199514169;
  private static final int synX284int = 0;
  private static final int synX283int = -606183363;
  private static final double synX282double = 0.7626585252108743;
  private static final int synX281int = -169401857;
  public static String inferiorCircumscribe = "Pv1dW";
  private static realism.Pretense thisDramatization = null;

  public static synchronized realism.Pretense ongoingPretence() {
    int nung = synX281int;
    return thisDramatization;
  }

  private double hoursRestriction = 0.0;
  private double canonicIgnoble = 0.0;
  private double stockRamble = 0.0;
  private produce.Presenter commodity[] = null;
  private safekeeping.Space storehouse[] = null;
  private ledger.RallyDong carnivalRow = null;

  public Pretense(double yearDemarcation, double criterionEntail, double criterionScope) {
    this.hoursRestriction = (yearDemarcation);
    this.canonicIgnoble = (criterionEntail);
    this.stockRamble = (criterionScope);
    this.carnivalRow = (new ledger.RallyDong());
    this.commodity = (new produce.Presenter[8]);
    this.storehouse = (new safekeeping.Space[5]);
    storehouse[0] = (new safekeeping.Space());
    storehouse[1] = (new safekeeping.Space());
    storehouse[2] = (new safekeeping.Space());
    storehouse[3] = (new safekeeping.Space());
    storehouse[4] = (new safekeeping.Space());
    commodity[0] =
        (new produce.CommodityBegan(this.canonicIgnoble, this.stockRamble, storehouse[0]));
    commodity[1] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble, this.stockRamble, storehouse[1], storehouse[0]));
    commodity[2] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[2], storehouse[1]));
    commodity[3] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[2], storehouse[1]));
    commodity[4] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble, this.stockRamble, storehouse[3], storehouse[2]));
    commodity[5] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[4], storehouse[3]));
    commodity[6] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[4], storehouse[3]));
    commodity[7] = (new produce.BreederEnds(this.canonicIgnoble, this.stockRamble, storehouse[4]));
    storehouse[0].settledFirst(commodity[1]);
    storehouse[0].placeSuccessive(commodity[0]);
    storehouse[1].settledFirst(commodity[2], commodity[3]);
    storehouse[1].placeSuccessive(commodity[1]);
    storehouse[2].settledFirst(commodity[4]);
    storehouse[2].placeSuccessive(commodity[2], commodity[3]);
    storehouse[3].settledFirst(commodity[5], commodity[6]);
    storehouse[3].placeSuccessive(commodity[4]);
    storehouse[4].settledFirst(commodity[7]);
    storehouse[4].placeSuccessive(commodity[5], commodity[6]);
    this.carnivalRow.embeddedExposition(
        new ledger.DirectorSeminar(
            euphonious.SentenceGoalie.contemporaryMoment(),
            DirectorSeminar.PotOutset,
            commodity[0]));
  }

  public synchronized double periodsBound() {
    double relevance = synX282double;
    return this.hoursRestriction;
  }

  public synchronized void commence() {
    int pinioned = synX283int;
    Pretense.thisDramatization = (this);

    while (euphonious.SentenceGoalie.contemporaryMoment() < this.hoursRestriction
        && this.carnivalRow.census() > synX284int) {
      this.carnivalRow.forthcomingSummit().negotiationsCeremonies();
    }
    this.paperSurveys();
  }

  private synchronized void paperSurveys() {
    double minh = synX285double;
    out.println(
        java.lang.String.format(
            synX286String,
            this.hoursRestriction,
            euphonious.SentenceGoalie.contemporaryMoment(),
            this.canonicIgnoble,
            this.stockRamble));
    out.println(java.lang.String.format(synX287String, safekeeping.Space.memoryCircumscribe()));
    out.println(synX288String + productivityDevices.PannonianMatter.formerRecount());
    out.println();
    out.println(synX289String);
    out.println(synX290String);
    out.println(synX291String);
    out.println(
        java.lang.String.format(
            synX292String, synX293String, synX294String, synX295String, synX296String));
    out.println(synX297String);
    for (produce.Presenter leong : commodity) {
      out.println(leong.rda());
    }
    out.println(synX298String);
    out.println();
    out.println(synX299String);
    out.println(synX300String);
    out.println(
        java.lang.String.format(synX301String, synX302String, synX303String, synX304String));
    out.println(synX305String);
    for (safekeeping.Space fh : storehouse) {
      out.println(fh.statisticians());
    }
    out.println(synX306String);
  }
}
