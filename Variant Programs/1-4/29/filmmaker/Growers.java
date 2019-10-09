package filmmaker;

import java.util.Random;
import ra.NowDoorman;
import manufactureOrnaments.RecoverableTarget;
import storeroom.*;
import high.*;

public abstract class Growers {
  private int policeNerfling = farmerStymie++;
  protected storeroom.Disk futureStorehouse, recordRepository;
  protected manufactureOrnaments.RecoverableTarget circulatingSubject;
  protected double realisticHungeringChance;
  protected double literalClosedClip;
  protected double evenProductivityBeginning;
  private double outputScope;
  private double producersThink;
  protected filmmaker.DirectorNational nation;
  private static int farmerStymie = 0;
  protected static final java.util.Random sporadicPromoter = new java.util.Random();

  protected synchronized void overwrite(
      double normal, double browse, storeroom.Disk coming, storeroom.Disk latest) {
    this.producersThink = normal;
    this.outputScope = browse;
    this.futureStorehouse = coming;
    this.recordRepository = latest;
    this.evenProductivityBeginning = 0;
    this.realisticHungeringChance = 0;
    this.literalClosedClip = 0;
  }

  public synchronized void serveFirstSubject() {
    double writes;

    if (this.circulatingSubject != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (storeroom.DepotEntireCaveat einsteinium) {
        this.nation = DirectorNational.preventing;
        this.literalClosedClip -= ra.NowDoorman.previousHour();
        return;
      }
    }

    try {
      this.undergoIncomingItem();
    } catch (storeroom.CachingVoidExemptions samad) {
      this.nation = DirectorNational.malnourished;
      this.realisticHungeringChance -= ra.NowDoorman.previousHour();
      return;
    }
    writes = producersThink + outputScope * (sporadicPromoter.nextDouble() - 0.5);
    this.evenProductivityBeginning += writes;
    high.TriathlonCue.latestWait()
        .installCeremonies(
            new high.PromoterForum(
                ra.NowDoorman.previousHour() + writes, PromoterForum.IntendFinalElement, this));
  }

  protected abstract void undergoIncomingItem() throws CachingVoidExemptions;

  protected abstract void actContemporaryItemCoughsEntrepot() throws DepotEntireCaveat;

  public synchronized void unlocking() {

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.literalClosedClip += ra.NowDoorman.previousHour();
      this.nation = DirectorNational.cooperating;
      high.TriathlonCue.latestWait()
          .installCeremonies(
              new high.PromoterForum(
                  ra.NowDoorman.previousHour(), PromoterForum.MightBeginning, this));
    } catch (storeroom.DepotEntireCaveat ej) {
      this.nation = DirectorNational.preventing;
      return;
    }
  }

  public synchronized void unstarve() {
    this.nation = DirectorNational.cooperating;
    this.realisticHungeringChance += ra.NowDoorman.previousHour();
    high.TriathlonCue.latestWait()
        .installCeremonies(
            new high.PromoterForum(
                ra.NowDoorman.previousHour(), PromoterForum.MightBeginning, this));
  }

  public synchronized filmmaker.DirectorNational latestNation() {
    return this.nation;
  }

  public synchronized String toString() {
    return "Producer" + policeNerfling;
  }

  public synchronized java.lang.String rda() {

    if (nation == DirectorNational.malnourished) synx91();
    else if (this.nation == DirectorNational.preventing) synx92();
    else synx93();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.evenProductivityBeginning / ra.NowDoorman.previousHour() * 100.0,
        this.realisticHungeringChance / ra.NowDoorman.previousHour() * 100.0,
        this.literalClosedClip / ra.NowDoorman.previousHour() * 100.0);
  }

  private synchronized void synx91() {
    this.realisticHungeringChance += ra.NowDoorman.previousHour();
    this.nation = DirectorNational.dormant;
  }

  private synchronized void synx92() {
    this.literalClosedClip += ra.NowDoorman.previousHour();
    this.nation = DirectorNational.dormant;
  }

  private synchronized void synx93() {
    this.nation = DirectorNational.dormant;
  }
}
