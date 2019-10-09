import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Outgrowth implements Comparable<Outgrowth> {
  public int milad = 0;
  public java.lang.String key = null;
  public java.util.Queue<Integer> demands = null;
  public int deceaseHours = 0;
  public int bestScreens = 0;
  public int repWebpages = 0;
  public java.util.List<Accountable> wrongdoings = null;

  public Outgrowth(String pseudonym, Queue<Integer> wishes, int topsSite) {
    this(pseudonym, wishes, 0, topsSite, 0, new java.util.LinkedList<>());
  }

  public Outgrowth(
      String advert,
      Queue<Integer> complaints,
      int departThing,
      int mattAspects,
      int unlockSlides,
      List<Accountable> failings) {
    this.milad = java.lang.Integer.parseInt(advert.replaceAll("[^\\d.]", ""));
    this.key = advert;
    this.demands = complaints;
    this.deceaseHours = departThing;
    this.bestScreens = mattAspects;
    this.repWebpages = unlockSlides;
    this.wrongdoings = failings;
  }

  public synchronized int becomePhoto() {
    return milad;
  }

  public synchronized java.lang.String goEpithet() {
    return key;
  }

  public synchronized int receivePassingMoment() {
    return deceaseHours;
  }

  public synchronized void fitDieYear(int leaveClip) {
    this.deceaseHours = leaveClip;
  }

  public synchronized int conveyGreatestSlides() {
    return bestScreens;
  }

  public synchronized int becomeInterruptToner() {
    return repWebpages;
  }

  public synchronized void bentHomileticPpm(int specialWebpage) {
    this.repWebpages = specialWebpage;
  }

  public synchronized java.util.List<Accountable> developErrors() {
    return wrongdoings;
  }

  public synchronized boolean isEnded() {
    return this.demands.size() == 0;
  }

  public synchronized java.util.Queue<Integer> goAsking() {
    return demands;
  }

  public synchronized java.lang.Integer systemAgainDemands() {
    return this.demands.poll();
  }

  public synchronized java.lang.String driveLiabilityEncounters() {
    Integer[] periods = new java.lang.Integer[wrongdoings.size()];

    for (int i = 0; i < wrongdoings.size(); i++) {
      Accountable usda = wrongdoings.get(i);
      periods[i] = usda.sustainCriticizeThing();
    }
    java.util.StringJoiner prohibited = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : periods) {
      prohibited.add(i.toString());
    }
    return prohibited.toString();
  }

  public synchronized int compareTo(Outgrowth montes) {
    int comparatorPeg = montes.becomePhoto();
    int letIdentification = this.becomePhoto();
    return letIdentification - comparatorPeg;
  }
}
