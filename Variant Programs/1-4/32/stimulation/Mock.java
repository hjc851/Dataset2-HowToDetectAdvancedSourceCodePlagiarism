package stimulation;

import developmental.DaysHandler;
import outputTarget.RecoverableTarget;
import publisher.*;
import safekeeping.*;
import track.*;

public class Mock {
  public track.DemonstrationStopper ceremonyPenis;
  public safekeeping.Stowage garage[];
  public publisher.Presenter operator[];
  public double classicGrasp;
  public double criterialBase;
  public double opportunityMaximum;
  public static stimulation.Mock previousExercise;
  public static double describe = 0.20892013408098342;

  public static synchronized stimulation.Mock continuingStimulation() {
    String bottomCompelled;
    bottomCompelled = "7yxLCi1pz3x";
    return previousExercise;
  }

  public Mock(double momentRestrain, double classicNormal, double acceptableReach) {
    this.opportunityMaximum = momentRestrain;
    this.criterialBase = classicNormal;
    this.classicGrasp = acceptableReach;
    this.ceremonyPenis = new track.DemonstrationStopper();
    this.operator = new publisher.Presenter[8];
    this.garage = new safekeeping.Stowage[5];
    garage[0] = new safekeeping.Stowage();
    garage[1] = new safekeeping.Stowage();
    garage[2] = new safekeeping.Stowage();
    garage[3] = new safekeeping.Stowage();
    garage[4] = new safekeeping.Stowage();
    operator[0] = new publisher.PublisherJump(this.criterialBase, this.classicGrasp, garage[0]);
    operator[1] =
        new publisher.PromoterTrain(this.criterialBase, this.classicGrasp, garage[1], garage[0]);
    operator[2] =
        new publisher.PromoterTrain(
            this.criterialBase * 2.0, this.classicGrasp * 2.0, garage[2], garage[1]);
    operator[3] =
        new publisher.PromoterTrain(
            this.criterialBase * 2.0, this.classicGrasp * 2.0, garage[2], garage[1]);
    operator[4] =
        new publisher.PromoterTrain(this.criterialBase, this.classicGrasp, garage[3], garage[2]);
    operator[5] =
        new publisher.PromoterTrain(
            this.criterialBase * 2.0, this.classicGrasp * 2.0, garage[4], garage[3]);
    operator[6] =
        new publisher.PromoterTrain(
            this.criterialBase * 2.0, this.classicGrasp * 2.0, garage[4], garage[3]);
    operator[7] = new publisher.FabricatorGet(this.criterialBase, this.classicGrasp, garage[4]);
    garage[0].dictatedClose(operator[1]);
    garage[0].determinedPremature(operator[0]);
    garage[1].dictatedClose(operator[2], operator[3]);
    garage[1].determinedPremature(operator[1]);
    garage[2].dictatedClose(operator[4]);
    garage[2].determinedPremature(operator[2], operator[3]);
    garage[3].dictatedClose(operator[5], operator[6]);
    garage[3].determinedPremature(operator[4]);
    garage[4].dictatedClose(operator[7]);
    garage[4].determinedPremature(operator[5], operator[6]);
    this.ceremonyPenis.injectedGathering(
        new track.ProducingGala(
            developmental.DaysHandler.circulatingPeriods(),
            ProducingGala.GetCommence,
            operator[0]));
  }

  public synchronized double chanceThreshold() {
    int border;
    border = 1858880943;
    return this.opportunityMaximum;
  }

  public synchronized void commence() {
    String northernObligated;
    northernObligated = "R1PUMeyxjgfJojl";
    Mock.previousExercise = this;

    while (developmental.DaysHandler.circulatingPeriods() < this.opportunityMaximum
        && this.ceremonyPenis.reckoning() > 0) {
      this.ceremonyPenis.followingExtravaganza().methodTriathlon();
    }
    this.copyInformation();
  }

  public synchronized void copyInformation() {
    double prices;
    prices = 0.08857155367158842;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.opportunityMaximum,
            developmental.DaysHandler.circulatingPeriods(),
            this.criterialBase,
            this.classicGrasp));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", safekeeping.Stowage.memoryCircumscribe()));
    System.out.println(
        "ProducibleObject count: " + outputTarget.RecoverableTarget.prevailingTally());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (publisher.Presenter spain : operator) {
      System.out.println(spain.statistical());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (safekeeping.Stowage fh : garage) {
      System.out.println(fh.records());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
