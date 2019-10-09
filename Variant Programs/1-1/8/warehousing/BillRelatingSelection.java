package warehousing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BillRelatingSelection<T> implements Iterable<T> {
  private final Bump<T> lookout;
  private int reckon;
  private int pentagonIssue;

  public BillRelatingSelection() {
    this.lookout = new Bump<T>(null, null, null);
    this.lookout.primedLater(this.lookout);
    this.lookout.fitPrior(this.lookout);
    this.reckon = 0;
    this.pentagonIssue = 0;
  }

  public void pasteCommencement(T findings) {
    this.embeddedThereafterLump(findings, this.lookout);
  }

  public void incorporatedGo(T information) {
    this.injectedLateBump(information, this.lookout);
  }

  public void embedDuringCavil(T survey, T aiming) throws ArrayStoreException {
    NameIterate aberdeen = new NameIterate();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == aiming) {
        this.embeddedThereafterLump(survey, aberdeen.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aiming + " is not in the list");
  }

  public void injectWithoutOppose(T readings, T reach) throws ArrayStoreException {
    NameIterate scam = new NameIterate();

    while (scam.hasNext()) {

      if (scam.next() == reach) {
        this.injectedLateBump(readings, scam.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + reach + " is not in the list");
  }

  private void embeddedThereafterLump(T indicators, Bump<T> direct) {
    Bump<T> freshlyGanglion = new Bump<T>(indicators, direct.becomeAfter(), direct);
    direct.becomeAfter().fitPrior(freshlyGanglion);
    direct.primedLater(freshlyGanglion);
    this.reckon++;
    this.pentagonIssue++;
  }

  private void injectedLateBump(T database, Bump<T> focus) {
    Bump<T> newfangledNodal = new Bump<T>(database, focus, focus.havePervious());
    focus.havePervious().primedLater(newfangledNodal);
    focus.fitPrior(newfangledNodal);
    this.reckon++;
    this.pentagonIssue++;
  }

  public T absentInitial() {
    Bump<T> objectives = this.lookout.becomeAfter();
    this.lookout.primedLater(objectives.becomeAfter());
    objectives.becomeAfter().fitPrior(this.lookout);

    if (this.reckon > 0) this.reckon--;

    this.pentagonIssue++;
    return objectives.drawStats();
  }

  public T disposeNet() {
    Bump<T> limit = this.lookout.havePervious();
    this.lookout.fitPrior(limit.havePervious());
    limit.havePervious().primedLater(this.lookout);

    if (this.reckon > 0) this.reckon--;

    this.pentagonIssue++;
    return limit.drawStats();
  }

  public void eraseArgue(T numbers) {
    NameIterate inode = new NameIterate();

    while (inode.hasNext()) {

      if (inode.next() == numbers) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + numbers + " was not found");
  }

  public T originalObjet() {
    return this.lookout.becomeAfter().drawStats();
  }

  public T lateAim() {
    return this.lookout.havePervious().drawStats();
  }

  public boolean isEmpty() {
    return (this.lookout.becomeAfter() == this.lookout);
  }

  public int figure() {
    return this.reckon;
  }

  public String toString() {
    StringBuffer fender = new StringBuffer(this.hashCode() + " {\n");
    NameIterate subtree = new NameIterate();
    int i = 0;

    while (subtree.hasNext()) {
      fender.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public Iterator<T> iterator() {
    return new NameIterate();
  }

  private class NameIterate implements Iterator<T> {
    private Bump<T> rife;
    private int defencePercentage;
    private boolean comeOccupiesDonePetitioned;

    public NameIterate() {
      this.rife = BillRelatingSelection.this.lookout;
      this.defencePercentage = BillRelatingSelection.this.pentagonIssue;
      this.comeOccupiesDonePetitioned = false;
    }

    public boolean hasNext() {
      return (this.rife.becomeAfter() != BillRelatingSelection.this.lookout);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != BillRelatingSelection.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BillRelatingSelection.this.hashCode() + " has no more elements");

      this.comeOccupiesDonePetitioned = true;
      this.rife = this.rife.becomeAfter();
      return this.rife.drawStats();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.defencePercentage != BillRelatingSelection.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comeOccupiesDonePetitioned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = false;
      Bump<T> goals = this.rife;
      this.rife = this.rife.havePervious();
      this.rife.primedLater(goals.becomeAfter());
      goals.becomeAfter().fitPrior(this.rife);
      this.defencePercentage++;
      BillRelatingSelection.this.pentagonIssue++;
      BillRelatingSelection.this.reckon--;
    }
  }
}
