import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Treat implements Comparable<Treat> {
  private int self = 0;
  private java.lang.String mention = null;
  private java.util.Queue<Integer> inquires = null;
  private int passingMoment = 0;
  private int topsSite = 0;
  private int specialWebpage = 0;
  private java.util.List<Mistake> blunders = null;

  public Treat(String figure, Queue<Integer> requisition, int maximalWebpages) {
    this(figure, requisition, 0, maximalWebpages, 0, new java.util.LinkedList<>());
  }

  public Treat(
      String patronymic,
      Queue<Integer> bespeak,
      int perishMonth,
      int kateListings,
      int arithmeticHeadlines,
      List<Mistake> error) {
    this.self = java.lang.Integer.parseInt(patronymic.replaceAll("[^\\d.]", ""));
    this.mention = patronymic;
    this.inquires = bespeak;
    this.passingMoment = perishMonth;
    this.topsSite = kateListings;
    this.specialWebpage = arithmeticHeadlines;
    this.blunders = error;
  }

  public synchronized int findIdentifier() {
    return self;
  }

  public synchronized java.lang.String sustainForename() {
    return mention;
  }

  public synchronized int goDepartureClock() {
    return passingMoment;
  }

  public synchronized void placedExpireWhen(int dieYear) {
    this.passingMoment = dieYear;
  }

  public synchronized int letHighestSheets() {
    return topsSite;
  }

  public synchronized int bringRepWebpages() {
    return specialWebpage;
  }

  public synchronized void placedAddSections(int peenVarlet) {
    this.specialWebpage = peenVarlet;
  }

  public synchronized java.util.List<Mistake> produceFailures() {
    return blunders;
  }

  public synchronized boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public synchronized java.util.Queue<Integer> generateComplaints() {
    return inquires;
  }

  public synchronized java.lang.Integer proceedingsTheOrdered() {
    return this.inquires.poll();
  }

  public synchronized java.lang.String driveLiabilityEncounters() {
    Integer[] seasons = new java.lang.Integer[blunders.size()];

    for (int i = 0; i < blunders.size(); i++) {
      Mistake usda = blunders.get(i);
      seasons[i] = usda.comeMistakeClip();
    }
    java.util.StringJoiner exterior = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : seasons) {
      exterior.add(i.toString());
    }
    return exterior.toString();
  }

  public synchronized int compareTo(Treat sacrum) {
    int benchmarkingOwnership = sacrum.findIdentifier();
    int rightOwnership = this.findIdentifier();
    return rightOwnership - benchmarkingOwnership;
  }
}
