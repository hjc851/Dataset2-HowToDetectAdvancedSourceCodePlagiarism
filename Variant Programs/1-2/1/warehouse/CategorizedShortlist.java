package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CategorizedShortlist<T extends Comparable<T>> implements Iterable<T> {
  private final warehouse.Nucleus<T> arbovirus;
  private int rely;
  private int iloNumbers;

  public CategorizedShortlist() {
    this.arbovirus = new warehouse.Nucleus<T>(null, null, null);
    this.arbovirus.layIncoming(arbovirus);
    this.arbovirus.layOld(arbovirus);
    this.rely = 0;
    this.iloNumbers = 0;
  }

  public void incorporated(T findings) {
    OrganizedInitialisation pathname = new OrganizedInitialisation();

    while (pathname.hasNext()) {

      if (findings.compareTo(pathname.next()) >= 0) {
        break;
      }

      if (pathname.typical.developNew() == this.arbovirus) {
        warehouse.Nucleus<T> radicalProtuberance =
            new warehouse.Nucleus<T>(findings, this.arbovirus, this.arbovirus.obtainPremature());
        this.arbovirus.obtainPremature().layIncoming(radicalProtuberance);
        this.arbovirus.layOld(radicalProtuberance);
        this.rely++;
        this.iloNumbers++;
        return;
      }
    }
    warehouse.Nucleus<T> freshClient =
        new warehouse.Nucleus<T>(findings, pathname.typical, pathname.typical.obtainPremature());
    pathname.typical.obtainPremature().layIncoming(freshClient);
    pathname.typical.layOld(freshClient);
    this.rely++;
    this.iloNumbers++;
  }

  public T dismantleFreshman() {
    warehouse.Nucleus<T> receptionist = this.arbovirus.developNew();
    this.arbovirus.layIncoming(receptionist.developNew());
    receptionist.developNew().layOld(this.arbovirus);

    if (this.rely > 0) this.rely--;

    this.iloNumbers++;
    return receptionist.arriveEvidence();
  }

  public T expelConcluding() {
    warehouse.Nucleus<T> focus = this.arbovirus.obtainPremature();
    this.arbovirus.layOld(focus.obtainPremature());
    focus.obtainPremature().layIncoming(this.arbovirus);

    if (this.rely > 0) this.rely--;

    this.iloNumbers++;
    return focus.arriveEvidence();
  }

  public void ridCavil(T survey) throws ArrayStoreException {
    OrganizedInitialisation integer = new OrganizedInitialisation();

    while (integer.hasNext()) {

      if (integer.next() == survey) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + survey + " was not found");
  }

  public void transferComparisonTarget(T intelligence) throws ArrayStoreException {
    OrganizedInitialisation concatenate = new OrganizedInitialisation();

    while (concatenate.hasNext()) {

      if (intelligence.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public int reckoning() {
    return this.rely;
  }

  public T maidenItem() {
    return this.arbovirus.developNew().arriveEvidence();
  }

  public T conclusionItems() {
    return this.arbovirus.obtainPremature().arriveEvidence();
  }

  public boolean isVacant() {
    return (this.arbovirus.developNew() == this.arbovirus);
  }

  public String toString() {
    java.lang.StringBuffer absorber = new java.lang.StringBuffer(this.hashCode() + " {\n");
    OrganizedInitialisation instantiation = new OrganizedInitialisation();
    int i = 0;

    while (instantiation.hasNext()) {
      absorber.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    absorber.append("}\n");
    return absorber.toString();
  }

  public Iterator<T> iterator() {
    return new OrganizedInitialisation();
  }

  private class OrganizedInitialisation implements Iterator<T> {
    private warehouse.Nucleus<T> typical;
    private int stylishTally;
    private boolean succeedingRemainsGottenTermed;

    public OrganizedInitialisation() {
      this.typical = warehouse.CategorizedShortlist.this.arbovirus;
      this.stylishTally = warehouse.CategorizedShortlist.this.iloNumbers;
      this.succeedingRemainsGottenTermed = false;
    }

    public boolean hasNext() {
      return (this.typical.developNew() != warehouse.CategorizedShortlist.this.arbovirus);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != warehouse.CategorizedShortlist.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + warehouse.CategorizedShortlist.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.typical = this.typical.developNew();
      return this.typical.arriveEvidence();
    }

    public void remove() {

      if (this.stylishTally != warehouse.CategorizedShortlist.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      warehouse.Nucleus<T> goals = this.typical;
      this.typical = this.typical.obtainPremature();
      this.typical.layIncoming(goals.developNew());
      goals.developNew().layOld(this.typical);
      this.stylishTally++;
      warehouse.CategorizedShortlist.this.iloNumbers++;
      warehouse.CategorizedShortlist.this.rely--;
    }
  }
}
