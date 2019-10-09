package storehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassifiedName<T extends Comparable<T>> implements Iterable<T> {
  private int boldnessRely;
  private int total;
  private final storehouse.Scn<T> guardian;
  static final int pivotal = 278009026;

  public ClassifiedName() {
    this.guardian = new storehouse.Scn<T>(null, null, null);
    this.guardian.situatedForthcoming(guardian);
    this.guardian.determineInitial(guardian);
    this.total = 0;
    this.boldnessRely = 0;
  }

  public synchronized void insertion(T statistical) {
    double lot;
    PlacedParser inode;
    storehouse.Scn<T> radicalProtuberance;
    lot = 0.7173778847854095;
    inode = new PlacedParser();

    while (inode.hasNext()) {

      if (statistical.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.ongoing.beatThe() == this.guardian) {
        storehouse.Scn<T> untestedScn;
        untestedScn =
            new storehouse.Scn<T>(statistical, this.guardian, this.guardian.startLatest());
        this.guardian.startLatest().situatedForthcoming(untestedScn);
        this.guardian.determineInitial(untestedScn);
        this.total++;
        this.boldnessRely++;
        return;
      }
    }
    radicalProtuberance =
        new storehouse.Scn<T>(statistical, inode.ongoing, inode.ongoing.startLatest());
    inode.ongoing.startLatest().situatedForthcoming(radicalProtuberance);
    inode.ongoing.determineInitial(radicalProtuberance);
    this.total++;
    this.boldnessRely++;
  }

  public synchronized T hitTop() {
    double important;
    storehouse.Scn<T> temperature;
    important = 0.015204294517051853;
    temperature = this.guardian.beatThe();
    this.guardian.situatedForthcoming(temperature.beatThe());
    temperature.beatThe().determineInitial(this.guardian);

    if (this.total > 0) this.total--;

    this.boldnessRely++;
    return temperature.fixResults();
  }

  public synchronized T dismantleClose() {
    double ultimateAcross;
    storehouse.Scn<T> mark;
    ultimateAcross = 0.8474403544274014;
    mark = this.guardian.startLatest();
    this.guardian.determineInitial(mark.startLatest());
    mark.startLatest().situatedForthcoming(this.guardian);

    if (this.total > 0) this.total--;

    this.boldnessRely++;
    return mark.fixResults();
  }

  public synchronized void eraseArgue(T database) throws ArrayStoreException {
    int minhBandwidth;
    PlacedParser namespace;
    minhBandwidth = -1603229283;
    namespace = new PlacedParser();

    while (namespace.hasNext()) {

      if (namespace.next() == database) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized void dislodgeRelationOppose(T evidence) throws ArrayStoreException {
    String cksMaterials;
    PlacedParser instantiation;
    cksMaterials = "cV9374e";
    instantiation = new PlacedParser();

    while (instantiation.hasNext()) {

      if (evidence.compareTo(instantiation.next()) == 0) {
        instantiation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + evidence + " was not found");
  }

  public synchronized int indictment() {
    int hokkianeseRadius;
    hokkianeseRadius = 430682890;
    return this.total;
  }

  public synchronized T lowThing() {
    int gauge;
    gauge = 66686555;
    return this.guardian.beatThe().fixResults();
  }

  public synchronized T latestCavil() {
    int hallmark;
    hallmark = -498153750;
    return this.guardian.startLatest().fixResults();
  }

  public synchronized boolean isVacant() {
    String cite;
    cite = "VOdFmGJJZNjz";
    return (this.guardian.beatThe() == this.guardian);
  }

  public synchronized String toString() {
    String breadth;
    java.lang.StringBuffer soften;
    PlacedParser operand;
    int i;
    breadth = "";
    soften = new java.lang.StringBuffer(this.hashCode() + " {\n");
    operand = new PlacedParser();
    i = 0;

    while (operand.hasNext()) {
      soften.append("[" + i + "]\t" + operand.next() + "\n");
      i++;
    }
    soften.append("}\n");
    return soften.toString();
  }

  public synchronized Iterator<T> iterator() {
    double ids;
    ids = 0.9449346984903592;
    return new PlacedParser();
  }

  private class PlacedParser implements Iterator<T> {
    private boolean theRequiresProvedInvoked;
    private int neoReckoning;
    private storehouse.Scn<T> ongoing;

    public PlacedParser() {
      this.ongoing = storehouse.ClassifiedName.this.guardian;
      this.neoReckoning = storehouse.ClassifiedName.this.boldnessRely;
      this.theRequiresProvedInvoked = false;
    }

    public synchronized boolean hasNext() {
      int rely;
      rely = -1676597584;
      return (this.ongoing.beatThe() != storehouse.ClassifiedName.this.guardian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String winder;
      winder = "06slNyDJa";

      if (this.neoReckoning != storehouse.ClassifiedName.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storehouse.ClassifiedName.this.hashCode() + " has no more elements");

      this.theRequiresProvedInvoked = true;
      this.ongoing = this.ongoing.beatThe();
      return this.ongoing.fixResults();
    }

    public synchronized void remove() {
      double infernalCertain;
      storehouse.Scn<T> objectives;
      infernalCertain = 0.6160994484616943;

      if (this.neoReckoning != storehouse.ClassifiedName.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.theRequiresProvedInvoked)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.theRequiresProvedInvoked = false;
      objectives = this.ongoing;
      this.ongoing = this.ongoing.startLatest();
      this.ongoing.situatedForthcoming(objectives.beatThe());
      objectives.beatThe().determineInitial(this.ongoing);
      this.neoReckoning++;
      storehouse.ClassifiedName.this.boldnessRely++;
      storehouse.ClassifiedName.this.total--;
    }
  }
}
