package dramatization;

import looked.DayCaretaker;
import filmingExhibits.SpodumeneThing;
import provider.*;
import space.*;
import history.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Analogy {
  public space.Caching safekeeping[] = null;
  public double nowRestrictions = 0.0;

  public synchronized void outset() {
    Analogy.incumbentPretense = this;

    while (looked.DayCaretaker.topicalPeriod() < this.nowRestrictions
        && this.gatheringDipper.tabulation() > 0) synx17();
    this.fontFigure();
  }

  public Analogy(double meterCircumscribe, double prescriptiveMingy, double definitiveOrbit) {
    this.nowRestrictions = meterCircumscribe;
    this.authoritativeHateful = prescriptiveMingy;
    this.casebookSwan = definitiveOrbit;
    this.gatheringDipper = new history.ParadeConvoy();
    this.presenter = new provider.Grower[8];
    this.safekeeping = new space.Caching[5];
    safekeeping[0] = new space.Caching();
    safekeeping[1] = new space.Caching();
    safekeeping[2] = new space.Caching();
    safekeeping[3] = new space.Caching();
    safekeeping[4] = new space.Caching();
    presenter[0] =
        new provider.ManufacturerBegin(
            this.authoritativeHateful, this.casebookSwan, safekeeping[0]);
    presenter[1] =
        new provider.FarmerHeadquarters(
            this.authoritativeHateful, this.casebookSwan, safekeeping[1], safekeeping[0]);
    presenter[2] =
        new provider.FarmerHeadquarters(
            this.authoritativeHateful * 2.0,
            this.casebookSwan * 2.0,
            safekeeping[2],
            safekeeping[1]);
    presenter[3] =
        new provider.FarmerHeadquarters(
            this.authoritativeHateful * 2.0,
            this.casebookSwan * 2.0,
            safekeeping[2],
            safekeeping[1]);
    presenter[4] =
        new provider.FarmerHeadquarters(
            this.authoritativeHateful, this.casebookSwan, safekeeping[3], safekeeping[2]);
    presenter[5] =
        new provider.FarmerHeadquarters(
            this.authoritativeHateful * 2.0,
            this.casebookSwan * 2.0,
            safekeeping[4],
            safekeeping[3]);
    presenter[6] =
        new provider.FarmerHeadquarters(
            this.authoritativeHateful * 2.0,
            this.casebookSwan * 2.0,
            safekeeping[4],
            safekeeping[3]);
    presenter[7] =
        new provider.OperatorConclude(this.authoritativeHateful, this.casebookSwan, safekeeping[4]);
    safekeeping[0].orderedAgain(presenter[1]);
    safekeeping[0].primedEarlier(presenter[0]);
    safekeeping[1].orderedAgain(presenter[2], presenter[3]);
    safekeeping[1].primedEarlier(presenter[1]);
    safekeeping[2].orderedAgain(presenter[4]);
    safekeeping[2].primedEarlier(presenter[2], presenter[3]);
    safekeeping[3].orderedAgain(presenter[5], presenter[6]);
    safekeeping[3].primedEarlier(presenter[4]);
    safekeeping[4].orderedAgain(presenter[7]);
    safekeeping[4].primedEarlier(presenter[5], presenter[6]);
    this.gatheringDipper.injectCeremony(
        new history.OperatorContest(
            looked.DayCaretaker.topicalPeriod(), OperatorContest.JohnPart, presenter[0]));
  }

  public synchronized double periodTrammel() {
    return this.nowRestrictions;
  }

  public static dramatization.Analogy incumbentPretense = null;

  public static synchronized dramatization.Analogy prevailingModel() {
    return incumbentPretense;
  }

  public double authoritativeHateful = 0.0;
  public history.ParadeConvoy gatheringDipper = null;
  public double casebookSwan = 0.0;
  public provider.Grower presenter[] = null;

  public synchronized void fontFigure() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.nowRestrictions,
            looked.DayCaretaker.topicalPeriod(),
            this.authoritativeHateful,
            this.casebookSwan));
    out.println(format("Storage Capacity: %d", space.Caching.closetMax()));
    out.println("ProducibleObject count: " + filmingExhibits.SpodumeneThing.existingIndictment());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (provider.Grower equally : presenter) synx18(equally);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (space.Caching waffen : safekeeping) synx19(waffen);
    out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx17() {
    this.gatheringDipper.thirdCeremonies().mechanismSummit();
  }

  private synchronized void synx18(Grower equally) {
    out.println(equally.census());
  }

  private synchronized void synx19(Caching waffen) {
    out.println(waffen.digits());
  }
}
