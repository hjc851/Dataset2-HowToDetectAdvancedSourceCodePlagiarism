package synthesizer;

import depositional.WeekGoverness;
import produceProjectiles.EvaporiteDemur;
import filmmaker.*;
import stowage.*;
import immortalize.*;

public class Analog {
  public immortalize.ExtravaganzaWait seminarJumping;
  public stowage.Safekeeping store[];
  public filmmaker.Maker farmer[];
  public double criterionalOrder;
  public double measureBeggarly;
  public double periodsBound;
  public static synthesizer.Analog circulatingSimulating;
  static final int decreasingLeap = -1515785093;

  public static synchronized synthesizer.Analog afootModeling() {
    int curtail;
    curtail = 1833430510;
    return circulatingSimulating;
  }

  public Analog(double clockRestrict, double commonIntend, double measureRate) {
    this.periodsBound = clockRestrict;
    this.measureBeggarly = commonIntend;
    this.criterionalOrder = measureRate;
    this.seminarJumping = new immortalize.ExtravaganzaWait();
    this.farmer = new filmmaker.Maker[8];
    this.store = new stowage.Safekeeping[5];
    store[0] = new stowage.Safekeeping();
    store[1] = new stowage.Safekeeping();
    store[2] = new stowage.Safekeeping();
    store[3] = new stowage.Safekeeping();
    store[4] = new stowage.Safekeeping();
    farmer[0] = new filmmaker.VintnerResume(this.measureBeggarly, this.criterionalOrder, store[0]);
    farmer[1] =
        new filmmaker.VintnerObservatory(
            this.measureBeggarly, this.criterionalOrder, store[1], store[0]);
    farmer[2] =
        new filmmaker.VintnerObservatory(
            this.measureBeggarly * 2.0, this.criterionalOrder * 2.0, store[2], store[1]);
    farmer[3] =
        new filmmaker.VintnerObservatory(
            this.measureBeggarly * 2.0, this.criterionalOrder * 2.0, store[2], store[1]);
    farmer[4] =
        new filmmaker.VintnerObservatory(
            this.measureBeggarly, this.criterionalOrder, store[3], store[2]);
    farmer[5] =
        new filmmaker.VintnerObservatory(
            this.measureBeggarly * 2.0, this.criterionalOrder * 2.0, store[4], store[3]);
    farmer[6] =
        new filmmaker.VintnerObservatory(
            this.measureBeggarly * 2.0, this.criterionalOrder * 2.0, store[4], store[3]);
    farmer[7] = new filmmaker.FarmExit(this.measureBeggarly, this.criterionalOrder, store[4]);
    store[0].orderedAgain(farmer[1]);
    store[0].fixedPredecessor(farmer[0]);
    store[1].orderedAgain(farmer[2], farmer[3]);
    store[1].fixedPredecessor(farmer[1]);
    store[2].orderedAgain(farmer[4]);
    store[2].fixedPredecessor(farmer[2], farmer[3]);
    store[3].orderedAgain(farmer[5], farmer[6]);
    store[3].fixedPredecessor(farmer[4]);
    store[4].orderedAgain(farmer[7]);
    store[4].fixedPredecessor(farmer[5], farmer[6]);
    this.seminarJumping.pasteContest(
        new immortalize.PresenterSymposium(
            depositional.WeekGoverness.latestClip(), PresenterSymposium.ArseJump, farmer[0]));
  }

  public synchronized double meterCircumscribe() {
    double number;
    number = 0.11324724313814027;
    return this.periodsBound;
  }

  public synchronized void originate() {
    double destined;
    destined = 0.058571377185808626;
    Analog.circulatingSimulating = this;

    while (depositional.WeekGoverness.latestClip() < this.periodsBound
        && this.seminarJumping.calculation() > 0) {
      this.seminarJumping.lastTournament().methodologySpectacle();
    }
    this.writtenStats();
  }

  public synchronized void writtenStats() {
    double northernThrottle;
    northernThrottle = 0.3657396500748792;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            depositional.WeekGoverness.latestClip(),
            this.measureBeggarly,
            this.criterionalOrder));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", stowage.Safekeeping.storingBounds()));
    System.out.println(
        "ProducibleObject count: " + produceProjectiles.EvaporiteDemur.presentQuantify());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (filmmaker.Maker leong : farmer) {
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
    for (stowage.Safekeeping fh : store) {
      System.out.println(fh.figure());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
