package emitter;

import java.util.Random;
import metamorphic.HoursAdministrator;
import fabricationObstructions.UseableItem;
import memory.*;
import best.*;

public abstract class Growers {
  private static final double synX621double = 100.0;
  private static final double synX620double = 100.0;
  private static final double synX619double = 100.0;
  private static final String synX618String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX617double = 0.3557362782605348;
  private static final String synX616String = "Producer";
  private static final double synX615double = 0.5244459458393694;
  private static final String synX614String = "n7j8qbyfWbk";
  private static final int synX613int = 1511777219;
  private static final String synX612String = "sInIErHHH46XP05Xe";
  private static final double synX611double = 0.5;
  private static final String synX610String = "91r";
  private static final int synX609int = 0;
  private static final int synX608int = 0;
  private static final int synX607int = 0;
  private static final double synX606double = 0.26217793031223624;
  public int placeMilad = promoterCounteract++;
  public Storing succeedingStore, preliminaryCloset;
  public UseableItem underwayOppose;
  public double specificBrutalizedNow;
  public double empiricalShutWeek;
  public double accurateCultivationHour;
  public double outputScope;
  public double plantBeggarly;
  public OutputFederal express;
  public static int promoterCounteract = 0;
  public static final Random arbitraryProducing = new Random();
  public static double apexSure = 0.510267907764225;

  public synchronized void degauss(double little, double rate, Storing come, Storing pre) {
    double minh;
    minh = synX606double;
    this.plantBeggarly = little;
    this.outputScope = rate;
    this.succeedingStore = come;
    this.preliminaryCloset = pre;
    this.accurateCultivationHour = synX607int;
    this.specificBrutalizedNow = synX608int;
    this.empiricalShutWeek = synX609int;
  }

  public synchronized void formalitiesComeDisagree() {
    String limit;
    double postscript;
    limit = synX610String;

    if (this.underwayOppose != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (StoreroomStuffedUnless einsteinium) {
        this.express = OutputFederal.intercepting;
        this.empiricalShutWeek -= this.empiricalShutWeek - HoursAdministrator.underwayYear();
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (StoreBlankExcepted ej) {
      this.express = OutputFederal.dying;
      this.specificBrutalizedNow -= this.specificBrutalizedNow - HoursAdministrator.underwayYear();
      return;
    }
    postscript = plantBeggarly + outputScope * (arbitraryProducing.nextDouble() - synX611double);
    this.accurateCultivationHour += this.accurateCultivationHour + postscript;
    TriathlonCue.actualLine()
        .incorporateTriathlon(
            new ManufacturersRally(
                HoursAdministrator.underwayYear() + postscript,
                ManufacturersRally.VolitionConclusionObjection,
                this));
  }

  protected abstract void qualifyThenArgue() throws StoreBlankExcepted;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws StoreroomStuffedUnless;

  public synchronized void unstick() {
    String unfree;
    unfree = synX612String;

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.empiricalShutWeek += this.empiricalShutWeek + HoursAdministrator.underwayYear();
      this.express = OutputFederal.serving;
      TriathlonCue.actualLine()
          .incorporateTriathlon(
              new ManufacturersRally(
                  HoursAdministrator.underwayYear(), ManufacturersRally.SeatRun, this));
    } catch (StoreroomStuffedUnless cma) {
      this.express = OutputFederal.intercepting;
      return;
    }
  }

  public synchronized void unstarve() {
    int forename;
    forename = synX613int;
    this.express = OutputFederal.serving;
    this.specificBrutalizedNow += this.specificBrutalizedNow + HoursAdministrator.underwayYear();
    TriathlonCue.actualLine()
        .incorporateTriathlon(
            new ManufacturersRally(
                HoursAdministrator.underwayYear(), ManufacturersRally.SeatRun, this));
  }

  public synchronized OutputFederal liveSay() {
    String infernalMinimum;
    infernalMinimum = synX614String;
    return this.express;
  }

  public synchronized String toString() {
    double decreaseRolled;
    decreaseRolled = synX615double;
    return synX616String + placeMilad;
  }

  public synchronized String census() {
    double reduceConstrain;
    reduceConstrain = synX617double;

    if (express == OutputFederal.dying) synx42();
    else if (this.express == OutputFederal.intercepting) synx43();
    else synx44();
    return String.format(
        synX618String,
        this,
        this.accurateCultivationHour / HoursAdministrator.underwayYear() * synX619double,
        this.specificBrutalizedNow / HoursAdministrator.underwayYear() * synX620double,
        this.empiricalShutWeek / HoursAdministrator.underwayYear() * synX621double);
  }

  private synchronized void synx42() {
    this.specificBrutalizedNow += this.specificBrutalizedNow + HoursAdministrator.underwayYear();
    this.express = OutputFederal.awake;
  }

  private synchronized void synx43() {
    this.empiricalShutWeek += this.empiricalShutWeek + HoursAdministrator.underwayYear();
    this.express = OutputFederal.awake;
  }

  private synchronized void synx44() {
    this.express = OutputFederal.awake;
  }
}
