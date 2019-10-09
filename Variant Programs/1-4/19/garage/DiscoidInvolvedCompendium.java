package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DiscoidInvolvedCompendium<T> implements Iterable<T> {
  public int fashionableTotal = 0;
  public int numeration = 0;
  public final Nucleus<T> indicator;

  public DiscoidInvolvedCompendium() {
    this.indicator = new Nucleus<T>(null, null, null);
    this.indicator.rigidCome(this.indicator);
    this.indicator.bentOriginal(this.indicator);
    this.numeration = 0;
    this.fashionableTotal = 0;
  }

  public synchronized void integratePrototypical(T study) {
    this.deleteThenEntanglement(study, this.indicator);
  }

  public synchronized void embedLatest(T tabulations) {
    this.inscribingBackProblem(tabulations, this.indicator);
  }

  public synchronized void attachAgoSubject(T files, T goal) throws ArrayStoreException {
    InclinationStruct abyss;
    abyss = new InclinationStruct();

    while (abyss.hasNext()) {

      if (abyss.next() == goal) {
        this.deleteThenEntanglement(files, abyss.stream);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goal + " is not in the list");
  }

  public synchronized void insertionLastResist(T indicators, T place) throws ArrayStoreException {
    InclinationStruct alive;
    alive = new InclinationStruct();

    while (alive.hasNext()) {

      if (alive.next() == place) {
        this.inscribingBackProblem(indicators, alive.stream);
        return;
      }
    }
    throw new ArrayStoreException("Target " + place + " is not in the list");
  }

  public synchronized void deleteThenEntanglement(T estimates, Nucleus<T> limit) {
    Nucleus<T> newfoundJunction;
    newfoundJunction = new Nucleus<T>(estimates, limit.comeFollowing(), limit);
    limit.comeFollowing().bentOriginal(newfoundJunction);
    limit.rigidCome(newfoundJunction);
    this.numeration++;
    this.fashionableTotal++;
  }

  public synchronized void inscribingBackProblem(T database, Nucleus<T> reach) {
    Nucleus<T> unusedBump;
    unusedBump = new Nucleus<T>(database, reach, reach.receiveOld());
    reach.receiveOld().rigidCome(unusedBump);
    reach.bentOriginal(unusedBump);
    this.numeration++;
    this.fashionableTotal++;
  }

  public synchronized T absentInitial() {
    Nucleus<T> objectives;
    objectives = this.indicator.comeFollowing();
    this.indicator.rigidCome(objectives.comeFollowing());
    objectives.comeFollowing().bentOriginal(this.indicator);

    if (this.numeration > 0) this.numeration--;

    this.fashionableTotal++;
    return objectives.goInformation();
  }

  public synchronized T ridLatest() {
    Nucleus<T> quarry;
    quarry = this.indicator.receiveOld();
    this.indicator.bentOriginal(quarry.receiveOld());
    quarry.receiveOld().rigidCome(this.indicator);

    if (this.numeration > 0) this.numeration--;

    this.fashionableTotal++;
    return quarry.goInformation();
  }

  public synchronized void takeObjective(T computer) {
    InclinationStruct namespace;
    namespace = new InclinationStruct();

    while (namespace.hasNext()) {

      if (namespace.next() == computer) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + computer + " was not found");
  }

  public synchronized T freshmanDemur() {
    return this.indicator.comeFollowing().goInformation();
  }

  public synchronized T worstItem() {
    return this.indicator.receiveOld().goInformation();
  }

  public synchronized boolean isEmpty() {
    return (this.indicator.comeFollowing() == this.indicator);
  }

  public synchronized int numbers() {
    return this.numeration;
  }

  public synchronized String toString() {
    StringBuffer cushion;
    InclinationStruct subtree;
    int i;
    cushion = new StringBuffer(this.hashCode() + " {\n");
    subtree = new InclinationStruct();
    i = 0;

    while (subtree.hasNext()) {
      cushion.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new InclinationStruct();
  }

  public class InclinationStruct implements Iterator<T> {
    public boolean succeedingRemainsGottenTermed = false;
    public int heartFrequency = 0;
    public Nucleus<T> stream = null;

    public InclinationStruct() {
      this.stream = DiscoidInvolvedCompendium.this.indicator;
      this.heartFrequency = DiscoidInvolvedCompendium.this.fashionableTotal;
      this.succeedingRemainsGottenTermed = false;
    }

    public synchronized boolean hasNext() {
      return (this.stream.comeFollowing() != DiscoidInvolvedCompendium.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFrequency != DiscoidInvolvedCompendium.this.fashionableTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + DiscoidInvolvedCompendium.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.stream = this.stream.comeFollowing();
      return this.stream.goInformation();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Nucleus<T> butt;

      if (this.heartFrequency != DiscoidInvolvedCompendium.this.fashionableTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      butt = this.stream;
      this.stream = this.stream.receiveOld();
      this.stream.rigidCome(butt.comeFollowing());
      butt.comeFollowing().bentOriginal(this.stream);
      this.heartFrequency++;
      DiscoidInvolvedCompendium.this.fashionableTotal++;
      DiscoidInvolvedCompendium.this.numeration--;
    }
  }
}
