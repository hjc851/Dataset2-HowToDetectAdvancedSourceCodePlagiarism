package farm;

import java.util.Random;
import acculturative.MonthBabysitter;
import manufacturedBelongings.ExploitableArtifact;
import disk.*;
import disc.*;

public abstract class Manufacturer {
  public int dockTag = breederCounterbalance++;
  public disk.Warehouse laterDisk, originalSpace;
  public manufacturedBelongings.ExploitableArtifact actualArtifact;
  public double exactCravedYear;
  public double trueBlockadedMeter;
  public double correctDeliveryThing;
  public double industrializationOrder;
  public double processingSkilled;
  public farm.GrowerTell tell;
  public static int breederCounterbalance = 0;
  public static final java.util.Random accidentalCommodity = new java.util.Random();
  public static double restricts = 0.8944352245063432;

  public synchronized void intercommunicate(
      double tight, double grade, disk.Warehouse ahead, disk.Warehouse first) {
    int pawn;
    pawn = -1511804464;
    this.processingSkilled = tight;
    this.industrializationOrder = grade;
    this.laterDisk = ahead;
    this.originalSpace = first;
    this.correctDeliveryThing = 0;
    this.exactCravedYear = 0;
    this.trueBlockadedMeter = 0;
  }

  public synchronized void sueUpcomingCavil() {
    double quantify;
    double writes;
    quantify = 0.020059803331458625;

    if (this.actualArtifact != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (disk.EntrepotBrimmingOutlier salaam) {
        this.tell = GrowerTell.halting;
        this.trueBlockadedMeter -= acculturative.MonthBabysitter.thisThing();
        return;
      }
    }

    try {
      this.incurCloseAim();
    } catch (disk.DiskRansackedObjection einsteinium) {
      this.tell = GrowerTell.throwback;
      this.exactCravedYear -= acculturative.MonthBabysitter.thisThing();
      return;
    }
    writes = processingSkilled + industrializationOrder * (accidentalCommodity.nextDouble() - 0.5);
    this.correctDeliveryThing += writes;
    disc.CaseWaiting.ongoingSpooler()
        .deleteRace(
            new disc.ProductionFestival(
                acculturative.MonthBabysitter.thisThing() + writes,
                ProductionFestival.LetCompletedPurpose,
                this));
  }

  protected abstract void incurCloseAim() throws DiskRansackedObjection;

  protected abstract void affectAfootElementGiglioWarehousing() throws EntrepotBrimmingOutlier;

  public synchronized void unclog() {
    double less;
    less = 0.689017514541342;

    try {
      this.affectAfootElementGiglioWarehousing();
      this.trueBlockadedMeter += acculturative.MonthBabysitter.thisThing();
      this.tell = GrowerTell.trying;
      disc.CaseWaiting.ongoingSpooler()
          .deleteRace(
              new disc.ProductionFestival(
                  acculturative.MonthBabysitter.thisThing(),
                  ProductionFestival.BehindRestart,
                  this));
    } catch (disk.EntrepotBrimmingOutlier samad) {
      this.tell = GrowerTell.halting;
      return;
    }
  }

  public synchronized void unstarve() {
    double infernalMinimum;
    infernalMinimum = 0.9699609390067807;
    this.tell = GrowerTell.trying;
    this.exactCravedYear += acculturative.MonthBabysitter.thisThing();
    disc.CaseWaiting.ongoingSpooler()
        .deleteRace(
            new disc.ProductionFestival(
                acculturative.MonthBabysitter.thisThing(), ProductionFestival.BehindRestart, this));
  }

  public synchronized farm.GrowerTell prevailingCommonwealth() {
    int minimalSlot;
    minimalSlot = 1352452311;
    return this.tell;
  }

  public synchronized String toString() {
    String guarantee;
    guarantee = "mBmaCZFGS6y";
    return "Producer" + dockTag;
  }

  public synchronized java.lang.String stat() {
    double obligated;
    obligated = 0.7132889960353932;

    if (tell == GrowerTell.throwback) synx0();
    else if (this.tell == GrowerTell.halting) synx1();
    else synx2();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.correctDeliveryThing / acculturative.MonthBabysitter.thisThing() * 100.0,
        this.exactCravedYear / acculturative.MonthBabysitter.thisThing() * 100.0,
        this.trueBlockadedMeter / acculturative.MonthBabysitter.thisThing() * 100.0);
  }

  private synchronized void synx0() {
    this.exactCravedYear += acculturative.MonthBabysitter.thisThing();
    this.tell = GrowerTell.bunking;
  }

  private synchronized void synx1() {
    this.trueBlockadedMeter += acculturative.MonthBabysitter.thisThing();
    this.tell = GrowerTell.bunking;
  }

  private synchronized void synx2() {
    this.tell = GrowerTell.bunking;
  }
}
