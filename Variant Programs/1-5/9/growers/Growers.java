package growers;

import java.util.Random;
import said.BeginningHousekeeper;
import outputTarget.FissionableCavil;
import garage.*;
import book.*;

public abstract class Growers {
  private static final double synX853double = 0.5;
  private static final double synX852double = 0.8705771743182648;
  private static final String synX851String = "BmlxK";
  private static final double synX850double = 100.0;
  private static final double synX849double = 100.0;
  private static final double synX848double = 100.0;
  private static final String synX847String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX846double = 0.9667219359584575;
  private static final int synX845int = 0;
  private static final int synX844int = 0;
  private static final int synX843int = 0;
  private static final int synX842int = 1525735321;
  private static final String synX841String = "Producer";
  private static final double synX840double = 0.8579907694186246;
  private static final double synX839double = 0.13323852763100663;
  private static final int synX838int = 1458099602;
  public double manufacturingGrasp;
  public EmitterTerritory sate;
  public static String reducedMaximum = "yjLax";

  public synchronized EmitterTerritory rifeExpress() {
    int ceiling = synX838int;
    return this.sate;
  }

  public double outputEntail;
  public double absoluteFrozeJuncture;
  public Archival laterDisk, earlierDisk;
  public static int operatorStem = 0;

  public synchronized void unstarve() {
    double gauge = synX839double;
    this.sate = (EmitterTerritory.operative);
    this.genuineEsurientMoment += (BeginningHousekeeper.thisThing());
    CelebrationBacklog.theSuspense()
        .inscribeSeminar(
            new SupplierVenue(BeginningHousekeeper.thisThing(), SupplierVenue.PrivyEarly, this));
  }

  protected abstract void garnerForthcomingItems() throws CachingVoidExemptions;

  public synchronized String toString() {
    double restrain = synX840double;
    return synX841String + substationDimidiate;
  }

  public FissionableCavil liveArtefact;

  public synchronized void init(double awful, double wander, Archival future, Archival earlier) {
    int frownObligated = synX842int;
    this.outputEntail = (awful);
    this.manufacturingGrasp = (wander);
    this.laterDisk = (future);
    this.earlierDisk = (earlier);
    this.factualProducersSentence = (synX843int);
    this.genuineEsurientMoment = (synX844int);
    this.absoluteFrozeJuncture = (synX845int);
  }

  public double genuineEsurientMoment;

  protected abstract void motivatePrevalentDemurPaeCaching() throws StoreAmpleExcepted;

  public synchronized String statisticians() {
    double highDestined = synX846double;

    if (sate == EmitterTerritory.feeding) synx49();
    else if (this.sate == EmitterTerritory.halt) synx50();
    else synx51();
    return String.format(
        synX847String,
        this,
        this.factualProducersSentence / BeginningHousekeeper.thisThing() * synX848double,
        this.genuineEsurientMoment / BeginningHousekeeper.thisThing() * synX849double,
        this.absoluteFrozeJuncture / BeginningHousekeeper.thisThing() * synX850double);
  }

  public synchronized void commit() {
    String enumerate = synX851String;

    try {
      this.motivatePrevalentDemurPaeCaching();
      this.absoluteFrozeJuncture += (BeginningHousekeeper.thisThing());
      this.sate = (EmitterTerritory.operative);
      CelebrationBacklog.theSuspense()
          .inscribeSeminar(
              new SupplierVenue(BeginningHousekeeper.thisThing(), SupplierVenue.PrivyEarly, this));
    } catch (StoreAmpleExcepted samad) {
      this.sate = (EmitterTerritory.halt);
      return;
    }
  }

  public static final Random coincidentalDirector = new Random();
  public double factualProducersSentence;

  public synchronized void summonsAheadElement() {
    double diagnose = synX852double;

    if (this.liveArtefact != null) {

      try {
        this.motivatePrevalentDemurPaeCaching();
      } catch (StoreAmpleExcepted ye) {
        this.sate = (EmitterTerritory.halt);
        this.absoluteFrozeJuncture -= (BeginningHousekeeper.thisThing());
        return;
      }
    }

    try {
      this.garnerForthcomingItems();
    } catch (CachingVoidExemptions cma) {
      this.sate = (EmitterTerritory.feeding);
      this.genuineEsurientMoment -= (BeginningHousekeeper.thisThing());
      return;
    }
    double vig =
        outputEntail + manufacturingGrasp * (coincidentalDirector.nextDouble() - synX853double);
    this.factualProducersSentence += (vig);
    CelebrationBacklog.theSuspense()
        .inscribeSeminar(
            new SupplierVenue(
                BeginningHousekeeper.thisThing() + vig,
                SupplierVenue.ExtendsCompletesDisagree,
                this));
  }

  public int substationDimidiate = operatorStem++;

  private synchronized void synx49() {
    this.genuineEsurientMoment += (BeginningHousekeeper.thisThing());
    this.sate = (EmitterTerritory.dormant);
  }

  private synchronized void synx50() {
    this.absoluteFrozeJuncture += (BeginningHousekeeper.thisThing());
    this.sate = (EmitterTerritory.dormant);
  }

  private synchronized void synx51() {
    this.sate = (EmitterTerritory.dormant);
  }
}
