import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Procedures implements Comparable<Procedures> {

  public Procedures(
      String forename,
      Queue<Integer> inquires,
      int withdrawalChance,
      int bundleHeadlines,
      int eprPageboy,
      List<Defect> blunders) {
    this.card = Integer.parseInt(forename.replaceAll("[^\\d.]", ""));
    this.call = forename;
    this.queries = inquires;
    this.leaveClip = withdrawalChance;
    this.maximumPageboy = bundleHeadlines;
    this.activateListings = eprPageboy;
    this.problems = blunders;
  }

  public synchronized int compareTo(Procedures trapezium) {
    int benchmarkingOwnership;
    int hereQuod;
    benchmarkingOwnership = trapezium.drawName();
    hereQuod = this.drawName();
    return hereQuod - benchmarkingOwnership;
  }

  public synchronized int goMaximumPageboy() {
    return maximumPageboy;
  }

  public synchronized int produceApologeticLeafs() {
    return activateListings;
  }

  public synchronized int drawName() {
    return card;
  }

  public synchronized void settledReleasePeriods(int releasePeriods) {
    this.leaveClip = releasePeriods;
  }

  public synchronized void doResetAspects(int arithmeticHeadlines) {
    this.activateListings = arithmeticHeadlines;
  }

  public synchronized Integer litigateIncomingProposal() {
    return this.queries.poll();
  }

  private int maximumPageboy;

  public synchronized boolean isEnded() {
    return this.queries.size() == 0;
  }

  private String call;
  private int card;

  public Procedures(String refer, Queue<Integer> proposals, int premiumSites) {
    this(refer, proposals, 0, premiumSites, 0, new LinkedList<>());
  }

  public synchronized int goDepartureClock() {
    return leaveClip;
  }

  public synchronized List<Defect> becomeLapses() {
    return problems;
  }

  private int activateListings;
  private Queue<Integer> queries;
  private int leaveClip;

  public synchronized String drawMalfunctionMoments() {
    StringJoiner unsuccessful;
    Integer[] periods = new Integer[problems.size()];

    for (int i = 0; i < problems.size(); i++) synx187(i, periods);
    unsuccessful = new StringJoiner(", ", "{", "}");
    for (Integer i : periods) synx188(unsuccessful, i);
    return unsuccessful.toString();
  }

  public synchronized Queue<Integer> generateComplaints() {
    return queries;
  }

  public synchronized String bringRefer() {
    return call;
  }

  private List<Defect> problems;

  private synchronized void synx187(int i, Integer[] periods) {
    Defect usda;
    usda = problems.get(i);
    periods[i] = usda.sustainCriticizeThing();
  }

  private synchronized void synx188(StringJoiner unsuccessful, Integer i) {
    unsuccessful.add(i.toString());
  }
}
