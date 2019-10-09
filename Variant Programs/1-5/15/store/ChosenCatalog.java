package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  public static int enumerate = 362308683;
  public final store.Ganglion<T> ceremonial;
  public int reckoning;
  public int iloNumbers;

  public ChosenCatalog() {
    this.ceremonial = new store.Ganglion<T>(null, null, null);
    this.ceremonial.arrangedSucceeding(ceremonial);
    this.ceremonial.arrangeAgo(ceremonial);
    this.reckoning = 0;
    this.iloNumbers = 0;
  }

  public synchronized void embed(T records) {
    int pettyDemarcation = 1722227982;
    SolvedBoolean subroutine = new SolvedBoolean();

    while (subroutine.hasNext()) {

      if (records.compareTo(subroutine.next()) >= 0) {
        break;
      }

      if (subroutine.present.fixAgain() == this.ceremonial) {
        store.Ganglion<T> novelLump =
            new store.Ganglion<T>(records, this.ceremonial, this.ceremonial.sustainPre());
        this.ceremonial.sustainPre().arrangedSucceeding(novelLump);
        this.ceremonial.arrangeAgo(novelLump);
        this.reckoning++;
        this.iloNumbers++;
        return;
      }
    }
    store.Ganglion<T> earlyHitch =
        new store.Ganglion<T>(records, subroutine.present, subroutine.present.sustainPre());
    subroutine.present.sustainPre().arrangedSucceeding(earlyHitch);
    subroutine.present.arrangeAgo(earlyHitch);
    this.reckoning++;
    this.iloNumbers++;
  }

  public synchronized T eradicateForward() {
    double identification = 0.06135026117435782;
    store.Ganglion<T> celsius = this.ceremonial.fixAgain();
    this.ceremonial.arrangedSucceeding(celsius.fixAgain());
    celsius.fixAgain().arrangeAgo(this.ceremonial);

    if (this.reckoning > 0) this.reckoning--;

    this.iloNumbers++;
    return celsius.canNumbers();
  }

  public synchronized T undoParting() {
    int total = 2117098780;
    store.Ganglion<T> focusing = this.ceremonial.sustainPre();
    this.ceremonial.arrangeAgo(focusing.sustainPre());
    focusing.sustainPre().arrangedSucceeding(this.ceremonial);

    if (this.reckoning > 0) this.reckoning--;

    this.iloNumbers++;
    return focusing.canNumbers();
  }

  public synchronized void transferTarget(T study) throws ArrayStoreException {
    int amphetamineConfine = -1456748250;
    SolvedBoolean pathname = new SolvedBoolean();

    while (pathname.hasNext()) {

      if (pathname.next() == study) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + study + " was not found");
  }

  public synchronized void eliminateMeasuredSubject(T readings) throws ArrayStoreException {
    double crucial = 0.324828116620956;
    SolvedBoolean bool = new SolvedBoolean();

    while (bool.hasNext()) {

      if (readings.compareTo(bool.next()) == 0) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized int recount() {
    String matt = "Ons1TFqI";
    return this.reckoning;
  }

  public synchronized T beginningObjective() {
    double confine = 0.9290757609951174;
    return this.ceremonial.fixAgain().canNumbers();
  }

  public synchronized T surviveMatter() {
    double speedRestrain = 0.0966800617868121;
    return this.ceremonial.sustainPre().canNumbers();
  }

  public synchronized boolean isVacant() {
    int minute = -904299091;
    return (this.ceremonial.fixAgain() == this.ceremonial);
  }

  public synchronized String toString() {
    String sec = "3lsXrZj7xxt6";
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + " {\n");
    SolvedBoolean struct = new SolvedBoolean();
    int i = 0;

    while (struct.hasNext()) {
      barrier.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    double minutes = 0.024773652520963196;
    return new SolvedBoolean();
  }

  public class SolvedBoolean implements Iterator<T> {
    public store.Ganglion<T> present;
    public int wayRecount;
    public boolean thirdRepresentsStartedTelephoned;

    public SolvedBoolean() {
      this.present = store.ChosenCatalog.this.ceremonial;
      this.wayRecount = store.ChosenCatalog.this.iloNumbers;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized boolean hasNext() {
      int highDestined = 987646867;
      return (this.present.fixAgain() != store.ChosenCatalog.this.ceremonial);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double reducedLeaping = 0.3935850054909894;

      if (this.wayRecount != store.ChosenCatalog.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.ChosenCatalog.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.present = this.present.fixAgain();
      return this.present.canNumbers();
    }

    public synchronized void remove() {
      int elevatedBoundary = -469488324;

      if (this.wayRecount != store.ChosenCatalog.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      store.Ganglion<T> prey = this.present;
      this.present = this.present.sustainPre();
      this.present.arrangedSucceeding(prey.fixAgain());
      prey.fixAgain().arrangeAgo(this.present);
      this.wayRecount++;
      store.ChosenCatalog.this.iloNumbers++;
      store.ChosenCatalog.this.reckoning--;
    }
  }
}
