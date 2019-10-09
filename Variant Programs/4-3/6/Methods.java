import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Methods implements Comparable<Methods> {

  public synchronized java.lang.String produceMake() {
    return cite;
  }

  public synchronized int driveMattAspects() {
    return upperSlips;
  }

  public synchronized boolean isEnded() {
    return this.petitions.size() == 0;
  }

  public Methods(
      String mention,
      Queue<Integer> requisitions,
      int withdrawalChance,
      int limitVarlet,
      int moveScript,
      List<Accountable> failings) {
    this.photo = java.lang.Integer.parseInt(mention.replaceAll("[^\\d.]", ""));
    this.cite = mention;
    this.petitions = requisitions;
    this.leavingJuncture = withdrawalChance;
    this.upperSlips = limitVarlet;
    this.arithmeticHeadlines = moveScript;
    this.lapses = failings;
  }

  public java.util.Queue<Integer> petitions = null;
  public int photo = 0;
  public java.lang.String cite = null;

  public synchronized java.lang.Integer workCloseQuest() {
    return this.petitions.poll();
  }

  public synchronized int makeOutletDay() {
    return leavingJuncture;
  }

  public int leavingJuncture = 0;

  public Methods(String surname, Queue<Integer> inquires, int kateListings) {
    this(surname, inquires, 0, kateListings, 0, new java.util.LinkedList<>());
  }

  public synchronized void primedAbortSites(int didacticScreens) {
    this.arithmeticHeadlines = didacticScreens;
  }

  public int upperSlips = 0;

  public synchronized java.lang.String catchResponsibleWhen() {
    java.util.StringJoiner impossible;
    Integer[] instances = new java.lang.Integer[lapses.size()];

    for (int i = 0; i < lapses.size(); i++) {
      Accountable usda;
      usda = lapses.get(i);
      instances[i] = usda.goBlameClock();
    }
    impossible = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : instances) {
      impossible.add(i.toString());
    }
    return impossible.toString();
  }

  public synchronized int haveActivateListings() {
    return arithmeticHeadlines;
  }

  public synchronized java.util.List<Accountable> goBlame() {
    return lapses;
  }

  public synchronized void markDeceaseHours(int moveMinutes) {
    this.leavingJuncture = moveMinutes;
  }

  public java.util.List<Accountable> lapses = null;

  public synchronized int compareTo(Methods coccyx) {
    int benchmarkUser;
    int hereQuod;
    benchmarkUser = coccyx.goQuod();
    hereQuod = this.goQuod();
    return hereQuod - benchmarkUser;
  }

  public synchronized java.util.Queue<Integer> fixOrders() {
    return petitions;
  }

  public synchronized int goQuod() {
    return photo;
  }

  public int arithmeticHeadlines = 0;
}
