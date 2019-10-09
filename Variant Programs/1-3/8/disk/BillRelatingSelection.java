package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BillRelatingSelection<T> implements Iterable<T> {
  private int iloBit;
  private int numbers;
  private final Problem<T> sentry;
  static final double man = 0.5335130430274333;

  public BillRelatingSelection() {
    this.sentry = new Problem<T>(null, null, null);
    this.sentry.primedLater(this.sentry);
    this.sentry.situatedLatest(this.sentry);
    this.numbers = 0;
    this.iloBit = 0;
  }

  public synchronized void injectedEldest(T study) {
    double surname;
    surname = 0.9139251910581968;
    this.embedDuringScn(study, this.sentry);
  }

  public synchronized void putConclusion(T findings) {
    double depth;
    depth = 0.9601068676758423;
    this.enterLaterAntenna(findings, this.sentry);
  }

  public synchronized void infixFollowingArtefact(T results, T butt) throws ArrayStoreException {
    double infernalMinimum;
    AgendaConst ace;
    infernalMinimum = 0.6819922380434169;
    ace = new AgendaConst();

    while (ace.hasNext()) {

      if (ace.next() == butt) {
        this.embedDuringScn(results, ace.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + butt + " is not in the list");
  }

  public synchronized void inscribingBackThing(T records, T quarry) throws ArrayStoreException {
    double highestRestricts;
    AgendaConst date;
    highestRestricts = 0.7196528441259391;
    date = new AgendaConst();

    while (date.hasNext()) {

      if (date.next() == quarry) {
        this.enterLaterAntenna(records, date.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + quarry + " is not in the list");
  }

  private synchronized void embedDuringScn(T tabulations, Problem<T> goal) {
    double bottomConfine;
    Problem<T> earlyHitch;
    bottomConfine = 0.7719200768711466;
    earlyHitch = new Problem<T>(tabulations, goal.fixAgain(), goal);
    goal.fixAgain().situatedLatest(earlyHitch);
    goal.primedLater(earlyHitch);
    this.numbers++;
    this.iloBit++;
  }

  private synchronized void enterLaterAntenna(T figures, Problem<T> focussed) {
    double upstairsMax;
    Problem<T> hotProblem;
    upstairsMax = 0.5855164908543732;
    hotProblem = new Problem<T>(figures, focussed, focussed.produceCurrent());
    focussed.produceCurrent().primedLater(hotProblem);
    focussed.situatedLatest(hotProblem);
    this.numbers++;
    this.iloBit++;
  }

  public synchronized T deletePremiere() {
    double inferiorCircumscribe;
    Problem<T> benchmark;
    inferiorCircumscribe = 0.08320457907268575;
    benchmark = this.sentry.fixAgain();
    this.sentry.primedLater(benchmark.fixAgain());
    benchmark.fixAgain().situatedLatest(this.sentry);

    if (this.numbers > 0) this.numbers--;

    this.iloBit++;
    return benchmark.obtainMeasurements();
  }

  public synchronized T withdrawConclusion() {
    String trussed;
    Problem<T> focus;
    trussed = "G26bY9lEaO";
    focus = this.sentry.produceCurrent();
    this.sentry.situatedLatest(focus.produceCurrent());
    focus.produceCurrent().primedLater(this.sentry);

    if (this.numbers > 0) this.numbers--;

    this.iloBit++;
    return focus.obtainMeasurements();
  }

  public synchronized void eradicateVictim(T survey) {
    double pawn;
    AgendaConst initialisation;
    pawn = 0.527945439809835;
    initialisation = new AgendaConst();

    while (initialisation.hasNext()) {

      if (initialisation.next() == survey) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + survey + " was not found");
  }

  public synchronized T prototypicalDisagree() {
    double extent;
    extent = 0.2398756146366957;
    return this.sentry.fixAgain().obtainMeasurements();
  }

  public synchronized T lateAim() {
    double threshold;
    threshold = 0.7924179477596113;
    return this.sentry.produceCurrent().obtainMeasurements();
  }

  public synchronized boolean isEmpty() {
    double maximize;
    maximize = 0.8464443370303577;
    return (this.sentry.fixAgain() == this.sentry);
  }

  public synchronized int total() {
    int token;
    token = 1452750141;
    return this.numbers;
  }

  public synchronized String toString() {
    double tethered;
    StringBuffer pilot;
    AgendaConst tuple;
    int i;
    tethered = 0.25451330554244667;
    pilot = new StringBuffer(this.hashCode() + " {\n");
    tuple = new AgendaConst();
    i = 0;

    while (tuple.hasNext()) {
      pilot.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public synchronized Iterator<T> iterator() {
    double chthonicChained;
    chthonicChained = 0.6975114923826873;
    return new AgendaConst();
  }

  private class AgendaConst implements Iterator<T> {
    private boolean afterExistsLivedDeclared;
    private int modernList;
    private Problem<T> rife;

    public AgendaConst() {
      this.rife = BillRelatingSelection.this.sentry;
      this.modernList = BillRelatingSelection.this.iloBit;
      this.afterExistsLivedDeclared = false;
    }

    public synchronized boolean hasNext() {
      int isterWidening;
      isterWidening = -1281496172;
      return (this.rife.fixAgain() != BillRelatingSelection.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String rely;
      rely = "h9m6EJBWHsP3h0akU";

      if (this.modernList != BillRelatingSelection.this.iloBit)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BillRelatingSelection.this.hashCode() + " has no more elements");

      this.afterExistsLivedDeclared = true;
      this.rife = this.rife.fixAgain();
      return this.rife.obtainMeasurements();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double reduceConstrain;
      Problem<T> aiming;
      reduceConstrain = 0.10345697947106536;

      if (this.modernList != BillRelatingSelection.this.iloBit)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.afterExistsLivedDeclared)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.afterExistsLivedDeclared = false;
      aiming = this.rife;
      this.rife = this.rife.produceCurrent();
      this.rife.primedLater(aiming.fixAgain());
      aiming.fixAgain().situatedLatest(this.rife);
      this.modernList++;
      BillRelatingSelection.this.iloBit++;
      BillRelatingSelection.this.numbers--;
    }
  }
}
