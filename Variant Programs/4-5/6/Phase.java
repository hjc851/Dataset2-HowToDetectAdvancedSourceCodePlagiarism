import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Phase implements Comparable<Phase> {
  private int est = 0;
  private String advert = null;
  private Queue<Integer> requirements = null;
  private int escapeOpportunity = 0;
  private int fullSections = 0;
  private int getImpressions = 0;
  private List<Malfunction> anomalies = null;

  public Phase(String key, Queue<Integer> demands, int marxPubs) {
    this(key, demands, 0, marxPubs, 0, new LinkedList<>());
  }

  public Phase(
      String describe,
      Queue<Integer> questions,
      int departureClock,
      int greatestSlides,
      int methodChapters,
      List<Malfunction> flaws) {
    this.est = Integer.parseInt(describe.replaceAll("[^\\d.]", ""));
    this.advert = describe;
    this.requirements = questions;
    this.escapeOpportunity = departureClock;
    this.fullSections = greatestSlides;
    this.getImpressions = methodChapters;
    this.anomalies = flaws;
  }

  public synchronized int developPeg() {
    return est;
  }

  public synchronized String arriveCite() {
    return advert;
  }

  public synchronized int generateDieYear() {
    return escapeOpportunity;
  }

  public synchronized void determineWithdrawBeginning(int pulloutHour) {
    this.escapeOpportunity = pulloutHour;
  }

  public synchronized int letHighestSheets() {
    return fullSections;
  }

  public synchronized int takeAbortSites() {
    return getImpressions;
  }

  public synchronized void fixRetrievePubs(int specialWebpage) {
    this.getImpressions = specialWebpage;
  }

  public synchronized List<Malfunction> beatBlunders() {
    return anomalies;
  }

  public synchronized boolean isEnded() {
    return this.requirements.size() == 0;
  }

  public synchronized Queue<Integer> arriveInvitations() {
    return requirements;
  }

  public synchronized Integer methodsThenCalls() {
    return this.requirements.poll();
  }

  public synchronized String receiveDefectPeriods() {
    Integer[] nights = new Integer[anomalies.size()];

    for (int i = 0; i < anomalies.size(); i++) synx34(i, nights);
    StringJoiner unstylish = new StringJoiner(", ", "{", "}");
    for (Integer i : nights) synx35(unstylish, i);
    return unstylish.toString();
  }

  public synchronized int compareTo(Phase trapezium) {
    int relativeName = trapezium.developPeg();
    int thereforeMap = this.developPeg();
    return thereforeMap - relativeName;
  }

  private synchronized void synx34(int i, Integer[] nights) {
    Malfunction usda = anomalies.get(i);
    nights[i] = usda.haveCulpabilityPeriods();
  }

  private synchronized void synx35(StringJoiner unstylish, Integer i) {
    unstylish.add(i.toString());
  }
}
