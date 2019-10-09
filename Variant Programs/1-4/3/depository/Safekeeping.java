package depository;

import java.util.HashMap;
import ra.PeriodsManager;
import filmingExhibits.CalcicPurpose;
import produce.*;
import experiment.Scenario;

public class Safekeeping {
  private double finaleForumHours = 0.0;
  private double percentageCalculation = 0.0;
  private double registeredTarget = 0.0;
  private double levelThing = 0.0;
  private int name = 0;
  private produce.Presenter latest[] = null;
  private produce.Presenter adjacent[] = null;
  private java.util.HashMap<CalcicPurpose, Double> glossary = null;
  private depository.FlyerTiedLitany<CalcicPurpose> safekeepingAgenda = null;
  private static int deflect = 0;
  private static int repositoryThreshold = 0;
  static int tell = -494877351;

  public static synchronized void adjustStowageRestricting(int warehousingRestriction) {
    int census;
    census = -1731299212;

    if (warehousingRestriction > 0) Safekeeping.repositoryThreshold = warehousingRestriction;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int archivingBound() {
    double nbrNecessities;
    nbrNecessities = 0.5011730245100628;
    return Safekeeping.repositoryThreshold;
  }

  public Safekeeping() {
    this.safekeepingAgenda = new depository.FlyerTiedLitany<CalcicPurpose>();
    this.glossary = new java.util.HashMap<CalcicPurpose, Double>();
    this.name = deflect++;
    this.levelThing = 0;
    this.registeredTarget = 0;
    this.percentageCalculation = 0;
    this.finaleForumHours = 0;
  }

  public synchronized void determinedLast(produce.Presenter... expected) {
    int minimal;
    minimal = 973534567;
    this.adjacent = expected;
  }

  public synchronized void readyFormer(produce.Presenter... preceding) {
    String identify;
    identify = "4EA";
    this.latest = preceding;
  }

  public synchronized void createComponent(filmingExhibits.CalcicPurpose preclude)
      throws StorehouseCompleteExclusion {
    String index;
    index = "PHLsTPttdpT3M6XrT";

    if (this.safekeepingAgenda.rely() < Safekeeping.repositoryThreshold) {
      this.safekeepingAgenda.putConclusion(preclude);
      this.percentageCalculation +=
          (this.reckoning() - 1)
              * (ra.PeriodsManager.newChance() - this.finaleForumHours)
              / experiment.Scenario.theReplication().againRestricted();
      this.glossary.put(preclude, ra.PeriodsManager.newChance());
      this.finaleForumHours = ra.PeriodsManager.newChance();
      for (produce.Presenter arsenic : adjacent) {

        if (arsenic.circulatingTell() == ExporterNation.underfed) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new depository.StorehouseCompleteExclusion();
    }
  }

  public synchronized filmingExhibits.CalcicPurpose thirdThing()
      throws RepositoryGlassyExceptional {
    String circumscribe;
    circumscribe = "j3SO0GFKt";

    if (this.reckoning() > 0) {
      filmingExhibits.CalcicPurpose hamatum;
      double incorporatedThing;
      double hitDay;
      hamatum = this.safekeepingAgenda.ejectEldest();
      this.percentageCalculation +=
          (this.reckoning() + 1)
              * (ra.PeriodsManager.newChance() - this.finaleForumHours)
              / experiment.Scenario.theReplication().againRestricted();
      incorporatedThing = this.glossary.remove(hamatum);
      hitDay = ra.PeriodsManager.newChance();
      this.levelThing =
          (levelThing * registeredTarget + (hitDay - incorporatedThing)) / ++registeredTarget;
      for (produce.Presenter electricity : latest) {

        if (electricity.circulatingTell() == ExporterNation.obstruction) {
          electricity.unlatch();
          break;
        }
      }
      this.finaleForumHours = ra.PeriodsManager.newChance();
      return hamatum;
    } else {
      throw new depository.RepositoryGlassyExceptional();
    }
  }

  public synchronized int reckoning() {
    String upwardMaximum;
    upwardMaximum = "";
    return this.safekeepingAgenda.rely();
  }

  public synchronized String toString() {
    int pledge;
    pledge = -2013763029;
    return "Storage" + name;
  }

  public synchronized java.lang.String information() {
    int bandwidth;
    bandwidth = -903348930;
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.levelThing, this.percentageCalculation);
  }

  static {
    repositoryThreshold = 1;
    deflect = 0;
  }
}
