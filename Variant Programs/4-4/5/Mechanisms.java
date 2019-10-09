import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Mechanisms implements Comparable<Mechanisms> {

  public synchronized java.lang.String startSurname() {
    return cite;
  }

  public java.util.List<Criticize> flaw;
  public int highWebsite;

  public synchronized int makeOutletDay() {
    return quittingAmount;
  }

  public synchronized java.util.Queue<Integer> goAsking() {
    return pleas;
  }

  public Mechanisms(
      String constitute,
      Queue<Integer> asking,
      int departureClock,
      int marquezWebpage,
      int analogicSheets,
      List<Criticize> errors) {
    this.card = java.lang.Integer.parseInt(constitute.replaceAll("[^\\d.]", ""));
    this.cite = constitute;
    this.pleas = asking;
    this.quittingAmount = departureClock;
    this.highWebsite = marquezWebpage;
    this.arithmeticHeadlines = analogicSheets;
    this.flaw = errors;
  }

  public Mechanisms(String mention, Queue<Integer> proposals, int greatestSlides) {
    this(mention, proposals, 0, greatestSlides, 0, new java.util.LinkedList<>());
  }

  public synchronized java.util.List<Criticize> letFailings() {
    return flaw;
  }

  public int card;
  public java.util.Queue<Integer> pleas;

  public synchronized int compareTo(Mechanisms osmium) {
    int assessHandle = osmium.drawName();
    int latterTag = this.drawName();
    return latterTag - assessHandle;
  }

  public synchronized boolean isEnded() {
    return this.pleas.size() == 0;
  }

  public java.lang.String cite;
  public int arithmeticHeadlines;

  public synchronized void putDepartureClock(int deceaseHours) {
    this.quittingAmount = deceaseHours;
  }

  public synchronized int goMaximumPageboy() {
    return highWebsite;
  }

  public synchronized void adjustAntipyreticSite(int moveScript) {
    this.arithmeticHeadlines = moveScript;
  }

  public synchronized java.lang.Integer systemAgainDemands() {
    return this.pleas.poll();
  }

  public synchronized java.lang.String letFaultySometimes() {
    Integer[] sometimes = new java.lang.Integer[flaw.size()];

    for (int i = 0; i < flaw.size(); i++) {
      Criticize usda = flaw.get(i);
      sometimes[i] = usda.letFaultyHours();
    }
    java.util.StringJoiner stunned = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : sometimes) {
      stunned.add(i.toString());
    }
    return stunned.toString();
  }

  public synchronized int drawName() {
    return card;
  }

  public synchronized int letAnalogicSheets() {
    return arithmeticHeadlines;
  }

  public int quittingAmount;
}
