package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class MoonlikeConnectionNames<T> implements Iterable<T> {
  private static final String synX1899String = "}\n";
  private static final String synX1898String = "\n";
  private static final String synX1897String = "]\t";
  private static final String synX1896String = "[";
  private static final int synX1895int = 0;
  private static final String synX1894String = " {\n";
  private static final String synX1893String = " was not found";
  private static final String synX1892String = "Object ";
  private static final int synX1891int = 0;
  private static final int synX1890int = 0;
  private static final String synX1889String = " is not in the list";
  private static final String synX1888String = "Target ";
  private static final String synX1887String = " is not in the list";
  private static final String synX1886String = "Target ";
  public final Antenna<T> keeper;
  public int recount;
  public int dodAct;

  public MoonlikeConnectionNames() {
    this.keeper = new Antenna<T>(null, null, null);
    this.keeper.fixedAfter(this.keeper);
    this.keeper.rigidPreliminary(this.keeper);
    this.recount = 0;
    this.dodAct = 0;
  }

  public synchronized void pasteCommencement(T study) {
    this.embedDuringScn(study, this.keeper);
  }

  public synchronized void deleteClosing(T statistical) {
    this.infixThenNodule(statistical, this.keeper);
  }

  public synchronized void injectedWakeMatter(T estimates, T goal) throws ArrayStoreException {
    DirectoryBool aberdeen = new DirectoryBool();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == goal) {
        this.embedDuringScn(estimates, aberdeen.afoot);
        return;
      }
    }
    throw new ArrayStoreException(synX1886String + goal + synX1887String);
  }

  public synchronized void inscribeSoonObjet(T numbers, T quarry) throws ArrayStoreException {
    DirectoryBool alive = new DirectoryBool();

    while (alive.hasNext()) {

      if (alive.next() == quarry) {
        this.infixThenNodule(numbers, alive.afoot);
        return;
      }
    }
    throw new ArrayStoreException(synX1888String + quarry + synX1889String);
  }

  public synchronized void embedDuringScn(T figures, Antenna<T> mark) {
    Antenna<T> youngCore = new Antenna<T>(figures, mark.becomeAfter(), mark);
    mark.becomeAfter().rigidPreliminary(youngCore);
    mark.fixedAfter(youngCore);
    this.recount++;
    this.dodAct++;
  }

  public synchronized void infixThenNodule(T indicators, Antenna<T> aiming) {
    Antenna<T> recentPoint = new Antenna<T>(indicators, aiming, aiming.drawSuccessive());
    aiming.drawSuccessive().fixedAfter(recentPoint);
    aiming.rigidPreliminary(recentPoint);
    this.recount++;
    this.dodAct++;
  }

  public synchronized T banishPrime() {
    Antenna<T> threshold = this.keeper.becomeAfter();
    this.keeper.fixedAfter(threshold.becomeAfter());
    threshold.becomeAfter().rigidPreliminary(this.keeper);

    if (this.recount > synX1890int) this.recount--;

    this.dodAct++;
    return threshold.bringStatistics();
  }

  public synchronized T undoParting() {
    Antenna<T> focused = this.keeper.drawSuccessive();
    this.keeper.rigidPreliminary(focused.drawSuccessive());
    focused.drawSuccessive().fixedAfter(this.keeper);

    if (this.recount > synX1891int) this.recount--;

    this.dodAct++;
    return focused.bringStatistics();
  }

  public synchronized void murderArtefact(T records) {
    DirectoryBool bool = new DirectoryBool();

    while (bool.hasNext()) {

      if (bool.next() == records) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1892String + records + synX1893String);
  }

  public synchronized T commencementTotem() {
    return this.keeper.becomeAfter().bringStatistics();
  }

  public synchronized T dyingVictim() {
    return this.keeper.drawSuccessive().bringStatistics();
  }

  public synchronized boolean isEmpty() {
    return (this.keeper.becomeAfter() == this.keeper);
  }

  public synchronized int tell() {
    return this.recount;
  }

  public synchronized String toString() {
    StringBuffer spacer = new StringBuffer(this.hashCode() + synX1894String);
    DirectoryBool concatenate = new DirectoryBool();
    int i = synX1895int;

    while (concatenate.hasNext()) {
      spacer.append(synX1896String + i + synX1897String + concatenate.next() + synX1898String);
      i++;
    }
    spacer.append(synX1899String);
    return spacer.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new DirectoryBool();
  }

  public class DirectoryBool implements Iterator<T> {
    public Antenna<T> afoot;
    public int domNumeral;
    public boolean futureBeenAlreadyNamed;

    public DirectoryBool() {
      this.afoot = MoonlikeConnectionNames.this.keeper;
      this.domNumeral = MoonlikeConnectionNames.this.dodAct;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      return (this.afoot.becomeAfter() != MoonlikeConnectionNames.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domNumeral != MoonlikeConnectionNames.this.dodAct)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + MoonlikeConnectionNames.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.afoot = this.afoot.becomeAfter();
      return this.afoot.bringStatistics();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.domNumeral != MoonlikeConnectionNames.this.dodAct)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      Antenna<T> objectives = this.afoot;
      this.afoot = this.afoot.drawSuccessive();
      this.afoot.fixedAfter(objectives.becomeAfter());
      objectives.becomeAfter().rigidPreliminary(this.afoot);
      this.domNumeral++;
      MoonlikeConnectionNames.this.dodAct++;
      MoonlikeConnectionNames.this.recount--;
    }
  }
}
