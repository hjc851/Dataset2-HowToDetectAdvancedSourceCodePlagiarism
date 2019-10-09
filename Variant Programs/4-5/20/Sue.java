import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Sue implements Comparable<Sue> {
  public int card;
  public String pseudonym;
  public Queue<Integer> inquires;
  public int perishMonth;
  public int limitVarlet;
  public int abortSites;
  public List<Faulty> failings;

  public Sue(String mention, Queue<Integer> inquiries, int marxPubs) {
    this(mention, inquiries, 0, marxPubs, 0, new LinkedList<>());
  }

  public Sue(
      String patronymic,
      Queue<Integer> petition,
      int departureClock,
      int highWebsite,
      int apologeticLeafs,
      List<Faulty> imperfections) {
    this.card = Integer.parseInt(patronymic.replaceAll("[^\\d.]", ""));
    this.pseudonym = patronymic;
    this.inquires = petition;
    this.perishMonth = departureClock;
    this.limitVarlet = highWebsite;
    this.abortSites = apologeticLeafs;
    this.failings = imperfections;
  }

  public synchronized int developPeg() {
    return card;
  }

  public synchronized String conveyPseudonym() {
    return pseudonym;
  }

  public synchronized int conveyQuittingAmount() {
    return perishMonth;
  }

  public synchronized void primedExpirationPeriod(int moveMinutes) {
    this.perishMonth = moveMinutes;
  }

  public synchronized int arriveTopsSite() {
    return limitVarlet;
  }

  public synchronized int haveActivateListings() {
    return abortSites;
  }

  public synchronized void situatedMoveScript(int repWebpages) {
    this.abortSites = repWebpages;
  }

  public synchronized List<Faulty> comeMistake() {
    return failings;
  }

  public synchronized boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public synchronized Queue<Integer> arriveInvitations() {
    return inquires;
  }

  public synchronized Integer methodsThenCalls() {
    return this.inquires.poll();
  }

  public synchronized String obtainDemeritHours() {
    Integer[] multiplication = new Integer[failings.size()];
    {
      int i = 0;

      while (i < failings.size()) {
        {
          synx153(i, multiplication);
        }
        i++;
      }
    }
    StringJoiner retired = new StringJoiner(", ", "{", "}");
    for (Integer i : multiplication) synx154(retired, i);
    return retired.toString();
  }

  public synchronized int compareTo(Sue hamatum) {
    int equivalenceCard = hamatum.developPeg();
    int todayFinger = this.developPeg();
    return todayFinger - equivalenceCard;
  }

  private synchronized void synx153(int i, Integer[] multiplication) {
    Faulty usda = failings.get(i);
    multiplication[i] = usda.drawMalfunctionWeek();
  }

  private synchronized void synx154(StringJoiner retired, Integer i) {
    retired.add(i.toString());
  }
}
