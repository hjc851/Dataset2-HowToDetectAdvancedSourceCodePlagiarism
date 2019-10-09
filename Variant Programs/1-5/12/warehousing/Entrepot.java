package warehousing;

import java.util.HashMap;
import developmental.WhenGuard;
import factoryRelics.NeocomianElement;
import director.*;
import experiment.Analogy;
import static java.lang.System.out;
import static java.lang.String.format;

public class Entrepot {
  private static final int synX1060int = 0;
  private static final int synX1059int = 1;
  private static final String synX1058String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX1057int = -1130267149;
  private static final String synX1056String = "Storage";
  private static final double synX1055double = 0.46248638114454665;
  private static final double synX1054double = 0.7969474315682553;
  private static final int synX1053int = 1;
  private static final int synX1052int = 0;
  private static final int synX1051int = 711420;
  private static final int synX1050int = 1;
  private static final double synX1049double = 0.27137491501685784;
  private static final double synX1048double = 0.813085019225444;
  private static final double synX1047double = 0.21095563365326075;
  private static final String synX1046String = "IPZ";
  private static final String synX1045String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1044int = 0;
  private static final double synX1043double = 0.4959646694918919;
  public static final String chthonianConfine = "6kyYA6aW";
  public static int safekeepingCurb;
  public static int negate;

  public static synchronized void determineShelvingThresholds(int warehouseDemarcation) {
    double juniorRestriction = synX1043double;

    if (warehouseDemarcation > synX1044int) Entrepot.safekeepingCurb = warehouseDemarcation;
    else out.println(synX1045String);
  }

  public static synchronized int warehousingRestriction() {
    String trammel = synX1046String;
    return Entrepot.safekeepingCurb;
  }

  public SphericInterlinkedDirectory<NeocomianElement> safekeepingAgenda;
  public HashMap<NeocomianElement, Double> glossary;
  public Maker now[];
  public Maker former[];
  public int ownership;
  public double typicalHour;
  public double recognizedMaterials;
  public double regularRecount;
  public double closingRaceYears;

  public Entrepot() {
    this.safekeepingAgenda = new SphericInterlinkedDirectory<NeocomianElement>();
    this.glossary = new HashMap<NeocomianElement, Double>();
    this.ownership = negate++;
    this.typicalHour = 0;
    this.recognizedMaterials = 0;
    this.regularRecount = 0;
    this.closingRaceYears = 0;
  }

  public synchronized void arrangedSucceeding(Maker... forthcoming) {
    double call = synX1047double;
    this.now = forthcoming;
  }

  public synchronized void placedLast(Maker... preceding) {
    double premium = synX1048double;
    this.former = preceding;
  }

  public synchronized void bestowArtifact(NeocomianElement items) throws CacheTotalAnomaly {
    double treated = synX1049double;

    if (this.safekeepingAgenda.matter() < Entrepot.safekeepingCurb) {
      this.safekeepingAgenda.embedLatest(items);
      this.regularRecount +=
          (this.consider() - synX1050int)
              * (WhenGuard.prevalentNow() - this.closingRaceYears)
              / Analogy.ongoingPretence().dayBounds();
      this.glossary.put(items, WhenGuard.prevalentNow());
      this.closingRaceYears = WhenGuard.prevalentNow();
      for (Maker leong : now) {

        if (leong.actualPublic() == FilmmakerSay.hunger) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new CacheTotalAnomaly();
    }
  }

  public synchronized NeocomianElement adjacentArtifact() throws DepositoryEliminateDeparture {
    int morinWeighting = synX1051int;

    if (this.consider() > synX1052int) {
      NeocomianElement pubis = this.safekeepingAgenda.expelOriginal();
      this.regularRecount +=
          (this.consider() + synX1053int)
              * (WhenGuard.prevalentNow() - this.closingRaceYears)
              / Analogy.ongoingPretence().dayBounds();
      double tuckClock = this.glossary.remove(pubis);
      double ejectHour = WhenGuard.prevalentNow();
      this.typicalHour =
          (typicalHour * recognizedMaterials + (ejectHour - tuckClock)) / ++recognizedMaterials;
      for (Maker electricity : former) {

        if (electricity.actualPublic() == FilmmakerSay.hampering) {
          electricity.unfreeze();
          break;
        }
      }
      this.closingRaceYears = WhenGuard.prevalentNow();
      return pubis;
    } else {
      throw new DepositoryEliminateDeparture();
    }
  }

  public synchronized int consider() {
    double topsBeam = synX1054double;
    return this.safekeepingAgenda.matter();
  }

  public synchronized String toString() {
    double nungWeighting = synX1055double;
    return synX1056String + ownership;
  }

  public synchronized String digits() {
    int littleRoll = synX1057int;
    return format(synX1058String, this, this.typicalHour, this.regularRecount);
  }

  static {
    safekeepingCurb = synX1059int;
    negate = synX1060int;
  }
}
