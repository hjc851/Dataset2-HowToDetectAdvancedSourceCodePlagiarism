package depository;

import java.util.HashMap;
import maturational.DaysHandler;
import fabricationObstructions.QuasicrystalArgue;
import fabricator.*;
import simulates.Pretense;
import static java.lang.System.out;
import static java.lang.String.format;

public class Depository {

  public static synchronized void layEntrepotRestrain(int entrepotRestrain) {

    if (entrepotRestrain > 0) Depository.storedBoundary = (entrepotRestrain);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized QuasicrystalArgue incomingPiece() throws ArchivalHungryExempt {

    if (this.tell() > 0) {
      QuasicrystalArgue osmium = this.stowageCompendium.discardIntroductory();
      this.commonNumeration +=
          ((this.tell() + 1)
              * (DaysHandler.rifeWhen() - this.concludingSeminarMonth)
              / Pretense.underwaySimulates().periodTrammel());
      double attachPeriods = this.book.remove(osmium);
      double banishHours = DaysHandler.rifeWhen();
      this.normalClip =
          ((normalClip * matteredItems + (banishHours - attachPeriods)) / ++matteredItems);
      for (Promoter spain : late) {

        if (spain.afootGovernment() == FarmerLaw.interference) {
          spain.reroute();
          break;
        }
      }
      this.concludingSeminarMonth = (DaysHandler.rifeWhen());
      return osmium;
    } else {
      throw new ArchivalHungryExempt();
    }
  }

  public synchronized String toString() {
    return "Storage" + security;
  }

  public double normalClip = 0.0;
  public double commonNumeration = 0.0;

  public synchronized void primedLater(Promoter... last) {
    this.after = (last);
  }

  public static synchronized int safekeepingCurb() {
    return Depository.storedBoundary;
  }

  public Promoter late[] = null;

  public synchronized String figure() {
    return format("| %-14s | %-12.11s | %-12.11s  |", this, this.normalClip, this.commonNumeration);
  }

  public synchronized void sumGoods(QuasicrystalArgue oppose) throws SpaceChockfulWaiver {

    if (this.stowageCompendium.numbers() < Depository.storedBoundary) {
      this.stowageCompendium.injectingDying(oppose);
      this.commonNumeration +=
          ((this.tell() - 1)
              * (DaysHandler.rifeWhen() - this.concludingSeminarMonth)
              / Pretense.underwaySimulates().periodTrammel());
      this.book.put(oppose, DaysHandler.rifeWhen());
      this.concludingSeminarMonth = (DaysHandler.rifeWhen());
      for (Promoter leong : after) {

        if (leong.afootGovernment() == FarmerLaw.pizza) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new SpaceChockfulWaiver();
    }
  }

  public static int storedBoundary = 1;
  public Promoter after[] = null;

  public Depository() {
    this.stowageCompendium = (new RoundedCausedAgenda<QuasicrystalArgue>());
    this.book = (new HashMap<QuasicrystalArgue, Double>());
    this.security = (forestall++);
    this.normalClip = (0);
    this.matteredItems = (0);
    this.commonNumeration = (0);
    this.concludingSeminarMonth = (0);
  }

  public RoundedCausedAgenda<QuasicrystalArgue> stowageCompendium = null;
  public static int forestall = 0;

  public synchronized void readyFormer(Promoter... original) {
    this.late = (original);
  }

  public HashMap<QuasicrystalArgue, Double> book = null;
  public int security = 0;
  public double concludingSeminarMonth = 0.0;
  public double matteredItems = 0.0;

  public synchronized int tell() {
    return this.stowageCompendium.numbers();
  }
}
