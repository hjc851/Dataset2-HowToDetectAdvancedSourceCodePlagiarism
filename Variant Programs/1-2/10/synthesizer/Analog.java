package synthesizer;

import indiscernible.MinutesNurse;
import productObjective.StorableSubject;
import grower.*;
import garage.*;
import book.*;

public class Analog {
  private static synthesizer.Analog thisDramatization;

  public static synthesizer.Analog streamMock() {
    return thisDramatization;
  }

  private double periodsBound;
  private double standardizedImply;
  private double textbookPasture;
  private grower.Exporter output[];
  private garage.Storeroom archival[];
  private book.SymposiumSufferance commemorationBraid;

  public Analog(double clipLimitation, double canonicalSmall, double normativeDrift) {
    this.periodsBound = clipLimitation;
    this.standardizedImply = canonicalSmall;
    this.textbookPasture = normativeDrift;
    this.commemorationBraid = new book.SymposiumSufferance();
    this.output = new grower.Exporter[8];
    this.archival = new garage.Storeroom[5];
    archival[0] = new garage.Storeroom();
    archival[1] = new garage.Storeroom();
    archival[2] = new garage.Storeroom();
    archival[3] = new garage.Storeroom();
    archival[4] = new garage.Storeroom();
    output[0] =
        new grower.ExporterBeginning(this.standardizedImply, this.textbookPasture, archival[0]);
    output[1] =
        new grower.FilmmakerRadio(
            this.standardizedImply, this.textbookPasture, archival[1], archival[0]);
    output[2] =
        new grower.FilmmakerRadio(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, archival[2], archival[1]);
    output[3] =
        new grower.FilmmakerRadio(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, archival[2], archival[1]);
    output[4] =
        new grower.FilmmakerRadio(
            this.standardizedImply, this.textbookPasture, archival[3], archival[2]);
    output[5] =
        new grower.FilmmakerRadio(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, archival[4], archival[3]);
    output[6] =
        new grower.FilmmakerRadio(
            this.standardizedImply * 2.0, this.textbookPasture * 2.0, archival[4], archival[3]);
    output[7] = new grower.GrowersDone(this.standardizedImply, this.textbookPasture, archival[4]);
    archival[0].doEarly(output[1]);
    archival[0].markRecent(output[0]);
    archival[1].doEarly(output[2], output[3]);
    archival[1].markRecent(output[1]);
    archival[2].doEarly(output[4]);
    archival[2].markRecent(output[2], output[3]);
    archival[3].doEarly(output[5], output[6]);
    archival[3].markRecent(output[4]);
    archival[4].doEarly(output[7]);
    archival[4].markRecent(output[5], output[6]);
    this.commemorationBraid.infixTournament(
        new book.PublisherCarnival(
            indiscernible.MinutesNurse.underwayYear(), PublisherCarnival.BottomFirst, output[0]));
  }

  public double againRestricted() {
    return this.periodsBound;
  }

  public void first() {
    Analog.thisDramatization = this;

    while (indiscernible.MinutesNurse.underwayYear() < this.periodsBound
        && this.commemorationBraid.calculation() > 0) {
      this.commemorationBraid.afterSpectacle().workFestival();
    }
    this.paperSurveys();
  }

  private void paperSurveys() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            indiscernible.MinutesNurse.underwayYear(),
            this.standardizedImply,
            this.textbookPasture));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", garage.Storeroom.storeConfine()));
    System.out.println(
        "ProducibleObject count: " + productObjective.StorableSubject.circulatingReckon());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (grower.Exporter spain : output) {
      System.out.println(spain.digit());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (garage.Storeroom waffen : archival) {
      System.out.println(waffen.estimates());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
