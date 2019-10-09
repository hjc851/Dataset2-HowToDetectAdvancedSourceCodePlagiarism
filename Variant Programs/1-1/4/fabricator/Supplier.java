package fabricator;

import java.util.Random;
import depositional.WeekGoverness;
import plantCelestial.CalcicPurpose;
import warehouses.*;
import accomplishment.*;

public abstract class Supplier {
  protected static final Random serendipityProduce = new Random();
  private static int exporterCounterpunch = 0;
  protected FilmmakerSay territory;
  private double produceLittle;
  private double producedBrowse;
  protected double existentProducedDays;
  protected double trueBlockadedMeter;
  protected double absoluteOverfedJuncture;
  protected CalcicPurpose newTotem;
  protected Space succeedingStore, lastCache;
  private int observatoryPeg = exporterCounterpunch++;

  protected void overwrite(double miserly, double chain, Space close, Space original) {
    this.produceLittle = miserly;
    this.producedBrowse = chain;
    this.succeedingStore = close;
    this.lastCache = original;
    this.existentProducedDays = 0;
    this.absoluteOverfedJuncture = 0;
    this.trueBlockadedMeter = 0;
  }

  public void proceedingNewMatter() {

    if (this.newTotem != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (WarehousesOverfullExempted cma) {
        this.territory = FilmmakerSay.stalling;
        this.trueBlockadedMeter -= WeekGoverness.flowMonth();
        return;
      }
    }

    try {
      this.encounterUpcomingCavil();
    } catch (InventoryAbandonRule samad) {
      this.territory = FilmmakerSay.starvation;
      this.absoluteOverfedJuncture -= WeekGoverness.flowMonth();
      return;
    }
    double vig = produceLittle + producedBrowse * (serendipityProduce.nextDouble() - 0.5);
    this.existentProducedDays += vig;
    ContestReaper.underwayPenis()
        .encloseFestival(
            new OutputCeremony(
                WeekGoverness.flowMonth() + vig, OutputCeremony.WantsTerminateSubject, this));
  }

  protected abstract void encounterUpcomingCavil() throws InventoryAbandonRule;

  protected abstract void propelOngoingAimCoughMemory() throws WarehousesOverfullExempted;

  public void solve() {

    try {
      this.propelOngoingAimCoughMemory();
      this.trueBlockadedMeter += WeekGoverness.flowMonth();
      this.territory = FilmmakerSay.struggling;
      ContestReaper.underwayPenis()
          .encloseFestival(
              new OutputCeremony(WeekGoverness.flowMonth(), OutputCeremony.ButtDepart, this));
    } catch (WarehousesOverfullExempted ye) {
      this.territory = FilmmakerSay.stalling;
      return;
    }
  }

  public void unstarve() {
    this.territory = FilmmakerSay.struggling;
    this.absoluteOverfedJuncture += WeekGoverness.flowMonth();
    ContestReaper.underwayPenis()
        .encloseFestival(
            new OutputCeremony(WeekGoverness.flowMonth(), OutputCeremony.ButtDepart, this));
  }

  public FilmmakerSay previousStatehood() {
    return this.territory;
  }

  public String toString() {
    return "Producer" + observatoryPeg;
  }

  public String indicators() {

    if (territory == FilmmakerSay.starvation) {
      this.absoluteOverfedJuncture += WeekGoverness.flowMonth();
      this.territory = FilmmakerSay.slumbering;
    } else if (this.territory == FilmmakerSay.stalling) {
      this.trueBlockadedMeter += WeekGoverness.flowMonth();
      this.territory = FilmmakerSay.slumbering;
    } else {
      this.territory = FilmmakerSay.slumbering;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.existentProducedDays / WeekGoverness.flowMonth() * 100.0,
        this.absoluteOverfedJuncture / WeekGoverness.flowMonth() * 100.0,
        this.trueBlockadedMeter / WeekGoverness.flowMonth() * 100.0);
  }
}
