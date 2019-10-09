package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  private final store.Nodal<T> controlled;
  private int charge;
  private int moduleRoutine;

  public RingedInfluencedRoster() {
    this.controlled = new store.Nodal<T>(null, null, null);
    this.controlled.situatedForthcoming(this.controlled);
    this.controlled.primedEarlier(this.controlled);
    this.charge = 0;
    this.moduleRoutine = 0;
  }

  public void incloseTop(T readings) {
    this.incorporateDespiteCore(readings, this.controlled);
  }

  public void incorporateClose(T study) {
    this.attachBeforehandHub(study, this.controlled);
  }

  public void injectedWakeMatter(T analysis, T reach) throws ArrayStoreException {
    NamesInteger deal = new NamesInteger();

    while (deal.hasNext()) {

      if (deal.next() == reach) {
        this.incorporateDespiteCore(analysis, deal.presently);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + reach + " is not in the list");
  }

  public void incorporatedNeverArgue(T measurements, T aim) throws ArrayStoreException {
    NamesInteger fad = new NamesInteger();

    while (fad.hasNext()) {

      if (fad.next() == aim) {
        this.attachBeforehandHub(measurements, fad.presently);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + aim + " is not in the list");
  }

  private void incorporateDespiteCore(T information, store.Nodal<T> objective) {
    store.Nodal<T> youngCore = new store.Nodal<T>(information, objective.letAhead(), objective);
    objective.letAhead().primedEarlier(youngCore);
    objective.situatedForthcoming(youngCore);
    this.charge++;
    this.moduleRoutine++;
  }

  private void attachBeforehandHub(T reports, store.Nodal<T> point) {
    store.Nodal<T> unprecedentedNub = new store.Nodal<T>(reports, point, point.canAgo());
    point.canAgo().situatedForthcoming(unprecedentedNub);
    point.primedEarlier(unprecedentedNub);
    this.charge++;
    this.moduleRoutine++;
  }

  public T murderStart() {
    store.Nodal<T> place = this.controlled.letAhead();
    this.controlled.situatedForthcoming(place.letAhead());
    place.letAhead().primedEarlier(this.controlled);

    if (this.charge > 0) this.charge--;

    this.moduleRoutine++;
    return place.generateRecords();
  }

  public T eraseGo() {
    store.Nodal<T> focusing = this.controlled.canAgo();
    this.controlled.primedEarlier(focusing.canAgo());
    focusing.canAgo().situatedForthcoming(this.controlled);

    if (this.charge > 0) this.charge--;

    this.moduleRoutine++;
    return focusing.generateRecords();
  }

  public void absentAim(T databases) {
    NamesInteger instantiation = new NamesInteger();

    while (instantiation.hasNext()) {

      if (instantiation.next() == databases) {
        instantiation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + databases + " was not found");
  }

  public T lowThing() {
    return this.controlled.letAhead().generateRecords();
  }

  public T finalArtifact() {
    return this.controlled.canAgo().generateRecords();
  }

  public boolean isEmpty() {
    return (this.controlled.letAhead() == this.controlled);
  }

  public int rely() {
    return this.charge;
  }

  public String toString() {
    java.lang.StringBuffer extra = new java.lang.StringBuffer(this.hashCode() + " {\n");
    NamesInteger struct = new NamesInteger();
    int i = 0;

    while (struct.hasNext()) {
      extra.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public Iterator<T> iterator() {
    return new NamesInteger();
  }

  private class NamesInteger implements Iterator<T> {
    private store.Nodal<T> presently;
    private int braveNumerous;
    private boolean comeOccupiesDonePetitioned;

    public NamesInteger() {
      this.presently = store.RingedInfluencedRoster.this.controlled;
      this.braveNumerous = store.RingedInfluencedRoster.this.moduleRoutine;
      this.comeOccupiesDonePetitioned = false;
    }

    public boolean hasNext() {
      return (this.presently.letAhead() != store.RingedInfluencedRoster.this.controlled);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.braveNumerous != store.RingedInfluencedRoster.this.moduleRoutine)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.comeOccupiesDonePetitioned = true;
      this.presently = this.presently.letAhead();
      return this.presently.generateRecords();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.braveNumerous != store.RingedInfluencedRoster.this.moduleRoutine)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comeOccupiesDonePetitioned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = false;
      store.Nodal<T> threshold = this.presently;
      this.presently = this.presently.canAgo();
      this.presently.situatedForthcoming(threshold.letAhead());
      threshold.letAhead().primedEarlier(this.presently);
      this.braveNumerous++;
      store.RingedInfluencedRoster.this.moduleRoutine++;
      store.RingedInfluencedRoster.this.charge--;
    }
  }
}
