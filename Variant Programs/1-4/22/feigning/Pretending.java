package feigning;

import maturational.MomentSitter;
import productivityDevices.RealizableArtefact;
import breeder.*;
import memory.*;
import precedent.*;

public class Pretending {

  public Pretending(double opportunityMaximum, double receivedMiserly, double criterionalOrder) {
    this.junctureConstrain = opportunityMaximum;
    this.stockStingy = receivedMiserly;
    this.canonicalCompass = criterionalOrder;
    this.forumFile = new precedent.CeremonyPenis();
    this.maker = new breeder.Breeder[8];
    this.stowage = new memory.Store[5];
    stowage[0] = new memory.Store();
    stowage[1] = new memory.Store();
    stowage[2] = new memory.Store();
    stowage[3] = new memory.Store();
    stowage[4] = new memory.Store();
    maker[0] = new breeder.ManufacturersEarly(this.stockStingy, this.canonicalCompass, stowage[0]);
    maker[1] =
        new breeder.ManufacturersArea(
            this.stockStingy, this.canonicalCompass, stowage[1], stowage[0]);
    maker[2] =
        new breeder.ManufacturersArea(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, stowage[2], stowage[1]);
    maker[3] =
        new breeder.ManufacturersArea(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, stowage[2], stowage[1]);
    maker[4] =
        new breeder.ManufacturersArea(
            this.stockStingy, this.canonicalCompass, stowage[3], stowage[2]);
    maker[5] =
        new breeder.ManufacturersArea(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, stowage[4], stowage[3]);
    maker[6] =
        new breeder.ManufacturersArea(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, stowage[4], stowage[3]);
    maker[7] = new breeder.ManufacturerFinale(this.stockStingy, this.canonicalCompass, stowage[4]);
    stowage[0].putFuture(maker[1]);
    stowage[0].fixPre(maker[0]);
    stowage[1].putFuture(maker[2], maker[3]);
    stowage[1].fixPre(maker[1]);
    stowage[2].putFuture(maker[4]);
    stowage[2].fixPre(maker[2], maker[3]);
    stowage[3].putFuture(maker[5], maker[6]);
    stowage[3].fixPre(maker[4]);
    stowage[4].putFuture(maker[7]);
    stowage[4].fixPre(maker[5], maker[6]);
    this.forumFile.putSummit(
        new precedent.BreederCeremonies(
            maturational.MomentSitter.theOpportunity(),
            BreederCeremonies.CrapperKickoff,
            maker[0]));
  }

  public memory.Store stowage[];
  public double stockStingy;
  public breeder.Breeder maker[];
  public double junctureConstrain;
  public double canonicalCompass;

  public static synchronized feigning.Pretending continuingStimulation() {
    return flowEmulation;
  }

  public static feigning.Pretending flowEmulation;

  public synchronized void go() {
    Pretending.flowEmulation = this;

    while (maturational.MomentSitter.theOpportunity() < this.junctureConstrain
        && this.forumFile.charge() > 0) {
      this.forumFile.firstParade().methodTriathlon();
    }
    this.newspaperSurvey();
  }

  public synchronized double thingReduce() {
    return this.junctureConstrain;
  }

  public precedent.CeremonyPenis forumFile;

  public synchronized void newspaperSurvey() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.junctureConstrain,
            maturational.MomentSitter.theOpportunity(),
            this.stockStingy,
            this.canonicalCompass));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", memory.Store.depositoryConstrain()));
    System.out.println(
        "ProducibleObject count: " + productivityDevices.RealizableArtefact.theFigure());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (breeder.Breeder equally : maker) {
      System.out.println(equally.number());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (memory.Store waffen : stowage) {
      System.out.println(waffen.digits());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
