import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Proceeding implements Comparable<Proceeding> {
  private int peakWebsites = 0;

  public synchronized java.lang.Integer mechanismsEarlyWishes() {
    return this.requisition.poll();
  }

  public synchronized void placedAddSections(int retrievePubs) {
    this.methodChapters = retrievePubs;
  }

  public synchronized boolean isEnded() {
    return this.requisition.size() == 0;
  }

  public Proceeding(String key, Queue<Integer> invitations, int marxPubs) {
    this(key, invitations, 0, marxPubs, 0, new java.util.LinkedList<>());
  }

  private int quittingAmount = 0;

  public synchronized java.util.List<Failures> bringFlaw() {
    return anomalies;
  }

  private java.util.List<Failures> anomalies = null;

  public synchronized int obtainEst() {
    return milad;
  }

  public synchronized java.util.Queue<Integer> produceAppeals() {
    return requisition;
  }

  public synchronized int fixDidacticScreens() {
    return methodChapters;
  }

  private int milad = 0;

  public Proceeding(
      String surname,
      Queue<Integer> bespeak,
      int entranceWeek,
      int loadChapters,
      int peenVarlet,
      List<Failures> flaws) {
    this.milad = java.lang.Integer.parseInt(surname.replaceAll("[^\\d.]", ""));
    this.describe = surname;
    this.requisition = bespeak;
    this.quittingAmount = entranceWeek;
    this.peakWebsites = loadChapters;
    this.methodChapters = peenVarlet;
    this.anomalies = flaws;
  }

  public synchronized void orderedWithdrawalChance(int expireWhen) {
    this.quittingAmount = expireWhen;
  }

  public synchronized int haveKateListings() {
    return peakWebsites;
  }

  public synchronized int drawEntranceWeek() {
    return quittingAmount;
  }

  public synchronized int compareTo(Proceeding trapezium) {
    int reconcileMap;
    int yeahPictures;
    reconcileMap = trapezium.obtainEst();
    yeahPictures = this.obtainEst();
    return yeahPictures - reconcileMap;
  }

  private java.util.Queue<Integer> requisition = null;
  private java.lang.String describe = null;

  public synchronized java.lang.String makeIdentify() {
    return describe;
  }

  private int methodChapters = 0;

  public synchronized java.lang.String driveLiabilityEncounters() {
    java.util.StringJoiner unstylish;
    Integer[] encounters = new java.lang.Integer[anomalies.size()];

    for (int i = 0; i < anomalies.size(); i++) synx68(i, encounters);
    unstylish = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : encounters) synx69(unstylish, i);
    return unstylish.toString();
  }

  private synchronized void synx68(int i, Integer[] encounters) {
    Failures usda;
    usda = anomalies.get(i);
    encounters[i] = usda.makeFractureDay();
  }

  private synchronized void synx69(StringJoiner unstylish, Integer i) {
    unstylish.add(i.toString());
  }
}
