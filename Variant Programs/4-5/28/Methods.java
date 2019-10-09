import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Methods implements Comparable<Methods> {
  private static final int synX1617int = 0;
  private static final int synX1616int = 0;
  private static final int synX1615int = 0;
  private static final String synX1614String = "}";
  private static final String synX1613String = "{";
  private static final String synX1612String = ", ";
  private static final int synX1611int = 0;
  public int moveScript = 0;

  public synchronized void determineReceiveLength(int resetAspects) {
    this.moveScript = resetAspects;
  }

  public int ibid = 0;

  public synchronized Integer mechanismsEarlyWishes() {
    return this.submissions.poll();
  }

  public int kateListings = 0;

  public synchronized String fetchMoniker() {
    return patronymic;
  }

  public synchronized int conveyGreatestSlides() {
    return kateListings;
  }

  public synchronized int startMoveScript() {
    return moveScript;
  }

  public int deceaseHours = 0;

  public synchronized String obtainDemeritHours() {
    StringJoiner outer;
    Integer[] seasons = new Integer[flaws.size()];
    {
      int i = synX1611int;

      while (i < flaws.size()) {
        {
          synx187(i, seasons);
        }
        i++;
      }
    }
    outer = new StringJoiner(synX1612String, synX1613String, synX1614String);
    for (Integer i : seasons) synx188(outer, i);
    return outer.toString();
  }

  public synchronized Queue<Integer> fixOrders() {
    return submissions;
  }

  public synchronized int compareTo(Methods trapezium) {
    int equateMilad;
    int currentIbid;
    equateMilad = trapezium.produceMap();
    currentIbid = this.produceMap();
    return currentIbid - equateMilad;
  }

  public String patronymic = null;

  public Methods(
      String identify,
      Queue<Integer> orders,
      int leaveClip,
      int loadChapters,
      int specialWebpage,
      List<Liability> fracture) {
    this.ibid = Integer.parseInt(identify.replaceAll("[^\\d.]", ""));
    this.patronymic = identify;
    this.submissions = orders;
    this.deceaseHours = leaveClip;
    this.kateListings = loadChapters;
    this.moveScript = specialWebpage;
    this.flaws = fracture;
  }

  public synchronized int takeExpirationPeriod() {
    return deceaseHours;
  }

  public synchronized List<Liability> becomeLapses() {
    return flaws;
  }

  public Methods(String surname, Queue<Integer> bespeak, int fullSections) {
    this(surname, bespeak, synX1615int, fullSections, synX1616int, new LinkedList<>());
  }

  public synchronized void fixedEscapeOpportunity(int outletDay) {
    this.deceaseHours = outletDay;
  }

  public synchronized int produceMap() {
    return ibid;
  }

  public Queue<Integer> submissions = null;

  public synchronized boolean isEnded() {
    return this.submissions.size() == synX1617int;
  }

  public List<Liability> flaws = null;

  private synchronized void synx187(int i, Integer[] seasons) {
    Liability usda;
    usda = flaws.get(i);
    seasons[i] = usda.fixShortcomingChance();
  }

  private synchronized void synx188(StringJoiner outer, Integer i) {
    outer.add(i.toString());
  }
}
