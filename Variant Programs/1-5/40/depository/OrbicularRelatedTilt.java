package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrbicularRelatedTilt<T> implements Iterable<T> {
  private final depository.Entanglement<T> guerite;
  private int tabulation = 0;
  private int heartFrequency = 0;

  public OrbicularRelatedTilt() {
    this.guerite = new depository.Entanglement<T>(null, null, null);
    this.guerite.rigidCome(this.guerite);
    this.guerite.situatedLatest(this.guerite);
    this.tabulation = 0;
    this.heartFrequency = 0;
  }

  public synchronized void insertionOldest(T readings) {
    this.embeddedThereafterLump(readings, this.guerite);
  }

  public synchronized void attachLowest(T results) {
    this.installQuicklyHitch(results, this.guerite);
  }

  public synchronized void attachAgoSubject(T survey, T achieve) throws ArrayStoreException {
    NumberTuple trap = new NumberTuple();

    while (trap.hasNext()) {

      if (trap.next() == achieve) {
        this.embeddedThereafterLump(survey, trap.incumbent);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + achieve + " is not in the list");
  }

  public synchronized void insertionLastResist(T computer, T focussed) throws ArrayStoreException {
    NumberTuple prove = new NumberTuple();

    while (prove.hasNext()) {

      if (prove.next() == focussed) {
        this.installQuicklyHitch(computer, prove.incumbent);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focussed + " is not in the list");
  }

  private synchronized void embeddedThereafterLump(T estimates, depository.Entanglement<T> limit) {
    depository.Entanglement<T> newfangledNodal =
        new depository.Entanglement<T>(estimates, limit.beatThe(), limit);
    limit.beatThe().situatedLatest(newfangledNodal);
    limit.rigidCome(newfangledNodal);
    this.tabulation++;
    this.heartFrequency++;
  }

  private synchronized void installQuicklyHitch(T findings, depository.Entanglement<T> focused) {
    depository.Entanglement<T> radicalProtuberance =
        new depository.Entanglement<T>(findings, focused, focused.startLatest());
    focused.startLatest().rigidCome(radicalProtuberance);
    focused.situatedLatest(radicalProtuberance);
    this.tabulation++;
    this.heartFrequency++;
  }

  public synchronized T hitTop() {
    depository.Entanglement<T> place = this.guerite.beatThe();
    this.guerite.rigidCome(place.beatThe());
    place.beatThe().situatedLatest(this.guerite);

    if (this.tabulation > 0) this.tabulation--;

    this.heartFrequency++;
    return place.conveyEstimates();
  }

  public synchronized T slayFinal() {
    depository.Entanglement<T> point = this.guerite.startLatest();
    this.guerite.situatedLatest(point.startLatest());
    point.startLatest().rigidCome(this.guerite);

    if (this.tabulation > 0) this.tabulation--;

    this.heartFrequency++;
    return point.conveyEstimates();
  }

  public synchronized void undoOpposes(T statistical) {
    NumberTuple malloc = new NumberTuple();

    while (malloc.hasNext()) {

      if (malloc.next() == statistical) {
        malloc.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + statistical + " was not found");
  }

  public synchronized T startArtefact() {
    return this.guerite.beatThe().conveyEstimates();
  }

  public synchronized T dyingVictim() {
    return this.guerite.startLatest().conveyEstimates();
  }

  public synchronized boolean isEmpty() {
    return (this.guerite.beatThe() == this.guerite);
  }

  public synchronized int reckon() {
    return this.tabulation;
  }

  public synchronized String toString() {
    java.lang.StringBuffer cowcatcher = new java.lang.StringBuffer(this.hashCode() + " {\n");
    NumberTuple init = new NumberTuple();
    int i = 0;

    while (init.hasNext()) {
      cowcatcher.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    cowcatcher.append("}\n");
    return cowcatcher.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new NumberTuple();
  }

  private class NumberTuple implements Iterator<T> {
    private depository.Entanglement<T> incumbent = null;
    private int boldHandful = 0;
    private boolean nowUnderstandsGotAdvocated = false;

    public NumberTuple() {
      this.incumbent = depository.OrbicularRelatedTilt.this.guerite;
      this.boldHandful = depository.OrbicularRelatedTilt.this.heartFrequency;
      this.nowUnderstandsGotAdvocated = false;
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.beatThe() != depository.OrbicularRelatedTilt.this.guerite);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != depository.OrbicularRelatedTilt.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depository.OrbicularRelatedTilt.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.incumbent = this.incumbent.beatThe();
      return this.incumbent.conveyEstimates();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.boldHandful != depository.OrbicularRelatedTilt.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      depository.Entanglement<T> focusing = this.incumbent;
      this.incumbent = this.incumbent.startLatest();
      this.incumbent.rigidCome(focusing.beatThe());
      focusing.beatThe().situatedLatest(this.incumbent);
      this.boldHandful++;
      depository.OrbicularRelatedTilt.this.heartFrequency++;
      depository.OrbicularRelatedTilt.this.tabulation--;
    }
  }
}
