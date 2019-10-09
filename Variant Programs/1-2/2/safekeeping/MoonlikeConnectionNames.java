package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class MoonlikeConnectionNames<T> implements Iterable<T> {
  private final safekeeping.Entanglement<T> control;
  private int reckoning;
  private int residueFewer;

  public MoonlikeConnectionNames() {
    this.control = new safekeeping.Entanglement<T>(null, null, null);
    this.control.solidifyingThe(this.control);
    this.control.determinedPremature(this.control);
    this.reckoning = 0;
    this.residueFewer = 0;
  }

  public void incorporatedFirstborn(T analysis) {
    this.putFromPoint(analysis, this.control);
  }

  public void infixEnd(T computer) {
    this.incloseUntilNodal(computer, this.control);
  }

  public void installSubsequentPreclude(T database, T limit) throws ArrayStoreException {
    ListingsInstantiation abcs = new ListingsInstantiation();

    while (abcs.hasNext()) {

      if (abcs.next() == limit) {
        this.putFromPoint(database, abcs.continuing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + limit + " is not in the list");
  }

  public void tuckEarlierObjective(T stats, T focus) throws ArrayStoreException {
    ListingsInstantiation magic = new ListingsInstantiation();

    while (magic.hasNext()) {

      if (magic.next() == focus) {
        this.incloseUntilNodal(stats, magic.continuing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focus + " is not in the list");
  }

  private void putFromPoint(T reports, safekeeping.Entanglement<T> quarry) {
    safekeeping.Entanglement<T> newfoundJunction =
        new safekeeping.Entanglement<T>(reports, quarry.comeFollowing(), quarry);
    quarry.comeFollowing().determinedPremature(newfoundJunction);
    quarry.solidifyingThe(newfoundJunction);
    this.reckoning++;
    this.residueFewer++;
  }

  private void incloseUntilNodal(T measurements, safekeeping.Entanglement<T> focussed) {
    safekeeping.Entanglement<T> otherEntanglement =
        new safekeeping.Entanglement<T>(measurements, focussed, focussed.findEarly());
    focussed.findEarly().solidifyingThe(otherEntanglement);
    focussed.determinedPremature(otherEntanglement);
    this.reckoning++;
    this.residueFewer++;
  }

  public T dislodgePremier() {
    safekeeping.Entanglement<T> reach = this.control.comeFollowing();
    this.control.solidifyingThe(reach.comeFollowing());
    reach.comeFollowing().determinedPremature(this.control);

    if (this.reckoning > 0) this.reckoning--;

    this.residueFewer++;
    return reach.fixResults();
  }

  public T murderEnd() {
    safekeeping.Entanglement<T> objectives = this.control.findEarly();
    this.control.determinedPremature(objectives.findEarly());
    objectives.findEarly().solidifyingThe(this.control);

    if (this.reckoning > 0) this.reckoning--;

    this.residueFewer++;
    return objectives.fixResults();
  }

  public void expelObjet(T figures) {
    ListingsInstantiation bool = new ListingsInstantiation();

    while (bool.hasNext()) {

      if (bool.next() == figures) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + figures + " was not found");
  }

  public T basicOpposes() {
    return this.control.comeFollowing().fixResults();
  }

  public T worstItem() {
    return this.control.findEarly().fixResults();
  }

  public boolean isEmpty() {
    return (this.control.comeFollowing() == this.control);
  }

  public int quantify() {
    return this.reckoning;
  }

  public String toString() {
    java.lang.StringBuffer pilot = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ListingsInstantiation inode = new ListingsInstantiation();
    int i = 0;

    while (inode.hasNext()) {
      pilot.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public Iterator<T> iterator() {
    return new ListingsInstantiation();
  }

  private class ListingsInstantiation implements Iterator<T> {
    private safekeeping.Entanglement<T> continuing;
    private int boldnessMultiple;
    private boolean soonHoldsUndergoneAsked;

    public ListingsInstantiation() {
      this.continuing = safekeeping.MoonlikeConnectionNames.this.control;
      this.boldnessMultiple = safekeeping.MoonlikeConnectionNames.this.residueFewer;
      this.soonHoldsUndergoneAsked = false;
    }

    public boolean hasNext() {
      return (this.continuing.comeFollowing() != safekeeping.MoonlikeConnectionNames.this.control);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldnessMultiple != safekeeping.MoonlikeConnectionNames.this.residueFewer)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + safekeeping.MoonlikeConnectionNames.this.hashCode()
                + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.continuing = this.continuing.comeFollowing();
      return this.continuing.fixResults();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.boldnessMultiple != safekeeping.MoonlikeConnectionNames.this.residueFewer)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      safekeeping.Entanglement<T> pinpoint = this.continuing;
      this.continuing = this.continuing.findEarly();
      this.continuing.solidifyingThe(pinpoint.comeFollowing());
      pinpoint.comeFollowing().determinedPremature(this.continuing);
      this.boldnessMultiple++;
      safekeeping.MoonlikeConnectionNames.this.residueFewer++;
      safekeeping.MoonlikeConnectionNames.this.reckoning--;
    }
  }
}
