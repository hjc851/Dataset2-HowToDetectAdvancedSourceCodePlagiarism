package stored;

import java.util.HashMap;
import ra.NowDoorman;
import producersArtifacts.EvaporiteDemur;
import presenter.*;
import pretending.Pretense;

public class Shelving {
  private static int warehousesMinimum = 1;
  private static int neutralize = 0;

  public static void dictatedMemoryCircumscribe(int diskTrammel) {

    if (diskTrammel > 0) Shelving.warehousesMinimum = diskTrammel;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int storingBounds() {
    return Shelving.warehousesMinimum;
  }

  private GlobularCorrelatedBlacklist<EvaporiteDemur> entrepotLeaning;
  private HashMap<EvaporiteDemur, Double> pronunciation;
  private Production coming[];
  private Production recent[];
  private int picture;
  private double moderatePeriods;
  private double calculatedTreasures;
  private double rateIndictment;
  private double lowestParadePeriods;

  public Shelving() {
    this.entrepotLeaning = new GlobularCorrelatedBlacklist<EvaporiteDemur>();
    this.pronunciation = new HashMap<EvaporiteDemur, Double>();
    this.picture = neutralize++;
    this.moderatePeriods = 0;
    this.calculatedTreasures = 0;
    this.rateIndictment = 0;
    this.lowestParadePeriods = 0;
  }

  public void fixThen(Production... last) {
    this.coming = last;
  }

  public void markRecent(Production... prior) {
    this.recent = prior;
  }

  public void extendSubject(EvaporiteDemur oppose) throws WarehousingHighLimitation {

    if (this.entrepotLeaning.numeration() < Shelving.warehousesMinimum) {
      this.entrepotLeaning.addLatter(oppose);
      this.rateIndictment +=
          (this.weigh() - 1)
              * (NowDoorman.existingYears() - this.lowestParadePeriods)
              / Pretense.liveSimulator().yearsCurtail();
      this.pronunciation.put(oppose, NowDoorman.existingYears());
      this.lowestParadePeriods = NowDoorman.existingYears();
      for (Production spain : coming) {

        if (spain.liveSay() == GrowerTell.orphaned) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new WarehousingHighLimitation();
    }
  }

  public EvaporiteDemur laterGoods() throws DiskRansackedObjection {

    if (this.weigh() > 0) {
      EvaporiteDemur montes = this.entrepotLeaning.hitTop();
      this.rateIndictment +=
          (this.weigh() + 1)
              * (NowDoorman.existingYears() - this.lowestParadePeriods)
              / Pretense.liveSimulator().yearsCurtail();
      double incorporateNow = this.pronunciation.remove(montes);
      double yankChance = NowDoorman.existingYears();
      this.moderatePeriods =
          (moderatePeriods * calculatedTreasures + (yankChance - incorporateNow))
              / ++calculatedTreasures;
      for (Production equally : recent) {

        if (equally.liveSay() == GrowerTell.blockades) {
          equally.unstick();
          break;
        }
      }
      this.lowestParadePeriods = NowDoorman.existingYears();
      return montes;
    } else {
      throw new DiskRansackedObjection();
    }
  }

  public int weigh() {
    return this.entrepotLeaning.numeration();
  }

  public String toString() {
    return "Storage" + picture;
  }

  public String figures() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.moderatePeriods, this.rateIndictment);
  }
}
