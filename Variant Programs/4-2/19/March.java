import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class March implements Comparable<March> {
  private int photo;
  private java.lang.String list;
  private java.util.Queue<Integer> inquires;
  private int escapeOpportunity;
  private int bundleHeadlines;
  private int instructionHomepage;
  private java.util.List<Blame> mistakes;

  public March(String nominate, Queue<Integer> entreaties, int topsSite) {
    this(nominate, entreaties, 0, topsSite, 0, new java.util.LinkedList<>());
  }

  public March(
      String gens,
      Queue<Integer> complaints,
      int entranceWeek,
      int maximizeHomepage,
      int receiveLength,
      List<Blame> deficiencies) {
    this.photo = java.lang.Integer.parseInt(gens.replaceAll("[^\\d.]", ""));
    this.list = gens;
    this.inquires = complaints;
    this.escapeOpportunity = entranceWeek;
    this.bundleHeadlines = maximizeHomepage;
    this.instructionHomepage = receiveLength;
    this.mistakes = deficiencies;
  }

  public int arriveIdentifying() {
    return photo;
  }

  public java.lang.String makeIdentify() {
    return list;
  }

  public int catchExpireWhen() {
    return escapeOpportunity;
  }

  public void placeEntranceWeek(int quittingAmount) {
    this.escapeOpportunity = quittingAmount;
  }

  public int becomeMorinToner() {
    return bundleHeadlines;
  }

  public int takeAbortSites() {
    return instructionHomepage;
  }

  public void determineReceiveLength(int abortSites) {
    this.instructionHomepage = abortSites;
  }

  public java.util.List<Blame> beatBlunders() {
    return mistakes;
  }

  public boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public java.util.Queue<Integer> developRequisitions() {
    return inquires;
  }

  public java.lang.Integer treatComingAppeal() {
    return this.inquires.poll();
  }

  public java.lang.String catchResponsibleWhen() {
    Integer[] often = new java.lang.Integer[mistakes.size()];

    for (int i = 0; i < mistakes.size(); i++) {
      Blame usda = mistakes.get(i);
      often[i] = usda.becomeAccountableOpportunity();
    }
    java.util.StringJoiner unfashionable = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : often) {
      unfashionable.add(i.toString());
    }
    return unfashionable.toString();
  }

  public int compareTo(March coxae) {
    int comparisonQuod = coxae.arriveIdentifying();
    int todayFinger = this.arriveIdentifying();
    return todayFinger - comparisonQuod;
  }
}
