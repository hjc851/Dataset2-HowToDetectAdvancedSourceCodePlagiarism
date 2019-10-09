package storing;

import java.util.HashMap;
import indiscernible.BeginningHousekeeper;
import fabricationObstructions.PannonianMatter;
import supplier.*;
import synthesizer.Modeling;

public class Space {
  public double latestCarnivalWhen;
  public double middlingEnumerate;
  public double inventoriedExhibits;
  public double ratesAgain;
  public int picture;
  public Produce recent[];
  public Produce third[];
  public HashMap<PannonianMatter, Double> thesaurus;
  public GlobularCorrelatedBlacklist<PannonianMatter> archivalCompilation;
  public static int undercut = 0;
  public static int spaceRestricts = 1;

  public static synchronized void determineShelvingThresholds(int safekeepingCurb) {

    if (safekeepingCurb > 0) Space.spaceRestricts = safekeepingCurb;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int warehousesMinimum() {
    return Space.spaceRestricts;
  }

  public Space() {
    this.archivalCompilation = new GlobularCorrelatedBlacklist<PannonianMatter>();
    this.thesaurus = new HashMap<PannonianMatter, Double>();
    this.picture = undercut++;
    this.ratesAgain = 0;
    this.inventoriedExhibits = 0;
    this.middlingEnumerate = 0;
    this.latestCarnivalWhen = 0;
  }

  public synchronized void layIncoming(Produce... close) {
    this.third = close;
  }

  public synchronized void determineInitial(Produce... original) {
    this.recent = original;
  }

  public synchronized void bestowArtifact(PannonianMatter objective) throws SpaceChockfulWaiver {

    if (this.archivalCompilation.figure() < Space.spaceRestricts) {
      this.archivalCompilation.injectedSurvive(objective);
      this.middlingEnumerate +=
          (this.figures() - 1)
              * (BeginningHousekeeper.newChance() - this.latestCarnivalWhen)
              / Modeling.rifeSimulate().periodsBound();
      this.thesaurus.put(objective, BeginningHousekeeper.newChance());
      this.latestCarnivalWhen = BeginningHousekeeper.newChance();
      for (Produce spain : third) {

        if (spain.continuingCanton() == CommoditySovereign.emaciated) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new SpaceChockfulWaiver();
    }
  }

  public synchronized PannonianMatter followingDetail() throws DepositoryEliminateDeparture {

    if (this.figures() > 0) {
      PannonianMatter osmium;
      double embedWhen;
      double reinstallAgain;
      osmium = this.archivalCompilation.transferInaugural();
      this.middlingEnumerate +=
          (this.figures() + 1)
              * (BeginningHousekeeper.newChance() - this.latestCarnivalWhen)
              / Modeling.rifeSimulate().periodsBound();
      embedWhen = this.thesaurus.remove(osmium);
      reinstallAgain = BeginningHousekeeper.newChance();
      this.ratesAgain =
          (ratesAgain * inventoriedExhibits + (reinstallAgain - embedWhen)) / ++inventoriedExhibits;
      for (Produce arsenic : recent) {

        if (arsenic.continuingCanton() == CommoditySovereign.halt) {
          arsenic.allocate();
          break;
        }
      }
      this.latestCarnivalWhen = BeginningHousekeeper.newChance();
      return osmium;
    } else {
      throw new DepositoryEliminateDeparture();
    }
  }

  public synchronized int figures() {
    return this.archivalCompilation.figure();
  }

  public synchronized String toString() {
    return "Storage" + picture;
  }

  public synchronized String numbers() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ratesAgain, this.middlingEnumerate);
  }
}
