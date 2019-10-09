package synthesizer;

import looked.DaysHandler;
import manufactureOrnaments.EvaporiteDemur;
import publisher.*;
import closet.*;
import precedent.*;
import static java.lang.String.format;

public class Model {

  public synchronized void publishingStat() {
    int upstreamBorder;
    upstreamBorder = (772206299);
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearsCurtail,
            DaysHandler.presentlyMinutes(),
            this.standardizedImply,
            this.textbookPasture));
    System.out.println(format("Storage Capacity: %d", Archival.warehousingRestriction()));
    System.out.println("ProducibleObject count: " + EvaporiteDemur.rifeNumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Promoter spain : growers) synx80(spain);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Archival waffen : storeroom) synx81(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  public double textbookPasture = 0.0;

  public Model(double hourRestricts, double measureBeggarly, double acceptedRun) {
    this.yearsCurtail = (hourRestricts);
    this.standardizedImply = (measureBeggarly);
    this.textbookPasture = (acceptedRun);
    this.triathlonCue = (new ForumFile());
    this.growers = (new Promoter[8]);
    this.storeroom = (new Archival[5]);
    storeroom[0] = (new Archival());
    storeroom[1] = (new Archival());
    storeroom[2] = (new Archival());
    storeroom[3] = (new Archival());
    storeroom[4] = (new Archival());
    growers[0] =
        (new ManufacturerBegin(this.standardizedImply, this.textbookPasture, storeroom[0]));
    growers[1] =
        (new PresenterOutpost(
            this.standardizedImply, this.textbookPasture, storeroom[1], storeroom[0]));
    growers[2] =
        (new PresenterOutpost(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, storeroom[2], storeroom[1]));
    growers[3] =
        (new PresenterOutpost(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, storeroom[2], storeroom[1]));
    growers[4] =
        (new PresenterOutpost(
            this.standardizedImply, this.textbookPasture, storeroom[3], storeroom[2]));
    growers[5] =
        (new PresenterOutpost(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, storeroom[4], storeroom[3]));
    growers[6] =
        (new PresenterOutpost(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, storeroom[4], storeroom[3]));
    growers[7] =
        (new ManufacturersEnding(this.standardizedImply, this.textbookPasture, storeroom[4]));
    storeroom[0].bentNew(growers[1]);
    storeroom[0].determineInitial(growers[0]);
    storeroom[1].bentNew(growers[2], growers[3]);
    storeroom[1].determineInitial(growers[1]);
    storeroom[2].bentNew(growers[4]);
    storeroom[2].determineInitial(growers[2], growers[3]);
    storeroom[3].bentNew(growers[5], growers[6]);
    storeroom[3].determineInitial(growers[4]);
    storeroom[4].bentNew(growers[7]);
    storeroom[4].determineInitial(growers[5], growers[6]);
    this.triathlonCue.inscribingMeeting(
        new FilmmakerTournament(
            DaysHandler.presentlyMinutes(), FilmmakerTournament.GetCommence, growers[0]));
  }

  public ForumFile triathlonCue = null;
  public Archival storeroom[] = null;
  public double yearsCurtail = 0.0;
  public static Model newScenario = null;
  static String upstreamReduce = "r2Kbv9";
  public double standardizedImply = 0.0;

  public static synchronized Model flowEmulation() {
    int distinguish;
    distinguish = (-1026299798);
    return newScenario;
  }

  public Promoter growers[] = null;

  public synchronized void go() {
    double extent;
    extent = (0.47298061602205344);
    Model.newScenario = (this);

    while (DaysHandler.presentlyMinutes() < this.yearsCurtail && this.triathlonCue.tabulation() > 0)
      synx82();
    this.publishingStat();
  }

  public synchronized double monthRestricting() {
    double infernalMinimum;
    infernalMinimum = (0.321489660471454);
    return this.yearsCurtail;
  }

  private synchronized void synx80(Promoter spain) {
    System.out.println(spain.survey());
  }

  private synchronized void synx81(Archival waffen) {
    System.out.println(waffen.census());
  }

  private synchronized void synx82() {
    this.triathlonCue.firstParade().actGala();
  }
}
