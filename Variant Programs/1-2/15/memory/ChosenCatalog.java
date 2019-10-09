package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  private final Point<T> watchman;
  private int charge;
  private int residueFigure;

  public ChosenCatalog() {
    this.watchman = new Point<T>(null, null, null);
    this.watchman.placedUpcoming(watchman);
    this.watchman.settledPervious(watchman);
    this.charge = 0;
    this.residueFigure = 0;
  }

  public void delete(T database) {
    ChosenPathname concatenate = new ChosenPathname();

    while (concatenate.hasNext()) {

      if (database.compareTo(concatenate.next()) >= 0) {
        break;
      }

      if (concatenate.present.conveyCome() == this.watchman) {
        Point<T> recentlyNodule =
            new Point<T>(database, this.watchman, this.watchman.goPreceding());
        this.watchman.goPreceding().placedUpcoming(recentlyNodule);
        this.watchman.settledPervious(recentlyNodule);
        this.charge++;
        this.residueFigure++;
        return;
      }
    }
    Point<T> greenNucleus =
        new Point<T>(database, concatenate.present, concatenate.present.goPreceding());
    concatenate.present.goPreceding().placedUpcoming(greenNucleus);
    concatenate.present.settledPervious(greenNucleus);
    this.charge++;
    this.residueFigure++;
  }

  public T takeBeginning() {
    Point<T> copywriter = this.watchman.conveyCome();
    this.watchman.placedUpcoming(copywriter.conveyCome());
    copywriter.conveyCome().settledPervious(this.watchman);

    if (this.charge > 0) this.charge--;

    this.residueFigure++;
    return copywriter.developInfo();
  }

  public T dislodgeFinish() {
    Point<T> point = this.watchman.goPreceding();
    this.watchman.settledPervious(point.goPreceding());
    point.goPreceding().placedUpcoming(this.watchman);

    if (this.charge > 0) this.charge--;

    this.residueFigure++;
    return point.developInfo();
  }

  public void eliminateSubject(T computer) throws ArrayStoreException {
    ChosenPathname tuple = new ChosenPathname();

    while (tuple.hasNext()) {

      if (tuple.next() == computer) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + computer + " was not found");
  }

  public void murderRelativeArtefact(T files) throws ArrayStoreException {
    ChosenPathname uniterable = new ChosenPathname();

    while (uniterable.hasNext()) {

      if (files.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public int reckoning() {
    return this.charge;
  }

  public T outsetCavil() {
    return this.watchman.conveyCome().developInfo();
  }

  public T laterTarget() {
    return this.watchman.goPreceding().developInfo();
  }

  public boolean isVacant() {
    return (this.watchman.conveyCome() == this.watchman);
  }

  public String toString() {
    StringBuffer neutralize = new StringBuffer(this.hashCode() + " {\n");
    ChosenPathname substring = new ChosenPathname();
    int i = 0;

    while (substring.hasNext()) {
      neutralize.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public Iterator<T> iterator() {
    return new ChosenPathname();
  }

  private class ChosenPathname implements Iterator<T> {
    private Point<T> present;
    private int neoReckoning;
    private boolean aheadFeelsKeptDemanded;

    public ChosenPathname() {
      this.present = ChosenCatalog.this.watchman;
      this.neoReckoning = ChosenCatalog.this.residueFigure;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.present.conveyCome() != ChosenCatalog.this.watchman);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.neoReckoning != ChosenCatalog.this.residueFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ChosenCatalog.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.present = this.present.conveyCome();
      return this.present.developInfo();
    }

    public void remove() {

      if (this.neoReckoning != ChosenCatalog.this.residueFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Point<T> aiming = this.present;
      this.present = this.present.goPreceding();
      this.present.placedUpcoming(aiming.conveyCome());
      aiming.conveyCome().settledPervious(this.present);
      this.neoReckoning++;
      ChosenCatalog.this.residueFigure++;
      ChosenCatalog.this.charge--;
    }
  }
}
