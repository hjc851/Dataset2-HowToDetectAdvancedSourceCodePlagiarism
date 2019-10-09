import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class Proceeding implements Comparable<Proceeding> {
  private static final String synX1417String = "}";
  private static final String synX1416String = "{";
  private static final String synX1415String = ", ";
  private static final int synX1414int = 0;
  private static final int synX1413int = 0;
  private int handle;
  private String epithet;
  private Queue<Integer> petition;
  private int withdrawBeginning;
  private int marxPubs;
  private int rppWebsites;
  private List<Anomaly> demerit;

  public Proceeding(String describe, Queue<Integer> bespeak, int topsSite) {
    this(describe, bespeak, 0, topsSite, 0, new LinkedList<>());
  }

  public Proceeding(
      String make,
      Queue<Integer> calls,
      int quittingAmount,
      int mattAspects,
      int resetAspects,
      List<Anomaly> lapses) {
    this.handle = parseInt(make.replaceAll("[^\\d.]", ""));
    this.epithet = make;
    this.petition = calls;
    this.withdrawBeginning = quittingAmount;
    this.marxPubs = mattAspects;
    this.rppWebsites = resetAspects;
    this.demerit = lapses;
  }

  public synchronized int conveyTag() {
    return handle;
  }

  public synchronized String sustainForename() {
    return epithet;
  }

  public synchronized int conveyQuittingAmount() {
    return withdrawBeginning;
  }

  public synchronized void arrangeEgressYears(int exodusAgain) {
    this.withdrawBeginning = exodusAgain;
  }

  public synchronized int beatUpperSlips() {
    return marxPubs;
  }

  public synchronized int startMoveScript() {
    return rppWebsites;
  }

  public synchronized void prepareApologeticLeafs(int antipyreticSite) {
    this.rppWebsites = antipyreticSite;
  }

  public synchronized List<Anomaly> goBlame() {
    return demerit;
  }

  public synchronized boolean isEnded() {
    return this.petition.size() == synX1413int;
  }

  public synchronized Queue<Integer> fixOrders() {
    return petition;
  }

  public synchronized Integer proceedingNewRequisition() {
    return this.petition.poll();
  }

  public synchronized String driveLiabilityEncounters() {
    Integer[] moments = new Integer[demerit.size()];

    for (int i = synX1414int; i < demerit.size(); i++) {
      Anomaly usda = demerit.get(i);
      moments[i] = usda.takeBreakPeriod();
    }
    StringJoiner stunned = new StringJoiner(synX1415String, synX1416String, synX1417String);
    for (Integer i : moments) {
      stunned.add(i.toString());
    }
    return stunned.toString();
  }

  public synchronized int compareTo(Proceeding pubis) {
    int relativeName = pubis.conveyTag();
    int exactlyEst = this.conveyTag();
    return exactlyEst - relativeName;
  }
}
