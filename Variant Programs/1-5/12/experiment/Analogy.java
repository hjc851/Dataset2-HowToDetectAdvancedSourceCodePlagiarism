package experiment;

import developmental.WhenGuard;
import factoryRelics.NeocomianElement;
import director.*;
import warehousing.*;
import track.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Analogy {
  private static final String synX1042String = " ----------------------------------------------- ";
  private static final String synX1041String = " ----------------------------------------------- ";
  private static final String synX1040String = "Average Count";
  private static final String synX1039String = "Average Time";
  private static final String synX1038String = "Storage ID";
  private static final String synX1037String = "| %-14s | %-12s | %-12s |";
  private static final String synX1036String = " ----------------------------------------------- ";
  private static final String synX1035String = "Storage";
  private static final String synX1034String =
      " ----------------------------------------------------- ";
  private static final String synX1033String =
      "|-----------------------------------------------------|";
  private static final String synX1032String = "Blocked";
  private static final String synX1031String = "Starving";
  private static final String synX1030String = "Production";
  private static final String synX1029String = "Producer ID";
  private static final String synX1028String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1027String =
      " ----------------------------------------------------- ";
  private static final String synX1026String = "Assemblers";
  private static final String synX1025String = "Statistics\n";
  private static final String synX1024String = "ProducibleObject count: ";
  private static final String synX1023String = "Storage Capacity: %d";
  private static final String synX1022String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final double synX1021double = 0.8791962315703861;
  private static final int synX1020int = 0;
  private static final double synX1019double = 0.6411488387176099;
  private static final double synX1018double = 0.06688020750079493;
  private static final double synX1017double = 0.19062269745085691;
  public static final String amount = "mT2xKxqWZXT";
  public static Analogy flowEmulation;

  public static synchronized Analogy ongoingPretence() {
    double namDetail = synX1017double;
    return flowEmulation;
  }

  public double againRestricted;
  public double receivedMiserly;
  public double criterialRank;
  public Maker provider[];
  public Entrepot storing[];
  public SummitPecker gatheringDipper;

  public Analogy(double hourRestricts, double criterionEntail, double normativeDrift) {
    this.againRestricted = hourRestricts;
    this.receivedMiserly = criterionEntail;
    this.criterialRank = normativeDrift;
    this.gatheringDipper = new SummitPecker();
    this.provider = new Maker[8];
    this.storing = new Entrepot[5];
    storing[0] = new Entrepot();
    storing[1] = new Entrepot();
    storing[2] = new Entrepot();
    storing[3] = new Entrepot();
    storing[4] = new Entrepot();
    provider[0] = new FabricatorStartle(this.receivedMiserly, this.criterialRank, storing[0]);
    provider[1] =
        new PresenterOutpost(this.receivedMiserly, this.criterialRank, storing[1], storing[0]);
    provider[2] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[2], storing[1]);
    provider[3] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[2], storing[1]);
    provider[4] =
        new PresenterOutpost(this.receivedMiserly, this.criterialRank, storing[3], storing[2]);
    provider[5] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[4], storing[3]);
    provider[6] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[4], storing[3]);
    provider[7] = new OperatorConclude(this.receivedMiserly, this.criterialRank, storing[4]);
    storing[0].arrangedSucceeding(provider[1]);
    storing[0].placedLast(provider[0]);
    storing[1].arrangedSucceeding(provider[2], provider[3]);
    storing[1].placedLast(provider[1]);
    storing[2].arrangedSucceeding(provider[4]);
    storing[2].placedLast(provider[2], provider[3]);
    storing[3].arrangedSucceeding(provider[5], provider[6]);
    storing[3].placedLast(provider[4]);
    storing[4].arrangedSucceeding(provider[7]);
    storing[4].placedLast(provider[5], provider[6]);
    this.gatheringDipper.tuckCase(
        new FabricatorCommemoration(
            WhenGuard.prevalentNow(), FabricatorCommemoration.BottomFirst, provider[0]));
  }

  public synchronized double dayBounds() {
    double highestRestricts = synX1018double;
    return this.againRestricted;
  }

  public synchronized void commencement() {
    double bound = synX1019double;
    Analogy.flowEmulation = this;

    while (WhenGuard.prevalentNow() < this.againRestricted
        && this.gatheringDipper.indictment() > synX1020int) {
      this.gatheringDipper.thirdCeremonies().systemContest();
    }
    this.brailleNumerals();
  }

  public synchronized void brailleNumerals() {
    double tonality = synX1021double;
    out.println(
        format(
            synX1022String,
            this.againRestricted,
            WhenGuard.prevalentNow(),
            this.receivedMiserly,
            this.criterialRank));
    out.println(format(synX1023String, Entrepot.warehousingRestriction()));
    out.println(synX1024String + NeocomianElement.liveMatter());
    out.println();
    out.println(synX1025String);
    out.println(synX1026String);
    out.println(synX1027String);
    out.println(
        format(synX1028String, synX1029String, synX1030String, synX1031String, synX1032String));
    out.println(synX1033String);
    for (Maker equally : provider) {
      out.println(equally.statisticians());
    }
    out.println(synX1034String);
    out.println();
    out.println(synX1035String);
    out.println(synX1036String);
    out.println(format(synX1037String, synX1038String, synX1039String, synX1040String));
    out.println(synX1041String);
    for (Entrepot ora : storing) {
      out.println(ora.digits());
    }
    out.println(synX1042String);
  }
}
