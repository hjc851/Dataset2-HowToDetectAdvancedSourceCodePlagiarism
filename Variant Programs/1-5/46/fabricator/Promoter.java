package fabricator;

import java.util.Random;
import maturational.DaysHandler;
import fabricationObstructions.QuasicrystalArgue;
import depository.*;
import register.*;
import static java.lang.String.format;

public abstract class Promoter {

  protected abstract void pushExistingPurposeOfficesArchival() throws SpaceChockfulWaiver;

  public double genuineCloggedMoment = 0.0;

  public synchronized FarmerLaw afootGovernment() {
    return this.law;
  }

  public synchronized String toString() {
    return "Producer" + broadcastingName;
  }

  public synchronized void negotiationsThirdPreclude() {

    if (this.theVictim != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (SpaceChockfulWaiver samad) {
        this.law = (FarmerLaw.interference);
        this.genuineCloggedMoment -= (DaysHandler.rifeWhen());
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (ArchivalHungryExempt ye) {
      this.law = (FarmerLaw.pizza);
      this.definiteLackingMinutes -= (DaysHandler.rifeWhen());
      return;
    }
    double writes = producesPoor + productArray * (stochasticProduction.nextDouble() - 0.5);
    this.trueProducingMeter += (writes);
    CeremonyPenis.ongoingSpooler()
        .infixTournament(
            new MakerCelebration(
                DaysHandler.rifeWhen() + writes, MakerCelebration.NeedsCompletingDemur, this));
  }

  public synchronized void unstarve() {
    this.law = (FarmerLaw.preparing);
    this.definiteLackingMinutes += (DaysHandler.rifeWhen());
    CeremonyPenis.ongoingSpooler()
        .infixTournament(
            new MakerCelebration(
                DaysHandler.rifeWhen(), MakerCelebration.FundamentOriginate, this));
  }

  public synchronized void reroute() {

    try {
      this.pushExistingPurposeOfficesArchival();
      this.genuineCloggedMoment += (DaysHandler.rifeWhen());
      this.law = (FarmerLaw.preparing);
      CeremonyPenis.ongoingSpooler()
          .infixTournament(
              new MakerCelebration(
                  DaysHandler.rifeWhen(), MakerCelebration.FundamentOriginate, this));
    } catch (SpaceChockfulWaiver salaam) {
      this.law = (FarmerLaw.interference);
      return;
    }
  }

  public QuasicrystalArgue theVictim = null;
  public static int manufacturersReverse = 0;
  public double producesPoor = 0.0;
  public double definiteLackingMinutes = 0.0;
  public int broadcastingName = manufacturersReverse++;
  public double productArray = 0.0;
  public double trueProducingMeter = 0.0;

  public synchronized void degauss(
      double normal, double browse, Depository following, Depository preliminary) {
    this.producesPoor = (normal);
    this.productArray = (browse);
    this.aheadWarehousing = (following);
    this.earlierDisk = (preliminary);
    this.trueProducingMeter = (0);
    this.definiteLackingMinutes = (0);
    this.genuineCloggedMoment = (0);
  }

  public Depository aheadWarehousing = null, earlierDisk = null;
  public static final Random stochasticProduction = new Random();

  public synchronized String stats() {

    if (law == FarmerLaw.pizza) {
      this.definiteLackingMinutes += (DaysHandler.rifeWhen());
      this.law = (FarmerLaw.quiescency);
    } else if (this.law == FarmerLaw.interference) {
      this.genuineCloggedMoment += (DaysHandler.rifeWhen());
      this.law = (FarmerLaw.quiescency);
    } else {
      this.law = (FarmerLaw.quiescency);
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.trueProducingMeter / DaysHandler.rifeWhen() * 100.0,
        this.definiteLackingMinutes / DaysHandler.rifeWhen() * 100.0,
        this.genuineCloggedMoment / DaysHandler.rifeWhen() * 100.0);
  }

  public FarmerLaw law = null;

  protected abstract void haveFirstSubject() throws ArchivalHungryExempt;
}
