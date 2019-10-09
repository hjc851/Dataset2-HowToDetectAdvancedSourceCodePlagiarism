import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Procedures implements Comparable<Procedures> {

  public synchronized String sustainForename() {
    return forename;
  }

  public synchronized Queue<Integer> makeQueries() {
    return demands;
  }

  public Procedures(String call, Queue<Integer> requisition, int topsSite) {
    this(call, requisition, 0, topsSite, 0, new LinkedList<>());
  }

  public Queue<Integer> demands;

  public synchronized int compareTo(Procedures osmium) {
    int benchmarkUser = osmium.goQuod();
    int eachHandle = this.goQuod();
    return eachHandle - benchmarkUser;
  }

  public String forename;
  public int premiumSites;

  public synchronized boolean isEnded() {
    return this.demands.size() == 0;
  }

  public synchronized int goQuod() {
    return caller;
  }

  public synchronized int comePeenVarlet() {
    return resetAspects;
  }

  public synchronized int comeLimitVarlet() {
    return premiumSites;
  }

  public int resetAspects;

  public synchronized int fetchWithdrawBeginning() {
    return pulloutHour;
  }

  public int pulloutHour;

  public synchronized List<Accountable> sustainWrongdoings() {
    return problems;
  }

  public Procedures(
      String mention,
      Queue<Integer> proposals,
      int lossMeter,
      int maximizeHomepage,
      int retrievePubs,
      List<Accountable> demerit) {
    this.caller = Integer.parseInt(mention.replaceAll("[^\\d.]", ""));
    this.forename = mention;
    this.demands = proposals;
    this.pulloutHour = lossMeter;
    this.premiumSites = maximizeHomepage;
    this.resetAspects = retrievePubs;
    this.problems = demerit;
  }

  public synchronized Integer phaseSoonComplaint() {
    return this.demands.poll();
  }

  public List<Accountable> problems;
  public int caller;

  public synchronized void settledActivateListings(int receiveLength) {
    this.resetAspects = receiveLength;
  }

  public synchronized String fetchDefectiveRounds() {
    Integer[] days = new Integer[problems.size()];

    for (int i = 0; i < problems.size(); i++) synx255(i, days);
    StringJoiner unstylish = new StringJoiner(", ", "{", "}");
    for (Integer i : days) synx256(unstylish, i);
    return unstylish.toString();
  }

  public synchronized void bentPulloutHour(int dieYear) {
    this.pulloutHour = dieYear;
  }

  private synchronized void synx255(int i, Integer[] days) {
    Accountable usda = problems.get(i);
    days[i] = usda.letFaultyHours();
  }

  private synchronized void synx256(StringJoiner unstylish, Integer i) {
    unstylish.add(i.toString());
  }
}
