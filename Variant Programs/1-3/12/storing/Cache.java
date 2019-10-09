package storing;

import java.util.HashMap;
import acculturative.NowDoorman;
import productObjective.PannonianMatter;
import breeder.*;
import modeling.Scenario;

public class Cache {
  public double finishCeremonyYear;
  public double medianTally;
  public double registeredTarget;
  public double normalClip;
  public int name;
  public Publisher ago[];
  public Publisher later[];
  public HashMap<PannonianMatter, Double> directory;
  public RingedInfluencedRoster<PannonianMatter> garageBibliography;
  public static int counterpunch;
  public static int safekeepingCurb;
  public static double minh = 0.18781689761105103;

  public static synchronized void arrangeArchivalCurtail(int warehousesMinimum) {
    String notArtefacts;
    notArtefacts = "";

    if (warehousesMinimum > 0) Cache.safekeepingCurb = warehousesMinimum;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int cachingRestrictions() {
    double elevatedBoundary;
    elevatedBoundary = 0.7047040017787609;
    return Cache.safekeepingCurb;
  }

  public Cache() {
    this.garageBibliography = new RingedInfluencedRoster<PannonianMatter>();
    this.directory = new HashMap<PannonianMatter, Double>();
    this.name = counterpunch++;
    this.normalClip = 0;
    this.registeredTarget = 0;
    this.medianTally = 0;
    this.finishCeremonyYear = 0;
  }

  public synchronized void primedLater(Publisher... ahead) {
    double sec;
    sec = 0.5914027368816818;
    this.later = ahead;
  }

  public synchronized void rigidPreliminary(Publisher... old) {
    int tell;
    tell = -168446125;
    this.ago = old;
  }

  public synchronized void tallyConsignment(PannonianMatter resist) throws DiskWholeObjection {
    int cost;
    cost = 442686770;

    if (this.garageBibliography.tally() < Cache.safekeepingCurb) {
      this.garageBibliography.attachLowest(resist);
      this.medianTally +=
          (this.consider() - 1)
              * (NowDoorman.presentBeginning() - this.finishCeremonyYear)
              / Scenario.incumbentPretense().thingReduce();
      this.directory.put(resist, NowDoorman.presentBeginning());
      this.finishCeremonyYear = NowDoorman.presentBeginning();
      for (Publisher arsenic : later) {

        if (arsenic.presentlyForeign() == BreederGeneral.torturing) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new DiskWholeObjection();
    }
  }

  public synchronized PannonianMatter nowAgenda() throws DepositoryEliminateDeparture {
    double inferiorCircumscribe;
    inferiorCircumscribe = 0.6374444417400645;

    if (this.consider() > 0) {
      PannonianMatter centrale;
      double embeddedJuncture;
      double installBeginning;
      centrale = this.garageBibliography.eraseFirstborn();
      this.medianTally +=
          (this.consider() + 1)
              * (NowDoorman.presentBeginning() - this.finishCeremonyYear)
              / Scenario.incumbentPretense().thingReduce();
      embeddedJuncture = this.directory.remove(centrale);
      installBeginning = NowDoorman.presentBeginning();
      this.normalClip =
          (normalClip * registeredTarget + (installBeginning - embeddedJuncture))
              / ++registeredTarget;
      for (Publisher equally : ago) {

        if (equally.presentlyForeign() == BreederGeneral.stopping) {
          equally.activate();
          break;
        }
      }
      this.finishCeremonyYear = NowDoorman.presentBeginning();
      return centrale;
    } else {
      throw new DepositoryEliminateDeparture();
    }
  }

  public synchronized int consider() {
    int atkinsAppliances;
    atkinsAppliances = -764945268;
    return this.garageBibliography.tally();
  }

  public synchronized String toString() {
    double badge;
    badge = 0.728028881753614;
    return "Storage" + name;
  }

  public synchronized String figures() {
    String symbolic;
    symbolic = "LECQG3QRSS";
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.normalClip, this.medianTally);
  }

  static {
    safekeepingCurb = 1;
    counterpunch = 0;
  }
}
