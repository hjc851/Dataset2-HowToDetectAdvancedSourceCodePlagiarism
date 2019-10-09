package simulate;

import probable.PeriodWarden;
import productivityDevices.HypabyssalTotem;
import filmmaker.*;
import store.*;
import disc.*;

public class Modeling {
  public disc.SymposiumSufferance tournamentStandby;
  public store.Warehousing stored[];
  public filmmaker.Commodity presenter[];
  public double acceptedRun;
  public double basicThink;
  public double momentRestrain;
  public static simulate.Modeling typicalTrainer;
  public static double jesus = 0.8123214753084617;

  public static synchronized simulate.Modeling ongoingPretence() {
    int subalternRestricting;
    subalternRestricting = -714548577;
    return typicalTrainer;
  }

  public Modeling(double periodsBound, double classicNormal, double basicAmbit) {
    this.momentRestrain = periodsBound;
    this.basicThink = classicNormal;
    this.acceptedRun = basicAmbit;
    this.tournamentStandby = new disc.SymposiumSufferance();
    this.presenter = new filmmaker.Commodity[8];
    this.stored = new store.Warehousing[5];
    stored[0] = new store.Warehousing();
    stored[1] = new store.Warehousing();
    stored[2] = new store.Warehousing();
    stored[3] = new store.Warehousing();
    stored[4] = new store.Warehousing();
    presenter[0] = new filmmaker.MakerOutset(this.basicThink, this.acceptedRun, stored[0]);
    presenter[1] =
        new filmmaker.PresenterOutpost(this.basicThink, this.acceptedRun, stored[1], stored[0]);
    presenter[2] =
        new filmmaker.PresenterOutpost(
            this.basicThink * 2.0, this.acceptedRun * 2.0, stored[2], stored[1]);
    presenter[3] =
        new filmmaker.PresenterOutpost(
            this.basicThink * 2.0, this.acceptedRun * 2.0, stored[2], stored[1]);
    presenter[4] =
        new filmmaker.PresenterOutpost(this.basicThink, this.acceptedRun, stored[3], stored[2]);
    presenter[5] =
        new filmmaker.PresenterOutpost(
            this.basicThink * 2.0, this.acceptedRun * 2.0, stored[4], stored[3]);
    presenter[6] =
        new filmmaker.PresenterOutpost(
            this.basicThink * 2.0, this.acceptedRun * 2.0, stored[4], stored[3]);
    presenter[7] = new filmmaker.GrowerTerminate(this.basicThink, this.acceptedRun, stored[4]);
    stored[0].determinedLast(presenter[1]);
    stored[0].situatedLatest(presenter[0]);
    stored[1].determinedLast(presenter[2], presenter[3]);
    stored[1].situatedLatest(presenter[1]);
    stored[2].determinedLast(presenter[4]);
    stored[2].situatedLatest(presenter[2], presenter[3]);
    stored[3].determinedLast(presenter[5], presenter[6]);
    stored[3].situatedLatest(presenter[4]);
    stored[4].determinedLast(presenter[7]);
    stored[4].situatedLatest(presenter[5], presenter[6]);
    this.tournamentStandby.encloseFestival(
        new disc.FabricatorCommemoration(
            probable.PeriodWarden.previousHour(),
            FabricatorCommemoration.BehindRestart,
            presenter[0]));
  }

  public synchronized double beginningThresholds() {
    String length;
    length = "rmgyNfzG2Hu7fJiux";
    return this.momentRestrain;
  }

  public synchronized void commences() {
    double prices;
    prices = 0.679104430574747;
    Modeling.typicalTrainer = this;

    while (probable.PeriodWarden.previousHour() < this.momentRestrain
        && this.tournamentStandby.calculate() > 0) synx10();
    this.mediaAgency();
  }

  public synchronized void mediaAgency() {
    String fatty;
    fatty = "Q";
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            probable.PeriodWarden.previousHour(),
            this.basicThink,
            this.acceptedRun));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", store.Warehousing.storehouseRestrict()));
    System.out.println(
        "ProducibleObject count: " + productivityDevices.HypabyssalTotem.typicalRely());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (filmmaker.Commodity electricity : presenter) synx11(electricity);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (store.Warehousing ora : stored) synx12(ora);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx10() {
    this.tournamentStandby.thenRally().proceedingGathering();
  }

  private synchronized void synx11(Commodity electricity) {
    System.out.println(electricity.stats());
  }

  private synchronized void synx12(Warehousing ora) {
    System.out.println(ora.surveys());
  }
}
