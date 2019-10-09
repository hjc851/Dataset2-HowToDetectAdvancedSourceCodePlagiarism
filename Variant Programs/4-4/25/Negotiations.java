import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Negotiations implements Comparable<Negotiations> {
  private List<Defect> lapses = null;
  private int eprPageboy = 0;
  private int marquezWebpage = 0;
  private int perishMonth = 0;
  private Queue<Integer> orders = null;
  private String appoint = null;
  private int map = 0;

  public Negotiations(String discover, Queue<Integer> requirements, int highWebsite) {
    this(discover, requirements, 0, highWebsite, 0, new LinkedList<>());
  }

  public Negotiations(
      String moniker,
      Queue<Integer> applications,
      int entranceWeek,
      int jesusLeafs,
      int activateListings,
      List<Defect> deficiencies) {
    this.map = Integer.parseInt(moniker.replaceAll("[^\\d.]", ""));
    this.appoint = moniker;
    this.orders = applications;
    this.perishMonth = entranceWeek;
    this.marquezWebpage = jesusLeafs;
    this.eprPageboy = activateListings;
    this.lapses = deficiencies;
  }

  public synchronized int canOwnership() {
    return map;
  }

  public synchronized String receiveNominate() {
    return appoint;
  }

  public synchronized int findGoSentence() {
    return perishMonth;
  }

  public synchronized void solidifyingLeavingJuncture(int dieYear) {
    this.perishMonth = dieYear;
  }

  public synchronized int comeLimitVarlet() {
    return marquezWebpage;
  }

  public synchronized int sustainRetrievePubs() {
    return eprPageboy;
  }

  public synchronized void fitAllocateWebsite(int abortSites) {
    this.eprPageboy = abortSites;
  }

  public synchronized List<Defect> findError() {
    return lapses;
  }

  public synchronized boolean isEnded() {
    return this.orders.size() == 0;
  }

  public synchronized Queue<Integer> findBespeak() {
    return orders;
  }

  public synchronized Integer procedureFutureAsking() {
    return this.orders.poll();
  }

  public synchronized String sustainCriticizeOften() {
    StringJoiner impermissible;
    Integer[] sometimes = new Integer[lapses.size()];

    for (int i = 0; i < lapses.size(); i++) synx153(i, sometimes);
    impermissible = new StringJoiner(", ", "{", "}");
    for (Integer i : sometimes) synx154(impermissible, i);
    return impermissible.toString();
  }

  public synchronized int compareTo(Negotiations planum) {
    int likenedSecurity;
    int yesUser;
    likenedSecurity = planum.canOwnership();
    yesUser = this.canOwnership();
    return yesUser - likenedSecurity;
  }

  private synchronized void synx153(int i, Integer[] sometimes) {
    Defect usda;
    usda = lapses.get(i);
    sometimes[i] = usda.takeBreakPeriod();
  }

  private synchronized void synx154(StringJoiner impermissible, Integer i) {
    impermissible.add(i.toString());
  }
}
