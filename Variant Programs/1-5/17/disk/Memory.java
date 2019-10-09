package disk;

import java.util.HashMap;
import metamorphic.SentenceGoalie;
import manufacturedBelongings.DiamondiferousItems;
import exporter.*;
import replication.Analogy;
import static java.lang.System.out;

public class Memory {
  private static final int synX1575int = 0;
  private static final int synX1574int = 1;
  private static final String synX1573String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX1572int = -81822754;
  private static final String synX1571String = "Storage";
  private static final double synX1570double = 0.9569431834574079;
  private static final double synX1569double = 0.793332119019022;
  private static final int synX1568int = 1;
  private static final int synX1567int = 0;
  private static final double synX1566double = 0.2706547560291892;
  private static final int synX1565int = 1;
  private static final int synX1564int = 2085881244;
  private static final double synX1563double = 0.41432926155585303;
  private static final double synX1562double = 0.5586698269985529;
  private static final int synX1561int = 0;
  private static final int synX1560int = 0;
  private static final int synX1559int = 0;
  private static final int synX1558int = 0;
  private static final double synX1557double = 0.9879760944539179;
  private static final String synX1556String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1555int = 0;
  private static final double synX1554double = 0.22739673247686532;
  public double laterExtravaganzaClip;
  public double ratesFigures;
  public double recordedPieces;
  public double mediocreMoment;
  public int tag;
  public Farmer late[];
  public Farmer expected[];
  public HashMap<DiamondiferousItems, Double> lexicographer;
  public FlierAttributedShortlist<DiamondiferousItems> spaceRosters;
  public static int neutralize;
  public static int repositoryThreshold;
  public static double minhBandwidth = 0.05295759738659933;

  public static synchronized void orderedRepositoryThreshold(int spaceRestricts) {
    double secondaryTrussed;
    secondaryTrussed = synX1554double;

    if (spaceRestricts > synX1555int) Memory.repositoryThreshold = spaceRestricts;
    else out.println(synX1556String);
  }

  public static synchronized int safekeepingCurb() {
    double calculate;
    calculate = synX1557double;
    return Memory.repositoryThreshold;
  }

  public Memory() {
    this.spaceRosters = new FlierAttributedShortlist<DiamondiferousItems>();
    this.lexicographer = new HashMap<DiamondiferousItems, Double>();
    this.tag = neutralize++;
    this.mediocreMoment = synX1558int;
    this.recordedPieces = synX1559int;
    this.ratesFigures = synX1560int;
    this.laterExtravaganzaClip = synX1561int;
  }

  public synchronized void prepareSecond(Farmer... close) {
    double outer;
    outer = synX1562double;
    this.expected = close;
  }

  public synchronized void settledPervious(Farmer... predecessor) {
    double cost;
    cost = synX1563double;
    this.late = predecessor;
  }

  public synchronized void tallyConsignment(DiamondiferousItems purpose) throws DepotEntireCaveat {
    int peak;
    peak = synX1564int;

    if (this.spaceRosters.matter() < Memory.repositoryThreshold) {
      this.spaceRosters.infixEnd(purpose);
      this.ratesFigures +=
          this.ratesFigures
              + (this.numeration() - synX1565int)
                  * (SentenceGoalie.underwayYear() - this.laterExtravaganzaClip)
                  / Analogy.continuingStimulation().nowRestrictions();
      this.lexicographer.put(purpose, SentenceGoalie.underwayYear());
      this.laterExtravaganzaClip = SentenceGoalie.underwayYear();
      for (Farmer arsenic : expected) {

        if (arsenic.actualPublic() == OperatorRepublic.dying) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new DepotEntireCaveat();
    }
  }

  public synchronized DiamondiferousItems comingObject() throws DepotUnfilledCaveat {
    double curtail;
    curtail = synX1566double;

    if (this.numeration() > synX1567int) {
      DiamondiferousItems dnv;
      double appendHours;
      double transferClip;
      dnv = this.spaceRosters.reinstallLow();
      this.ratesFigures +=
          this.ratesFigures
              + (this.numeration() + synX1568int)
                  * (SentenceGoalie.underwayYear() - this.laterExtravaganzaClip)
                  / Analogy.continuingStimulation().nowRestrictions();
      appendHours = this.lexicographer.remove(dnv);
      transferClip = SentenceGoalie.underwayYear();
      this.mediocreMoment =
          (mediocreMoment * recordedPieces + (transferClip - appendHours)) / ++recordedPieces;
      for (Farmer leong : late) {

        if (leong.actualPublic() == OperatorRepublic.clog) {
          leong.unclog();
          break;
        }
      }
      this.laterExtravaganzaClip = SentenceGoalie.underwayYear();
      return dnv;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  public synchronized int numeration() {
    double minimumAcross;
    minimumAcross = synX1569double;
    return this.spaceRosters.matter();
  }

  public synchronized String toString() {
    double magnitude;
    magnitude = synX1570double;
    return synX1571String + tag;
  }

  public synchronized String number() {
    int constrain;
    constrain = synX1572int;
    return String.format(synX1573String, this, this.mediocreMoment, this.ratesFigures);
  }

  static {
    repositoryThreshold = synX1574int;
    neutralize = synX1575int;
  }
}
