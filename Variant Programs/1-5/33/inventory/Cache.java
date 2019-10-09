package inventory;

import java.util.HashMap;
import indiscernible.PeriodWarden;
import productivityDevices.StorableSubject;
import promoter.*;
import simulating.Feigning;
import static java.lang.String.format;

public class Cache {
  public int handle;
  public static int closetMax = 1;

  public static synchronized int depotLimitation() {
    return Cache.closetMax;
  }

  public Cache() {
    this.repositoryDocket = new FlierAttributedShortlist<StorableSubject>();
    this.idioticon = new HashMap<StorableSubject, Double>();
    this.handle = sideboard++;
    this.medianClock = 0;
    this.talliedObjective = 0;
    this.ratesFigures = 0;
    this.laterExtravaganzaClip = 0;
  }

  public Director past[];
  public double medianClock;
  public double talliedObjective;

  public synchronized String toString() {
    return "Storage" + handle;
  }

  public synchronized int calculate() {
    return this.repositoryDocket.enumerate();
  }

  public synchronized void fixedPredecessor(Director... ago) {
    this.past = ago;
  }

  public double laterExtravaganzaClip;
  public double ratesFigures;
  public FlierAttributedShortlist<StorableSubject> repositoryDocket;

  public static synchronized void fitWarehouseDemarcation(int archivingBound) {

    if (archivingBound > 0) Cache.closetMax = archivingBound;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized StorableSubject lastElement() throws DepotUnfilledCaveat {

    if (this.calculate() > 0) {
      StorableSubject hamatum = this.repositoryDocket.expelOriginal();
      this.ratesFigures +=
          (this.calculate() + 1)
              * (PeriodWarden.presentBeginning() - this.laterExtravaganzaClip)
              / Feigning.existingExperiment().hourRestricts();
      double infixDays = this.idioticon.remove(hamatum);
      double expelMonth = PeriodWarden.presentBeginning();
      this.medianClock =
          (medianClock * talliedObjective + (expelMonth - infixDays)) / ++talliedObjective;
      for (Director leong : past) {

        if (leong.flowNational() == ExporterNation.disrupting) {
          leong.undo();
          break;
        }
      }
      this.laterExtravaganzaClip = PeriodWarden.presentBeginning();
      return hamatum;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  public Director ahead[];

  public synchronized void extendSubject(StorableSubject objet) throws ArchivingBrimfulDistinction {

    if (this.repositoryDocket.enumerate() < Cache.closetMax) {
      this.repositoryDocket.tuckPast(objet);
      this.ratesFigures +=
          (this.calculate() - 1)
              * (PeriodWarden.presentBeginning() - this.laterExtravaganzaClip)
              / Feigning.existingExperiment().hourRestricts();
      this.idioticon.put(objet, PeriodWarden.presentBeginning());
      this.laterExtravaganzaClip = PeriodWarden.presentBeginning();
      for (Director electricity : ahead) {

        if (electricity.flowNational() == ExporterNation.underfed) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new ArchivingBrimfulDistinction();
    }
  }

  public static int sideboard = 0;
  public HashMap<StorableSubject, Double> idioticon;

  public synchronized String estimates() {
    return format("| %-14s | %-12.11s | %-12.11s  |", this, this.medianClock, this.ratesFigures);
  }

  public synchronized void prepareSecond(Director... later) {
    this.ahead = later;
  }
}
