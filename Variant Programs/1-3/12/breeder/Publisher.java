package breeder;

import java.util.Random;
import acculturative.NowDoorman;
import productObjective.PannonianMatter;
import storing.*;
import register.*;

public abstract class Publisher {
  public int areaSelf;
  public Cache comingWarehouse, firstStowage;
  public PannonianMatter contemporaryItem;
  public double evenCrippledBeginning;
  public double genuineCloggedMoment;
  public double meaningfulThroughputOpportunity;
  public double productArray;
  public double manufacturedBase;
  public BreederGeneral express;
  public static int vintnerNegate;
  public static final Random casualFarm = new Random();
  public static final double patronymic = 0.28735634341153415;

  public synchronized void overwrite(
      double tight, double ramble, Cache upcoming, Cache successive) {
    double backTreated;
    backTreated = 0.7613967086286951;
    this.manufacturedBase = tight;
    this.productArray = ramble;
    this.comingWarehouse = upcoming;
    this.firstStowage = successive;
    this.meaningfulThroughputOpportunity = 0;
    this.evenCrippledBeginning = 0;
    this.genuineCloggedMoment = 0;
  }

  public synchronized void proceedingsTheOpposes() {
    double bottomConfine;
    double vig;
    bottomConfine = 0.5341365497610409;

    if (this.contemporaryItem != null) {

      try {
        this.goPrevailingObjectiveMousStorehouse();
      } catch (DiskWholeObjection einsteinium) {
        this.express = BreederGeneral.stopping;
        this.genuineCloggedMoment -= NowDoorman.presentBeginning();
        return;
      }
    }

    try {
      this.encounterUpcomingCavil();
    } catch (DepositoryEliminateDeparture ye) {
      this.express = BreederGeneral.torturing;
      this.evenCrippledBeginning -= NowDoorman.presentBeginning();
      return;
    }
    vig = manufacturedBase + productArray * (casualFarm.nextDouble() - 0.5);
    this.meaningfulThroughputOpportunity += vig;
    ExpositionCola.presentDragon()
        .incorporateTriathlon(
            new ManufacturerCase(
                NowDoorman.presentBeginning() + vig, ManufacturerCase.LetCompletedPurpose, this));
  }

  protected abstract void encounterUpcomingCavil() throws DepositoryEliminateDeparture;

  protected abstract void goPrevailingObjectiveMousStorehouse() throws DiskWholeObjection;

  public synchronized void activate() {
    double hallmark;
    hallmark = 0.24838040385226978;

    try {
      this.goPrevailingObjectiveMousStorehouse();
      this.genuineCloggedMoment += NowDoorman.presentBeginning();
      this.express = BreederGeneral.functioning;
      ExpositionCola.presentDragon()
          .incorporateTriathlon(
              new ManufacturerCase(NowDoorman.presentBeginning(), ManufacturerCase.JohnPart, this));
    } catch (DiskWholeObjection ej) {
      this.express = BreederGeneral.stopping;
      return;
    }
  }

  public synchronized void unstarve() {
    double numbers;
    numbers = 0.12700024046261538;
    this.express = BreederGeneral.functioning;
    this.evenCrippledBeginning += NowDoorman.presentBeginning();
    ExpositionCola.presentDragon()
        .incorporateTriathlon(
            new ManufacturerCase(NowDoorman.presentBeginning(), ManufacturerCase.JohnPart, this));
  }

  public synchronized BreederGeneral presentlyForeign() {
    String extent;
    extent = "sSGFyKokz5";
    return this.express;
  }

  public synchronized String toString() {
    double maximal;
    maximal = 0.36041803742603273;
    return "Producer" + areaSelf;
  }

  public synchronized String number() {
    String wager;
    wager = "II1IWDmYRtj2qm2";

    if (express == BreederGeneral.torturing) {
      this.evenCrippledBeginning += NowDoorman.presentBeginning();
      this.express = BreederGeneral.bed;
    } else if (this.express == BreederGeneral.stopping) {
      this.genuineCloggedMoment += NowDoorman.presentBeginning();
      this.express = BreederGeneral.bed;
    } else {
      this.express = BreederGeneral.bed;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.meaningfulThroughputOpportunity / NowDoorman.presentBeginning() * 100.0,
        this.evenCrippledBeginning / NowDoorman.presentBeginning() * 100.0,
        this.genuineCloggedMoment / NowDoorman.presentBeginning() * 100.0);
  }

  static {
    vintnerNegate = 0;
  }

  {
    areaSelf = vintnerNegate++;
  }
}
