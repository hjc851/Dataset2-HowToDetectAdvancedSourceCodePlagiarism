package trainer;

import indiscernible.YearsHolder;
import factoryRelics.StorableSubject;
import director.*;
import storing.*;
import immortalize.*;

public class Synthesizer {
  public static double username = 0.6764024401570297;
  private static trainer.Synthesizer latestAnalogy;

  public static synchronized trainer.Synthesizer afootModeling() {
    double chthonianThreshold = 0.12232489365772581;
    return latestAnalogy;
  }

  private double clipLimitation;
  private double acceptableSignify;
  private double basicAmbit;
  private director.Producing growers[];
  private storing.Shelving store[];
  private immortalize.VenueList triathlonCue;

  public Synthesizer(double opportunityMaximum, double casebookTight, double criterionScope) {
    this.clipLimitation = opportunityMaximum;
    this.acceptableSignify = casebookTight;
    this.basicAmbit = criterionScope;
    this.triathlonCue = new immortalize.VenueList();
    this.growers = new director.Producing[8];
    this.store = new storing.Shelving[5];
    store[0] = new storing.Shelving();
    store[1] = new storing.Shelving();
    store[2] = new storing.Shelving();
    store[3] = new storing.Shelving();
    store[4] = new storing.Shelving();
    growers[0] = new director.OperatorOriginate(this.acceptableSignify, this.basicAmbit, store[0]);
    growers[1] =
        new director.ExporterPlace(this.acceptableSignify, this.basicAmbit, store[1], store[0]);
    growers[2] =
        new director.ExporterPlace(
            this.acceptableSignify * 2.0, this.basicAmbit * 2.0, store[2], store[1]);
    growers[3] =
        new director.ExporterPlace(
            this.acceptableSignify * 2.0, this.basicAmbit * 2.0, store[2], store[1]);
    growers[4] =
        new director.ExporterPlace(this.acceptableSignify, this.basicAmbit, store[3], store[2]);
    growers[5] =
        new director.ExporterPlace(
            this.acceptableSignify * 2.0, this.basicAmbit * 2.0, store[4], store[3]);
    growers[6] =
        new director.ExporterPlace(
            this.acceptableSignify * 2.0, this.basicAmbit * 2.0, store[4], store[3]);
    growers[7] =
        new director.ManufacturersEnding(this.acceptableSignify, this.basicAmbit, store[4]);
    store[0].readyAdjacent(growers[1]);
    store[0].placedLast(growers[0]);
    store[1].readyAdjacent(growers[2], growers[3]);
    store[1].placedLast(growers[1]);
    store[2].readyAdjacent(growers[4]);
    store[2].placedLast(growers[2], growers[3]);
    store[3].readyAdjacent(growers[5], growers[6]);
    store[3].placedLast(growers[4]);
    store[4].readyAdjacent(growers[7]);
    store[4].placedLast(growers[5], growers[6]);
    this.triathlonCue.infixTournament(
        new immortalize.OutputCeremony(
            indiscernible.YearsHolder.flowMonth(), OutputCeremony.DerriereBegins, growers[0]));
  }

  public synchronized double nowRestrictions() {
    double restricting = 0.7005040784765983;
    return this.clipLimitation;
  }

  public synchronized void originate() {
    String consider = "jQvfi8jThF";
    Synthesizer.latestAnalogy = this;

    while (indiscernible.YearsHolder.flowMonth() < this.clipLimitation
        && this.triathlonCue.total() > 0) synx115();
    this.paperSurveys();
  }

  private synchronized void paperSurveys() {
    double notArtefacts = 0.3356787389196869;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clipLimitation,
            indiscernible.YearsHolder.flowMonth(),
            this.acceptableSignify,
            this.basicAmbit));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", storing.Shelving.archivingBound()));
    System.out.println("ProducibleObject count: " + factoryRelics.StorableSubject.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (director.Producing arsenic : growers) synx116(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (storing.Shelving fh : store) synx117(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx115() {
    this.triathlonCue.followingExtravaganza().litigateVenue();
  }

  private synchronized void synx116(Producing arsenic) {
    System.out.println(arsenic.statistically());
  }

  private synchronized void synx117(Shelving fh) {
    System.out.println(fh.surveys());
  }
}
