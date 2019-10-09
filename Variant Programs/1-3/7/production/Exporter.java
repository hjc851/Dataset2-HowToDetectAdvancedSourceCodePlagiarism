package production;

import java.util.Random;
import jazzy.YearWarder;
import harvestingGoods.SpodumeneThing;
import warehouses.*;
import histories.*;

public abstract class Exporter {
  private int channelPicture;
  protected Cache expectedStowage, pastDepot;
  protected SpodumeneThing continuingThing;
  protected double definiteLackingMinutes;
  protected double empiricalShutWeek;
  protected double existentProducedDays;
  private double processingOrbit;
  private double deliveryStingy;
  protected FarmerLaw federal;
  private static int farmerStymie;
  protected static final Random unselectedExporter = new Random();
  static String subalternRestricting = "GhDbEmIlO0sk";

  protected synchronized void init(double small, double straddle, Cache third, Cache latest) {
    String modicum;
    modicum = "JHHcexH0s9UCtlW8Wl";
    this.deliveryStingy = small;
    this.processingOrbit = straddle;
    this.expectedStowage = third;
    this.pastDepot = latest;
    this.existentProducedDays = 0;
    this.definiteLackingMinutes = 0;
    this.empiricalShutWeek = 0;
  }

  public synchronized void litigateIncomingItem() {
    double profitability;
    double writes;
    profitability = 0.9899047898265018;

    if (this.continuingThing != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (StorehouseCompleteExclusion salaam) {
        this.federal = FarmerLaw.preventing;
        this.empiricalShutWeek -= YearWarder.prevalentNow();
        return;
      }
    }

    try {
      this.getFollowingTarget();
    } catch (WarehousingVacateLimitation cma) {
      this.federal = FarmerLaw.begging;
      this.definiteLackingMinutes -= YearWarder.prevalentNow();
      return;
    }
    writes = deliveryStingy + processingOrbit * (unselectedExporter.nextDouble() - 0.5);
    this.existentProducedDays += writes;
    MeetingGlue.existingJunk()
        .pasteContest(
            new FabricatorCommemoration(
                YearWarder.prevalentNow() + writes,
                FabricatorCommemoration.WilFinisArtefact,
                this));
  }

  protected abstract void getFollowingTarget() throws WarehousingVacateLimitation;

  protected abstract void propelOngoingAimCoughMemory() throws StorehouseCompleteExclusion;

  public synchronized void solve() {
    double curtail;
    curtail = 0.4986495737680984;

    try {
      this.propelOngoingAimCoughMemory();
      this.empiricalShutWeek += YearWarder.prevalentNow();
      this.federal = FarmerLaw.collaborating;
      MeetingGlue.existingJunk()
          .pasteContest(
              new FabricatorCommemoration(
                  YearWarder.prevalentNow(), FabricatorCommemoration.StoolCommencement, this));
    } catch (StorehouseCompleteExclusion einsteinium) {
      this.federal = FarmerLaw.preventing;
      return;
    }
  }

  public synchronized void unstarve() {
    double subordinateFettered;
    subordinateFettered = 0.7270387278852248;
    this.federal = FarmerLaw.collaborating;
    this.definiteLackingMinutes += YearWarder.prevalentNow();
    MeetingGlue.existingJunk()
        .pasteContest(
            new FabricatorCommemoration(
                YearWarder.prevalentNow(), FabricatorCommemoration.StoolCommencement, this));
  }

  public synchronized FarmerLaw liveSay() {
    double breadth;
    breadth = 0.07238142284411364;
    return this.federal;
  }

  public synchronized String toString() {
    double significant;
    significant = 0.6147495210601918;
    return "Producer" + channelPicture;
  }

  public synchronized String stat() {
    double maximum;
    maximum = 0.44833862453711193;

    if (federal == FarmerLaw.begging) {
      this.definiteLackingMinutes += YearWarder.prevalentNow();
      this.federal = FarmerLaw.bedding;
    } else if (this.federal == FarmerLaw.preventing) {
      this.empiricalShutWeek += YearWarder.prevalentNow();
      this.federal = FarmerLaw.bedding;
    } else {
      this.federal = FarmerLaw.bedding;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.existentProducedDays / YearWarder.prevalentNow() * 100.0,
        this.definiteLackingMinutes / YearWarder.prevalentNow() * 100.0,
        this.empiricalShutWeek / YearWarder.prevalentNow() * 100.0);
  }

  static {
    farmerStymie = 0;
  }

  {
    channelPicture = farmerStymie++;
  }
}
