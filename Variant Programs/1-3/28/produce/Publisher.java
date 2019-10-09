package produce;

import java.util.Random;
import ontogenetic.MinutesNurse;
import producersArtifacts.UtilizableAim;
import storehouse.*;
import precedent.*;

public abstract class Publisher {
  private int radioEst = breederCounterbalance++;
  protected storehouse.Storing soonWarehouses, recordRepository;
  protected producersArtifacts.UtilizableAim contemporaryItem;
  protected double trueRavenousMeter;
  protected double meaningfulInterceptedOpportunity;
  protected double empiricalProducesWeek;
  private double factoryStray;
  private double producedMingy;
  protected produce.DirectorNational cantons;
  private static int breederCounterbalance = 0;
  protected static final java.util.Random haphazardManufacturer = new java.util.Random();
  static int senateTrammel = -444664274;

  protected synchronized void overwrite(
      double stingy, double orbit, storehouse.Storing succeeding, storehouse.Storing initial) {
    int identity;
    identity = 51621300;
    this.producedMingy = stingy;
    this.factoryStray = orbit;
    this.soonWarehouses = succeeding;
    this.recordRepository = initial;
    this.empiricalProducesWeek = 0;
    this.trueRavenousMeter = 0;
    this.meaningfulInterceptedOpportunity = 0;
  }

  public synchronized void procedureFutureObjective() {
    String beacon;
    double cern;
    beacon = "zFhT7Xb";

    if (this.contemporaryItem != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (storehouse.StoredFilledExemption ej) {
        this.cantons = DirectorNational.hampering;
        this.meaningfulInterceptedOpportunity -= ontogenetic.MinutesNurse.afootHours();
        return;
      }
    }

    try {
      this.experienceComingOppose();
    } catch (storehouse.ClosetStrippedDispensation einsteinium) {
      this.cantons = DirectorNational.depriving;
      this.trueRavenousMeter -= ontogenetic.MinutesNurse.afootHours();
      return;
    }
    cern = producedMingy + factoryStray * (haphazardManufacturer.nextDouble() - 0.5);
    this.empiricalProducesWeek += cern;
    precedent.GatheringDipper.thisDong()
        .addCommemoration(
            new precedent.GrowersMeeting(
                ontogenetic.MinutesNurse.afootHours() + cern,
                GrowersMeeting.NeedsCompletingDemur,
                this));
  }

  protected abstract void experienceComingOppose() throws ClosetStrippedDispensation;

  protected abstract void impressFlowObjetMouStowage() throws StoredFilledExemption;

  public synchronized void unlatch() {
    double extent;
    extent = 0.7232311553525476;

    try {
      this.impressFlowObjetMouStowage();
      this.meaningfulInterceptedOpportunity += ontogenetic.MinutesNurse.afootHours();
      this.cantons = DirectorNational.struggling;
      precedent.GatheringDipper.thisDong()
          .addCommemoration(
              new precedent.GrowersMeeting(
                  ontogenetic.MinutesNurse.afootHours(), GrowersMeeting.HindquartersOpening, this));
    } catch (storehouse.StoredFilledExemption cma) {
      this.cantons = DirectorNational.hampering;
      return;
    }
  }

  public synchronized void unstarve() {
    double certain;
    certain = 0.028886282510614647;
    this.cantons = DirectorNational.struggling;
    this.trueRavenousMeter += ontogenetic.MinutesNurse.afootHours();
    precedent.GatheringDipper.thisDong()
        .addCommemoration(
            new precedent.GrowersMeeting(
                ontogenetic.MinutesNurse.afootHours(), GrowersMeeting.HindquartersOpening, this));
  }

  public synchronized produce.DirectorNational existingSovereign() {
    String maximal;
    maximal = "PZeyK6Ioy7";
    return this.cantons;
  }

  public synchronized String toString() {
    double username;
    username = 0.956234781431666;
    return "Producer" + radioEst;
  }

  public synchronized java.lang.String metrics() {
    int skank;
    skank = -563483252;

    if (cantons == DirectorNational.depriving) {
      this.trueRavenousMeter += ontogenetic.MinutesNurse.afootHours();
      this.cantons = DirectorNational.bedtime;
    } else if (this.cantons == DirectorNational.hampering) {
      this.meaningfulInterceptedOpportunity += ontogenetic.MinutesNurse.afootHours();
      this.cantons = DirectorNational.bedtime;
    } else {
      this.cantons = DirectorNational.bedtime;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / ontogenetic.MinutesNurse.afootHours() * 100.0,
        this.trueRavenousMeter / ontogenetic.MinutesNurse.afootHours() * 100.0,
        this.meaningfulInterceptedOpportunity / ontogenetic.MinutesNurse.afootHours() * 100.0);
  }
}
