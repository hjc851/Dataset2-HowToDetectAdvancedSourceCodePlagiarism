import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Mechanism implements Comparable<Mechanism> {
  public java.util.List<Demerit> defect = null;
  public int analogicSheets = 0;
  public int bestScreens = 0;
  public int expirationPeriod = 0;
  public java.util.Queue<Integer> quest = null;
  public java.lang.String cite = null;
  public int photo = 0;

  public Mechanism(String forename, Queue<Integer> proposals, int highestSheets) {
    this(forename, proposals, 0, highestSheets, 0, new java.util.LinkedList<>());
  }

  public Mechanism(
      String distinguish,
      Queue<Integer> calls,
      int leaveClip,
      int maximumPageboy,
      int antipyreticSite,
      List<Demerit> wrongdoings) {
    this.photo = java.lang.Integer.parseInt(distinguish.replaceAll("[^\\d.]", ""));
    this.cite = distinguish;
    this.quest = calls;
    this.expirationPeriod = leaveClip;
    this.bestScreens = maximumPageboy;
    this.analogicSheets = antipyreticSite;
    this.defect = wrongdoings;
  }

  public synchronized int fetchPictures() {
    return photo;
  }

  public synchronized java.lang.String letDistinguish() {
    return cite;
  }

  public synchronized int comeLeaveClip() {
    return expirationPeriod;
  }

  public synchronized void rigidQuittingAmount(int outletDay) {
    this.expirationPeriod = outletDay;
  }

  public synchronized int makeLoadChapters() {
    return bestScreens;
  }

  public synchronized int makeMethodChapters() {
    return analogicSheets;
  }

  public synchronized void fitAllocateWebsite(int abortSites) {
    this.analogicSheets = abortSites;
  }

  public synchronized java.util.List<Demerit> developErrors() {
    return defect;
  }

  public synchronized boolean isEnded() {
    return this.quest.size() == 0;
  }

  public synchronized java.util.Queue<Integer> sustainWishes() {
    return quest;
  }

  public synchronized java.lang.Integer sueUpcomingApplication() {
    return this.quest.poll();
  }

  public synchronized java.lang.String produceAnomalyNights() {
    java.util.StringJoiner unsuccessful;
    Integer[] hours = new java.lang.Integer[defect.size()];

    for (int i = 0; i < defect.size(); i++) {
      Demerit usda;
      usda = defect.get(i);
      hours[i] = usda.becomeAccountableOpportunity();
    }
    unsuccessful = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : hours) {
      unsuccessful.add(i.toString());
    }
    return unsuccessful.toString();
  }

  public synchronized int compareTo(Mechanism hamatum) {
    int weighSelf;
    int nowDimidiate;
    weighSelf = hamatum.fetchPictures();
    nowDimidiate = this.fetchPictures();
    return nowDimidiate - weighSelf;
  }
}
