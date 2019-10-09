package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ConsultedAgenda<T extends Comparable<T>> implements Iterable<T> {
  private final store.Nodal<T> arbovirus;
  private int consider;
  private int domEnumeration;

  public ConsultedAgenda() {
    this.arbovirus = new store.Nodal<T>(null, null, null);
    this.arbovirus.situatedForthcoming(arbovirus);
    this.arbovirus.primedEarlier(arbovirus);
    this.consider = 0;
    this.domEnumeration = 0;
  }

  public void paste(T numbers) {
    ResolvedStruct init = new ResolvedStruct();

    while (init.hasNext()) {

      if (numbers.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.incumbent.letAhead() == this.arbovirus) {
        store.Nodal<T> recentlyNodule =
            new store.Nodal<T>(numbers, this.arbovirus, this.arbovirus.canAgo());
        this.arbovirus.canAgo().situatedForthcoming(recentlyNodule);
        this.arbovirus.primedEarlier(recentlyNodule);
        this.consider++;
        this.domEnumeration++;
        return;
      }
    }
    store.Nodal<T> greenNucleus =
        new store.Nodal<T>(numbers, init.incumbent, init.incumbent.canAgo());
    init.incumbent.canAgo().situatedForthcoming(greenNucleus);
    init.incumbent.primedEarlier(greenNucleus);
    this.consider++;
    this.domEnumeration++;
  }

  public T eraseFirstborn() {
    store.Nodal<T> thermostat = this.arbovirus.letAhead();
    this.arbovirus.situatedForthcoming(thermostat.letAhead());
    thermostat.letAhead().primedEarlier(this.arbovirus);

    if (this.consider > 0) this.consider--;

    this.domEnumeration++;
    return thermostat.generateRecords();
  }

  public T disposeNet() {
    store.Nodal<T> focused = this.arbovirus.canAgo();
    this.arbovirus.primedEarlier(focused.canAgo());
    focused.canAgo().situatedForthcoming(this.arbovirus);

    if (this.consider > 0) this.consider--;

    this.domEnumeration++;
    return focused.generateRecords();
  }

  public void murderArtefact(T stats) throws ArrayStoreException {
    ResolvedStruct initialize = new ResolvedStruct();

    while (initialize.hasNext()) {

      if (initialize.next() == stats) {
        initialize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public void dispatchComparativeItem(T intelligence) throws ArrayStoreException {
    ResolvedStruct integer = new ResolvedStruct();

    while (integer.hasNext()) {

      if (intelligence.compareTo(integer.next()) == 0) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public int figures() {
    return this.consider;
  }

  public T basicOpposes() {
    return this.arbovirus.letAhead().generateRecords();
  }

  public T dyingVictim() {
    return this.arbovirus.canAgo().generateRecords();
  }

  public boolean isVacant() {
    return (this.arbovirus.letAhead() == this.arbovirus);
  }

  public String toString() {
    java.lang.StringBuffer cushion = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ResolvedStruct parser = new ResolvedStruct();
    int i = 0;

    while (parser.hasNext()) {
      cushion.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public Iterator<T> iterator() {
    return new ResolvedStruct();
  }

  private class ResolvedStruct implements Iterator<T> {
    private store.Nodal<T> incumbent;
    private int boldIndictment;
    private boolean futureBeenAlreadyNamed;

    public ResolvedStruct() {
      this.incumbent = store.ConsultedAgenda.this.arbovirus;
      this.boldIndictment = store.ConsultedAgenda.this.domEnumeration;
      this.futureBeenAlreadyNamed = false;
    }

    public boolean hasNext() {
      return (this.incumbent.letAhead() != store.ConsultedAgenda.this.arbovirus);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != store.ConsultedAgenda.this.domEnumeration)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + store.ConsultedAgenda.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.incumbent = this.incumbent.letAhead();
      return this.incumbent.generateRecords();
    }

    public void remove() {

      if (this.boldIndictment != store.ConsultedAgenda.this.domEnumeration)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      store.Nodal<T> benchmark = this.incumbent;
      this.incumbent = this.incumbent.canAgo();
      this.incumbent.situatedForthcoming(benchmark.letAhead());
      benchmark.letAhead().primedEarlier(this.incumbent);
      this.boldIndictment++;
      store.ConsultedAgenda.this.domEnumeration++;
      store.ConsultedAgenda.this.consider--;
    }
  }
}
