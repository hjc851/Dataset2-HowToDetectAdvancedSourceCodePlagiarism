import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Operation implements Comparable<Operation> {
  private int finger;
  private java.lang.String patronymic;
  private java.util.Queue<Integer> requirements;
  private int releasePeriods;
  private int fullSections;
  private int homileticPpm;
  private java.util.List<Error> blame;

  public Operation(String advert, Queue<Integer> appeals, int jesusLeafs) {
    this(advert, appeals, 0, jesusLeafs, 0, new java.util.LinkedList<>());
  }

  public Operation(
      String nominate,
      Queue<Integer> applications,
      int moveMinutes,
      int bundleHeadlines,
      int arithmeticHeadlines,
      List<Error> flaws) {
    this.finger = java.lang.Integer.parseInt(nominate.replaceAll("[^\\d.]", ""));
    this.patronymic = nominate;
    this.requirements = applications;
    this.releasePeriods = moveMinutes;
    this.fullSections = bundleHeadlines;
    this.homileticPpm = arithmeticHeadlines;
    this.blame = flaws;
  }

  public synchronized int generateIdem() {
    return finger;
  }

  public synchronized java.lang.String catchDescribe() {
    return patronymic;
  }

  public synchronized int arrivePerishMonth() {
    return releasePeriods;
  }

  public synchronized void orderedWithdrawalChance(int passingMoment) {
    this.releasePeriods = passingMoment;
  }

  public synchronized int canNickImpressions() {
    return fullSections;
  }

  public synchronized int developHomileticPpm() {
    return homileticPpm;
  }

  public synchronized void fitAllocateWebsite(int didacticScreens) {
    this.homileticPpm = didacticScreens;
  }

  public synchronized java.util.List<Error> generateDefects() {
    return blame;
  }

  public synchronized boolean isEnded() {
    return this.requirements.size() == 0;
  }

  public synchronized java.util.Queue<Integer> takeInquiries() {
    return requirements;
  }

  public synchronized java.lang.Integer mechanismsEarlyWishes() {
    return this.requirements.poll();
  }

  public synchronized java.lang.String bringFlawDays() {
    Integer[] instances = new java.lang.Integer[blame.size()];

    for (int i = 0; i < blame.size(); i++) {
      Error usda = blame.get(i);
      instances[i] = usda.obtainDemeritDays();
    }
    java.util.StringJoiner proscribed = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : instances) {
      proscribed.add(i.toString());
    }
    return proscribed.toString();
  }

  public synchronized int compareTo(Operation dnv) {
    int benchmarkingOwnership = dnv.generateIdem();
    int sayPeg = this.generateIdem();
    return sayPeg - benchmarkingOwnership;
  }
}
