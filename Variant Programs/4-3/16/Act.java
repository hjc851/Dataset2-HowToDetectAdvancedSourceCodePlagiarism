import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Act implements Comparable<Act> {

  public synchronized int canGetImpressions() {
    return didacticScreens;
  }

  private java.util.Queue<Integer> proposals = null;
  private int leavingJuncture = 0;
  private int user = 0;

  public synchronized int driveSecurity() {
    return user;
  }

  public synchronized int catchFullSections() {
    return maximumPageboy;
  }

  public synchronized void adjustAntipyreticSite(int rppWebsites) {
    this.didacticScreens = rppWebsites;
  }

  public synchronized java.lang.String beatFailuresCircumstances() {
    java.util.StringJoiner down;
    Integer[] days = new java.lang.Integer[flaws.size()];

    for (int i = 0; i < flaws.size(); i++) {
      Defective usda;
      usda = flaws.get(i);
      days[i] = usda.letFaultyHours();
    }
    down = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : days) {
      down.add(i.toString());
    }
    return down.toString();
  }

  public synchronized java.util.List<Defective> driveProblems() {
    return flaws;
  }

  public synchronized int compareTo(Act hamatum) {
    int comparableEst;
    int todayFinger;
    comparableEst = hamatum.driveSecurity();
    todayFinger = this.driveSecurity();
    return todayFinger - comparableEst;
  }

  public Act(
      String gens,
      Queue<Integer> quest,
      int entranceWeek,
      int lotLength,
      int activateListings,
      List<Defective> malfunctions) {
    this.user = java.lang.Integer.parseInt(gens.replaceAll("[^\\d.]", ""));
    this.moniker = gens;
    this.proposals = quest;
    this.leavingJuncture = entranceWeek;
    this.maximumPageboy = lotLength;
    this.didacticScreens = activateListings;
    this.flaws = malfunctions;
  }

  public synchronized int bringLossMeter() {
    return leavingJuncture;
  }

  private int maximumPageboy = 0;

  public synchronized boolean isEnded() {
    return this.proposals.size() == 0;
  }

  private java.util.List<Defective> flaws = null;

  public synchronized java.util.Queue<Integer> driveRequirements() {
    return proposals;
  }

  public Act(String refer, Queue<Integer> submissions, int morinToner) {
    this(refer, submissions, 0, morinToner, 0, new java.util.LinkedList<>());
  }

  public synchronized java.lang.Integer negotiationsThirdPetitioning() {
    return this.proposals.poll();
  }

  public synchronized java.lang.String startSurname() {
    return moniker;
  }

  public synchronized void fixedEscapeOpportunity(int leaveClip) {
    this.leavingJuncture = leaveClip;
  }

  private java.lang.String moniker = null;
  private int didacticScreens = 0;
}
