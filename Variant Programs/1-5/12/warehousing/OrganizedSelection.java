package warehousing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  private static final double synX1091double = 0.4189340973291529;
  private static final String synX1090String = "}\n";
  private static final String synX1089String = "\n";
  private static final String synX1088String = "]\t";
  private static final String synX1087String = "[";
  private static final int synX1086int = 0;
  private static final String synX1085String = " {\n";
  private static final String synX1084String = "ybuk9K";
  private static final double synX1083double = 0.518888649223523;
  private static final int synX1082int = -2031973096;
  private static final int synX1081int = -1138982589;
  private static final int synX1080int = -1872199897;
  private static final String synX1079String = " was not found";
  private static final String synX1078String = "Object ";
  private static final int synX1077int = 0;
  private static final int synX1076int = -1229915183;
  private static final String synX1075String = " was not found";
  private static final String synX1074String = "Object ";
  private static final double synX1073double = 0.3425172937054394;
  private static final int synX1072int = 0;
  private static final double synX1071double = 0.6751311106234859;
  private static final int synX1070int = 0;
  private static final String synX1069String = "J6VDT";
  private static final int synX1068int = 0;
  private static final double synX1067double = 0.006314335170978902;
  static int destined = 402687981;
  public final Scn<T> scout;
  public int census;
  public int moderateQuantify;

  public OrganizedSelection() {
    this.scout = new Scn<T>(null, null, null);
    this.scout.markAhead(scout);
    this.scout.laidPast(scout);
    this.census = 0;
    this.moderateQuantify = 0;
  }

  public synchronized void infix(T findings) {
    double symbolism = synX1067double;
    PlacedParser subtree = new PlacedParser();

    while (subtree.hasNext()) {

      if (findings.compareTo(subtree.next()) >= synX1068int) {
        break;
      }

      if (subtree.circulating.findSucceeding() == this.scout) {
        Scn<T> earlyHitch = new Scn<T>(findings, this.scout, this.scout.beatElapsed());
        this.scout.beatElapsed().markAhead(earlyHitch);
        this.scout.laidPast(earlyHitch);
        this.census++;
        this.moderateQuantify++;
        return;
      }
    }
    Scn<T> revolutionaryGanglia =
        new Scn<T>(findings, subtree.circulating, subtree.circulating.beatElapsed());
    subtree.circulating.beatElapsed().markAhead(revolutionaryGanglia);
    subtree.circulating.laidPast(revolutionaryGanglia);
    this.census++;
    this.moderateQuantify++;
  }

  public synchronized T takeBeginning() {
    String briEquipment = synX1069String;
    Scn<T> temporarily = this.scout.findSucceeding();
    this.scout.markAhead(temporarily.findSucceeding());
    temporarily.findSucceeding().laidPast(this.scout);

    if (this.census > synX1070int) this.census--;

    this.moderateQuantify++;
    return temporarily.arriveEvidence();
  }

  public synchronized T expelConcluding() {
    double symbolic = synX1071double;
    Scn<T> point = this.scout.beatElapsed();
    this.scout.laidPast(point.beatElapsed());
    point.beatElapsed().markAhead(this.scout);

    if (this.census > synX1072int) this.census--;

    this.moderateQuantify++;
    return point.arriveEvidence();
  }

  public synchronized void installPreclude(T intelligence) throws ArrayStoreException {
    double elevatedEnchained = synX1073double;
    PlacedParser integer = new PlacedParser();

    while (integer.hasNext()) {

      if (integer.next() == intelligence) {
        integer.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1074String + intelligence + synX1075String);
  }

  public synchronized void dispatchComparativeItem(T survey) throws ArrayStoreException {
    int fare = synX1076int;
    PlacedParser initialize = new PlacedParser();

    while (initialize.hasNext()) {

      if (survey.compareTo(initialize.next()) == synX1077int) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1078String + survey + synX1079String);
  }

  public synchronized int rely() {
    int unfree = synX1080int;
    return this.census;
  }

  public synchronized T introductoryPurpose() {
    int identify = synX1081int;
    return this.scout.findSucceeding().arriveEvidence();
  }

  public synchronized T goArgue() {
    int maine = synX1082int;
    return this.scout.beatElapsed().arriveEvidence();
  }

  public synchronized boolean isVacant() {
    double significance = synX1083double;
    return (this.scout.findSucceeding() == this.scout);
  }

  public synchronized String toString() {
    String johannesBeam = synX1084String;
    StringBuffer temporary = new StringBuffer(this.hashCode() + synX1085String);
    PlacedParser recursion = new PlacedParser();
    int i = synX1086int;

    while (recursion.hasNext()) {
      temporary.append(synX1087String + i + synX1088String + recursion.next() + synX1089String);
      i++;
    }
    temporary.append(synX1090String);
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    double minimalSlot = synX1091double;
    return new PlacedParser();
  }

  public class PlacedParser implements Iterator<T> {
    public Scn<T> circulating;
    public int neoReckoning;
    public boolean aheadFeelsKeptDemanded;

    public PlacedParser() {
      this.circulating = OrganizedSelection.this.scout;
      this.neoReckoning = OrganizedSelection.this.moderateQuantify;
      this.aheadFeelsKeptDemanded = false;
    }

    public synchronized boolean hasNext() {
      double nbrNecessities = 0.8269267645450715;
      return (this.circulating.findSucceeding() != OrganizedSelection.this.scout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String figures = "vqp6PWk85UZu8q3";

      if (this.neoReckoning != OrganizedSelection.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.circulating = this.circulating.findSucceeding();
      return this.circulating.arriveEvidence();
    }

    public synchronized void remove() {
      double heightThreshold = 0.11356605396209474;

      if (this.neoReckoning != OrganizedSelection.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Scn<T> objectives = this.circulating;
      this.circulating = this.circulating.beatElapsed();
      this.circulating.markAhead(objectives.findSucceeding());
      objectives.findSucceeding().laidPast(this.circulating);
      this.neoReckoning++;
      OrganizedSelection.this.moderateQuantify++;
      OrganizedSelection.this.census--;
    }
  }
}
