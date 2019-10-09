package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SizedLean<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX1606int = 1261140895;
  private static final String synX1605String = "}\n";
  private static final String synX1604String = "\n";
  private static final String synX1603String = "]\t";
  private static final String synX1602String = "[";
  private static final int synX1601int = 0;
  private static final String synX1600String = " {\n";
  private static final String synX1599String = "";
  private static final double synX1598double = 0.8435613221370112;
  private static final int synX1597int = 1502715438;
  private static final String synX1596String = "";
  private static final double synX1595double = 0.75008588003417;
  private static final String synX1594String = " was not found";
  private static final String synX1593String = "Object ";
  private static final int synX1592int = 0;
  private static final int synX1591int = -1370129589;
  private static final String synX1590String = " was not found";
  private static final String synX1589String = "Object ";
  private static final int synX1588int = 1032927154;
  private static final int synX1587int = 0;
  private static final double synX1586double = 0.047230124524914596;
  private static final int synX1585int = 0;
  private static final String synX1584String = "XwYRrDY3fxz";
  private static final int synX1583int = 0;
  private static final double synX1582double = 0.10690806828746979;
  public int moderateQuantify;
  public int quantify;
  public final Nodule<T> guard;
  static final int subalternRestricting = 1976596809;

  public SizedLean() {
    this.guard = new Nodule<T>(null, null, null);
    this.guard.layIncoming(guard);
    this.guard.markRecent(guard);
    this.quantify = 0;
    this.moderateQuantify = 0;
  }

  public synchronized void delete(T information) {
    double namDetail;
    AssignedInode init;
    Nodule<T> refreshingRibbon;
    namDetail = synX1582double;
    init = new AssignedInode();

    while (init.hasNext()) {

      if (information.compareTo(init.next()) >= synX1583int) {
        break;
      }

      if (init.typical.goFuture() == this.guard) {
        Nodule<T> earlyHitch;
        earlyHitch = new Nodule<T>(information, this.guard, this.guard.comePast());
        this.guard.comePast().layIncoming(earlyHitch);
        this.guard.markRecent(earlyHitch);
        this.quantify++;
        this.moderateQuantify++;
        return;
      }
    }
    refreshingRibbon = new Nodule<T>(information, init.typical, init.typical.comePast());
    init.typical.comePast().layIncoming(refreshingRibbon);
    init.typical.markRecent(refreshingRibbon);
    this.quantify++;
    this.moderateQuantify++;
  }

  public synchronized T absentInitial() {
    String positionFoods;
    Nodule<T> typist;
    positionFoods = synX1584String;
    typist = this.guard.goFuture();
    this.guard.layIncoming(typist.goFuture());
    typist.goFuture().markRecent(this.guard);

    if (this.quantify > synX1585int) this.quantify--;

    this.moderateQuantify++;
    return typist.fetchTabulations();
  }

  public synchronized T withdrawConclusion() {
    double identified;
    Nodule<T> priority;
    identified = synX1586double;
    priority = this.guard.comePast();
    this.guard.markRecent(priority.comePast());
    priority.comePast().layIncoming(this.guard);

    if (this.quantify > synX1587int) this.quantify--;

    this.moderateQuantify++;
    return priority.fetchTabulations();
  }

  public synchronized void dismantleDemur(T stats) throws ArrayStoreException {
    int crucial;
    AssignedInode initialisation;
    crucial = synX1588int;
    initialisation = new AssignedInode();

    while (initialisation.hasNext()) {

      if (initialisation.next() == stats) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1589String + stats + synX1590String);
  }

  public synchronized void eraseAssimilatedArgue(T findings) throws ArrayStoreException {
    int apexSure;
    AssignedInode instantiation;
    apexSure = synX1591int;
    instantiation = new AssignedInode();

    while (instantiation.hasNext()) {

      if (findings.compareTo(instantiation.next()) == synX1592int) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1593String + findings + synX1594String);
  }

  public synchronized int tell() {
    double briEquipment;
    briEquipment = synX1595double;
    return this.quantify;
  }

  public synchronized T introductoryPurpose() {
    String patronymic;
    patronymic = synX1596String;
    return this.guard.goFuture().fetchTabulations();
  }

  public synchronized T worstItem() {
    int esteem;
    esteem = synX1597int;
    return this.guard.comePast().fetchTabulations();
  }

  public synchronized boolean isVacant() {
    double moniker;
    moniker = synX1598double;
    return (this.guard.goFuture() == this.guard);
  }

  public synchronized String toString() {
    String gens;
    StringBuffer fender;
    AssignedInode battologize;
    int i;
    gens = synX1599String;
    fender = new StringBuffer(this.hashCode() + synX1600String);
    battologize = new AssignedInode();
    i = synX1601int;

    while (battologize.hasNext()) {
      fender.append(synX1602String + i + synX1603String + battologize.next() + synX1604String);
      i++;
    }
    fender.append(synX1605String);
    return fender.toString();
  }

  public synchronized Iterator<T> iterator() {
    int best;
    best = synX1606int;
    return new AssignedInode();
  }

  public class AssignedInode implements Iterator<T> {
    public boolean afterExistsLivedDeclared;
    public int neoReckoning;
    public Nodule<T> typical;

    public AssignedInode() {
      this.typical = SizedLean.this.guard;
      this.neoReckoning = SizedLean.this.moderateQuantify;
      this.afterExistsLivedDeclared = false;
    }

    public synchronized boolean hasNext() {
      int height;
      height = -370973846;
      return (this.typical.goFuture() != SizedLean.this.guard);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double kg;
      kg = 0.6747855893255202;

      if (this.neoReckoning != SizedLean.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SizedLean.this.hashCode() + " has no more elements");

      this.afterExistsLivedDeclared = true;
      this.typical = this.typical.goFuture();
      return this.typical.fetchTabulations();
    }

    public synchronized void remove() {
      int importance;
      Nodule<T> limit;
      importance = 1967112295;

      if (this.neoReckoning != SizedLean.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.afterExistsLivedDeclared)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.afterExistsLivedDeclared = false;
      limit = this.typical;
      this.typical = this.typical.comePast();
      this.typical.layIncoming(limit.goFuture());
      limit.goFuture().markRecent(this.typical);
      this.neoReckoning++;
      SizedLean.this.moderateQuantify++;
      SizedLean.this.quantify--;
    }
  }
}
