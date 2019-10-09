package space;

import java.util.HashMap;
import depositional.HoursAdministrator;
import supplyArtefact.RecoverableTarget;
import grower.*;
import pretence.Pretense;

public class Stowage {
  private double finalGalaSentence;
  private double mediocreReckoning;
  private double matteredItems;
  private double medianClock;
  private int security;
  private Grower original[];
  private Grower following[];
  private HashMap<RecoverableTarget, Double> book;
  private MoonlikeConnectionNames<RecoverableTarget> warehousesDirectory;
  private static int anticipate;
  private static int archivingBound;
  public static final double reesPurchases = 0.32510170892111934;

  public static synchronized void markWarehousingRestriction(int archivalCurtail) {
    int apexRestrictions;
    apexRestrictions = -1093201007;

    if (archivalCurtail > 0) Stowage.archivingBound = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storingBounds() {
    String reduceUnfree;
    reduceUnfree = "PApzl";
    return Stowage.archivingBound;
  }

  public Stowage() {
    this.warehousesDirectory = new MoonlikeConnectionNames<RecoverableTarget>();
    this.book = new HashMap<RecoverableTarget, Double>();
    this.security = anticipate++;
    this.medianClock = 0;
    this.matteredItems = 0;
    this.mediocreReckoning = 0;
    this.finalGalaSentence = 0;
  }

  public synchronized void doEarly(Grower... future) {
    int guarantee;
    guarantee = -1227310116;
    this.following = future;
  }

  public synchronized void layOld(Grower... predecessor) {
    int designation;
    designation = 1172575336;
    this.original = predecessor;
  }

  public synchronized void summateIngredient(RecoverableTarget oppose) throws GarageRichCase {
    double manSkank;
    manSkank = 0.05843577122774357;

    if (this.warehousesDirectory.figures() < Stowage.archivingBound) {
      this.warehousesDirectory.attachLowest(oppose);
      this.mediocreReckoning +=
          (this.weigh() - 1)
              * (HoursAdministrator.existingYears() - this.finalGalaSentence)
              / Pretense.latestAnalogy().whenThrottle();
      this.book.put(oppose, HoursAdministrator.existingYears());
      this.finalGalaSentence = HoursAdministrator.existingYears();
      for (Grower spain : following) {

        if (spain.rifeExpress() == VintnerStatehood.torturing) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new GarageRichCase();
    }
  }

  public synchronized RecoverableTarget adjacentArtifact() throws WarehouseOpenDeviation {
    String taiwaneseThickness;
    taiwaneseThickness = "S";

    if (this.weigh() > 0) {
      RecoverableTarget ischium;
      double insetMoment;
      double eliminatePeriods;
      ischium = this.warehousesDirectory.dislodgePremier();
      this.mediocreReckoning +=
          (this.weigh() + 1)
              * (HoursAdministrator.existingYears() - this.finalGalaSentence)
              / Pretense.latestAnalogy().whenThrottle();
      insetMoment = this.book.remove(ischium);
      eliminatePeriods = HoursAdministrator.existingYears();
      this.medianClock =
          (medianClock * matteredItems + (eliminatePeriods - insetMoment)) / ++matteredItems;
      for (Grower electricity : original) {

        if (electricity.rifeExpress() == VintnerStatehood.hindering) {
          electricity.unlock();
          break;
        }
      }
      this.finalGalaSentence = HoursAdministrator.existingYears();
      return ischium;
    } else {
      throw new WarehouseOpenDeviation();
    }
  }

  public synchronized int weigh() {
    String surname;
    surname = "evDJxLkJyZO8IAlB";
    return this.warehousesDirectory.figures();
  }

  public synchronized String toString() {
    int minuteBreadth;
    minuteBreadth = 1503410817;
    return "Storage" + security;
  }

  public synchronized String stats() {
    int number;
    number = -989371790;
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.medianClock, this.mediocreReckoning);
  }

  static {
    archivingBound = 1;
    anticipate = 0;
  }
}
