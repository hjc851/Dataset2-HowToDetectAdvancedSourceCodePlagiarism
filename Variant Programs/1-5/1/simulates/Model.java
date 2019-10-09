package simulates;

import glanced.PeriodWarden;
import produceProjectiles.RecoverableTarget;
import publisher.*;
import storeroom.*;
import histories.*;
import static java.lang.String.format;

public class Model {
  public histories.FestivalSpooler meetingGlue = null;
  public storeroom.Stored warehousing[] = null;
  public publisher.Maker maker[] = null;
  public double commonStray = 0.0;
  public double stockStingy = 0.0;
  public double periodsBound = 0.0;
  public static simulates.Model rifeSimulate = null;
  static double token = 0.8985164753018653;

  public static synchronized simulates.Model prevailingModel() {
    double confine;
    confine = 0.18839479065127973;
    return rifeSimulate;
  }

  public Model(double dayBounds, double standardizedImply, double classicGrasp) {
    this.periodsBound = dayBounds;
    this.stockStingy = standardizedImply;
    this.commonStray = classicGrasp;
    this.meetingGlue = new histories.FestivalSpooler();
    this.maker = new publisher.Maker[8];
    this.warehousing = new storeroom.Stored[5];
    warehousing[0] = new storeroom.Stored();
    warehousing[1] = new storeroom.Stored();
    warehousing[2] = new storeroom.Stored();
    warehousing[3] = new storeroom.Stored();
    warehousing[4] = new storeroom.Stored();
    maker[0] = new publisher.FilmmakerInitiate(this.stockStingy, this.commonStray, warehousing[0]);
    maker[1] =
        new publisher.FilmmakerRadio(
            this.stockStingy, this.commonStray, warehousing[1], warehousing[0]);
    maker[2] =
        new publisher.FilmmakerRadio(
            this.stockStingy * 2.0, this.commonStray * 2.0, warehousing[2], warehousing[1]);
    maker[3] =
        new publisher.FilmmakerRadio(
            this.stockStingy * 2.0, this.commonStray * 2.0, warehousing[2], warehousing[1]);
    maker[4] =
        new publisher.FilmmakerRadio(
            this.stockStingy, this.commonStray, warehousing[3], warehousing[2]);
    maker[5] =
        new publisher.FilmmakerRadio(
            this.stockStingy * 2.0, this.commonStray * 2.0, warehousing[4], warehousing[3]);
    maker[6] =
        new publisher.FilmmakerRadio(
            this.stockStingy * 2.0, this.commonStray * 2.0, warehousing[4], warehousing[3]);
    maker[7] = new publisher.PromoterFinal(this.stockStingy, this.commonStray, warehousing[4]);
    warehousing[0].solidifyingThe(maker[1]);
    warehousing[0].rigidPreliminary(maker[0]);
    warehousing[1].solidifyingThe(maker[2], maker[3]);
    warehousing[1].rigidPreliminary(maker[1]);
    warehousing[2].solidifyingThe(maker[4]);
    warehousing[2].rigidPreliminary(maker[2], maker[3]);
    warehousing[3].solidifyingThe(maker[5], maker[6]);
    warehousing[3].rigidPreliminary(maker[4]);
    warehousing[4].solidifyingThe(maker[7]);
    warehousing[4].rigidPreliminary(maker[5], maker[6]);
    this.meetingGlue.introduceExtravaganza(
        new histories.PromoterForum(
            glanced.PeriodWarden.liveDays(), PromoterForum.TushOffset, maker[0]));
  }

  public synchronized double whenThrottle() {
    double uppermostTied;
    uppermostTied = 0.4234950609788488;
    return this.periodsBound;
  }

  public synchronized void originate() {
    int across;
    across = -1112160684;
    Model.rifeSimulate = this;

    while (glanced.PeriodWarden.liveDays() < this.periodsBound && this.meetingGlue.get() > 0)
      synx10();
    this.impressStatistical();
  }

  public synchronized void impressStatistical() {
    int describe;
    describe = 1248773611;
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            glanced.PeriodWarden.liveDays(),
            this.stockStingy,
            this.commonStray));
    System.out.println(format("Storage Capacity: %d", storeroom.Stored.storedBoundary()));
    System.out.println(
        "ProducibleObject count: " + produceProjectiles.RecoverableTarget.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (publisher.Maker electricity : maker) synx11(electricity);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (storeroom.Stored waffen : warehousing) synx12(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx10() {
    this.meetingGlue.nowRace().actGala();
  }

  private synchronized void synx11(Maker electricity) {
    System.out.println(electricity.number());
  }

  private synchronized void synx12(Stored waffen) {
    System.out.println(waffen.estimates());
  }
}
