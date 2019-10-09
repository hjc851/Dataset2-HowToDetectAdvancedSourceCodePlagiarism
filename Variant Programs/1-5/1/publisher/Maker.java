package publisher;

import java.util.Random;
import glanced.PeriodWarden;
import produceProjectiles.RecoverableTarget;
import storeroom.*;
import histories.*;
import static java.lang.String.format;

public abstract class Maker {
  public int areaSelf = 0;
  public storeroom.Stored soonWarehouses = null, predecessorInventory = null;
  public produceProjectiles.RecoverableTarget topicalResist = null;
  public double actualizedBereftPeriod = 0.0;
  public double meaningfulInterceptedOpportunity = 0.0;
  public double correctDeliveryThing = 0.0;
  public double plantRate = 0.0;
  public double produceLittle = 0.0;
  public publisher.BreederGeneral canton = null;
  public static int breederCounterbalance = 0;
  public static final java.util.Random haphazardlyFilmmaker = new java.util.Random();
  static double flag = 0.4862709313984831;

  public synchronized void interleave(
      double skilled, double ramble, storeroom.Stored the, storeroom.Stored successive) {
    int depressShackled;
    depressShackled = -1116487174;
    this.produceLittle = skilled;
    this.plantRate = ramble;
    this.soonWarehouses = the;
    this.predecessorInventory = successive;
    this.correctDeliveryThing = 0;
    this.actualizedBereftPeriod = 0;
    this.meaningfulInterceptedOpportunity = 0;
  }

  public synchronized void serveFirstSubject() {
    String subordinateFettered;
    double vig;
    subordinateFettered = "RrUN6I7Dr7";

    if (this.topicalResist != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (storeroom.StoreAmpleExcepted salaam) {
        this.canton = BreederGeneral.intercepting;
        this.meaningfulInterceptedOpportunity -= glanced.PeriodWarden.liveDays();
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (storeroom.WarehouseOpenDeviation ej) {
      this.canton = BreederGeneral.throwback;
      this.actualizedBereftPeriod -= glanced.PeriodWarden.liveDays();
      return;
    }
    vig = produceLittle + plantRate * (haphazardlyFilmmaker.nextDouble() - 0.5);
    this.correctDeliveryThing += vig;
    histories.FestivalSpooler.actualLine()
        .introduceExtravaganza(
            new histories.PromoterForum(
                glanced.PeriodWarden.liveDays() + vig, PromoterForum.AimExitOpposes, this));
  }

  protected abstract void meetLaterResist() throws WarehouseOpenDeviation;

  protected abstract void pushExistingPurposeOfficesArchival() throws StoreAmpleExcepted;

  public synchronized void exit() {
    double minuteBreadth;
    minuteBreadth = 0.40179395817713326;

    try {
      this.pushExistingPurposeOfficesArchival();
      this.meaningfulInterceptedOpportunity += glanced.PeriodWarden.liveDays();
      this.canton = BreederGeneral.functioning;
      histories.FestivalSpooler.actualLine()
          .introduceExtravaganza(
              new histories.PromoterForum(
                  glanced.PeriodWarden.liveDays(), PromoterForum.TushOffset, this));
    } catch (storeroom.StoreAmpleExcepted samad) {
      this.canton = BreederGeneral.intercepting;
      return;
    }
  }

  public synchronized void unstarve() {
    String greatestFatty;
    greatestFatty = "odnWWqW61";
    this.canton = BreederGeneral.functioning;
    this.actualizedBereftPeriod += glanced.PeriodWarden.liveDays();
    histories.FestivalSpooler.actualLine()
        .introduceExtravaganza(
            new histories.PromoterForum(
                glanced.PeriodWarden.liveDays(), PromoterForum.TushOffset, this));
  }

  public synchronized publisher.BreederGeneral streamSate() {
    double slot;
    slot = 0.08438645762522345;
    return this.canton;
  }

  public synchronized String toString() {
    double best;
    best = 0.477891119892382;
    return "Producer" + areaSelf;
  }

  public synchronized java.lang.String number() {
    double minimalSlot;
    minimalSlot = 0.5980841168615556;

    if (canton == BreederGeneral.throwback) synx7();
    else if (this.canton == BreederGeneral.intercepting) synx8();
    else synx9();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.correctDeliveryThing / glanced.PeriodWarden.liveDays() * 100.0,
        this.actualizedBereftPeriod / glanced.PeriodWarden.liveDays() * 100.0,
        this.meaningfulInterceptedOpportunity / glanced.PeriodWarden.liveDays() * 100.0);
  }

  static {
    breederCounterbalance = 0;
  }

  {
    areaSelf = breederCounterbalance++;
  }

  private synchronized void synx7() {
    this.actualizedBereftPeriod += glanced.PeriodWarden.liveDays();
    this.canton = BreederGeneral.awake;
  }

  private synchronized void synx8() {
    this.meaningfulInterceptedOpportunity += glanced.PeriodWarden.liveDays();
    this.canton = BreederGeneral.awake;
  }

  private synchronized void synx9() {
    this.canton = BreederGeneral.awake;
  }
}
