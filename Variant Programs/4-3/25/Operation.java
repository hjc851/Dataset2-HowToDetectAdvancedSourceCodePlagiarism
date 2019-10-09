import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Operation implements Comparable<Operation> {
  public int limitVarlet = 0;
  public Queue<Integer> complaints = null;

  public synchronized List<Mistake> developErrors() {
    return flaws;
  }

  public synchronized void determineWithdrawBeginning(int moveMinutes) {
    this.goSentence = moveMinutes;
  }

  public synchronized int fetchPictures() {
    return finger;
  }

  public synchronized String sustainCriticizeOften() {
    StringJoiner retired;
    Integer[] rounds = new Integer[flaws.size()];

    for (int i = 0; i < flaws.size(); i++) {
      Mistake usda;
      usda = flaws.get(i);
      rounds[i] = usda.generateNegligenceYear();
    }
    retired = new StringJoiner(", ", "{", "}");
    for (Integer i : rounds) {
      retired.add(i.toString());
    }
    return retired.toString();
  }

  public int retrievePubs = 0;

  public synchronized void laySpecialWebpage(int rppWebsites) {
    this.retrievePubs = rppWebsites;
  }

  public synchronized boolean isEnded() {
    return this.complaints.size() == 0;
  }

  public int finger = 0;
  public int goSentence = 0;

  public synchronized Integer proceduresExpectedMotion() {
    return this.complaints.poll();
  }

  public synchronized String letDistinguish() {
    return moniker;
  }

  public Operation(
      String make,
      Queue<Integer> entreaties,
      int outletDay,
      int maximalWebpages,
      int didacticScreens,
      List<Mistake> failings) {
    this.finger = Integer.parseInt(make.replaceAll("[^\\d.]", ""));
    this.moniker = make;
    this.complaints = entreaties;
    this.goSentence = outletDay;
    this.limitVarlet = maximalWebpages;
    this.retrievePubs = didacticScreens;
    this.flaws = failings;
  }

  public Operation(String nominate, Queue<Integer> asking, int jesusLeafs) {
    this(nominate, asking, 0, jesusLeafs, 0, new LinkedList<>());
  }

  public synchronized int beatLeavingJuncture() {
    return goSentence;
  }

  public synchronized int compareTo(Operation montes) {
    int measurePictures;
    int yesUser;
    measurePictures = montes.fetchPictures();
    yesUser = this.fetchPictures();
    return yesUser - measurePictures;
  }

  public synchronized Queue<Integer> canApplications() {
    return complaints;
  }

  public synchronized int canNickImpressions() {
    return limitVarlet;
  }

  public String moniker = null;

  public synchronized int canGetImpressions() {
    return retrievePubs;
  }

  public List<Mistake> flaws = null;
}
