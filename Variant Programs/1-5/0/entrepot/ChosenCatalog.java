package entrepot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  private static final double synX188double = 0.9831647875314927;
  private static final String synX187String = "}\n";
  private static final String synX186String = "\n";
  private static final String synX185String = "]\t";
  private static final String synX184String = "[";
  private static final int synX183int = 0;
  private static final String synX182String = " {\n";
  private static final double synX181double = 0.2018486838987844;
  private static final double synX180double = 0.8400210640907794;
  private static final int synX179int = 213491976;
  private static final int synX178int = -624946848;
  private static final String synX177String = "F0k";
  private static final String synX176String = " was not found";
  private static final String synX175String = "Object ";
  private static final int synX174int = 0;
  private static final double synX173double = 0.8140968570268247;
  private static final String synX172String = " was not found";
  private static final String synX171String = "Object ";
  private static final int synX170int = -1769766076;
  private static final int synX169int = 0;
  private static final String synX168String = "2";
  private static final int synX167int = 0;
  private static final int synX166int = 637849975;
  private static final int synX165int = 0;
  private static final double synX164double = 0.7217042409140645;
  public int amdConsider;
  public int tally;
  public final entrepot.Ribbon<T> guerite;
  public static final int modicum = 148633111;

  public ChosenCatalog() {
    this.guerite = (new entrepot.Ribbon<T>(null, null, null));
    this.guerite.fixThen(guerite);
    this.guerite.solidifyingElapsed(guerite);
    this.tally = (0);
    this.amdConsider = (0);
  }

  public synchronized void inclose(T readings) {
    double minutes;
    ScreenedConcatenate initialisation;
    entrepot.Ribbon<T> originalAntenna;
    minutes = (synX164double);
    initialisation = (new ScreenedConcatenate());

    while (initialisation.hasNext()) {

      if (readings.compareTo(initialisation.next()) >= synX165int) {
        break;
      }

      if (initialisation.ongoing.conveyCome() == this.guerite) {
        entrepot.Ribbon<T> babyNoose;
        babyNoose = (new entrepot.Ribbon<T>(readings, this.guerite, this.guerite.fixRecord()));
        this.guerite.fixRecord().fixThen(babyNoose);
        this.guerite.solidifyingElapsed(babyNoose);
        this.tally++;
        this.amdConsider++;
        return;
      }
    }
    originalAntenna =
        (new entrepot.Ribbon<T>(
            readings, initialisation.ongoing, initialisation.ongoing.fixRecord()));
    initialisation.ongoing.fixRecord().fixThen(originalAntenna);
    initialisation.ongoing.solidifyingElapsed(originalAntenna);
    this.tally++;
    this.amdConsider++;
  }

  public synchronized T yankCommencement() {
    int patronymic;
    entrepot.Ribbon<T> substitute;
    patronymic = (synX166int);
    substitute = (this.guerite.conveyCome());
    this.guerite.fixThen(substitute.conveyCome());
    substitute.conveyCome().solidifyingElapsed(this.guerite);

    if (this.tally > synX167int) this.tally--;

    this.amdConsider++;
    return substitute.driveIntelligence();
  }

  public synchronized T transferLater() {
    String discover;
    entrepot.Ribbon<T> benchmark;
    discover = (synX168String);
    benchmark = (this.guerite.fixRecord());
    this.guerite.solidifyingElapsed(benchmark.fixRecord());
    benchmark.fixRecord().fixThen(this.guerite);

    if (this.tally > synX169int) this.tally--;

    this.amdConsider++;
    return benchmark.driveIntelligence();
  }

  public synchronized void reinstallThing(T database) throws ArrayStoreException {
    int fullThick;
    ScreenedConcatenate iterate;
    fullThick = (synX170int);
    iterate = (new ScreenedConcatenate());

    while (iterate.hasNext()) {

      if (iterate.next() == database) {
        iterate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX171String + database + synX172String));
  }

  public synchronized void hitMatchedObjection(T statistical) throws ArrayStoreException {
    double higherRestricts;
    ScreenedConcatenate subroutine;
    higherRestricts = (synX173double);
    subroutine = (new ScreenedConcatenate());

    while (subroutine.hasNext()) {

      if (statistical.compareTo(subroutine.next()) == synX174int) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX175String + statistical + synX176String));
  }

  public synchronized int charge() {
    String beacon;
    beacon = (synX177String);
    return this.tally;
  }

  public synchronized T maidenItem() {
    int modicumFatty;
    modicumFatty = (synX178int);
    return this.guerite.conveyCome().driveIntelligence();
  }

  public synchronized T latestCavil() {
    int belowReduce;
    belowReduce = (synX179int);
    return this.guerite.fixRecord().driveIntelligence();
  }

  public synchronized boolean isVacant() {
    double frontThresholds;
    frontThresholds = (synX180double);
    return (this.guerite.conveyCome() == this.guerite);
  }

  public synchronized String toString() {
    double bundle;
    java.lang.StringBuffer cushion;
    ScreenedConcatenate instantiation;
    int i;
    bundle = (synX181double);
    cushion = (new java.lang.StringBuffer(this.hashCode() + synX182String));
    instantiation = (new ScreenedConcatenate());
    i = (synX183int);

    while (instantiation.hasNext()) {
      cushion.append((synX184String + i + synX185String + instantiation.next() + synX186String));
      i++;
    }
    cushion.append(synX187String);
    return cushion.toString();
  }

  public synchronized Iterator<T> iterator() {
    double glowerSure;
    glowerSure = (synX188double);
    return new ScreenedConcatenate();
  }

  public class ScreenedConcatenate implements Iterator<T> {
    public boolean newOffersEnduredSuggested;
    public int chicWeigh;
    public entrepot.Ribbon<T> ongoing;

    public ScreenedConcatenate() {
      this.ongoing = (entrepot.ChosenCatalog.this.guerite);
      this.chicWeigh = (entrepot.ChosenCatalog.this.amdConsider);
      this.newOffersEnduredSuggested = (false);
    }

    public synchronized boolean hasNext() {
      double assess;
      assess = (0.7670577520704458);
      return (this.ongoing.conveyCome() != entrepot.ChosenCatalog.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String widening;
      widening = ("zsOvy6vY2aloi9y");

      if (this.chicWeigh != entrepot.ChosenCatalog.this.amdConsider)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + entrepot.ChosenCatalog.this.hashCode() + " has no more elements"));

      this.newOffersEnduredSuggested = (true);
      this.ongoing = (this.ongoing.conveyCome());
      return this.ongoing.driveIntelligence();
    }

    public synchronized void remove() {
      double highDestined;
      entrepot.Ribbon<T> butt;
      highDestined = (0.001434241998354291);

      if (this.chicWeigh != entrepot.ChosenCatalog.this.amdConsider)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.newOffersEnduredSuggested)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = (false);
      butt = (this.ongoing);
      this.ongoing = (this.ongoing.fixRecord());
      this.ongoing.fixThen(butt.conveyCome());
      butt.conveyCome().solidifyingElapsed(this.ongoing);
      this.chicWeigh++;
      entrepot.ChosenCatalog.this.amdConsider++;
      entrepot.ChosenCatalog.this.tally--;
    }
  }
}
