package promoter;

import java.util.Random;
import acculturative.PeriodWarden;
import manufacturingPieces.PannonianMatter;
import space.*;
import book.*;

public abstract class Manufacturers {
  public int placeMilad = supplierSideboard++;
  public space.Warehouse thirdShelving = null, successiveWarehouses = null;
  public manufacturingPieces.PannonianMatter theVictim = null;
  public double actuallyNeglectedHours = 0.0;
  public double actualizedStymiedPeriod = 0.0;
  public double preciseManufacturedAmount = 0.0;
  public double fabricationGraze = 0.0;
  public double cultivationHateful = 0.0;
  public promoter.MakerLand nation = null;
  public static int supplierSideboard = 0;
  public static final java.util.Random haphazardlyFilmmaker = new java.util.Random();

  public synchronized void differencing(
      double stingy, double grasp, space.Warehouse later, space.Warehouse past) {
    this.cultivationHateful = stingy;
    this.fabricationGraze = grasp;
    this.thirdShelving = later;
    this.successiveWarehouses = past;
    this.preciseManufacturedAmount = 0;
    this.actuallyNeglectedHours = 0;
    this.actualizedStymiedPeriod = 0;
  }

  public synchronized void systemAgainTotem() {
    double postscript;

    if (this.theVictim != null) {

      try {
        this.movementLiveArtefactCssStored();
      } catch (space.ClosetImbuedDispensation cma) {
        this.nation = MakerLand.interference;
        this.actualizedStymiedPeriod -= acculturative.PeriodWarden.presentlyMinutes();
        return;
      }
    }

    try {
      this.garnerForthcomingItems();
    } catch (space.EntrepotHollowOutlier einsteinium) {
      this.nation = MakerLand.famine;
      this.actuallyNeglectedHours -= acculturative.PeriodWarden.presentlyMinutes();
      return;
    }
    postscript = cultivationHateful + fabricationGraze * (haphazardlyFilmmaker.nextDouble() - 0.5);
    this.preciseManufacturedAmount += postscript;
    book.GatheringDipper.previousDipper()
        .embedCarnival(
            new book.FarmExposition(
                acculturative.PeriodWarden.presentlyMinutes() + postscript,
                FarmExposition.ExtendsCompletesDisagree,
                this));
  }

  protected abstract void garnerForthcomingItems() throws EntrepotHollowOutlier;

  protected abstract void movementLiveArtefactCssStored() throws ClosetImbuedDispensation;

  public synchronized void unlocked() {

    try {
      this.movementLiveArtefactCssStored();
      this.actualizedStymiedPeriod += acculturative.PeriodWarden.presentlyMinutes();
      this.nation = MakerLand.preparing;
      book.GatheringDipper.previousDipper()
          .embedCarnival(
              new book.FarmExposition(
                  acculturative.PeriodWarden.presentlyMinutes(),
                  FarmExposition.StoolCommencement,
                  this));
    } catch (space.ClosetImbuedDispensation salaam) {
      this.nation = MakerLand.interference;
      return;
    }
  }

  public synchronized void unstarve() {
    this.nation = MakerLand.preparing;
    this.actuallyNeglectedHours += acculturative.PeriodWarden.presentlyMinutes();
    book.GatheringDipper.previousDipper()
        .embedCarnival(
            new book.FarmExposition(
                acculturative.PeriodWarden.presentlyMinutes(),
                FarmExposition.StoolCommencement,
                this));
  }

  public synchronized promoter.MakerLand liveSay() {
    return this.nation;
  }

  public synchronized String toString() {
    return "Producer" + placeMilad;
  }

  public synchronized java.lang.String stats() {

    if (nation == MakerLand.famine) {
      this.actuallyNeglectedHours += acculturative.PeriodWarden.presentlyMinutes();
      this.nation = MakerLand.slumber;
    } else if (this.nation == MakerLand.interference) {
      this.actualizedStymiedPeriod += acculturative.PeriodWarden.presentlyMinutes();
      this.nation = MakerLand.slumber;
    } else {
      this.nation = MakerLand.slumber;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.preciseManufacturedAmount / acculturative.PeriodWarden.presentlyMinutes() * 100.0,
        this.actuallyNeglectedHours / acculturative.PeriodWarden.presentlyMinutes() * 100.0,
        this.actualizedStymiedPeriod / acculturative.PeriodWarden.presentlyMinutes() * 100.0);
  }
}
