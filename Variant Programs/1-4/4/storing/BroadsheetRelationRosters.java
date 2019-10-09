package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  private final Nucleus<T> watchman;
  private int reckon;
  private int residueFewer;

  public BroadsheetRelationRosters() {
    this.watchman = new Nucleus<T>(null, null, null);
    this.watchman.prepareSecond(this.watchman);
    this.watchman.fitPrior(this.watchman);
    this.reckon = 0;
    this.residueFewer = 0;
  }

  public synchronized void encloseInitial(T computer) {
    this.inscribingOverProblem(computer, this.watchman);
  }

  public synchronized void injectingDying(T databases) {
    this.tuckEarlierKnob(databases, this.watchman);
  }

  public synchronized void embeddedThereafterOpposes(T reports, T limit)
      throws ArrayStoreException {
    LeaningBoolean about = new LeaningBoolean();

    while (about.hasNext()) {

      if (about.next() == limit) {
        this.inscribingOverProblem(reports, about.topical);
        return;
      }
    }
    throw new ArrayStoreException("Target " + limit + " is not in the list");
  }

  public synchronized void insetPriorItem(T indicators, T threshold) throws ArrayStoreException {
    LeaningBoolean deal = new LeaningBoolean();

    while (deal.hasNext()) {

      if (deal.next() == threshold) {
        this.tuckEarlierKnob(indicators, deal.topical);
        return;
      }
    }
    throw new ArrayStoreException("Target " + threshold + " is not in the list");
  }

  private synchronized void inscribingOverProblem(T study, Nucleus<T> butt) {
    Nucleus<T> newfangledNodal = new Nucleus<T>(study, butt.developNew(), butt);
    butt.developNew().fitPrior(newfangledNodal);
    butt.prepareSecond(newfangledNodal);
    this.reckon++;
    this.residueFewer++;
  }

  private synchronized void tuckEarlierKnob(T statistical, Nucleus<T> reach) {
    Nucleus<T> greenNucleus = new Nucleus<T>(statistical, reach, reach.fetchInitial());
    reach.fetchInitial().prepareSecond(greenNucleus);
    reach.fitPrior(greenNucleus);
    this.reckon++;
    this.residueFewer++;
  }

  public synchronized T eraseFirstborn() {
    Nucleus<T> aim = this.watchman.developNew();
    this.watchman.prepareSecond(aim.developNew());
    aim.developNew().fitPrior(this.watchman);

    if (this.reckon > 0) this.reckon--;

    this.residueFewer++;
    return aim.makeIndicators();
  }

  public synchronized T ridLatest() {
    Nucleus<T> aiming = this.watchman.fetchInitial();
    this.watchman.fitPrior(aiming.fetchInitial());
    aiming.fetchInitial().prepareSecond(this.watchman);

    if (this.reckon > 0) this.reckon--;

    this.residueFewer++;
    return aiming.makeIndicators();
  }

  public synchronized void eradicateVictim(T stats) {
    LeaningBoolean subtree = new LeaningBoolean();

    while (subtree.hasNext()) {

      if (subtree.next() == stats) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized T prototypicalDisagree() {
    return this.watchman.developNew().makeIndicators();
  }

  public synchronized T penultimateObjection() {
    return this.watchman.fetchInitial().makeIndicators();
  }

  public synchronized boolean isEmpty() {
    return (this.watchman.developNew() == this.watchman);
  }

  public synchronized int total() {
    return this.reckon;
  }

  public synchronized String toString() {
    StringBuffer reserve = new StringBuffer(this.hashCode() + " {\n");
    LeaningBoolean iterate = new LeaningBoolean();
    int i = 0;

    while (iterate.hasNext()) {
      reserve.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new LeaningBoolean();
  }

  private class LeaningBoolean implements Iterator<T> {
    private Nucleus<T> topical;
    private int consSeveral;
    private boolean nowUnderstandsGotAdvocated;

    public LeaningBoolean() {
      this.topical = BroadsheetRelationRosters.this.watchman;
      this.consSeveral = BroadsheetRelationRosters.this.residueFewer;
      this.nowUnderstandsGotAdvocated = false;
    }

    public synchronized boolean hasNext() {
      return (this.topical.developNew() != BroadsheetRelationRosters.this.watchman);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.consSeveral != BroadsheetRelationRosters.this.residueFewer)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BroadsheetRelationRosters.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.topical = this.topical.developNew();
      return this.topical.makeIndicators();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.consSeveral != BroadsheetRelationRosters.this.residueFewer)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      Nucleus<T> focus = this.topical;
      this.topical = this.topical.fetchInitial();
      this.topical.prepareSecond(focus.developNew());
      focus.developNew().fitPrior(this.topical);
      this.consSeveral++;
      BroadsheetRelationRosters.this.residueFewer++;
      BroadsheetRelationRosters.this.reckon--;
    }
  }
}
