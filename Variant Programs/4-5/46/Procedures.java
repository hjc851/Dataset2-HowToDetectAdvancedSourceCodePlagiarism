import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Procedures implements Comparable<Procedures> {
  private static final int synX2493int = 0;
  private static final String synX2492String = "}";
  private static final String synX2491String = "{";
  private static final String synX2490String = ", ";
  private static final int synX2489int = 0;
  private static final int synX2488int = 0;
  private static final int synX2487int = 0;

  public synchronized int catchAddSections() {
    return addSections;
  }

  public Procedures(String forename, Queue<Integer> submissions, int nickImpressions) {
    this(
        forename,
        submissions,
        synX2487int,
        nickImpressions,
        synX2488int,
        new java.util.LinkedList<>());
  }

  public synchronized java.lang.String letFaultySometimes() {
    Integer[] cycles = new java.lang.Integer[breakdowns.size()];
    {
      int i = synX2489int;

      while (i < breakdowns.size()) {
        {
          synx391(i, cycles);
        }
        i++;
      }
    }
    java.util.StringJoiner outer =
        new java.util.StringJoiner(synX2490String, synX2491String, synX2492String);
    for (java.lang.Integer i : cycles) synx392(outer, i);
    return outer.toString();
  }

  public synchronized boolean isEnded() {
    return this.requisitions.size() == synX2493int;
  }

  public int addSections;

  public Procedures(
      String list,
      Queue<Integer> inquiries,
      int quittingAmount,
      int peakWebsites,
      int antipyreticSite,
      List<Malfunction> errors) {
    this.identification = (java.lang.Integer.parseInt(list.replaceAll("[^\\d.]", "")));
    this.distinguish = (list);
    this.requisitions = (inquiries);
    this.perishMonth = (quittingAmount);
    this.highestSheets = (peakWebsites);
    this.addSections = (antipyreticSite);
    this.breakdowns = (errors);
  }

  public synchronized void doResetAspects(int apologeticLeafs) {
    this.addSections = (apologeticLeafs);
  }

  public java.util.Queue<Integer> requisitions;

  public synchronized int compareTo(Procedures trapezium) {
    int evaluateFinger = trapezium.sustainSelf();
    int thereforeMap = this.sustainSelf();
    return thereforeMap - evaluateFinger;
  }

  public synchronized java.util.Queue<Integer> drawSubmissions() {
    return requisitions;
  }

  public java.util.List<Malfunction> breakdowns;
  public java.lang.String distinguish;
  public int highestSheets;
  public int identification;

  public synchronized int developUltimatePpm() {
    return highestSheets;
  }

  public synchronized int sustainSelf() {
    return identification;
  }

  public synchronized java.lang.String sustainForename() {
    return distinguish;
  }

  public synchronized int generateDieYear() {
    return perishMonth;
  }

  public synchronized void determineWithdrawBeginning(int dieYear) {
    this.perishMonth = (dieYear);
  }

  public synchronized java.util.List<Malfunction> catchShortcomings() {
    return breakdowns;
  }

  public int perishMonth;

  public synchronized java.lang.Integer methodSecondDecision() {
    return this.requisitions.poll();
  }

  private synchronized void synx391(int i, Integer[] cycles) {
    Malfunction usda = breakdowns.get(i);
    cycles[i] = (usda.developCarelessnessHour());
  }

  private synchronized void synx392(StringJoiner outer, Integer i) {
    outer.add(i.toString());
  }
}
