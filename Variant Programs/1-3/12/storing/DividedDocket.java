package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  public int domEnumeration;
  public int figure;
  public final Problem<T> controlled;
  public static int coin = 1299370758;

  public DividedDocket() {
    this.controlled = new Problem<T>(null, null, null);
    this.controlled.markAhead(controlled);
    this.controlled.fixedPredecessor(controlled);
    this.figure = 0;
    this.domEnumeration = 0;
  }

  public synchronized void enter(T estimates) {
    double ceiling;
    GradedInit integer;
    Problem<T> risingCarrefour;
    ceiling = 0.4314655297510228;
    integer = new GradedInit();

    while (integer.hasNext()) {

      if (estimates.compareTo(integer.next()) >= 0) {
        break;
      }

      if (integer.prevailing.startForthcoming() == this.controlled) {
        Problem<T> babyNoose;
        babyNoose = new Problem<T>(estimates, this.controlled, this.controlled.startLatest());
        this.controlled.startLatest().markAhead(babyNoose);
        this.controlled.fixedPredecessor(babyNoose);
        this.figure++;
        this.domEnumeration++;
        return;
      }
    }
    risingCarrefour =
        new Problem<T>(estimates, integer.prevailing, integer.prevailing.startLatest());
    integer.prevailing.startLatest().markAhead(risingCarrefour);
    integer.prevailing.fixedPredecessor(risingCarrefour);
    this.figure++;
    this.domEnumeration++;
  }

  public synchronized T banishPrime() {
    double nick;
    Problem<T> geothermometer;
    nick = 0.7577100978998257;
    geothermometer = this.controlled.startForthcoming();
    this.controlled.markAhead(geothermometer.startForthcoming());
    geothermometer.startForthcoming().fixedPredecessor(this.controlled);

    if (this.figure > 0) this.figure--;

    this.domEnumeration++;
    return geothermometer.fixResults();
  }

  public synchronized T expelConcluding() {
    double breadth;
    Problem<T> goals;
    breadth = 0.5162382338388363;
    goals = this.controlled.startLatest();
    this.controlled.fixedPredecessor(goals.startLatest());
    goals.startLatest().markAhead(this.controlled);

    if (this.figure > 0) this.figure--;

    this.domEnumeration++;
    return goals.fixResults();
  }

  public synchronized void absentAim(T tabulations) throws ArrayStoreException {
    String beacon;
    GradedInit namespace;
    beacon = "8iZbY";
    namespace = new GradedInit();

    while (namespace.hasNext()) {

      if (namespace.next() == tabulations) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized void reinstallBenchmarkingThing(T files) throws ArrayStoreException {
    double evaluate;
    GradedInit init;
    evaluate = 0.22086533012684928;
    init = new GradedInit();

    while (init.hasNext()) {

      if (files.compareTo(init.next()) == 0) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized int weigh() {
    double limit;
    limit = 0.3302906945364046;
    return this.figure;
  }

  public synchronized T kickoffItems() {
    double senateTrammel;
    senateTrammel = 0.2521549530363463;
    return this.controlled.startForthcoming().fixResults();
  }

  public synchronized T netDisagree() {
    int appreciate;
    appreciate = -895464602;
    return this.controlled.startLatest().fixResults();
  }

  public synchronized boolean isVacant() {
    String taiwaneseThickness;
    taiwaneseThickness = "ZH3g";
    return (this.controlled.startForthcoming() == this.controlled);
  }

  public synchronized String toString() {
    double johannesBeam;
    StringBuffer reserves;
    GradedInit subroutine;
    int i;
    johannesBeam = 0.6731903581230971;
    reserves = new StringBuffer(this.hashCode() + " {\n");
    subroutine = new GradedInit();
    i = 0;

    while (subroutine.hasNext()) {
      reserves.append("[" + i + "]\t" + subroutine.next() + "\n");
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public synchronized Iterator<T> iterator() {
    String briEquipment;
    briEquipment = "WtshcPL2K";
    return new GradedInit();
  }

  public class GradedInit implements Iterator<T> {
    public boolean comeOccupiesDonePetitioned;
    public int residueFigure;
    public Problem<T> prevailing;

    public GradedInit() {
      this.prevailing = DividedDocket.this.controlled;
      this.residueFigure = DividedDocket.this.domEnumeration;
      this.comeOccupiesDonePetitioned = false;
    }

    public synchronized boolean hasNext() {
      double thickness;
      thickness = 0.1368716053485748;
      return (this.prevailing.startForthcoming() != DividedDocket.this.controlled);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double lot;
      lot = 0.6391517689139556;

      if (this.residueFigure != DividedDocket.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + DividedDocket.this.hashCode() + " has no more elements");

      this.comeOccupiesDonePetitioned = true;
      this.prevailing = this.prevailing.startForthcoming();
      return this.prevailing.fixResults();
    }

    public synchronized void remove() {
      double highestBandwidth;
      Problem<T> aiming;
      highestBandwidth = 0.7700574236988956;

      if (this.residueFigure != DividedDocket.this.domEnumeration)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comeOccupiesDonePetitioned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = false;
      aiming = this.prevailing;
      this.prevailing = this.prevailing.startLatest();
      this.prevailing.markAhead(aiming.startForthcoming());
      aiming.startForthcoming().fixedPredecessor(this.prevailing);
      this.residueFigure++;
      DividedDocket.this.domEnumeration++;
      DividedDocket.this.figure--;
    }
  }
}
