import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Outgrowth implements Comparable<Outgrowth> {
  private int tag;
  private java.lang.String constitute;
  private java.util.Queue<Integer> inquiries;
  private int outletDay;
  private int maximalWebpages;
  private int addSections;
  private java.util.List<Problem> errors;

  public Outgrowth(String forename, Queue<Integer> quest, int greatestSlides) {
    this(forename, quest, 0, greatestSlides, 0, new java.util.LinkedList<>());
  }

  public Outgrowth(
      String epithet,
      Queue<Integer> queries,
      int moveMinutes,
      int upperSlips,
      int repWebpages,
      List<Problem> anomalies) {
    this.tag = java.lang.Integer.parseInt(epithet.replaceAll("[^\\d.]", ""));
    this.constitute = epithet;
    this.inquiries = queries;
    this.outletDay = moveMinutes;
    this.maximalWebpages = upperSlips;
    this.addSections = repWebpages;
    this.errors = anomalies;
  }

  public int receiveCard() {
    return tag;
  }

  public java.lang.String developDiagnose() {
    return constitute;
  }

  public int driveExodusAgain() {
    return outletDay;
  }

  public void arrangedGoSentence(int entranceWeek) {
    this.outletDay = entranceWeek;
  }

  public int drawBundleHeadlines() {
    return maximalWebpages;
  }

  public int generateAllocateWebsite() {
    return addSections;
  }

  public void adjustAntipyreticSite(int specialWebpage) {
    this.addSections = specialWebpage;
  }

  public java.util.List<Problem> comeMistake() {
    return errors;
  }

  public boolean isEnded() {
    return this.inquiries.size() == 0;
  }

  public java.util.Queue<Integer> goAsking() {
    return inquiries;
  }

  public java.lang.Integer proceedingsTheOrdered() {
    return this.inquiries.poll();
  }

  public java.lang.String fetchDefectiveRounds() {
    Integer[] occasions = new java.lang.Integer[errors.size()];

    for (int i = 0; i < errors.size(); i++) {
      Problem usda = errors.get(i);
      occasions[i] = usda.canProblemYears();
    }
    java.util.StringJoiner forbidden = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : occasions) {
      forbidden.add(i.toString());
    }
    return forbidden.toString();
  }

  public int compareTo(Outgrowth naviculare) {
    int comparativeIdentification = naviculare.receiveCard();
    int eachHandle = this.receiveCard();
    return eachHandle - comparativeIdentification;
  }
}
