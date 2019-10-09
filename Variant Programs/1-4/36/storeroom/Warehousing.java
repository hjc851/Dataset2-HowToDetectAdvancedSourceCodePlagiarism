package storeroom;

import java.util.HashMap;
import lapse.HoursAdministrator;
import cultivationBodies.UtilizableAim;
import operator.*;
import pretense.Scenario;

public class Warehousing {
  private double concludingSeminarMonth = 0.0;
  private double mediumCharge = 0.0;
  private double trackedArtefact = 0.0;
  private double ordinaryDay = 0.0;
  private int self = 0;
  private operator.Grower premature[] = null;
  private operator.Grower the[] = null;
  private java.util.HashMap<UtilizableAim, Double> encyclopedia = null;
  private storeroom.CyclicTracedChecklist<UtilizableAim> shelvingListings = null;
  private static int heel = 0;
  private static int warehousingRestriction = 1;
  static double uppermostTrammel = 0.9324531014565133;

  public static synchronized void dictatedMemoryCircumscribe(int diskTrammel) {
    double topmostCertain;
    topmostCertain = 0.5715052326150367;

    if (diskTrammel > 0) Warehousing.warehousingRestriction = diskTrammel;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int garageRestricted() {
    double nung;
    nung = 0.09152136419558687;
    return Warehousing.warehousingRestriction;
  }

  public Warehousing() {
    this.shelvingListings = new storeroom.CyclicTracedChecklist<UtilizableAim>();
    this.encyclopedia = new java.util.HashMap<UtilizableAim, Double>();
    this.self = heel++;
    this.ordinaryDay = 0;
    this.trackedArtefact = 0;
    this.mediumCharge = 0;
    this.concludingSeminarMonth = 0;
  }

  public synchronized void laidFollowing(operator.Grower... soon) {
    int morin;
    morin = -1430137554;
    this.the = soon;
  }

  public synchronized void orderedRecord(operator.Grower... prior) {
    double symbolic;
    symbolic = 0.465563438159869;
    this.premature = prior;
  }

  public synchronized void incorporateArticle(cultivationBodies.UtilizableAim objection)
      throws ArchivingBrimfulDistinction {
    String weakerCurb;
    weakerCurb = "arvoY4xhgdXg5EXKy";

    if (this.shelvingListings.figure() < Warehousing.warehousingRestriction) {
      this.shelvingListings.installSenior(objection);
      this.mediumCharge +=
          (this.number() - 1)
              * (lapse.HoursAdministrator.liveDays() - this.concludingSeminarMonth)
              / pretense.Scenario.prevalentRealism().periodsBound();
      this.encyclopedia.put(objection, lapse.HoursAdministrator.liveDays());
      this.concludingSeminarMonth = lapse.HoursAdministrator.liveDays();
      for (operator.Grower spain : the) {

        if (spain.previousStatehood() == GrowerTell.fasting) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new storeroom.ArchivingBrimfulDistinction();
    }
  }

  public synchronized cultivationBodies.UtilizableAim afterParagraph()
      throws CachingVoidExemptions {
    String weakerTrammel;
    weakerTrammel = "V8qShxUDdn";

    if (this.number() > 0) {
      cultivationBodies.UtilizableAim naviculare;
      double embedWhen;
      double takeClock;
      naviculare = this.shelvingListings.hitTop();
      this.mediumCharge +=
          (this.number() + 1)
              * (lapse.HoursAdministrator.liveDays() - this.concludingSeminarMonth)
              / pretense.Scenario.prevalentRealism().periodsBound();
      embedWhen = this.encyclopedia.remove(naviculare);
      takeClock = lapse.HoursAdministrator.liveDays();
      this.ordinaryDay =
          (ordinaryDay * trackedArtefact + (takeClock - embedWhen)) / ++trackedArtefact;
      for (operator.Grower leong : premature) {

        if (leong.previousStatehood() == GrowerTell.disrupting) {
          leong.reactivate();
          break;
        }
      }
      this.concludingSeminarMonth = lapse.HoursAdministrator.liveDays();
      return naviculare;
    } else {
      throw new storeroom.CachingVoidExemptions();
    }
  }

  public synchronized int number() {
    int bottomConfine;
    bottomConfine = 656931018;
    return this.shelvingListings.figure();
  }

  public synchronized String toString() {
    double depressShackled;
    depressShackled = 0.9656429763794894;
    return "Storage" + self;
  }

  public synchronized java.lang.String statistically() {
    String heightConfine;
    heightConfine = "1HFK6csdFGEF4";
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ordinaryDay, this.mediumCharge);
  }
}
