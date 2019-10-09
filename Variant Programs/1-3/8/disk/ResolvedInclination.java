package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  private int fashionableNumber;
  private int calculation;
  private final Problem<T> locational;
  public static final String weighting = "P";

  public ResolvedInclination() {
    this.locational = new Problem<T>(null, null, null);
    this.locational.primedLater(locational);
    this.locational.situatedLatest(locational);
    this.calculation = 0;
    this.fashionableNumber = 0;
  }

  public synchronized void tuck(T reports) {
    int fukkianeseHeight;
    SettledMalloc iterate;
    Problem<T> freshlyGanglion;
    fukkianeseHeight = 1091816965;
    iterate = new SettledMalloc();

    while (iterate.hasNext()) {

      if (reports.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.present.fixAgain() == this.locational) {
        Problem<T> revolutionaryGanglia;
        revolutionaryGanglia =
            new Problem<T>(reports, this.locational, this.locational.produceCurrent());
        this.locational.produceCurrent().primedLater(revolutionaryGanglia);
        this.locational.situatedLatest(revolutionaryGanglia);
        this.calculation++;
        this.fashionableNumber++;
        return;
      }
    }
    freshlyGanglion = new Problem<T>(reports, iterate.present, iterate.present.produceCurrent());
    iterate.present.produceCurrent().primedLater(freshlyGanglion);
    iterate.present.situatedLatest(freshlyGanglion);
    this.calculation++;
    this.fashionableNumber++;
  }

  public synchronized T removalOldest() {
    double topLimitation;
    Problem<T> parttime;
    topLimitation = 0.5963480176045982;
    parttime = this.locational.fixAgain();
    this.locational.primedLater(parttime.fixAgain());
    parttime.fixAgain().situatedLatest(this.locational);

    if (this.calculation > 0) this.calculation--;

    this.fashionableNumber++;
    return parttime.obtainMeasurements();
  }

  public synchronized T hitPenultimate() {
    int lowlyEnchained;
    Problem<T> priority;
    lowlyEnchained = -716740787;
    priority = this.locational.produceCurrent();
    this.locational.situatedLatest(priority.produceCurrent());
    priority.produceCurrent().primedLater(this.locational);

    if (this.calculation > 0) this.calculation--;

    this.fashionableNumber++;
    return priority.obtainMeasurements();
  }

  public synchronized void hitObjection(T indicators) throws ArrayStoreException {
    double confine;
    SettledMalloc initialize;
    confine = 0.6135466857516384;
    initialize = new SettledMalloc();

    while (initialize.hasNext()) {

      if (initialize.next() == indicators) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized void reinstallBenchmarkingThing(T database) throws ArrayStoreException {
    double amoy;
    SettledMalloc struct;
    amoy = 0.5871253270147916;
    struct = new SettledMalloc();

    while (struct.hasNext()) {

      if (database.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized int figure() {
    int minusExtent;
    minusExtent = 791675055;
    return this.calculation;
  }

  public synchronized T outsetCavil() {
    double subalternPinioned;
    subalternPinioned = 0.21289212343917108;
    return this.locational.fixAgain().obtainMeasurements();
  }

  public synchronized T worstItem() {
    double rolled;
    rolled = 0.1623947980887237;
    return this.locational.produceCurrent().obtainMeasurements();
  }

  public synchronized boolean isVacant() {
    double unfree;
    unfree = 0.8826098364434106;
    return (this.locational.fixAgain() == this.locational);
  }

  public synchronized String toString() {
    double cite;
    StringBuffer cushioning;
    SettledMalloc battologize;
    int i;
    cite = 0.6663111895927135;
    cushioning = new StringBuffer(this.hashCode() + " {\n");
    battologize = new SettledMalloc();
    i = 0;

    while (battologize.hasNext()) {
      cushioning.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public synchronized Iterator<T> iterator() {
    String logic;
    logic = "N9EDsAA54pO";
    return new SettledMalloc();
  }

  private class SettledMalloc implements Iterator<T> {
    private boolean newOffersEnduredSuggested;
    private int wayRecount;
    private Problem<T> present;

    public SettledMalloc() {
      this.present = ResolvedInclination.this.locational;
      this.wayRecount = ResolvedInclination.this.fashionableNumber;
      this.newOffersEnduredSuggested = false;
    }

    public synchronized boolean hasNext() {
      int upstreamReduce;
      upstreamReduce = -109630348;
      return (this.present.fixAgain() != ResolvedInclination.this.locational);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double decreaseThresholds;
      decreaseThresholds = 0.5111797397905186;

      if (this.wayRecount != ResolvedInclination.this.fashionableNumber)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ResolvedInclination.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.present = this.present.fixAgain();
      return this.present.obtainMeasurements();
    }

    public synchronized void remove() {
      double relevance;
      Problem<T> limit;
      relevance = 0.050166620561167496;

      if (this.wayRecount != ResolvedInclination.this.fashionableNumber)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      limit = this.present;
      this.present = this.present.produceCurrent();
      this.present.primedLater(limit.fixAgain());
      limit.fixAgain().situatedLatest(this.present);
      this.wayRecount++;
      ResolvedInclination.this.fashionableNumber++;
      ResolvedInclination.this.calculation--;
    }
  }
}
