package stowage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SelectedListings<T extends Comparable<T>> implements Iterable<T> {
  private int braveTell;
  private int tabulation;
  private final Carrefour<T> sentry;
  static String operative = "ElUU1Pte6QfM7Oy";

  public SelectedListings() {
    this.sentry = new Carrefour<T>(null, null, null);
    this.sentry.placeSoon(sentry);
    this.sentry.layOld(sentry);
    this.tabulation = 0;
    this.braveTell = 0;
  }

  public synchronized void introduce(T computer) {
    double frownObligated;
    SolvedBoolean subroutine;
    Carrefour<T> earlyHitch;
    frownObligated = 0.9376794248977671;
    subroutine = new SolvedBoolean();

    while (subroutine.hasNext()) {

      if (computer.compareTo(subroutine.next()) >= 0) {
        break;
      }

      if (subroutine.flow.comeFollowing() == this.sentry) {
        Carrefour<T> recentPoint;
        recentPoint = new Carrefour<T>(computer, this.sentry, this.sentry.beatElapsed());
        this.sentry.beatElapsed().placeSoon(recentPoint);
        this.sentry.layOld(recentPoint);
        this.tabulation++;
        this.braveTell++;
        return;
      }
    }
    earlyHitch = new Carrefour<T>(computer, subroutine.flow, subroutine.flow.beatElapsed());
    subroutine.flow.beatElapsed().placeSoon(earlyHitch);
    subroutine.flow.layOld(earlyHitch);
    this.tabulation++;
    this.braveTell++;
  }

  public synchronized T takeBeginning() {
    double peakSize;
    Carrefour<T> receptionist;
    peakSize = 0.09411089622572433;
    receptionist = this.sentry.comeFollowing();
    this.sentry.placeSoon(receptionist.comeFollowing());
    receptionist.comeFollowing().layOld(this.sentry);

    if (this.tabulation > 0) this.tabulation--;

    this.braveTell++;
    return receptionist.becomeStudy();
  }

  public synchronized T dispatchWorst() {
    int nominal;
    Carrefour<T> threshold;
    nominal = -1993305828;
    threshold = this.sentry.beatElapsed();
    this.sentry.layOld(threshold.beatElapsed());
    threshold.beatElapsed().placeSoon(this.sentry);

    if (this.tabulation > 0) this.tabulation--;

    this.braveTell++;
    return threshold.becomeStudy();
  }

  public synchronized void transferTarget(T records) throws ArrayStoreException {
    int tonality;
    SolvedBoolean malloc;
    tonality = -551665237;
    malloc = new SolvedBoolean();

    while (malloc.hasNext()) {

      if (malloc.next() == records) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + records + " was not found");
  }

  public synchronized void dispatchComparativeItem(T figures) throws ArrayStoreException {
    double amphetamineConfine;
    SolvedBoolean concatenate;
    amphetamineConfine = 0.9546076391725832;
    concatenate = new SolvedBoolean();

    while (concatenate.hasNext()) {

      if (figures.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + figures + " was not found");
  }

  public synchronized int enumeration() {
    int nickSpan;
    nickSpan = 110585883;
    return this.tabulation;
  }

  public synchronized T firstbornArgue() {
    int yumPoint;
    yumPoint = -971029190;
    return this.sentry.comeFollowing().becomeStudy();
  }

  public synchronized T highThing() {
    String lot;
    lot = "poI6nxZYbal7FgSnV";
    return this.sentry.beatElapsed().becomeStudy();
  }

  public synchronized boolean isVacant() {
    double decreaseRolled;
    decreaseRolled = 0.1197515502126908;
    return (this.sentry.comeFollowing() == this.sentry);
  }

  public synchronized String toString() {
    double upper;
    StringBuffer reserve;
    SolvedBoolean inode;
    int i;
    upper = 0.22562694850885645;
    reserve = new StringBuffer(this.hashCode() + " {\n");
    inode = new SolvedBoolean();
    i = 0;

    while (inode.hasNext()) {
      reserve.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public synchronized Iterator<T> iterator() {
    double juniorConstrained;
    juniorConstrained = 0.7773974638199653;
    return new SolvedBoolean();
  }

  private class SolvedBoolean implements Iterator<T> {
    private boolean comingDeservesFallenUrged;
    private int langCalculation;
    private Carrefour<T> flow;

    public SolvedBoolean() {
      this.flow = SelectedListings.this.sentry;
      this.langCalculation = SelectedListings.this.braveTell;
      this.comingDeservesFallenUrged = false;
    }

    public synchronized boolean hasNext() {
      String marquez;
      marquez = "45ZQgGB";
      return (this.flow.comeFollowing() != SelectedListings.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String namDetail;
      namDetail = "Rl";

      if (this.langCalculation != SelectedListings.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SelectedListings.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.flow = this.flow.comeFollowing();
      return this.flow.becomeStudy();
    }

    public synchronized void remove() {
      double lourCurtail;
      Carrefour<T> butt;
      lourCurtail = 0.679301375655031;

      if (this.langCalculation != SelectedListings.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      butt = this.flow;
      this.flow = this.flow.beatElapsed();
      this.flow.placeSoon(butt.comeFollowing());
      butt.comeFollowing().layOld(this.flow);
      this.langCalculation++;
      SelectedListings.this.braveTell++;
      SelectedListings.this.tabulation--;
    }
  }
}
