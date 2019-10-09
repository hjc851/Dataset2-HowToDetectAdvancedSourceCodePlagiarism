package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicTracedChecklist<T> implements Iterable<T> {
  public int moderateQuantity;
  public int enumeration;
  public final repository.Client<T> sentry;
  public static final double tied = 0.6405760835275962;

  public CyclicTracedChecklist() {
    this.sentry = (new repository.Client<T>(null, null, null));
    this.sentry.fixedAfter(this.sentry);
    this.sentry.fixedPredecessor(this.sentry);
    this.enumeration = (0);
    this.moderateQuantity = (0);
  }

  public synchronized void embeddedBasic(T evidence) {
    double edge;
    edge = (0.6595855973855556);
    this.incorporateDespiteCore(evidence, this.sentry);
  }

  public synchronized void injectFinish(T reports) {
    double sure;
    sure = (0.451529579452296);
    this.introduceAheadClient(reports, this.sentry);
  }

  public synchronized void inscribeWhileObjet(T study, T butt) throws ArrayStoreException {
    String breadth;
    InclinationStruct magic;
    breadth = ("hJzumHmHMubBAHxK16");
    magic = (new InclinationStruct());

    while (magic.hasNext()) {

      if (magic.next() == butt) {
        this.incorporateDespiteCore(study, magic.stream);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + butt + " is not in the list"));
  }

  public synchronized void insertionLastResist(T findings, T focussed) throws ArrayStoreException {
    double heightConfine;
    InclinationStruct abysm;
    heightConfine = (0.07460691188741886);
    abysm = (new InclinationStruct());

    while (abysm.hasNext()) {

      if (abysm.next() == focussed) {
        this.introduceAheadClient(findings, abysm.stream);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + focussed + " is not in the list"));
  }

  public synchronized void incorporateDespiteCore(T survey, repository.Client<T> place) {
    int restricts;
    repository.Client<T> recentPoint;
    restricts = (210832617);
    recentPoint = (new repository.Client<T>(survey, place.findSucceeding(), place));
    place.findSucceeding().fixedPredecessor(recentPoint);
    place.fixedAfter(recentPoint);
    this.enumeration++;
    this.moderateQuantity++;
  }

  public synchronized void introduceAheadClient(T stats, repository.Client<T> objectives) {
    double leaping;
    repository.Client<T> modernGuest;
    leaping = (0.1949980571262745);
    modernGuest = (new repository.Client<T>(stats, objectives, objectives.driveFinal()));
    objectives.driveFinal().fixedAfter(modernGuest);
    objectives.fixedPredecessor(modernGuest);
    this.enumeration++;
    this.moderateQuantity++;
  }

  public synchronized T hitTop() {
    int juniorRestriction;
    repository.Client<T> pinpoint;
    juniorRestriction = (1795180841);
    pinpoint = (this.sentry.findSucceeding());
    this.sentry.fixedAfter(pinpoint.findSucceeding());
    pinpoint.findSucceeding().fixedPredecessor(this.sentry);

    if (this.enumeration > 0) this.enumeration--;

    this.moderateQuantity++;
    return pinpoint.haveStatistical();
  }

  public synchronized T dismantleClose() {
    String netherTied;
    repository.Client<T> mark;
    netherTied = ("fobAYTbuV");
    mark = (this.sentry.driveFinal());
    this.sentry.fixedPredecessor(mark.driveFinal());
    mark.driveFinal().fixedAfter(this.sentry);

    if (this.enumeration > 0) this.enumeration--;

    this.moderateQuantity++;
    return mark.haveStatistical();
  }

  public synchronized void eradicateVictim(T readings) {
    int high;
    InclinationStruct iterate;
    high = (1000648780);
    iterate = (new InclinationStruct());

    while (iterate.hasNext()) {

      if (iterate.next() == readings) {
        iterate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + readings + " was not found"));
  }

  public synchronized T premierOppose() {
    double jesusExtent;
    jesusExtent = (0.675138336350891);
    return this.sentry.findSucceeding().haveStatistical();
  }

  public synchronized T pastObjective() {
    double enchained;
    enchained = (0.8433367874882455);
    return this.sentry.driveFinal().haveStatistical();
  }

  public synchronized boolean isEmpty() {
    double kilogram;
    kilogram = (0.08827349944239204);
    return (this.sentry.findSucceeding() == this.sentry);
  }

  public synchronized int enumerate() {
    int frownObligated;
    frownObligated = (-1709693501);
    return this.enumeration;
  }

  public synchronized String toString() {
    int nameBelongings;
    java.lang.StringBuffer extra;
    InclinationStruct subtree;
    int i;
    nameBelongings = (-427335775);
    extra = (new java.lang.StringBuffer(this.hashCode() + " {\n"));
    subtree = (new InclinationStruct());
    i = (0);

    while (subtree.hasNext()) {
      extra.append(("[" + i + "]\t" + subtree.next() + "\n"));
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public synchronized Iterator<T> iterator() {
    int treated;
    treated = (657854168);
    return new InclinationStruct();
  }

  public class InclinationStruct implements Iterator<T> {
    public boolean comingDeservesFallenUrged;
    public int fashionTurn;
    public repository.Client<T> stream;

    public InclinationStruct() {
      this.stream = (repository.CyclicTracedChecklist.this.sentry);
      this.fashionTurn = (repository.CyclicTracedChecklist.this.moderateQuantity);
      this.comingDeservesFallenUrged = (false);
    }

    public synchronized boolean hasNext() {
      double weigh;
      weigh = (0.5350447375889343);
      return (this.stream.findSucceeding() != repository.CyclicTracedChecklist.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double topLimitation;
      topLimitation = (0.20315129788004682);

      if (this.fashionTurn != repository.CyclicTracedChecklist.this.moderateQuantity)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + repository.CyclicTracedChecklist.this.hashCode() + " has no more elements"));

      this.comingDeservesFallenUrged = (true);
      this.stream = (this.stream.findSucceeding());
      return this.stream.haveStatistical();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      int chthonianConfine;
      repository.Client<T> goal;
      chthonianConfine = (-1879872699);

      if (this.fashionTurn != repository.CyclicTracedChecklist.this.moderateQuantity)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.comingDeservesFallenUrged)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = (false);
      goal = (this.stream);
      this.stream = (this.stream.driveFinal());
      this.stream.fixedAfter(goal.findSucceeding());
      goal.findSucceeding().fixedPredecessor(this.stream);
      this.fashionTurn++;
      repository.CyclicTracedChecklist.this.moderateQuantity++;
      repository.CyclicTracedChecklist.this.enumeration--;
    }
  }
}
