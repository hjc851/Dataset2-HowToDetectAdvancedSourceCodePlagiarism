import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Phase implements Comparable<Phase> {
  private int finger;
  private java.lang.String refer;
  private java.util.Queue<Integer> inquires;
  private int lossMeter;
  private int maximizeHomepage;
  private int rppWebsites;
  private java.util.List<Error> fracture;

  public Phase(String forename, Queue<Integer> bespeak, int upperSlips) {
    this(forename, bespeak, 0, upperSlips, 0, new java.util.LinkedList<>());
  }

  public Phase(
      String cite,
      Queue<Integer> petition,
      int passingMoment,
      int topsSite,
      int repWebpages,
      List<Error> flaw) {
    this.finger = java.lang.Integer.parseInt(cite.replaceAll("[^\\d.]", ""));
    this.refer = cite;
    this.inquires = petition;
    this.lossMeter = passingMoment;
    this.maximizeHomepage = topsSite;
    this.rppWebsites = repWebpages;
    this.fracture = flaw;
  }

  public int catchIbid() {
    return finger;
  }

  public java.lang.String produceMake() {
    return refer;
  }

  public int drawEntranceWeek() {
    return lossMeter;
  }

  public void adjustPerishMonth(int exodusAgain) {
    this.lossMeter = exodusAgain;
  }

  public int conveyGreatestSlides() {
    return maximizeHomepage;
  }

  public int sustainRetrievePubs() {
    return rppWebsites;
  }

  public void orderedDidacticScreens(int arithmeticHeadlines) {
    this.rppWebsites = arithmeticHeadlines;
  }

  public java.util.List<Error> canAnomalies() {
    return fracture;
  }

  public boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public java.util.Queue<Integer> bringQuest() {
    return inquires;
  }

  public java.lang.Integer marchAdjacentAsked() {
    return this.inquires.poll();
  }

  public java.lang.String catchResponsibleWhen() {
    Integer[] years = new java.lang.Integer[fracture.size()];

    for (int i = 0; i < fracture.size(); i++) {
      Error usda = fracture.get(i);
      years[i] = usda.beatFailuresJuncture();
    }
    java.util.StringJoiner taboo = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : years) {
      taboo.add(i.toString());
    }
    return taboo.toString();
  }

  public int compareTo(Phase coxa) {
    int correlateIdem = coxa.catchIbid();
    int farIdem = this.catchIbid();
    return farIdem - correlateIdem;
  }
}
