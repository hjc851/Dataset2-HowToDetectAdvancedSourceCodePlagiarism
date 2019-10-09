import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class Proceedings implements Comparable<Proceedings> {
  private static final String synX1351String = "}";
  private static final String synX1350String = "{";
  private static final String synX1349String = ", ";
  private static final int synX1348int = 0;
  private static final int synX1347int = 0;
  public java.util.List<Defect> mistake;
  public int getImpressions;
  public int ceilingScript;
  public int departureClock;
  public java.util.Queue<Integer> asking;
  public java.lang.String diagnose;
  public int user;

  public Proceedings(String epithet, Queue<Integer> inquiries, int mattAspects) {
    this(epithet, inquiries, 0, mattAspects, 0, new java.util.LinkedList<>());
  }

  public Proceedings(
      String constitute,
      Queue<Integer> pleas,
      int quittingAmount,
      int premiumSites,
      int rppWebsites,
      List<Defect> weaknesses) {
    this.user = parseInt(constitute.replaceAll("[^\\d.]", ""));
    this.diagnose = constitute;
    this.asking = pleas;
    this.departureClock = quittingAmount;
    this.ceilingScript = premiumSites;
    this.getImpressions = rppWebsites;
    this.mistake = weaknesses;
  }

  public synchronized int obtainEst() {
    return user;
  }

  public synchronized java.lang.String driveNickname() {
    return diagnose;
  }

  public synchronized int haveReleasePeriods() {
    return departureClock;
  }

  public synchronized void doExodusAgain(int leaveClip) {
    this.departureClock = leaveClip;
  }

  public synchronized int comeLimitVarlet() {
    return ceilingScript;
  }

  public synchronized int canGetImpressions() {
    return getImpressions;
  }

  public synchronized void rigidUnlockSlides(int abortSites) {
    this.getImpressions = abortSites;
  }

  public synchronized java.util.List<Defect> obtainDemerit() {
    return mistake;
  }

  public synchronized boolean isEnded() {
    return this.asking.size() == synX1347int;
  }

  public synchronized java.util.Queue<Integer> generateComplaints() {
    return asking;
  }

  public synchronized java.lang.Integer mechanismsEarlyWishes() {
    return this.asking.poll();
  }

  public synchronized java.lang.String arriveWrongSeasons() {
    java.util.StringJoiner kayoed;
    Integer[] encounters = new java.lang.Integer[mistake.size()];

    for (int i = synX1348int; i < mistake.size(); i++) {
      Defect usda;
      usda = mistake.get(i);
      encounters[i] = usda.produceAnomalyNow();
    }
    kayoed = new java.util.StringJoiner(synX1349String, synX1350String, synX1351String);
    for (java.lang.Integer i : encounters) {
      kayoed.add(i.toString());
    }
    return kayoed.toString();
  }

  public synchronized int compareTo(Proceedings pubis) {
    int comparableEst;
    int hereQuod;
    comparableEst = pubis.obtainEst();
    hereQuod = this.obtainEst();
    return hereQuod - comparableEst;
  }
}
