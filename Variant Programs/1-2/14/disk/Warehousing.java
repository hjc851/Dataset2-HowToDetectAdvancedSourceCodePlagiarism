package disk;

import java.util.HashMap;
import lapse.MinutesNurse;
import developmentElements.NeocomianElement;
import supplier.*;
import replication.Simulator;

public class Warehousing {
  private static int memoryCircumscribe = 1;
  private static int thwart = 0;

  public static void rigidClosetMax(int repositoryThreshold) {

    if (repositoryThreshold > 0) Warehousing.memoryCircumscribe = repositoryThreshold;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int storedBoundary() {
    return Warehousing.memoryCircumscribe;
  }

  private GlobularCorrelatedBlacklist<NeocomianElement> storedBlacklist;
  private HashMap<NeocomianElement, Double> dante;
  private Farmer forthcoming[];
  private Farmer late[];
  private int handle;
  private double percentageNow;
  private double consideredGoods;
  private double regularRecount;
  private double netDemonstrationAmount;

  public Warehousing() {
    this.storedBlacklist = new GlobularCorrelatedBlacklist<NeocomianElement>();
    this.dante = new HashMap<NeocomianElement, Double>();
    this.handle = thwart++;
    this.percentageNow = 0;
    this.consideredGoods = 0;
    this.regularRecount = 0;
    this.netDemonstrationAmount = 0;
  }

  public void fixedAfter(Farmer... succeeding) {
    this.forthcoming = succeeding;
  }

  public void fixedPredecessor(Farmer... initial) {
    this.late = initial;
  }

  public void appendToken(NeocomianElement artifact) throws StoringWideProviso {

    if (this.storedBlacklist.total() < Warehousing.memoryCircumscribe) {
      this.storedBlacklist.putConclusion(artifact);
      this.regularRecount +=
          (this.indictment() - 1)
              * (MinutesNurse.flowMonth() - this.netDemonstrationAmount)
              / Simulator.topicalSimulated().daysBoundary();
      this.dante.put(artifact, MinutesNurse.flowMonth());
      this.netDemonstrationAmount = MinutesNurse.flowMonth();
      for (Farmer arsenic : forthcoming) {

        if (arsenic.continuingCanton() == ProducingPublic.malnourished) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new StoringWideProviso();
    }
  }

  public NeocomianElement closeToken() throws WarehousesGlazedExempted {

    if (this.indictment() > 0) {
      NeocomianElement centrale = this.storedBlacklist.disposePrototypical();
      this.regularRecount +=
          (this.indictment() + 1)
              * (MinutesNurse.flowMonth() - this.netDemonstrationAmount)
              / Simulator.topicalSimulated().daysBoundary();
      double pasteChance = this.dante.remove(centrale);
      double eraseThing = MinutesNurse.flowMonth();
      this.percentageNow =
          (percentageNow * consideredGoods + (eraseThing - pasteChance)) / ++consideredGoods;
      for (Farmer leong : late) {

        if (leong.continuingCanton() == ProducingPublic.impeding) {
          leong.unlock();
          break;
        }
      }
      this.netDemonstrationAmount = MinutesNurse.flowMonth();
      return centrale;
    } else {
      throw new WarehousesGlazedExempted();
    }
  }

  public int indictment() {
    return this.storedBlacklist.total();
  }

  public String toString() {
    return "Storage" + handle;
  }

  public String surveys() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.percentageNow, this.regularRecount);
  }
}
