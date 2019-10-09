package manufacturer;

import java.util.Random;
import glanced.PeriodsManager;
import producingAim.ImmiscibleDisagree;
import shelving.*;
import immortalize.*;

public abstract class Production {
  public int dockTag = exporterCounterpunch++;
  public Stored succeedingStore = null, lateMemory = null;
  public ImmiscibleDisagree incumbentObjection = null;
  public double realisticHungeringChance = 0.0;
  public double currentThwartedDay = 0.0;
  public double accurateCultivationHour = 0.0;
  public double manufactureRoam = 0.0;
  public double industrializationEquate = 0.0;
  public FilmmakerSay province = null;
  public static int exporterCounterpunch = 0;
  public static final Random strayProvider = new Random();
  static final double lourTreated = 0.9652893503802664;

  public synchronized void interleave(
      double entail, double chain, Stored later, Stored successive) {
    String hour;
    hour = "S5";
    this.industrializationEquate = entail;
    this.manufactureRoam = chain;
    this.succeedingStore = later;
    this.lateMemory = successive;
    this.accurateCultivationHour = 0;
    this.realisticHungeringChance = 0;
    this.currentThwartedDay = 0;
  }

  public synchronized void methodsThenArgue() {
    int contrGoods;
    double writes;
    contrGoods = -1202153820;

    if (this.incumbentObjection != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (WarehousingHighLimitation ej) {
        this.province = FilmmakerSay.blockade;
        this.currentThwartedDay -= PeriodsManager.prevalentNow();
        return;
      }
    }

    try {
      this.findAdjacentObjection();
    } catch (DepositoryEliminateDeparture ye) {
      this.province = FilmmakerSay.hungry;
      this.realisticHungeringChance -= PeriodsManager.prevalentNow();
      return;
    }
    writes = industrializationEquate + manufactureRoam * (strayProvider.nextDouble() - 0.5);
    this.accurateCultivationHour += writes;
    ForumFile.liveStandby()
        .addCommemoration(
            new ProducingGala(
                PeriodsManager.prevalentNow() + writes, ProducingGala.ShallFinaleObjective, this));
  }

  protected abstract void findAdjacentObjection() throws DepositoryEliminateDeparture;

  protected abstract void proceedLatestTargetPoiDepot() throws WarehousingHighLimitation;

  public synchronized void unlock() {
    int coin;
    coin = 1398727720;

    try {
      this.proceedLatestTargetPoiDepot();
      this.currentThwartedDay += PeriodsManager.prevalentNow();
      this.province = FilmmakerSay.practical;
      ForumFile.liveStandby()
          .addCommemoration(
              new ProducingGala(
                  PeriodsManager.prevalentNow(), ProducingGala.StoolCommencement, this));
    } catch (WarehousingHighLimitation einsteinium) {
      this.province = FilmmakerSay.blockade;
      return;
    }
  }

  public synchronized void unstarve() {
    int upstreamReduce;
    upstreamReduce = 240312001;
    this.province = FilmmakerSay.practical;
    this.realisticHungeringChance += PeriodsManager.prevalentNow();
    ForumFile.liveStandby()
        .addCommemoration(
            new ProducingGala(
                PeriodsManager.prevalentNow(), ProducingGala.StoolCommencement, this));
  }

  public synchronized FilmmakerSay theLaw() {
    int high;
    high = -2069250709;
    return this.province;
  }

  public synchronized String toString() {
    int max;
    max = 1887572569;
    return "Producer" + dockTag;
  }

  public synchronized String numerals() {
    double lowlyEnchained;
    lowlyEnchained = 0.9368760794749225;

    if (province == FilmmakerSay.hungry) {
      this.realisticHungeringChance += PeriodsManager.prevalentNow();
      this.province = FilmmakerSay.bedtime;
    } else if (this.province == FilmmakerSay.blockade) {
      this.currentThwartedDay += PeriodsManager.prevalentNow();
      this.province = FilmmakerSay.bedtime;
    } else {
      this.province = FilmmakerSay.bedtime;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.accurateCultivationHour / PeriodsManager.prevalentNow() * 100.0,
        this.realisticHungeringChance / PeriodsManager.prevalentNow() * 100.0,
        this.currentThwartedDay / PeriodsManager.prevalentNow() * 100.0);
  }
}
