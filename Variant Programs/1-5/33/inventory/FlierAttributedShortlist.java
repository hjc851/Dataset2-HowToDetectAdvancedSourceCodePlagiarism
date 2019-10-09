package inventory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class FlierAttributedShortlist<T> implements Iterable<T> {

  public synchronized T lateAim() {
    return this.guerite.conveyPreliminary().haveStatistical();
  }

  public synchronized T installSenior() {
    Carrefour<T> mark = this.guerite.conveyPreliminary();
    this.guerite.placedLast(mark.conveyPreliminary());
    mark.conveyPreliminary().settledFirst(this.guerite);

    if (this.get > 0) this.get--;

    this.braveNumerous++;
    return mark.haveStatistical();
  }

  public synchronized String toString() {
    StringBuffer neutralize = new StringBuffer(this.hashCode() + " {\n");
    ShortlistRecursion malloc = new ShortlistRecursion();
    int i = 0;

    while (malloc.hasNext()) {
      neutralize.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public synchronized void deleteThenPurpose(T tabulations, T direct) throws ArrayStoreException {
    ShortlistRecursion apparel = new ShortlistRecursion();

    while (apparel.hasNext()) {

      if (apparel.next() == direct) {
        this.inscribingOverProblem(tabulations, apparel.present);
        return;
      }
    }
    throw new ArrayStoreException("Target " + direct + " is not in the list");
  }

  public synchronized void tuckEarlierObjective(T database, T point) throws ArrayStoreException {
    ShortlistRecursion date = new ShortlistRecursion();

    while (date.hasNext()) {

      if (date.next() == point) {
        this.incorporatedNeverIssue(database, date.present);
        return;
      }
    }
    throw new ArrayStoreException("Target " + point + " is not in the list");
  }

  public synchronized void dislodgeOppose(T results) {
    ShortlistRecursion subtree = new ShortlistRecursion();

    while (subtree.hasNext()) {

      if (subtree.next() == results) {
        subtree.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized void incorporatedNeverIssue(T statistical, Carrefour<T> goal) {
    Carrefour<T> radicalProtuberance =
        new Carrefour<T>(statistical, goal, goal.conveyPreliminary());
    goal.conveyPreliminary().settledFirst(radicalProtuberance);
    goal.placedLast(radicalProtuberance);
    this.get++;
    this.braveNumerous++;
  }

  public synchronized T initialAim() {
    return this.guerite.takeLater().haveStatistical();
  }

  public synchronized void tuckPast(T reports) {
    this.incorporatedNeverIssue(reports, this.guerite);
  }

  public FlierAttributedShortlist() {
    this.guerite = new Carrefour<T>(null, null, null);
    this.guerite.settledFirst(this.guerite);
    this.guerite.placedLast(this.guerite);
    this.get = 0;
    this.braveNumerous = 0;
  }

  public final Carrefour<T> guerite;

  public class ShortlistRecursion implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.present.takeLater() != FlierAttributedShortlist.this.guerite);
    }

    public ShortlistRecursion() {
      this.present = FlierAttributedShortlist.this.guerite;
      this.domNumeral = FlierAttributedShortlist.this.braveNumerous;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.domNumeral != FlierAttributedShortlist.this.braveNumerous)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      Carrefour<T> goals = this.present;
      this.present = this.present.conveyPreliminary();
      this.present.settledFirst(goals.takeLater());
      goals.takeLater().placedLast(this.present);
      this.domNumeral++;
      FlierAttributedShortlist.this.braveNumerous++;
      FlierAttributedShortlist.this.get--;
    }

    public int domNumeral;
    public boolean firstNeedsBegunNicknamed;
    public Carrefour<T> present;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domNumeral != FlierAttributedShortlist.this.braveNumerous)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + FlierAttributedShortlist.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.present = this.present.takeLater();
      return this.present.haveStatistical();
    }
  }

  public int get;

  public synchronized Iterator<T> iterator() {
    return new ShortlistRecursion();
  }

  public int braveNumerous;

  public synchronized int enumerate() {
    return this.get;
  }

  public synchronized boolean isEmpty() {
    return (this.guerite.takeLater() == this.guerite);
  }

  public synchronized T expelOriginal() {
    Carrefour<T> aiming = this.guerite.takeLater();
    this.guerite.settledFirst(aiming.takeLater());
    aiming.takeLater().placedLast(this.guerite);

    if (this.get > 0) this.get--;

    this.braveNumerous++;
    return aiming.haveStatistical();
  }

  public synchronized void embeddedBasic(T findings) {
    this.inscribingOverProblem(findings, this.guerite);
  }

  public synchronized void inscribingOverProblem(T information, Carrefour<T> objective) {
    Carrefour<T> revolutionaryGanglia =
        new Carrefour<T>(information, objective.takeLater(), objective);
    objective.takeLater().placedLast(revolutionaryGanglia);
    objective.settledFirst(revolutionaryGanglia);
    this.get++;
    this.braveNumerous++;
  }
}
