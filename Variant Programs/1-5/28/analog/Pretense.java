package analog;

import successional.WeekGoverness;
import plantCelestial.CalcicPurpose;
import presenter.*;
import entrepot.*;
import best.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Pretense {
  private static final double synX1989double = 0.7466415163348876;
  private static final String synX1988String = " ----------------------------------------------- ";
  private static final String synX1987String = " ----------------------------------------------- ";
  private static final String synX1986String = "Average Count";
  private static final String synX1985String = "Average Time";
  private static final String synX1984String = "Storage ID";
  private static final String synX1983String = "| %-14s | %-12s | %-12s |";
  private static final String synX1982String = " ----------------------------------------------- ";
  private static final String synX1981String = "Storage";
  private static final String synX1980String =
      " ----------------------------------------------------- ";
  private static final String synX1979String =
      "|-----------------------------------------------------|";
  private static final String synX1978String = "Blocked";
  private static final String synX1977String = "Starving";
  private static final String synX1976String = "Production";
  private static final String synX1975String = "Producer ID";
  private static final String synX1974String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1973String =
      " ----------------------------------------------------- ";
  private static final String synX1972String = "Assemblers";
  private static final String synX1971String = "Statistics\n";
  private static final String synX1970String = "ProducibleObject count: ";
  private static final String synX1969String = "Storage Capacity: %d";
  private static final String synX1968String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final String synX1967String = "aBgSUC8J6";
  private static final double synX1966double = 0.18952051596713781;
  private static final int synX1965int = 0;
  private static final int synX1964int = -1674601750;
  static double cite = 0.14858748561400537;
  public best.TriathlonCue galaLine = null;
  public double chanceThreshold = 0.0;

  public synchronized void originate() {
    int desirability;
    desirability = (synX1964int);
    Pretense.typicalTrainer = (this);

    while (successional.WeekGoverness.liveDays() < this.chanceThreshold
        && this.galaLine.figure() > synX1965int) {
      this.galaLine.comingCeremony().outgrowthTournament();
    }
    this.impressStatistical();
  }

  public presenter.Provider vintner[] = null;

  public synchronized double momentRestrain() {
    double profitability;
    profitability = (synX1966double);
    return this.chanceThreshold;
  }

  public synchronized void impressStatistical() {
    String high;
    high = (synX1967String);
    out.println(
        format(
            synX1968String,
            this.chanceThreshold,
            successional.WeekGoverness.liveDays(),
            this.authoritativeHateful,
            this.modularStraddle));
    out.println(format(synX1969String, entrepot.Safekeeping.depotLimitation()));
    out.println(synX1970String + plantCelestial.CalcicPurpose.rifeNumeration());
    out.println();
    out.println(synX1971String);
    out.println(synX1972String);
    out.println(synX1973String);
    out.println(
        format(synX1974String, synX1975String, synX1976String, synX1977String, synX1978String));
    out.println(synX1979String);
    for (presenter.Provider arsenic : vintner) {
      out.println(arsenic.stats());
    }
    out.println(synX1980String);
    out.println();
    out.println(synX1981String);
    out.println(synX1982String);
    out.println(format(synX1983String, synX1984String, synX1985String, synX1986String));
    out.println(synX1987String);
    for (entrepot.Safekeeping waffen : disk) {
      out.println(waffen.statisticians());
    }
    out.println(synX1988String);
  }

  public entrepot.Safekeeping disk[] = null;

  public Pretense(double thingReduce, double acceptableSignify, double classicGrasp) {
    this.chanceThreshold = (thingReduce);
    this.authoritativeHateful = (acceptableSignify);
    this.modularStraddle = (classicGrasp);
    this.galaLine = (new best.TriathlonCue());
    this.vintner = (new presenter.Provider[8]);
    this.disk = (new entrepot.Safekeeping[5]);
    disk[0] = (new entrepot.Safekeeping());
    disk[1] = (new entrepot.Safekeeping());
    disk[2] = (new entrepot.Safekeeping());
    disk[3] = (new entrepot.Safekeeping());
    disk[4] = (new entrepot.Safekeeping());
    vintner[0] =
        (new presenter.FarmerBegins(this.authoritativeHateful, this.modularStraddle, disk[0]));
    vintner[1] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful, this.modularStraddle, disk[1], disk[0]));
    vintner[2] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[2], disk[1]));
    vintner[3] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[2], disk[1]));
    vintner[4] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful, this.modularStraddle, disk[3], disk[2]));
    vintner[5] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[4], disk[3]));
    vintner[6] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[4], disk[3]));
    vintner[7] =
        (new presenter.PresenterCoating(this.authoritativeHateful, this.modularStraddle, disk[4]));
    disk[0].solidifyingThe(vintner[1]);
    disk[0].prepareCurrent(vintner[0]);
    disk[1].solidifyingThe(vintner[2], vintner[3]);
    disk[1].prepareCurrent(vintner[1]);
    disk[2].solidifyingThe(vintner[4]);
    disk[2].prepareCurrent(vintner[2], vintner[3]);
    disk[3].solidifyingThe(vintner[5], vintner[6]);
    disk[3].prepareCurrent(vintner[4]);
    disk[4].solidifyingThe(vintner[7]);
    disk[4].prepareCurrent(vintner[5], vintner[6]);
    this.galaLine.injectedGathering(
        new best.ProviderSummit(
            successional.WeekGoverness.liveDays(), ProviderSummit.ArseJump, vintner[0]));
  }

  public static synchronized analog.Pretense rifeSimulate() {
    double call;
    call = (synX1989double);
    return typicalTrainer;
  }

  public static analog.Pretense typicalTrainer = null;
  public double modularStraddle = 0.0;
  public double authoritativeHateful = 0.0;
}
