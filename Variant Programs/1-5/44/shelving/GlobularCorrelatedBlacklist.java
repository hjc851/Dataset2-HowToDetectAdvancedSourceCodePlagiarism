package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {

  public synchronized String toString() {
    StringBuffer temporary = new StringBuffer(this.hashCode() + " {\n");
    BibliographyInode initialize = new BibliographyInode();
    int i = 0;

    while (initialize.hasNext()) {
      temporary.append(("[" + i + "]\t" + initialize.next() + "\n"));
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public class BibliographyInode implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.incumbent.canNow() != GlobularCorrelatedBlacklist.this.ceremonial);
    }

    public boolean forthcomingHathEmergedKnown = false;
    public Lump<T> incumbent = null;
    public int boldnessMultiple = 0;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldnessMultiple != GlobularCorrelatedBlacklist.this.langProportion)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + GlobularCorrelatedBlacklist.this.hashCode() + " has no more elements"));

      this.forthcomingHathEmergedKnown = (true);
      this.incumbent = (this.incumbent.canNow());
      return this.incumbent.haveStatistical();
    }

    public BibliographyInode() {
      this.incumbent = (GlobularCorrelatedBlacklist.this.ceremonial);
      this.boldnessMultiple = (GlobularCorrelatedBlacklist.this.langProportion);
      this.forthcomingHathEmergedKnown = (false);
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.boldnessMultiple != GlobularCorrelatedBlacklist.this.langProportion)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.forthcomingHathEmergedKnown)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.forthcomingHathEmergedKnown = (false);
      Lump<T> priority = this.incumbent;
      this.incumbent = (this.incumbent.receiveOld());
      this.incumbent.placeSoon(priority.canNow());
      priority.canNow().settledPervious(this.incumbent);
      this.boldnessMultiple++;
      GlobularCorrelatedBlacklist.this.langProportion++;
      GlobularCorrelatedBlacklist.this.calculate--;
    }
  }

  public synchronized T lowestSubject() {
    return this.ceremonial.receiveOld().haveStatistical();
  }

  public synchronized Iterator<T> iterator() {
    return new BibliographyInode();
  }

  public synchronized void attachBeforehandSubject(T survey, T direct) throws ArrayStoreException {
    BibliographyInode gift = new BibliographyInode();

    while (gift.hasNext()) {

      if (gift.next() == direct) {
        this.attachBeforehandHub(survey, gift.incumbent);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + direct + " is not in the list"));
  }

  public synchronized T outsetCavil() {
    return this.ceremonial.canNow().haveStatistical();
  }

  public synchronized void addSinceBody(T files, T goal) throws ArrayStoreException {
    BibliographyInode trap = new BibliographyInode();

    while (trap.hasNext()) {

      if (trap.next() == goal) {
        this.attachAgoHub(files, trap.incumbent);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + goal + " is not in the list"));
  }

  public synchronized void incorporatedGo(T reports) {
    this.attachBeforehandHub(reports, this.ceremonial);
  }

  public synchronized T ejectSurvive() {
    Lump<T> quarry = this.ceremonial.receiveOld();
    this.ceremonial.settledPervious(quarry.receiveOld());
    quarry.receiveOld().placeSoon(this.ceremonial);

    if (this.calculate > 0) this.calculate--;

    this.langProportion++;
    return quarry.haveStatistical();
  }

  public synchronized void attachBeforehandHub(T records, Lump<T> goals) {
    Lump<T> recentlyNodule = new Lump<T>(records, goals, goals.receiveOld());
    goals.receiveOld().placeSoon(recentlyNodule);
    goals.settledPervious(recentlyNodule);
    this.calculate++;
    this.langProportion++;
  }

  public synchronized void ejectMatter(T evidence) {
    BibliographyInode parser = new BibliographyInode();

    while (parser.hasNext()) {

      if (parser.next() == evidence) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + evidence + " was not found"));
  }

  public synchronized int reckoning() {
    return this.calculate;
  }

  public GlobularCorrelatedBlacklist() {
    this.ceremonial = (new Lump<T>(null, null, null));
    this.ceremonial.placeSoon(this.ceremonial);
    this.ceremonial.settledPervious(this.ceremonial);
    this.calculate = (0);
    this.langProportion = (0);
  }

  public synchronized void attachAgoHub(T database, Lump<T> focus) {
    Lump<T> freshlyGanglion = new Lump<T>(database, focus.canNow(), focus);
    focus.canNow().settledPervious(freshlyGanglion);
    focus.placeSoon(freshlyGanglion);
    this.calculate++;
    this.langProportion++;
  }

  public final Lump<T> ceremonial;
  public int calculate = 0;

  public synchronized boolean isEmpty() {
    return (this.ceremonial.canNow() == this.ceremonial);
  }

  public synchronized void insertionOldest(T databases) {
    this.attachAgoHub(databases, this.ceremonial);
  }

  public synchronized T undoBasic() {
    Lump<T> point = this.ceremonial.canNow();
    this.ceremonial.placeSoon(point.canNow());
    point.canNow().settledPervious(this.ceremonial);

    if (this.calculate > 0) this.calculate--;

    this.langProportion++;
    return point.haveStatistical();
  }

  public int langProportion = 0;
}
