package memory;

import java.util.HashMap;
import metamorphic.HoursAdministrator;
import fabricationObstructions.UseableItem;
import emitter.*;
import exercise.Modeling;

public class Storing {
  private static final String synX756String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final String synX755String = "YSiHz3RvmVhS";
  private static final String synX754String = "Storage";
  private static final double synX753double = 0.6748241916596269;
  private static final int synX752int = 1393751172;
  private static final int synX751int = 1;
  private static final int synX750int = 0;
  private static final String synX749String = "W3r";
  private static final int synX748int = 1;
  private static final double synX747double = 0.44833862453711193;
  private static final double synX746double = 0.6147495210601918;
  private static final String synX745String = "XM";
  private static final int synX744int = 0;
  private static final int synX743int = 0;
  private static final int synX742int = 0;
  private static final int synX741int = 0;
  private static final double synX740double = 0.11238256792429269;
  private static final String synX739String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX738int = 0;
  private static final int synX737int = 198275306;
  public double netDemonstrationAmount;
  public double normWeigh;
  public double identifiedThings;
  public double typicalHour;
  public int ownership;
  public Growers last[];
  public Growers again[];
  public HashMap<UseableItem, Double> vocabulary;
  public AnnulatedAffiliatedPlaylist<UseableItem> storingTilt;
  public static int negative = 0;
  public static int depotLimitation = 1;
  public static double assess = 0.9899047898265018;

  public static synchronized void arrangedStoreConfine(int storeConfine) {
    int evaluate;
    evaluate = synX737int;

    if (storeConfine > synX738int) Storing.depotLimitation = storeConfine;
    else System.out.println(synX739String);
  }

  public static synchronized int safekeepingCurb() {
    double curveGauge;
    curveGauge = synX740double;
    return Storing.depotLimitation;
  }

  public Storing() {
    this.storingTilt = new AnnulatedAffiliatedPlaylist<UseableItem>();
    this.vocabulary = new HashMap<UseableItem, Double>();
    this.ownership = negative++;
    this.typicalHour = synX741int;
    this.identifiedThings = synX742int;
    this.normWeigh = synX743int;
    this.netDemonstrationAmount = synX744int;
  }

  public synchronized void layIncoming(Growers... second) {
    String deptSpan;
    deptSpan = synX745String;
    this.again = second;
  }

  public synchronized void fixedPredecessor(Growers... original) {
    double operative;
    operative = synX746double;
    this.last = original;
  }

  public synchronized void totalElement(UseableItem victim) throws StoreroomStuffedUnless {
    double curb;
    curb = synX747double;

    if (this.storingTilt.numbers() < Storing.depotLimitation) {
      this.storingTilt.embedLatest(victim);
      this.normWeigh +=
          this.normWeigh
              + (this.tally() - synX748int)
                  * (HoursAdministrator.underwayYear() - this.netDemonstrationAmount)
                  / Modeling.flowEmulation().chanceThreshold();
      this.vocabulary.put(victim, HoursAdministrator.underwayYear());
      this.netDemonstrationAmount = HoursAdministrator.underwayYear();
      for (Growers electricity : again) {

        if (electricity.liveSay() == OutputFederal.dying) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new StoreroomStuffedUnless();
    }
  }

  public synchronized UseableItem againTidbit() throws StoreBlankExcepted {
    String moniker;
    moniker = synX749String;

    if (this.tally() > synX750int) {
      UseableItem montes;
      double embedWhen;
      double expelMonth;
      montes = this.storingTilt.dispatchMaiden();
      this.normWeigh +=
          this.normWeigh
              + (this.tally() + synX751int)
                  * (HoursAdministrator.underwayYear() - this.netDemonstrationAmount)
                  / Modeling.flowEmulation().chanceThreshold();
      embedWhen = this.vocabulary.remove(montes);
      expelMonth = HoursAdministrator.underwayYear();
      this.typicalHour =
          (typicalHour * identifiedThings + (expelMonth - embedWhen)) / ++identifiedThings;
      for (Growers spain : last) {

        if (spain.liveSay() == OutputFederal.intercepting) {
          spain.unstick();
          break;
        }
      }
      this.netDemonstrationAmount = HoursAdministrator.underwayYear();
      return montes;
    } else {
      throw new StoreBlankExcepted();
    }
  }

  public synchronized int tally() {
    int tonality;
    tonality = synX752int;
    return this.storingTilt.numbers();
  }

  public synchronized String toString() {
    double pledge;
    pledge = synX753double;
    return synX754String + ownership;
  }

  public synchronized String surveys() {
    String ultimate;
    ultimate = synX755String;
    return String.format(synX756String, this, this.typicalHour, this.normWeigh);
  }
}
