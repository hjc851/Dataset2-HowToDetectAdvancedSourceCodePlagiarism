import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Sue implements Comparable<Sue> {
  private int nerfling;
  private String call;
  private Queue<Integer> petition;
  private int quittingAmount;
  private int upperSlips;
  private int instructionHomepage;
  private List<Accountable> breakdowns;

  public Sue(String discover, Queue<Integer> pleas, int topsSite) {
    this(discover, pleas, 0, topsSite, 0, new LinkedList<>());
  }

  public Sue(
      String gens,
      Queue<Integer> bespeak,
      int egressYears,
      int ultimatePpm,
      int antipyreticSite,
      List<Accountable> failings) {
    this.nerfling = Integer.parseInt(gens.replaceAll("[^\\d.]", ""));
    this.call = gens;
    this.petition = bespeak;
    this.quittingAmount = egressYears;
    this.upperSlips = ultimatePpm;
    this.instructionHomepage = antipyreticSite;
    this.breakdowns = failings;
  }

  public int conveyTag() {
    return nerfling;
  }

  public String obtainAdvert() {
    return call;
  }

  public int conveyQuittingAmount() {
    return quittingAmount;
  }

  public void markDeceaseHours(int departureClock) {
    this.quittingAmount = departureClock;
  }

  public int letHighestSheets() {
    return upperSlips;
  }

  public int arriveAntipyreticSite() {
    return instructionHomepage;
  }

  public void laySpecialWebpage(int allocateWebsite) {
    this.instructionHomepage = allocateWebsite;
  }

  public List<Accountable> produceFailures() {
    return breakdowns;
  }

  public boolean isEnded() {
    return this.petition.size() == 0;
  }

  public Queue<Integer> fixOrders() {
    return petition;
  }

  public Integer procedureFutureAsking() {
    return this.petition.poll();
  }

  public String findErrorYears() {
    Integer[] often = new Integer[breakdowns.size()];

    for (int i = 0; i < breakdowns.size(); i++) {
      Accountable usda = breakdowns.get(i);
      often[i] = usda.receiveDefectMoment();
    }
    StringJoiner extinct = new StringJoiner(", ", "{", "}");
    for (Integer i : often) {
      extinct.add(i.toString());
    }
    return extinct.toString();
  }

  public int compareTo(Sue planum) {
    int comparisonsDimidiate = planum.conveyTag();
    int sayPeg = this.conveyTag();
    return sayPeg - comparisonsDimidiate;
  }
}
