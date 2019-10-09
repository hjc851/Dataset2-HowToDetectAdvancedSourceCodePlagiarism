package space;

import java.util.HashMap;
import ontogenetic.PeriodsManager;
import filmingExhibits.QuasicrystalArgue;
import breeder.*;
import experiment.Synthesizer;

public class Storeroom {
  private static int safekeepingCurb = 1;
  private static int neutralize = 0;

  public static void putStorehouseRestrict(int closetMax) {

    if (closetMax > 0) Storeroom.safekeepingCurb = closetMax;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int storingBounds() {
    return Storeroom.safekeepingCurb;
  }

  private space.RoundedCausedAgenda<QuasicrystalArgue> repositoryDocket;
  private java.util.HashMap<QuasicrystalArgue, Double> thesaurus;
  private breeder.Fabricator again[];
  private breeder.Fabricator preliminary[];
  private int card;
  private double levelThing;
  private double inventoriedExhibits;
  private double mediumCharge;
  private double concludingSeminarMonth;

  public Storeroom() {
    this.repositoryDocket = new space.RoundedCausedAgenda<QuasicrystalArgue>();
    this.thesaurus = new java.util.HashMap<QuasicrystalArgue, Double>();
    this.card = neutralize++;
    this.levelThing = 0;
    this.inventoriedExhibits = 0;
    this.mediumCharge = 0;
    this.concludingSeminarMonth = 0;
  }

  public void fixedAfter(breeder.Fabricator... following) {
    this.again = following;
  }

  public void putPreceding(breeder.Fabricator... former) {
    this.preliminary = former;
  }

  public void createComponent(filmingExhibits.QuasicrystalArgue artefact)
      throws ArchivingBrimfulDistinction {

    if (this.repositoryDocket.numbers() < Storeroom.safekeepingCurb) {
      this.repositoryDocket.tuckPast(artefact);
      this.mediumCharge +=
          (this.reckoning() - 1)
              * (ontogenetic.PeriodsManager.topicalPeriod() - this.concludingSeminarMonth)
              / experiment.Synthesizer.streamMock().yearsCurtail();
      this.thesaurus.put(artefact, ontogenetic.PeriodsManager.topicalPeriod());
      this.concludingSeminarMonth = ontogenetic.PeriodsManager.topicalPeriod();
      for (breeder.Fabricator electricity : again) {

        if (electricity.typicalCentral() == EmitterTerritory.orphaned) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new space.ArchivingBrimfulDistinction();
    }
  }

  public filmingExhibits.QuasicrystalArgue comeSection() throws ArchivingBareDistinction {

    if (this.reckoning() > 0) {
      filmingExhibits.QuasicrystalArgue trapezium = this.repositoryDocket.absentInitial();
      this.mediumCharge +=
          (this.reckoning() + 1)
              * (ontogenetic.PeriodsManager.topicalPeriod() - this.concludingSeminarMonth)
              / experiment.Synthesizer.streamMock().yearsCurtail();
      double infixDays = this.thesaurus.remove(trapezium);
      double banishHours = ontogenetic.PeriodsManager.topicalPeriod();
      this.levelThing =
          (levelThing * inventoriedExhibits + (banishHours - infixDays)) / ++inventoriedExhibits;
      for (breeder.Fabricator arsenic : preliminary) {

        if (arsenic.typicalCentral() == EmitterTerritory.blockading) {
          arsenic.exit();
          break;
        }
      }
      this.concludingSeminarMonth = ontogenetic.PeriodsManager.topicalPeriod();
      return trapezium;
    } else {
      throw new space.ArchivingBareDistinction();
    }
  }

  public int reckoning() {
    return this.repositoryDocket.numbers();
  }

  public String toString() {
    return "Storage" + card;
  }

  public java.lang.String digit() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.levelThing, this.mediumCharge);
  }
}
