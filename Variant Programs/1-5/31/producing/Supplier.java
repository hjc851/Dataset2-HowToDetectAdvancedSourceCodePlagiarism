package producing;

import java.util.Random;
import ra.DayCaretaker;
import cultivationBodies.DiamondiferousItems;
import depot.*;
import ledger.*;
import static java.lang.String.format;

public abstract class Supplier {
  public double trueRavenousMeter = 0.0;
  public double empiricalShutWeek = 0.0;

  public synchronized String toString() {
    return "Producer" + channelPicture;
  }

  public int channelPicture = providerAgainst++;

  public synchronized void modulo(double little, double browse, Stored succeeding, Stored last) {
    this.producerAwful = (little);
    this.harvestingWander = (browse);
    this.aheadWarehousing = (succeeding);
    this.lateMemory = (last);
    this.empiricalProducesWeek = (0);
    this.trueRavenousMeter = (0);
    this.empiricalShutWeek = (0);
  }

  protected abstract void payTheOpposes() throws WarehouseOpenDeviation;

  public synchronized void formalitiesComeDisagree() {

    if (this.rifeCavil != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (CachingBroadExemptions salaam) {
        this.law = (GrowersCanton.blockage);
        this.empiricalShutWeek -= (DayCaretaker.underwayYear());
        return;
      }
    }

    try {
      this.payTheOpposes();
    } catch (WarehouseOpenDeviation ej) {
      this.law = (GrowersCanton.dying);
      this.trueRavenousMeter -= (DayCaretaker.underwayYear());
      return;
    }
    double cern = producerAwful + harvestingWander * (occasionalGrowers.nextDouble() - 0.5);
    this.empiricalProducesWeek += (cern);
    SummitPecker.liveStandby()
        .deleteRace(
            new GrowerParade(
                DayCaretaker.underwayYear() + cern, GrowerParade.IntendsCoatingResist, this));
  }

  public double empiricalProducesWeek = 0.0;
  public double harvestingWander = 0.0;

  public synchronized String statistician() {

    if (law == GrowersCanton.dying) synx126();
    else if (this.law == GrowersCanton.blockage) synx127();
    else synx128();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / DayCaretaker.underwayYear() * 100.0,
        this.trueRavenousMeter / DayCaretaker.underwayYear() * 100.0,
        this.empiricalShutWeek / DayCaretaker.underwayYear() * 100.0);
  }

  public static int providerAgainst = 0;
  public DiamondiferousItems rifeCavil = null;

  protected abstract void affectAfootElementGiglioWarehousing() throws CachingBroadExemptions;

  public static final Random occasionalGrowers = new Random();

  public synchronized void allocate() {

    try {
      this.affectAfootElementGiglioWarehousing();
      this.empiricalShutWeek += (DayCaretaker.underwayYear());
      this.law = (GrowersCanton.employing);
      SummitPecker.liveStandby()
          .deleteRace(new GrowerParade(DayCaretaker.underwayYear(), GrowerParade.FannyBegun, this));
    } catch (CachingBroadExemptions ye) {
      this.law = (GrowersCanton.blockage);
      return;
    }
  }

  public synchronized void unstarve() {
    this.law = (GrowersCanton.employing);
    this.trueRavenousMeter += (DayCaretaker.underwayYear());
    SummitPecker.liveStandby()
        .deleteRace(new GrowerParade(DayCaretaker.underwayYear(), GrowerParade.FannyBegun, this));
  }

  public double producerAwful = 0.0;
  public Stored aheadWarehousing = null, lateMemory = null;

  public synchronized GrowersCanton continuingCanton() {
    return this.law;
  }

  public GrowersCanton law = null;

  private synchronized void synx126() {
    this.trueRavenousMeter += (DayCaretaker.underwayYear());
    this.law = (GrowersCanton.slumbering);
  }

  private synchronized void synx127() {
    this.empiricalShutWeek += (DayCaretaker.underwayYear());
    this.law = (GrowersCanton.slumbering);
  }

  private synchronized void synx128() {
    this.law = (GrowersCanton.slumbering);
  }
}
