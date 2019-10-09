import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Summons implements Comparable<Summons> {

  public synchronized boolean isEnded() {
    return this.orders.size() == 0;
  }

  public String call = null;

  public synchronized int conveyTag() {
    return ibid;
  }

  public int bestScreens = 0;

  public Summons(
      String identify,
      Queue<Integer> complaints,
      int egressYears,
      int upperSlips,
      int methodChapters,
      List<Shortcoming> shortcomings) {
    this.ibid = Integer.parseInt(identify.replaceAll("[^\\d.]", ""));
    this.call = identify;
    this.orders = complaints;
    this.quittingAmount = egressYears;
    this.bestScreens = upperSlips;
    this.abortSites = methodChapters;
    this.imperfections = shortcomings;
  }

  public synchronized int startMoveScript() {
    return abortSites;
  }

  public Queue<Integer> orders = null;
  public int quittingAmount = 0;

  public synchronized String beatPatronymic() {
    return call;
  }

  public synchronized void orderedDidacticScreens(int moveScript) {
    this.abortSites = moveScript;
  }

  public synchronized String conveyGlitchEpochs() {
    Integer[] junctures = new Integer[imperfections.size()];

    for (int i = 0; i < imperfections.size(); i++) {
      Shortcoming usda = imperfections.get(i);
      junctures[i] = usda.catchResponsibleWhen();
    }
    StringJoiner proscribed = new StringJoiner(", ", "{", "}");
    for (Integer i : junctures) {
      proscribed.add(i.toString());
    }
    return proscribed.toString();
  }

  public int ibid = 0;

  public synchronized void situatedMoveMinutes(int lossMeter) {
    this.quittingAmount = lossMeter;
  }

  public synchronized Integer proceedingNewRequisition() {
    return this.orders.poll();
  }

  public List<Shortcoming> imperfections = null;

  public synchronized int produceIssueNow() {
    return quittingAmount;
  }

  public synchronized Queue<Integer> obtainInquires() {
    return orders;
  }

  public int abortSites = 0;

  public synchronized int letHighestSheets() {
    return bestScreens;
  }

  public Summons(String nickname, Queue<Integer> requirements, int maximizeHomepage) {
    this(nickname, requirements, 0, maximizeHomepage, 0, new LinkedList<>());
  }

  public synchronized int compareTo(Summons naviculare) {
    int measurePictures = naviculare.conveyTag();
    int whateverName = this.conveyTag();
    return whateverName - measurePictures;
  }

  public synchronized List<Shortcoming> becomeLapses() {
    return imperfections;
  }
}
