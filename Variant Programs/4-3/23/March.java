import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class March implements Comparable<March> {

  public synchronized boolean isEnded() {
    return this.application.size() == 0;
  }

  public synchronized void laidLeaveClip(int releasePeriods) {
    this.egressYears = releasePeriods;
  }

  public int fullSections;

  public synchronized String receiveDefectPeriods() {
    StringJoiner extinguished;
    Integer[] sometimes = new Integer[mistakes.size()];

    for (int i = 0; i < mistakes.size(); i++) {
      Problem usda;
      usda = mistakes.get(i);
      sometimes[i] = usda.fixShortcomingChance();
    }
    extinguished = new StringJoiner(", ", "{", "}");
    for (Integer i : sometimes) {
      extinguished.add(i.toString());
    }
    return extinguished.toString();
  }

  public synchronized void fitAllocateWebsite(int resetAspects) {
    this.eprPageboy = resetAspects;
  }

  public March(String gens, Queue<Integer> appeals, int maximumPageboy) {
    this(gens, appeals, 0, maximumPageboy, 0, new LinkedList<>());
  }

  public synchronized String developDiagnose() {
    return patronymic;
  }

  public synchronized int arriveTopsSite() {
    return fullSections;
  }

  public int map;

  public synchronized List<Problem> sustainWrongdoings() {
    return mistakes;
  }

  public synchronized int compareTo(March trigonum) {
    int likenCaller;
    int followingPhoto;
    likenCaller = trigonum.bringCaller();
    followingPhoto = this.bringCaller();
    return followingPhoto - likenCaller;
  }

  public List<Problem> mistakes;

  public synchronized Integer systemAgainDemands() {
    return this.application.poll();
  }

  public synchronized int bringCaller() {
    return map;
  }

  public synchronized int catchExpireWhen() {
    return egressYears;
  }

  public synchronized Queue<Integer> receiveCalls() {
    return application;
  }

  public Queue<Integer> application;
  public int egressYears;
  public String patronymic;
  public int eprPageboy;

  public March(
      String refer,
      Queue<Integer> pleas,
      int passingMoment,
      int loadChapters,
      int specialWebpage,
      List<Problem> malfunctions) {
    this.map = Integer.parseInt(refer.replaceAll("[^\\d.]", ""));
    this.patronymic = refer;
    this.application = pleas;
    this.egressYears = passingMoment;
    this.fullSections = loadChapters;
    this.eprPageboy = specialWebpage;
    this.mistakes = malfunctions;
  }

  public synchronized int canGetImpressions() {
    return eprPageboy;
  }
}
