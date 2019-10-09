package analog;

import maturational.OpportunityCarer;
import cultivationBodies.RecoverableTarget;
import presenter.*;
import archiving.*;
import platter.*;

public class Dramatization {
  private static analog.Dramatization prevailingModel = null;

  public static synchronized analog.Dramatization actualPretending() {
    return prevailingModel;
  }

  private double whenThrottle = 0.0;
  private double stockStingy = 0.0;
  private double basicAmbit = 0.0;
  private presenter.Manufacturer producing[] = null;
  private archiving.Cache stowage[] = null;
  private platter.ParadeConvoy expositionCola = null;

  public Dramatization(double meterCircumscribe, double prescriptiveMingy, double acceptableReach) {
    this.whenThrottle = meterCircumscribe;
    this.stockStingy = prescriptiveMingy;
    this.basicAmbit = acceptableReach;
    this.expositionCola = new platter.ParadeConvoy();
    this.producing = new presenter.Manufacturer[8];
    this.stowage = new archiving.Cache[5];
    stowage[0] = new archiving.Cache();
    stowage[1] = new archiving.Cache();
    stowage[2] = new archiving.Cache();
    stowage[3] = new archiving.Cache();
    stowage[4] = new archiving.Cache();
    producing[0] = new presenter.ProducingGo(this.stockStingy, this.basicAmbit, stowage[0]);
    producing[1] =
        new presenter.OutputTerminal(this.stockStingy, this.basicAmbit, stowage[1], stowage[0]);
    producing[2] =
        new presenter.OutputTerminal(
            this.stockStingy * 2.0, this.basicAmbit * 2.0, stowage[2], stowage[1]);
    producing[3] =
        new presenter.OutputTerminal(
            this.stockStingy * 2.0, this.basicAmbit * 2.0, stowage[2], stowage[1]);
    producing[4] =
        new presenter.OutputTerminal(this.stockStingy, this.basicAmbit, stowage[3], stowage[2]);
    producing[5] =
        new presenter.OutputTerminal(
            this.stockStingy * 2.0, this.basicAmbit * 2.0, stowage[4], stowage[3]);
    producing[6] =
        new presenter.OutputTerminal(
            this.stockStingy * 2.0, this.basicAmbit * 2.0, stowage[4], stowage[3]);
    producing[7] = new presenter.ProviderAccomplish(this.stockStingy, this.basicAmbit, stowage[4]);
    stowage[0].putFuture(producing[1]);
    stowage[0].rigidPreliminary(producing[0]);
    stowage[1].putFuture(producing[2], producing[3]);
    stowage[1].rigidPreliminary(producing[1]);
    stowage[2].putFuture(producing[4]);
    stowage[2].rigidPreliminary(producing[2], producing[3]);
    stowage[3].putFuture(producing[5], producing[6]);
    stowage[3].rigidPreliminary(producing[4]);
    stowage[4].putFuture(producing[7]);
    stowage[4].rigidPreliminary(producing[5], producing[6]);
    this.expositionCola.infixTournament(
        new platter.BreederCeremonies(
            maturational.OpportunityCarer.actualSentence(),
            BreederCeremonies.BacksideStartle,
            producing[0]));
  }

  public synchronized double thingReduce() {
    return this.whenThrottle;
  }

  public synchronized void run() {
    Dramatization.prevailingModel = this;

    while (maturational.OpportunityCarer.actualSentence() < this.whenThrottle
        && this.expositionCola.tabulation() > 0) {
      this.expositionCola.afterSpectacle().appendageSymposium();
    }
    this.paperSurveys();
  }

  private synchronized void paperSurveys() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle,
            maturational.OpportunityCarer.actualSentence(),
            this.stockStingy,
            this.basicAmbit));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", archiving.Cache.storingBounds()));
    System.out.println(
        "ProducibleObject count: " + cultivationBodies.RecoverableTarget.flowNumbers());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (presenter.Manufacturer spain : producing) {
      System.out.println(spain.statisticians());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (archiving.Cache ora : stowage) {
      System.out.println(ora.records());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
