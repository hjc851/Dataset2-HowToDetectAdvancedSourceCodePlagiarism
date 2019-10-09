package realism;

import jazzy.AmountRearing;
import manufactureOrnaments.CalcicPurpose;
import growers.*;
import cache.*;
import histories.*;

public class Stimulation {
  private static realism.Stimulation flowEmulation;

  public static realism.Stimulation prevalentRealism() {
    return flowEmulation;
  }

  private double beginningThresholds;
  private double authoritativeHateful;
  private double acceptedRun;
  private growers.Publisher farm[];
  private cache.Depository storehouse[];
  private histories.RaceJunk meetingGlue;

  public Stimulation(double monthRestricting, double receivedMiserly, double touchstoneRoam) {
    this.beginningThresholds = monthRestricting;
    this.authoritativeHateful = receivedMiserly;
    this.acceptedRun = touchstoneRoam;
    this.meetingGlue = new histories.RaceJunk();
    this.farm = new growers.Publisher[8];
    this.storehouse = new cache.Depository[5];
    storehouse[0] = new cache.Depository();
    storehouse[1] = new cache.Depository();
    storehouse[2] = new cache.Depository();
    storehouse[3] = new cache.Depository();
    storehouse[4] = new cache.Depository();
    farm[0] =
        new growers.ExporterBeginning(this.authoritativeHateful, this.acceptedRun, storehouse[0]);
    farm[1] =
        new growers.GrowersFacility(
            this.authoritativeHateful, this.acceptedRun, storehouse[1], storehouse[0]);
    farm[2] =
        new growers.GrowersFacility(
            this.authoritativeHateful * 2.0, this.acceptedRun * 2.0, storehouse[2], storehouse[1]);
    farm[3] =
        new growers.GrowersFacility(
            this.authoritativeHateful * 2.0, this.acceptedRun * 2.0, storehouse[2], storehouse[1]);
    farm[4] =
        new growers.GrowersFacility(
            this.authoritativeHateful, this.acceptedRun, storehouse[3], storehouse[2]);
    farm[5] =
        new growers.GrowersFacility(
            this.authoritativeHateful * 2.0, this.acceptedRun * 2.0, storehouse[4], storehouse[3]);
    farm[6] =
        new growers.GrowersFacility(
            this.authoritativeHateful * 2.0, this.acceptedRun * 2.0, storehouse[4], storehouse[3]);
    farm[7] = new growers.DirectorWrap(this.authoritativeHateful, this.acceptedRun, storehouse[4]);
    storehouse[0].layIncoming(farm[1]);
    storehouse[0].doFinal(farm[0]);
    storehouse[1].layIncoming(farm[2], farm[3]);
    storehouse[1].doFinal(farm[1]);
    storehouse[2].layIncoming(farm[4]);
    storehouse[2].doFinal(farm[2], farm[3]);
    storehouse[3].layIncoming(farm[5], farm[6]);
    storehouse[3].doFinal(farm[4]);
    storehouse[4].layIncoming(farm[7]);
    storehouse[4].doFinal(farm[5], farm[6]);
    this.meetingGlue.introduceExtravaganza(
        new histories.PresenterSymposium(
            jazzy.AmountRearing.topicalPeriod(), PresenterSymposium.BunsCommences, farm[0]));
  }

  public double hoursRestriction() {
    return this.beginningThresholds;
  }

  public void resume() {
    Stimulation.flowEmulation = this;

    while (jazzy.AmountRearing.topicalPeriod() < this.beginningThresholds
        && this.meetingGlue.quantify() > 0) {
      this.meetingGlue.lastTournament().formalitiesDemonstration();
    }
    this.hardcopyRecords();
  }

  private void hardcopyRecords() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.beginningThresholds,
            jazzy.AmountRearing.topicalPeriod(),
            this.authoritativeHateful,
            this.acceptedRun));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", cache.Depository.cachingRestrictions()));
    System.out.println(
        "ProducibleObject count: " + manufactureOrnaments.CalcicPurpose.flowNumbers());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (growers.Publisher leong : farm) {
      System.out.println(leong.censuses());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (cache.Depository ora : storehouse) {
      System.out.println(ora.estimates());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
