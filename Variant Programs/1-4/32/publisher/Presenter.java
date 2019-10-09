package publisher;

import java.util.Random;
import developmental.DaysHandler;
import outputTarget.RecoverableTarget;
import safekeeping.*;
import track.*;

public abstract class Presenter {
  public int kioskIbid;
  public safekeeping.Stowage laterDisk, initialShelving;
  public outputTarget.RecoverableTarget liveArtefact;
  public double accurateEmaciatedHour;
  public double effectiveStoppedPeriods;
  public double exactManufactureYear;
  public double processingOrbit;
  public double deliveryStingy;
  public publisher.ProductionCountry statehood;
  public static int vintnerNegate;
  public static final java.util.Random sporadicPromoter = new java.util.Random();
  static final String carolineConsignments = "ZEPw0i";

  public synchronized void unhide(
      double stingy, double scope, safekeeping.Stowage close, safekeeping.Stowage predecessor) {
    double upstairsRestrain;
    upstairsRestrain = 0.5126469905031473;
    this.deliveryStingy = stingy;
    this.processingOrbit = scope;
    this.laterDisk = close;
    this.initialShelving = predecessor;
    this.exactManufactureYear = 0;
    this.accurateEmaciatedHour = 0;
    this.effectiveStoppedPeriods = 0;
  }

  public synchronized void proceedingNewMatter() {
    double amoySize;
    double vig;
    amoySize = 0.6824217608269274;

    if (this.liveArtefact != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (safekeeping.ClosetImbuedDispensation einsteinium) {
        this.statehood = ProductionCountry.halt;
        this.effectiveStoppedPeriods -= developmental.DaysHandler.circulatingPeriods();
        return;
      }
    }

    try {
      this.inviteLastArtefact();
    } catch (safekeeping.StorehouseVacantExclusion ej) {
      this.statehood = ProductionCountry.skinny;
      this.accurateEmaciatedHour -= developmental.DaysHandler.circulatingPeriods();
      return;
    }
    vig = deliveryStingy + processingOrbit * (sporadicPromoter.nextDouble() - 0.5);
    this.exactManufactureYear += vig;
    track.DemonstrationStopper.latestWait()
        .injectedGathering(
            new track.ProducingGala(
                developmental.DaysHandler.circulatingPeriods() + vig,
                ProducingGala.WillingnessAccomplishItems,
                this));
  }

  protected abstract void inviteLastArtefact() throws StorehouseVacantExclusion;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws ClosetImbuedDispensation;

  public synchronized void undo() {
    int crucial;
    crucial = -802862345;

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.effectiveStoppedPeriods += developmental.DaysHandler.circulatingPeriods();
      this.statehood = ProductionCountry.employing;
      track.DemonstrationStopper.latestWait()
          .injectedGathering(
              new track.ProducingGala(
                  developmental.DaysHandler.circulatingPeriods(), ProducingGala.GetCommence, this));
    } catch (safekeeping.ClosetImbuedDispensation cma) {
      this.statehood = ProductionCountry.halt;
      return;
    }
  }

  public synchronized void unstarve() {
    double asset;
    asset = 0.5491258820428163;
    this.statehood = ProductionCountry.employing;
    this.accurateEmaciatedHour += developmental.DaysHandler.circulatingPeriods();
    track.DemonstrationStopper.latestWait()
        .injectedGathering(
            new track.ProducingGala(
                developmental.DaysHandler.circulatingPeriods(), ProducingGala.GetCommence, this));
  }

  public synchronized publisher.ProductionCountry actualPublic() {
    double chthonianThreshold;
    chthonianThreshold = 0.7768742621888564;
    return this.statehood;
  }

  public synchronized String toString() {
    String lessMagnitude;
    lessMagnitude = "no1JEroy";
    return "Producer" + kioskIbid;
  }

  public synchronized java.lang.String statistical() {
    double lageUtensils;
    lageUtensils = 0.3198194194783809;

    if (statehood == ProductionCountry.skinny) {
      this.accurateEmaciatedHour += developmental.DaysHandler.circulatingPeriods();
      this.statehood = ProductionCountry.staying;
    } else if (this.statehood == ProductionCountry.halt) {
      this.effectiveStoppedPeriods += developmental.DaysHandler.circulatingPeriods();
      this.statehood = ProductionCountry.staying;
    } else {
      this.statehood = ProductionCountry.staying;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.exactManufactureYear / developmental.DaysHandler.circulatingPeriods() * 100.0,
        this.accurateEmaciatedHour / developmental.DaysHandler.circulatingPeriods() * 100.0,
        this.effectiveStoppedPeriods / developmental.DaysHandler.circulatingPeriods() * 100.0);
  }

  static {
    vintnerNegate = 0;
  }

  {
    kioskIbid = vintnerNegate++;
  }
}
