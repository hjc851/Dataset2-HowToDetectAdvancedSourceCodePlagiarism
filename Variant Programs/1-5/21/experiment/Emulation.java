package experiment;

import said.JunctureJailer;
import extractionTreasures.DepositionalObjet;
import presenter.*;
import garage.*;
import disc.*;
import static java.lang.String.format;

public class Emulation {
  private VenueList galaLine = null;
  private Produce vintner[] = null;

  public synchronized double periodsBound() {
    return this.weekMinimum;
  }

  public static synchronized Emulation underwaySimulates() {
    return typicalTrainer;
  }

  private double standardizedImply = 0.0;
  private static Emulation typicalTrainer = null;

  public synchronized void go() {
    Emulation.typicalTrainer = (this);

    while (JunctureJailer.streamWeek() < this.weekMinimum && this.galaLine.reckoning() > 0)
      synx101();
    this.publishFigures();
  }

  private double weekMinimum = 0.0;

  public Emulation(double hoursRestriction, double canonicalSmall, double acceptableReach) {
    this.weekMinimum = (hoursRestriction);
    this.standardizedImply = (canonicalSmall);
    this.canonicalCompass = (acceptableReach);
    this.galaLine = (new VenueList());
    this.vintner = (new Produce[8]);
    this.storeroom = (new Memory[5]);
    storeroom[0] = (new Memory());
    storeroom[1] = (new Memory());
    storeroom[2] = (new Memory());
    storeroom[3] = (new Memory());
    storeroom[4] = (new Memory());
    vintner[0] = (new SupplierFirst(this.standardizedImply, this.canonicalCompass, storeroom[0]));
    vintner[1] =
        (new FilmmakerRadio(
            this.standardizedImply, this.canonicalCompass, storeroom[1], storeroom[0]));
    vintner[2] =
        (new FilmmakerRadio(
            this.standardizedImply * 2.0, this.canonicalCompass * 2.0, storeroom[2], storeroom[1]));
    vintner[3] =
        (new FilmmakerRadio(
            this.standardizedImply * 2.0, this.canonicalCompass * 2.0, storeroom[2], storeroom[1]));
    vintner[4] =
        (new FilmmakerRadio(
            this.standardizedImply, this.canonicalCompass, storeroom[3], storeroom[2]));
    vintner[5] =
        (new FilmmakerRadio(
            this.standardizedImply * 2.0, this.canonicalCompass * 2.0, storeroom[4], storeroom[3]));
    vintner[6] =
        (new FilmmakerRadio(
            this.standardizedImply * 2.0, this.canonicalCompass * 2.0, storeroom[4], storeroom[3]));
    vintner[7] = (new FarmExit(this.standardizedImply, this.canonicalCompass, storeroom[4]));
    storeroom[0].rigidCome(vintner[1]);
    storeroom[0].situatedLatest(vintner[0]);
    storeroom[1].rigidCome(vintner[2], vintner[3]);
    storeroom[1].situatedLatest(vintner[1]);
    storeroom[2].rigidCome(vintner[4]);
    storeroom[2].situatedLatest(vintner[2], vintner[3]);
    storeroom[3].rigidCome(vintner[5], vintner[6]);
    storeroom[3].situatedLatest(vintner[4]);
    storeroom[4].rigidCome(vintner[7]);
    storeroom[4].situatedLatest(vintner[5], vintner[6]);
    this.galaLine.installCeremonies(
        new GrowersMeeting(
            JunctureJailer.streamWeek(), GrowersMeeting.HindquartersOpening, vintner[0]));
  }

  private synchronized void publishFigures() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.weekMinimum,
            JunctureJailer.streamWeek(),
            this.standardizedImply,
            this.canonicalCompass));
    System.out.println(format("Storage Capacity: %d", Memory.safekeepingCurb()));
    System.out.println("ProducibleObject count: " + DepositionalObjet.flowNumbers());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Produce arsenic : vintner) synx102(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Memory waffen : storeroom) synx103(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private Memory storeroom[] = null;
  private double canonicalCompass = 0.0;

  private synchronized void synx101() {
    this.galaLine.soonCommemoration().methodologySpectacle();
  }

  private synchronized void synx102(Produce arsenic) {
    System.out.println(arsenic.survey());
  }

  private synchronized void synx103(Memory waffen) {
    System.out.println(waffen.digits());
  }
}
