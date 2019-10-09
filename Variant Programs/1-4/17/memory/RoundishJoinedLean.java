package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundishJoinedLean<T> implements Iterable<T> {
  public int iloBit = 0;
  public int recount = 0;
  public final Scn<T> outsentry;
  public static double rely = 0.6484374661847991;

  public RoundishJoinedLean() {
    this.outsentry = new Scn<T>(null, null, null);
    this.outsentry.adjustExpected(this.outsentry);
    this.outsentry.arrangedEarly(this.outsentry);
    this.recount = 0;
    this.iloBit = 0;
  }

  public synchronized void embedOutset(T study) {
    double ceilingSlot;
    ceilingSlot = 0.21955798129997472;
    this.addSinceNucleus(study, this.outsentry);
  }

  public synchronized void inscribeConcluding(T files) {
    int backCurtail;
    backCurtail = -573354948;
    this.incorporateOnceCore(files, this.outsentry);
  }

  public synchronized void encloseAfterwardAim(T tabulations, T direct) throws ArrayStoreException {
    String beam;
    RegistryBattologize above;
    beam = "6s6VfUviWhpm";
    above = new RegistryBattologize();

    while (above.hasNext()) {

      if (above.next() == direct) {
        this.addSinceNucleus(tabulations, above.present);
        return;
      }
    }
    throw new ArrayStoreException("Target " + direct + " is not in the list");
  }

  public synchronized void deleteFirstPurpose(T estimates, T goals) throws ArrayStoreException {
    double subalternRestricting;
    RegistryBattologize abyss;
    subalternRestricting = 0.3997793834391675;
    abyss = new RegistryBattologize();

    while (abyss.hasNext()) {

      if (abyss.next() == goals) {
        this.incorporateOnceCore(estimates, abyss.present);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goals + " is not in the list");
  }

  public synchronized void addSinceNucleus(T records, Scn<T> goal) {
    double critical;
    Scn<T> newlyKnob;
    critical = 0.39390292566838436;
    newlyKnob = new Scn<T>(records, goal.sustainThen(), goal);
    goal.sustainThen().arrangedEarly(newlyKnob);
    goal.adjustExpected(newlyKnob);
    this.recount++;
    this.iloBit++;
  }

  public synchronized void incorporateOnceCore(T computer, Scn<T> priority) {
    int marx;
    Scn<T> youngCore;
    marx = 512643824;
    youngCore = new Scn<T>(computer, priority, priority.fetchInitial());
    priority.fetchInitial().adjustExpected(youngCore);
    priority.arrangedEarly(youngCore);
    this.recount++;
    this.iloBit++;
  }

  public synchronized T transferInaugural() {
    double universal;
    Scn<T> focussed;
    universal = 0.8746087666925499;
    focussed = this.outsentry.sustainThen();
    this.outsentry.adjustExpected(focussed.sustainThen());
    focussed.sustainThen().arrangedEarly(this.outsentry);

    if (this.recount > 0) this.recount--;

    this.iloBit++;
    return focussed.takeFiles();
  }

  public synchronized T hitPenultimate() {
    int amount;
    Scn<T> mark;
    amount = 677101359;
    mark = this.outsentry.fetchInitial();
    this.outsentry.arrangedEarly(mark.fetchInitial());
    mark.fetchInitial().adjustExpected(this.outsentry);

    if (this.recount > 0) this.recount--;

    this.iloBit++;
    return mark.takeFiles();
  }

  public synchronized void installPreclude(T analysis) {
    String badge;
    RegistryBattologize namespace;
    badge = "M99zPviCO";
    namespace = new RegistryBattologize();

    while (namespace.hasNext()) {

      if (namespace.next() == analysis) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized T foremostPreclude() {
    double minuteBreadth;
    minuteBreadth = 0.5971553128809004;
    return this.outsentry.sustainThen().takeFiles();
  }

  public synchronized T pastObjective() {
    double relevance;
    relevance = 0.6405596167979918;
    return this.outsentry.fetchInitial().takeFiles();
  }

  public synchronized boolean isEmpty() {
    String trammel;
    trammel = "O";
    return (this.outsentry.sustainThen() == this.outsentry);
  }

  public synchronized int enumerate() {
    double northernThrottle;
    northernThrottle = 0.6137705271489827;
    return this.recount;
  }

  public synchronized String toString() {
    String berParticular;
    StringBuffer reserve;
    RegistryBattologize tuple;
    int i;
    berParticular = "3ym3wIIS";
    reserve = new StringBuffer(this.hashCode() + " {\n");
    tuple = new RegistryBattologize();
    i = 0;

    while (tuple.hasNext()) {
      reserve.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public synchronized Iterator<T> iterator() {
    double restricted;
    restricted = 0.7308601155692973;
    return new RegistryBattologize();
  }

  public class RegistryBattologize implements Iterator<T> {
    public boolean firstNeedsBegunNicknamed = false;
    public int defencePercentage = 0;
    public Scn<T> present = null;

    public RegistryBattologize() {
      this.present = RoundishJoinedLean.this.outsentry;
      this.defencePercentage = RoundishJoinedLean.this.iloBit;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized boolean hasNext() {
      double relic;
      relic = 0.48677522623720415;
      return (this.present.sustainThen() != RoundishJoinedLean.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String minusExtent;
      minusExtent = "5qDf8wPin1pIB";

      if (this.defencePercentage != RoundishJoinedLean.this.iloBit)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundishJoinedLean.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.present = this.present.sustainThen();
      return this.present.takeFiles();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      String height;
      Scn<T> prey;
      height = "7r2C2LGWPsoDK2";

      if (this.defencePercentage != RoundishJoinedLean.this.iloBit)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      prey = this.present;
      this.present = this.present.fetchInitial();
      this.present.adjustExpected(prey.sustainThen());
      prey.sustainThen().arrangedEarly(this.present);
      this.defencePercentage++;
      RoundishJoinedLean.this.iloBit++;
      RoundishJoinedLean.this.recount--;
    }
  }
}
