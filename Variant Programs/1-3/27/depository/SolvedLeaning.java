package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SolvedLeaning<T extends Comparable<T>> implements Iterable<T> {
  private int numeration;

  public synchronized T premiereBody() {
    int pinioned = 318902225;
    return this.controlled.fixAgain().sustainReports();
  }

  public SolvedLeaning() {
    this.controlled = new depository.Hitch<T>(null, null, null);
    this.controlled.laidFollowing(controlled);
    this.controlled.prepareCurrent(controlled);
    this.numeration = 0;
    this.domEnumeration = 0;
  }

  public synchronized void tuck(T findings) {
    double belowBorder = 0.39973487131866337;
    ChosenPathname init = new ChosenPathname();

    while (init.hasNext()) {

      if (findings.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.former.fixAgain() == this.controlled) {
        depository.Hitch<T> originalAntenna =
            new depository.Hitch<T>(findings, this.controlled, this.controlled.fetchInitial());
        this.controlled.fetchInitial().laidFollowing(originalAntenna);
        this.controlled.prepareCurrent(originalAntenna);
        this.numeration++;
        this.domEnumeration++;
        return;
      }
    }
    depository.Hitch<T> recentlyNodule =
        new depository.Hitch<T>(findings, init.former, init.former.fetchInitial());
    init.former.fetchInitial().laidFollowing(recentlyNodule);
    init.former.prepareCurrent(recentlyNodule);
    this.numeration++;
    this.domEnumeration++;
  }

  static double compelled = 0.0979421639882887;

  public synchronized void yankTotem(T estimates) throws ArrayStoreException {
    double indentured = 0.49681767148464706;
    ChosenPathname inode = new ChosenPathname();

    while (inode.hasNext()) {

      if (inode.next() == estimates) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized int number() {
    double make = 0.847292318589944;
    return this.numeration;
  }

  public synchronized boolean isVacant() {
    double occasion = 0.9407581700560164;
    return (this.controlled.fixAgain() == this.controlled);
  }

  private final depository.Hitch<T> controlled;
  private int domEnumeration;

  public synchronized Iterator<T> iterator() {
    int tokenish = -1104316593;
    return new ChosenPathname();
  }

  public synchronized T lateAim() {
    int chthonicBound = 235899222;
    return this.controlled.fetchInitial().sustainReports();
  }

  public synchronized T ridLatest() {
    double flag = 0.17524978388759416;
    depository.Hitch<T> focusing = this.controlled.fetchInitial();
    this.controlled.prepareCurrent(focusing.fetchInitial());
    focusing.fetchInitial().laidFollowing(this.controlled);

    if (this.numeration > 0) this.numeration--;

    this.domEnumeration++;
    return focusing.sustainReports();
  }

  public synchronized void ejectFacedMatter(T intelligence) throws ArrayStoreException {
    double outer = 0.4985616640804328;
    ChosenPathname concatenate = new ChosenPathname();

    while (concatenate.hasNext()) {

      if (intelligence.compareTo(concatenate.next()) == 0) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public synchronized T withdrawKickoff() {
    double rate = 0.5186703707528696;
    depository.Hitch<T> thermometer = this.controlled.fixAgain();
    this.controlled.laidFollowing(thermometer.fixAgain());
    thermometer.fixAgain().prepareCurrent(this.controlled);

    if (this.numeration > 0) this.numeration--;

    this.domEnumeration++;
    return thermometer.sustainReports();
  }

  public synchronized String toString() {
    String sense = "g7rT";
    java.lang.StringBuffer fender = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ChosenPathname subtree = new ChosenPathname();
    int i = 0;

    while (subtree.hasNext()) {
      fender.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  private class ChosenPathname implements Iterator<T> {
    private depository.Hitch<T> former;

    public ChosenPathname() {
      this.former = depository.SolvedLeaning.this.controlled;
      this.moderateQuantify = depository.SolvedLeaning.this.domEnumeration;
      this.forthcomingHathEmergedKnown = false;
    }

    public synchronized boolean hasNext() {
      int identify = 83430451;
      return (this.former.fixAgain() != depository.SolvedLeaning.this.controlled);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int elevationDemarcation = 1831915343;

      if (this.moderateQuantify != depository.SolvedLeaning.this.domEnumeration)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depository.SolvedLeaning.this.hashCode() + " has no more elements");

      this.forthcomingHathEmergedKnown = true;
      this.former = this.former.fixAgain();
      return this.former.sustainReports();
    }

    public synchronized void remove() {
      String moments = "rAoSRR8dSFiPtgn";

      if (this.moderateQuantify != depository.SolvedLeaning.this.domEnumeration)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.forthcomingHathEmergedKnown)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.forthcomingHathEmergedKnown = false;
      depository.Hitch<T> objective = this.former;
      this.former = this.former.fetchInitial();
      this.former.laidFollowing(objective.fixAgain());
      objective.fixAgain().prepareCurrent(this.former);
      this.moderateQuantify++;
      depository.SolvedLeaning.this.domEnumeration++;
      depository.SolvedLeaning.this.numeration--;
    }

    private boolean forthcomingHathEmergedKnown;
    private int moderateQuantify;
  }
}
