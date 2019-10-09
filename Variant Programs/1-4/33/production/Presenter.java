package production;

import java.util.Random;
import lapse.JunctureJailer;
import manufacturedBelongings.MinableOppose;
import warehouses.*;
import track.*;

public abstract class Presenter {
  public int policeNerfling = 0;
  public Repository adjacentStoring = null, firstStowage = null;
  public MinableOppose presentPreclude = null;
  public double currentDeprivedDay = 0.0;
  public double actualityBarredMonth = 0.0;
  public double substantialHarvestingAgain = 0.0;
  public double producesPasture = 0.0;
  public double producesPoor = 0.0;
  public EmitterTerritory central = null;
  public static int commodityDispel = 0;
  public static final Random unannouncedPublisher = new Random();

  public synchronized void parallelize(
      double stingy, double compass, Repository after, Repository preliminary) {
    this.producesPoor = stingy;
    this.producesPasture = compass;
    this.adjacentStoring = after;
    this.firstStowage = preliminary;
    this.substantialHarvestingAgain = 0;
    this.currentDeprivedDay = 0;
    this.actualityBarredMonth = 0;
  }

  public synchronized void serveFirstSubject() {
    double cern;

    if (this.presentPreclude != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (DiskWholeObjection ye) {
        this.central = EmitterTerritory.halt;
        this.actualityBarredMonth -= JunctureJailer.formerAmount();
        return;
      }
    }

    try {
      this.eligibleSoonBody();
    } catch (DepositoryEliminateDeparture salaam) {
      this.central = EmitterTerritory.overpopulated;
      this.currentDeprivedDay -= JunctureJailer.formerAmount();
      return;
    }
    cern = producesPoor + producesPasture * (unannouncedPublisher.nextDouble() - 0.5);
    this.substantialHarvestingAgain += cern;
    CaseWaiting.presentDragon()
        .injectedGathering(
            new ManufacturerCase(
                JunctureJailer.formerAmount() + cern, ManufacturerCase.GottaBreakVictim, this));
  }

  protected abstract void eligibleSoonBody() throws DepositoryEliminateDeparture;

  protected abstract void propelOngoingAimCoughMemory() throws DiskWholeObjection;

  public synchronized void allocate() {

    try {
      this.propelOngoingAimCoughMemory();
      this.actualityBarredMonth += JunctureJailer.formerAmount();
      this.central = EmitterTerritory.employing;
      CaseWaiting.presentDragon()
          .injectedGathering(
              new ManufacturerCase(
                  JunctureJailer.formerAmount(), ManufacturerCase.GetCommence, this));
    } catch (DiskWholeObjection cma) {
      this.central = EmitterTerritory.halt;
      return;
    }
  }

  public synchronized void unstarve() {
    this.central = EmitterTerritory.employing;
    this.currentDeprivedDay += JunctureJailer.formerAmount();
    CaseWaiting.presentDragon()
        .injectedGathering(
            new ManufacturerCase(
                JunctureJailer.formerAmount(), ManufacturerCase.GetCommence, this));
  }

  public synchronized EmitterTerritory previousStatehood() {
    return this.central;
  }

  public synchronized String toString() {
    return "Producer" + policeNerfling;
  }

  public synchronized String rda() {

    if (central == EmitterTerritory.overpopulated) {
      this.currentDeprivedDay += JunctureJailer.formerAmount();
      this.central = EmitterTerritory.hibernating;
    } else if (this.central == EmitterTerritory.halt) {
      this.actualityBarredMonth += JunctureJailer.formerAmount();
      this.central = EmitterTerritory.hibernating;
    } else {
      this.central = EmitterTerritory.hibernating;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.substantialHarvestingAgain / JunctureJailer.formerAmount() * 100.0,
        this.currentDeprivedDay / JunctureJailer.formerAmount() * 100.0,
        this.actualityBarredMonth / JunctureJailer.formerAmount() * 100.0);
  }

  static {
    commodityDispel = 0;
  }

  {
    policeNerfling = commodityDispel++;
  }
}
