package provider;

import java.util.Random;
import checked.PeriodsManager;
import industrializationInstallations.ClasticVictim;
import shelving.*;
import tape.*;

public abstract class Fabricator {

  public synchronized void unstarve() {
    this.territory = ExporterNation.collaborate;
    this.realisticHungeringChance += PeriodsManager.formerAmount();
    CarnivalRow.theSuspense()
        .incloseCelebration(
            new BreederCeremonies(PeriodsManager.formerAmount(), BreederCeremonies.JohnPart, this));
  }

  public synchronized void unstick() {

    try {
      this.impressFlowObjetMouStowage();
      this.specificDisruptedNow += PeriodsManager.formerAmount();
      this.territory = ExporterNation.collaborate;
      CarnivalRow.theSuspense()
          .incloseCelebration(
              new BreederCeremonies(
                  PeriodsManager.formerAmount(), BreederCeremonies.JohnPart, this));
    } catch (WarehouseHeavyDeviation cma) {
      this.territory = ExporterNation.halt;
      return;
    }
  }

  public Stowage lastStored, precedingStorehouse;
  public int radioEst = presenterAnticipate++;

  protected abstract void awardedNewMatter() throws GarageEvacuateCase;

  public static int presenterAnticipate = 0;
  public double absoluteIndustrializationJuncture;

  public synchronized String toString() {
    return "Producer" + radioEst;
  }

  public double realisticHungeringChance;

  public synchronized void outgrowthLastArtefact() {
    double writes;

    if (this.liveArtefact != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (WarehouseHeavyDeviation samad) {
        this.territory = ExporterNation.halt;
        this.specificDisruptedNow -= PeriodsManager.formerAmount();
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (GarageEvacuateCase ej) {
      this.territory = ExporterNation.pizza;
      this.realisticHungeringChance -= PeriodsManager.formerAmount();
      return;
    }
    writes = producesPoor + extractionRun * (casualFarm.nextDouble() - 0.5);
    this.absoluteIndustrializationJuncture += writes;
    CarnivalRow.theSuspense()
        .incloseCelebration(
            new BreederCeremonies(
                PeriodsManager.formerAmount() + writes,
                BreederCeremonies.NeedsCompletingDemur,
                this));
  }

  public synchronized ExporterNation formerTerritory() {
    return this.territory;
  }

  protected abstract void impressFlowObjetMouStowage() throws WarehouseHeavyDeviation;

  public double producesPoor;

  public synchronized void init(double hateful, double array, Stowage come, Stowage old) {
    this.producesPoor = hateful;
    this.extractionRun = array;
    this.lastStored = come;
    this.precedingStorehouse = old;
    this.absoluteIndustrializationJuncture = 0;
    this.realisticHungeringChance = 0;
    this.specificDisruptedNow = 0;
  }

  public synchronized String agency() {

    if (territory == ExporterNation.pizza) {
      this.realisticHungeringChance += PeriodsManager.formerAmount();
      this.territory = ExporterNation.hibernating;
    } else if (this.territory == ExporterNation.halt) {
      this.specificDisruptedNow += PeriodsManager.formerAmount();
      this.territory = ExporterNation.hibernating;
    } else {
      this.territory = ExporterNation.hibernating;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.absoluteIndustrializationJuncture / PeriodsManager.formerAmount() * 100.0,
        this.realisticHungeringChance / PeriodsManager.formerAmount() * 100.0,
        this.specificDisruptedNow / PeriodsManager.formerAmount() * 100.0);
  }

  public double extractionRun;
  public double specificDisruptedNow;
  public static final Random casualFarm = new Random();
  public ClasticVictim liveArtefact;
  public ExporterNation territory;
}
