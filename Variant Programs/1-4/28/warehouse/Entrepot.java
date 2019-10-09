package warehouse;

import java.util.HashMap;
import indiscernible.YearWarder;
import throughputMaterials.PannonianMatter;
import exporter.*;
import analogue.Scenario;

public class Entrepot {

  public Entrepot() {
    this.garageBibliography = new AnnularImplicatedInclination<PannonianMatter>();
    this.pencil = new HashMap<PannonianMatter, Double>();
    this.est = antagonistic++;
    this.avgWeek = 0;
    this.classedRelics = 0;
    this.commonNumeration = 0;
    this.concludingSeminarMonth = 0;
  }

  private static int stowageRestricting;

  static {
    stowageRestricting = 1;
    antagonistic = 0;
  }

  public synchronized String digit() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.avgWeek, this.commonNumeration);
  }

  public synchronized PannonianMatter forthcomingAspect() throws StoreroomPillagedUnless {

    if (this.numbers() > 0) {
      PannonianMatter pubis = this.garageBibliography.yankCommencement();
      this.commonNumeration +=
          (this.numbers() + 1)
              * (YearWarder.liveDays() - this.concludingSeminarMonth)
              / Scenario.afootModeling().meterCircumscribe();
      double insetMoment = this.pencil.remove(pubis);
      double ridWhen = YearWarder.liveDays();
      this.avgWeek = (avgWeek * classedRelics + (ridWhen - insetMoment)) / ++classedRelics;
      for (Farm leong : initial) {

        if (leong.liveSay() == ManufacturerCommonwealth.clogging) {
          leong.commit();
          break;
        }
      }
      this.concludingSeminarMonth = YearWarder.liveDays();
      return pubis;
    } else {
      throw new StoreroomPillagedUnless();
    }
  }

  private static int antagonistic;
  private Farm initial[];

  public synchronized void fitComing(Farm... incoming) {
    this.forthcoming = incoming;
  }

  private double avgWeek;
  private int est;

  public synchronized int numbers() {
    return this.garageBibliography.consider();
  }

  private double concludingSeminarMonth;

  public static synchronized int safekeepingCurb() {
    return Entrepot.stowageRestricting;
  }

  private HashMap<PannonianMatter, Double> pencil;

  public static synchronized void arrangedStoreConfine(int warehousingRestriction) {

    if (warehousingRestriction > 0) Entrepot.stowageRestricting = warehousingRestriction;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  private double commonNumeration;
  private Farm forthcoming[];

  public synchronized String toString() {
    return "Storage" + est;
  }

  public synchronized void primedEarlier(Farm... recent) {
    this.initial = recent;
  }

  private AnnularImplicatedInclination<PannonianMatter> garageBibliography;
  private double classedRelics;

  public synchronized void giveArticles(PannonianMatter cavil) throws GarageRichCase {

    if (this.garageBibliography.consider() < Entrepot.stowageRestricting) {
      this.garageBibliography.encloseLate(cavil);
      this.commonNumeration +=
          (this.numbers() - 1)
              * (YearWarder.liveDays() - this.concludingSeminarMonth)
              / Scenario.afootModeling().meterCircumscribe();
      this.pencil.put(cavil, YearWarder.liveDays());
      this.concludingSeminarMonth = YearWarder.liveDays();
      for (Farm electricity : forthcoming) {

        if (electricity.liveSay() == ManufacturerCommonwealth.depriving) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new GarageRichCase();
    }
  }
}
