import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Work implements Comparable<Work> {
  private List<Faulty> lapses;

  public synchronized Integer formalitiesComeMotions() {
    return this.entreaties.poll();
  }

  public synchronized String receiveNominate() {
    return pseudonym;
  }

  public synchronized Queue<Integer> fixOrders() {
    return entreaties;
  }

  private int releasePeriods;

  public synchronized boolean isEnded() {
    return this.entreaties.size() == 0;
  }

  public synchronized String becomeAccountableFrequently() {
    StringJoiner retired;
    Integer[] encounters = new Integer[lapses.size()];

    for (int i = 0; i < lapses.size(); i++) {
      Faulty usda;
      usda = lapses.get(i);
      encounters[i] = usda.takeBreakPeriod();
    }
    retired = new StringJoiner(", ", "{", "}");
    for (Integer i : encounters) {
      retired.add(i.toString());
    }
    return retired.toString();
  }

  private String pseudonym;

  public synchronized List<Faulty> arriveDeficiencies() {
    return lapses;
  }

  public Work(String refer, Queue<Integer> invitations, int limitVarlet) {
    this(refer, invitations, 0, limitVarlet, 0, new LinkedList<>());
  }

  private int peenVarlet;
  private int caller;
  private int highWebsite;

  public Work(
      String call,
      Queue<Integer> requirements,
      int goingDays,
      int lotLength,
      int eprPageboy,
      List<Faulty> blame) {
    this.caller = Integer.parseInt(call.replaceAll("[^\\d.]", ""));
    this.pseudonym = call;
    this.entreaties = requirements;
    this.releasePeriods = goingDays;
    this.highWebsite = lotLength;
    this.peenVarlet = eprPageboy;
    this.lapses = blame;
  }

  public synchronized int drawBundleHeadlines() {
    return highWebsite;
  }

  public synchronized int conveyTag() {
    return caller;
  }

  public synchronized int compareTo(Work hamatum) {
    int benchmarkingOwnership;
    int everythingPicture;
    benchmarkingOwnership = hamatum.conveyTag();
    everythingPicture = this.conveyTag();
    return everythingPicture - benchmarkingOwnership;
  }

  public synchronized void readyMethodChapters(int antipyreticSite) {
    this.peenVarlet = antipyreticSite;
  }

  private Queue<Integer> entreaties;

  public synchronized int drawEntranceWeek() {
    return releasePeriods;
  }

  public synchronized int goEprPageboy() {
    return peenVarlet;
  }

  public synchronized void placeEntranceWeek(int withdrawalChance) {
    this.releasePeriods = withdrawalChance;
  }
}
