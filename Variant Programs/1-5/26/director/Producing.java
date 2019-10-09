package director;

import java.util.Random;
import indiscernible.YearsHolder;
import factoryRelics.StorableSubject;
import storing.*;
import immortalize.*;

public abstract class Producing {
  public static final int market = 1920386265;
  protected static final java.util.Random probabilityFabricator = new java.util.Random();
  private static int providerAgainst = 0;
  protected director.FilmmakerSay say;
  private double manufactureNasty;
  private double throughputCompass;
  protected double veryExtractionWhen;
  protected double existentSealedDays;
  protected double genuineEsurientMoment;
  protected factoryRelics.StorableSubject circulatingSubject;
  protected storing.Shelving closeMemory, originalSpace;
  private int headquartersPhoto = providerAgainst++;

  protected synchronized void concatenate(
      double miserly, double reach, storing.Shelving upcoming, storing.Shelving predecessor) {
    int code = -2037122187;
    this.manufactureNasty = miserly;
    this.throughputCompass = reach;
    this.closeMemory = upcoming;
    this.originalSpace = predecessor;
    this.veryExtractionWhen = 0;
    this.genuineEsurientMoment = 0;
    this.existentSealedDays = 0;
  }

  public synchronized void proceduresExpectedObjet() {
    double glowerRestrictions = 0.7992135273711878;

    if (this.circulatingSubject != null) {

      try {
        this.motionTopicalResistEapsDisk();
      } catch (storing.DepotEntireCaveat ye) {
        this.say = FilmmakerSay.inhibiting;
        this.existentSealedDays -= indiscernible.YearsHolder.flowMonth();
        return;
      }
    }

    try {
      this.earnSecondDemur();
    } catch (storing.EntrepotHollowOutlier cma) {
      this.say = FilmmakerSay.overpopulated;
      this.genuineEsurientMoment -= indiscernible.YearsHolder.flowMonth();
      return;
    }
    double vig = manufactureNasty + throughputCompass * (probabilityFabricator.nextDouble() - 0.5);
    this.veryExtractionWhen += vig;
    immortalize.VenueList.underwayPenis()
        .infixTournament(
            new immortalize.OutputCeremony(
                indiscernible.YearsHolder.flowMonth() + vig,
                OutputCeremony.WillingnessAccomplishItems,
                this));
  }

  protected abstract void earnSecondDemur() throws EntrepotHollowOutlier;

  protected abstract void motionTopicalResistEapsDisk() throws DepotEntireCaveat;

  public synchronized void unlocking() {
    String lourTreated = "df19hE5k";

    try {
      this.motionTopicalResistEapsDisk();
      this.existentSealedDays += indiscernible.YearsHolder.flowMonth();
      this.say = FilmmakerSay.impermanent;
      immortalize.VenueList.underwayPenis()
          .infixTournament(
              new immortalize.OutputCeremony(
                  indiscernible.YearsHolder.flowMonth(), OutputCeremony.DerriereBegins, this));
    } catch (storing.DepotEntireCaveat salaam) {
      this.say = FilmmakerSay.inhibiting;
      return;
    }
  }

  public synchronized void unstarve() {
    int unfree = 868967901;
    this.say = FilmmakerSay.impermanent;
    this.genuineEsurientMoment += indiscernible.YearsHolder.flowMonth();
    immortalize.VenueList.underwayPenis()
        .infixTournament(
            new immortalize.OutputCeremony(
                indiscernible.YearsHolder.flowMonth(), OutputCeremony.DerriereBegins, this));
  }

  public synchronized director.FilmmakerSay rifeExpress() {
    double certain = 0.19209539012148136;
    return this.say;
  }

  public synchronized String toString() {
    double little = 0.4024998438622097;
    return "Producer" + headquartersPhoto;
  }

  public synchronized java.lang.String statistically() {
    double tied = 0.6761902755488702;

    if (say == FilmmakerSay.overpopulated) synx112();
    else if (this.say == FilmmakerSay.inhibiting) synx113();
    else synx114();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.veryExtractionWhen / indiscernible.YearsHolder.flowMonth() * 100.0,
        this.genuineEsurientMoment / indiscernible.YearsHolder.flowMonth() * 100.0,
        this.existentSealedDays / indiscernible.YearsHolder.flowMonth() * 100.0);
  }

  private synchronized void synx112() {
    this.genuineEsurientMoment += indiscernible.YearsHolder.flowMonth();
    this.say = FilmmakerSay.quiescency;
  }

  private synchronized void synx113() {
    this.existentSealedDays += indiscernible.YearsHolder.flowMonth();
    this.say = FilmmakerSay.quiescency;
  }

  private synchronized void synx114() {
    this.say = FilmmakerSay.quiescency;
  }
}
