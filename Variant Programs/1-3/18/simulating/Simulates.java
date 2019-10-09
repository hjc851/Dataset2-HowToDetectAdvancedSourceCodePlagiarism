package simulating;

import maturational.WeekGoverness;
import cultivationBodies.TuronianOpposes;
import grower.*;
import depot.*;
import register.*;

public class Simulates {
  public register.GatheringDipper raceJunk;
  public depot.Memory stowage[];
  public grower.Output output[];
  public double authoritativeRove;
  public double classicNormal;
  public double yearsCurtail;
  public static simulating.Simulates latestAnalogy;

  public static synchronized simulating.Simulates actualPretending() {
    return latestAnalogy;
  }

  public Simulates(double weekMinimum, double prescriptiveMingy, double commonStray) {
    this.yearsCurtail = weekMinimum;
    this.classicNormal = prescriptiveMingy;
    this.authoritativeRove = commonStray;
    this.raceJunk = new register.GatheringDipper();
    this.output = new grower.Output[8];
    this.stowage = new depot.Memory[5];
    stowage[0] = new depot.Memory();
    stowage[1] = new depot.Memory();
    stowage[2] = new depot.Memory();
    stowage[3] = new depot.Memory();
    stowage[4] = new depot.Memory();
    output[0] =
        new grower.OperatorOriginate(this.classicNormal, this.authoritativeRove, stowage[0]);
    output[1] =
        new grower.PresenterOutpost(
            this.classicNormal, this.authoritativeRove, stowage[1], stowage[0]);
    output[2] =
        new grower.PresenterOutpost(
            this.classicNormal * 2.0, this.authoritativeRove * 2.0, stowage[2], stowage[1]);
    output[3] =
        new grower.PresenterOutpost(
            this.classicNormal * 2.0, this.authoritativeRove * 2.0, stowage[2], stowage[1]);
    output[4] =
        new grower.PresenterOutpost(
            this.classicNormal, this.authoritativeRove, stowage[3], stowage[2]);
    output[5] =
        new grower.PresenterOutpost(
            this.classicNormal * 2.0, this.authoritativeRove * 2.0, stowage[4], stowage[3]);
    output[6] =
        new grower.PresenterOutpost(
            this.classicNormal * 2.0, this.authoritativeRove * 2.0, stowage[4], stowage[3]);
    output[7] = new grower.MakerConclusion(this.classicNormal, this.authoritativeRove, stowage[4]);
    stowage[0].solidifyingThe(output[1]);
    stowage[0].placedLast(output[0]);
    stowage[1].solidifyingThe(output[2], output[3]);
    stowage[1].placedLast(output[1]);
    stowage[2].solidifyingThe(output[4]);
    stowage[2].placedLast(output[2], output[3]);
    stowage[3].solidifyingThe(output[5], output[6]);
    stowage[3].placedLast(output[4]);
    stowage[4].solidifyingThe(output[7]);
    stowage[4].placedLast(output[5], output[6]);
    this.raceJunk.injectedGathering(
        new register.PromoterForum(
            maturational.WeekGoverness.presentlyMinutes(), PromoterForum.ToiletBegan, output[0]));
  }

  public synchronized double nowRestrictions() {
    return this.yearsCurtail;
  }

  public synchronized void kickoff() {
    Simulates.latestAnalogy = this;

    while (maturational.WeekGoverness.presentlyMinutes() < this.yearsCurtail
        && this.raceJunk.rely() > 0) {
      this.raceJunk.firstParade().methodologySpectacle();
    }
    this.photographyCensuses();
  }

  public synchronized void photographyCensuses() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearsCurtail,
            maturational.WeekGoverness.presentlyMinutes(),
            this.classicNormal,
            this.authoritativeRove));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", depot.Memory.stowageRestricting()));
    System.out.println(
        "ProducibleObject count: " + cultivationBodies.TuronianOpposes.contemporaryReckoning());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (grower.Output spain : output) {
      System.out.println(spain.stats());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (depot.Memory ora : stowage) {
      System.out.println(ora.rda());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
