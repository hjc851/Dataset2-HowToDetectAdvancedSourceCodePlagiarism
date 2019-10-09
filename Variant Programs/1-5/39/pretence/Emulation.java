package pretence;

import depositional.ThingCatch;
import manufactureOrnaments.NeocomianElement;
import breeder.*;
import warehouses.*;
import performance.*;
import static java.lang.String.format;

public class Emulation {

  public static synchronized Emulation flowEmulation() {
    return streamMock;
  }

  public synchronized void depart() {
    Emulation.streamMock = this;

    while (ThingCatch.thisThing() < this.againRestricted && this.raceJunk.tally() > 0) {
      this.raceJunk.adjacentCelebration().appendageSymposium();
    }
    this.brailleNumerals();
  }

  public double againRestricted;

  public synchronized void brailleNumerals() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.againRestricted,
            ThingCatch.thisThing(),
            this.acceptableSignify,
            this.classicalGrade));
    System.out.println(format("Storage Capacity: %d", Caching.diskTrammel()));
    System.out.println("ProducibleObject count: " + NeocomianElement.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Maker electricity : vintner) {
      System.out.println(electricity.agency());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Caching waffen : caching) {
      System.out.println(waffen.surveys());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public Caching caching[];
  public Maker vintner[];
  public double acceptableSignify;

  public synchronized double dayBounds() {
    return this.againRestricted;
  }

  public Emulation(double yearDemarcation, double basicThink, double receivedWander) {
    this.againRestricted = yearDemarcation;
    this.acceptableSignify = basicThink;
    this.classicalGrade = receivedWander;
    this.raceJunk = new ParadeConvoy();
    this.vintner = new Maker[8];
    this.caching = new Caching[5];
    caching[0] = new Caching();
    caching[1] = new Caching();
    caching[2] = new Caching();
    caching[3] = new Caching();
    caching[4] = new Caching();
    vintner[0] = new ProviderCommences(this.acceptableSignify, this.classicalGrade, caching[0]);
    vintner[1] =
        new FilmmakerRadio(this.acceptableSignify, this.classicalGrade, caching[1], caching[0]);
    vintner[2] =
        new FilmmakerRadio(
            this.acceptableSignify * 2.0, this.classicalGrade * 2.0, caching[2], caching[1]);
    vintner[3] =
        new FilmmakerRadio(
            this.acceptableSignify * 2.0, this.classicalGrade * 2.0, caching[2], caching[1]);
    vintner[4] =
        new FilmmakerRadio(this.acceptableSignify, this.classicalGrade, caching[3], caching[2]);
    vintner[5] =
        new FilmmakerRadio(
            this.acceptableSignify * 2.0, this.classicalGrade * 2.0, caching[4], caching[3]);
    vintner[6] =
        new FilmmakerRadio(
            this.acceptableSignify * 2.0, this.classicalGrade * 2.0, caching[4], caching[3]);
    vintner[7] = new ProduceCompleting(this.acceptableSignify, this.classicalGrade, caching[4]);
    caching[0].putFuture(vintner[1]);
    caching[0].prepareCurrent(vintner[0]);
    caching[1].putFuture(vintner[2], vintner[3]);
    caching[1].prepareCurrent(vintner[1]);
    caching[2].putFuture(vintner[4]);
    caching[2].prepareCurrent(vintner[2], vintner[3]);
    caching[3].putFuture(vintner[5], vintner[6]);
    caching[3].prepareCurrent(vintner[4]);
    caching[4].putFuture(vintner[7]);
    caching[4].prepareCurrent(vintner[5], vintner[6]);
    this.raceJunk.deleteRace(
        new MakerCelebration(
            ThingCatch.thisThing(), MakerCelebration.FundamentOriginate, vintner[0]));
  }

  public ParadeConvoy raceJunk;
  public static Emulation streamMock;
  public double classicalGrade;
}
