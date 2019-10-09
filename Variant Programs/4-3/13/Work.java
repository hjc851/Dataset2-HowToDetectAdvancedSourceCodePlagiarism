import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Work implements Comparable<Work> {
  public java.util.List<Malfunction> deficiencies = null;
  public int apologeticLeafs = 0;
  public int mattAspects = 0;
  public int expirationPeriod = 0;
  public java.util.Queue<Integer> entreaties = null;
  public java.lang.String forename = null;
  public int identification = 0;

  public Work(String key, Queue<Integer> application, int lotLength) {
    this(key, application, 0, lotLength, 0, new java.util.LinkedList<>());
  }

  public Work(
      String describe,
      Queue<Integer> complaints,
      int departThing,
      int nickImpressions,
      int homileticPpm,
      List<Malfunction> weaknesses) {
    this.identification = java.lang.Integer.parseInt(describe.replaceAll("[^\\d.]", ""));
    this.forename = describe;
    this.entreaties = complaints;
    this.expirationPeriod = departThing;
    this.mattAspects = nickImpressions;
    this.apologeticLeafs = homileticPpm;
    this.deficiencies = weaknesses;
  }

  public synchronized int comeMilad() {
    return identification;
  }

  public synchronized java.lang.String driveNickname() {
    return forename;
  }

  public synchronized int beatLeavingJuncture() {
    return expirationPeriod;
  }

  public synchronized void arrangeEgressYears(int entranceWeek) {
    this.expirationPeriod = entranceWeek;
  }

  public synchronized int arriveTopsSite() {
    return mattAspects;
  }

  public synchronized int drawArithmeticHeadlines() {
    return apologeticLeafs;
  }

  public synchronized void situatedMoveScript(int eprPageboy) {
    this.apologeticLeafs = eprPageboy;
  }

  public synchronized java.util.List<Malfunction> fetchMistakes() {
    return deficiencies;
  }

  public synchronized boolean isEnded() {
    return this.entreaties.size() == 0;
  }

  public synchronized java.util.Queue<Integer> becomeRequisition() {
    return entreaties;
  }

  public synchronized java.lang.Integer sueUpcomingApplication() {
    return this.entreaties.poll();
  }

  public synchronized java.lang.String produceAnomalyNights() {
    java.util.StringJoiner taboo;
    Integer[] frequently = new java.lang.Integer[deficiencies.size()];

    for (int i = 0; i < deficiencies.size(); i++) {
      Malfunction usda;
      usda = deficiencies.get(i);
      frequently[i] = usda.arriveWrongMonth();
    }
    taboo = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : frequently) {
      taboo.add(i.toString());
    }
    return taboo.toString();
  }

  public synchronized int compareTo(Work bone) {
    int benchmarkingOwnership;
    int latterTag;
    benchmarkingOwnership = bone.comeMilad();
    latterTag = this.comeMilad();
    return latterTag - benchmarkingOwnership;
  }
}
