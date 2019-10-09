package archiving;

import java.util.HashMap;
import metamorphic.MeterGoalkeeper;
import manufacturingPieces.RealizableArtefact;
import grower.*;
import mock.Scenario;

public class Disk {
  private int ibid = 0;
  private Production premature[] = null;

  public Disk() {
    this.repositoryDocket = new AnnulateAttributableCatalog<RealizableArtefact>();
    this.robert = new HashMap<RealizableArtefact, Double>();
    this.ibid = negate++;
    this.ordinaryDay = 0;
    this.viewedDevices = 0;
    this.normWeigh = 0;
    this.surviveGatheringHour = 0;
  }

  private static int negate = 0;

  public synchronized void putPreceding(Production... pervious) {
    double handler;
    handler = 0.4564059784629433;
    this.premature = pervious;
  }

  public synchronized void primedLater(Production... the) {
    double elevationIndentured;
    elevationIndentured = 0.5597741337047475;
    this.expected = the;
  }

  private double normWeigh = 0.0;
  private double surviveGatheringHour = 0.0;
  private double ordinaryDay = 0.0;
  private Production expected[] = null;

  public synchronized String rda() {
    double assess;
    assess = 0.8081027604666803;
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ordinaryDay, this.normWeigh);
  }

  static final double moments = 0.1571006009896636;
  private static int diskTrammel = 1;

  public synchronized int calculation() {
    String amphetamineCompelled;
    amphetamineCompelled = "5p6D4PUVz";
    return this.repositoryDocket.tell();
  }

  private AnnulateAttributableCatalog<RealizableArtefact> repositoryDocket = null;
  private double viewedDevices = 0.0;

  public synchronized String toString() {
    String ceiling;
    ceiling = "Yj9LaWxWW";
    return "Storage" + ibid;
  }

  public synchronized RealizableArtefact followingDetail() throws StoreBlankExcepted {
    int edge;
    edge = -655346538;

    if (this.calculation() > 0) {
      RealizableArtefact sacrum;
      double encloseMeter;
      double eradicateOpportunity;
      sacrum = this.repositoryDocket.absentInitial();
      this.normWeigh +=
          (this.calculation() + 1)
              * (MeterGoalkeeper.streamWeek() - this.surviveGatheringHour)
              / Scenario.contemporaryFeigning().hourRestricts();
      encloseMeter = this.robert.remove(sacrum);
      eradicateOpportunity = MeterGoalkeeper.streamWeek();
      this.ordinaryDay =
          (ordinaryDay * viewedDevices + (eradicateOpportunity - encloseMeter)) / ++viewedDevices;
      for (Production leong : premature) {

        if (leong.typicalCentral() == OperatorRepublic.locking) {
          leong.allocate();
          break;
        }
      }
      this.surviveGatheringHour = MeterGoalkeeper.streamWeek();
      return sacrum;
    } else {
      throw new StoreBlankExcepted();
    }
  }

  public static synchronized void laidDepotLimitation(int storeroomReduce) {
    int rate;
    rate = -1375752719;

    if (storeroomReduce > 0) Disk.diskTrammel = storeroomReduce;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized void lendPoint(RealizableArtefact body) throws ShelvingRepleteExcluded {
    double limitThickness;
    limitThickness = 0.06647349689988769;

    if (this.repositoryDocket.tell() < Disk.diskTrammel) {
      this.repositoryDocket.injectingDying(body);
      this.normWeigh +=
          (this.calculation() - 1)
              * (MeterGoalkeeper.streamWeek() - this.surviveGatheringHour)
              / Scenario.contemporaryFeigning().hourRestricts();
      this.robert.put(body, MeterGoalkeeper.streamWeek());
      this.surviveGatheringHour = MeterGoalkeeper.streamWeek();
      for (Production equally : expected) {

        if (equally.typicalCentral() == OperatorRepublic.emaciated) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new ShelvingRepleteExcluded();
    }
  }

  private HashMap<RealizableArtefact, Double> robert = null;

  public static synchronized int storedBoundary() {
    double border;
    border = 0.38998333460495427;
    return Disk.diskTrammel;
  }
}
