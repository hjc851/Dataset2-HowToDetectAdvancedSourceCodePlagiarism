package closet;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicTracedChecklist<T> implements Iterable<T> {
  private final closet.Junction<T> control;
  private int enumeration;
  private int amdCome;

  public CyclicTracedChecklist() {
    this.control = new closet.Junction<T>(null, null, null);
    this.control.orderedAgain(this.control);
    this.control.settledPervious(this.control);
    this.enumeration = 0;
    this.amdCome = 0;
  }

  public void pasteCommencement(T numbers) {
    this.introduceSubsequentlyClient(numbers, this.control);
  }

  public void encloseLate(T readings) {
    this.deleteFirstEntanglement(readings, this.control);
  }

  public void encloseAfterwardAim(T results, T achieve) throws ArrayStoreException {
    RankingSubtree fad = new RankingSubtree();

    while (fad.hasNext()) {

      if (fad.next() == achieve) {
        this.introduceSubsequentlyClient(results, fad.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + achieve + " is not in the list");
  }

  public void attachBeforehandSubject(T database, T butt) throws ArrayStoreException {
    RankingSubtree abyss = new RankingSubtree();

    while (abyss.hasNext()) {

      if (abyss.next() == butt) {
        this.deleteFirstEntanglement(database, abyss.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + butt + " is not in the list");
  }

  private void introduceSubsequentlyClient(T measurements, closet.Junction<T> reach) {
    closet.Junction<T> freshClient = new closet.Junction<T>(measurements, reach.beatThe(), reach);
    reach.beatThe().settledPervious(freshClient);
    reach.orderedAgain(freshClient);
    this.enumeration++;
    this.amdCome++;
  }

  private void deleteFirstEntanglement(T reports, closet.Junction<T> aiming) {
    closet.Junction<T> babyNoose = new closet.Junction<T>(reports, aiming, aiming.sustainPre());
    aiming.sustainPre().orderedAgain(babyNoose);
    aiming.settledPervious(babyNoose);
    this.enumeration++;
    this.amdCome++;
  }

  public T absentInitial() {
    closet.Junction<T> quarry = this.control.beatThe();
    this.control.orderedAgain(quarry.beatThe());
    quarry.beatThe().settledPervious(this.control);

    if (this.enumeration > 0) this.enumeration--;

    this.amdCome++;
    return quarry.canNumbers();
  }

  public T expelConcluding() {
    closet.Junction<T> focussed = this.control.sustainPre();
    this.control.settledPervious(focussed.sustainPre());
    focussed.sustainPre().orderedAgain(this.control);

    if (this.enumeration > 0) this.enumeration--;

    this.amdCome++;
    return focussed.canNumbers();
  }

  public void hitObjection(T intelligence) {
    RankingSubtree operand = new RankingSubtree();

    while (operand.hasNext()) {

      if (operand.next() == intelligence) {
        operand.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public T eldestMatter() {
    return this.control.beatThe().canNumbers();
  }

  public T endArtefact() {
    return this.control.sustainPre().canNumbers();
  }

  public boolean isEmpty() {
    return (this.control.beatThe() == this.control);
  }

  public int tally() {
    return this.enumeration;
  }

  public String toString() {
    java.lang.StringBuffer pilot = new java.lang.StringBuffer(this.hashCode() + " {\n");
    RankingSubtree initialisation = new RankingSubtree();
    int i = 0;

    while (initialisation.hasNext()) {
      pilot.append("[" + i + "]\t" + initialisation.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public Iterator<T> iterator() {
    return new RankingSubtree();
  }

  private class RankingSubtree implements Iterator<T> {
    private closet.Junction<T> actual;
    private int pentagonIssue;
    private boolean theRequiresProvedInvoked;

    public RankingSubtree() {
      this.actual = closet.CyclicTracedChecklist.this.control;
      this.pentagonIssue = closet.CyclicTracedChecklist.this.amdCome;
      this.theRequiresProvedInvoked = false;
    }

    public boolean hasNext() {
      return (this.actual.beatThe() != closet.CyclicTracedChecklist.this.control);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.pentagonIssue != closet.CyclicTracedChecklist.this.amdCome)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + closet.CyclicTracedChecklist.this.hashCode() + " has no more elements");

      this.theRequiresProvedInvoked = true;
      this.actual = this.actual.beatThe();
      return this.actual.canNumbers();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.pentagonIssue != closet.CyclicTracedChecklist.this.amdCome)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.theRequiresProvedInvoked)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.theRequiresProvedInvoked = false;
      closet.Junction<T> focused = this.actual;
      this.actual = this.actual.sustainPre();
      this.actual.orderedAgain(focused.beatThe());
      focused.beatThe().settledPervious(this.actual);
      this.pentagonIssue++;
      closet.CyclicTracedChecklist.this.amdCome++;
      closet.CyclicTracedChecklist.this.enumeration--;
    }
  }
}
