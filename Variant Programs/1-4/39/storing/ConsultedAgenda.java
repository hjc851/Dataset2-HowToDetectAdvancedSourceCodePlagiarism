package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ConsultedAgenda<T extends Comparable<T>> implements Iterable<T> {
  public int fashionableNumber;
  public int get;
  public final Client<T> outsentry;

  public ConsultedAgenda() {
    this.outsentry = new Client<T>(null, null, null);
    this.outsentry.markAhead(outsentry);
    this.outsentry.dictatedLate(outsentry);
    this.get = 0;
    this.fashionableNumber = 0;
  }

  public synchronized void tuck(T stats) {
    ResolvedStruct recursion;
    Client<T> newfoundJunction;
    recursion = new ResolvedStruct();

    while (recursion.hasNext()) {

      if (stats.compareTo(recursion.next()) >= 0) {
        break;
      }

      if (recursion.existing.goFuture() == this.outsentry) {
        Client<T> revolutionaryGanglia;
        revolutionaryGanglia = new Client<T>(stats, this.outsentry, this.outsentry.beatElapsed());
        this.outsentry.beatElapsed().markAhead(revolutionaryGanglia);
        this.outsentry.dictatedLate(revolutionaryGanglia);
        this.get++;
        this.fashionableNumber++;
        return;
      }
    }
    newfoundJunction = new Client<T>(stats, recursion.existing, recursion.existing.beatElapsed());
    recursion.existing.beatElapsed().markAhead(newfoundJunction);
    recursion.existing.dictatedLate(newfoundJunction);
    this.get++;
    this.fashionableNumber++;
  }

  public synchronized T dislodgePremier() {
    Client<T> job;
    job = this.outsentry.goFuture();
    this.outsentry.markAhead(job.goFuture());
    job.goFuture().dictatedLate(this.outsentry);

    if (this.get > 0) this.get--;

    this.fashionableNumber++;
    return job.driveIntelligence();
  }

  public synchronized T eraseGo() {
    Client<T> aim;
    aim = this.outsentry.beatElapsed();
    this.outsentry.dictatedLate(aim.beatElapsed());
    aim.beatElapsed().markAhead(this.outsentry);

    if (this.get > 0) this.get--;

    this.fashionableNumber++;
    return aim.driveIntelligence();
  }

  public synchronized void dispatchItem(T intelligence) throws ArrayStoreException {
    ResolvedStruct namespace;
    namespace = new ResolvedStruct();

    while (namespace.hasNext()) {

      if (namespace.next() == intelligence) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + intelligence + " was not found");
  }

  public synchronized void withdrawReconciledItems(T readings) throws ArrayStoreException {
    ResolvedStruct initialisation;
    initialisation = new ResolvedStruct();

    while (initialisation.hasNext()) {

      if (readings.compareTo(initialisation.next()) == 0) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized int calculation() {
    return this.get;
  }

  public synchronized T foremostPreclude() {
    return this.outsentry.goFuture().driveIntelligence();
  }

  public synchronized T endArtefact() {
    return this.outsentry.beatElapsed().driveIntelligence();
  }

  public synchronized boolean isVacant() {
    return (this.outsentry.goFuture() == this.outsentry);
  }

  public synchronized String toString() {
    StringBuffer cowcatcher;
    ResolvedStruct instantiation;
    int i;
    cowcatcher = new StringBuffer(this.hashCode() + " {\n");
    instantiation = new ResolvedStruct();
    i = 0;

    while (instantiation.hasNext()) {
      cowcatcher.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    cowcatcher.append("}\n");
    return cowcatcher.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ResolvedStruct();
  }

  public class ResolvedStruct implements Iterator<T> {
    public boolean comeOccupiesDonePetitioned;
    public int boldlyGet;
    public Client<T> existing;

    public ResolvedStruct() {
      this.existing = ConsultedAgenda.this.outsentry;
      this.boldlyGet = ConsultedAgenda.this.fashionableNumber;
      this.comeOccupiesDonePetitioned = false;
    }

    public synchronized boolean hasNext() {
      return (this.existing.goFuture() != ConsultedAgenda.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyGet != ConsultedAgenda.this.fashionableNumber)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ConsultedAgenda.this.hashCode() + " has no more elements");

      this.comeOccupiesDonePetitioned = true;
      this.existing = this.existing.goFuture();
      return this.existing.driveIntelligence();
    }

    public synchronized void remove() {
      Client<T> priority;

      if (this.boldlyGet != ConsultedAgenda.this.fashionableNumber)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comeOccupiesDonePetitioned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = false;
      priority = this.existing;
      this.existing = this.existing.beatElapsed();
      this.existing.markAhead(priority.goFuture());
      priority.goFuture().dictatedLate(this.existing);
      this.boldlyGet++;
      ConsultedAgenda.this.fashionableNumber++;
      ConsultedAgenda.this.get--;
    }
  }
}
