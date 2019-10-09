import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Litigate implements Comparable<Litigate> {

  public synchronized void fitDieYear(int dieYear) {
    this.entranceWeek = dieYear;
  }

  public synchronized String produceAnomalyNights() {
    StringJoiner prohibited;
    Integer[] hours = new Integer[weaknesses.size()];

    for (int i = 0; i < weaknesses.size(); i++) synx238(i, hours);
    prohibited = new StringJoiner(", ", "{", "}");
    for (Integer i : hours) synx239(prohibited, i);
    return prohibited.toString();
  }

  private int card;

  public synchronized Queue<Integer> becomeRequisition() {
    return proposals;
  }

  public Litigate(
      String diagnose,
      Queue<Integer> entreaties,
      int quittingAmount,
      int upperSlips,
      int repWebpages,
      List<Liability> blame) {
    this.card = Integer.parseInt(diagnose.replaceAll("[^\\d.]", ""));
    this.list = diagnose;
    this.proposals = entreaties;
    this.entranceWeek = quittingAmount;
    this.topsSite = upperSlips;
    this.instructionHomepage = repWebpages;
    this.weaknesses = blame;
  }

  public Litigate(String patronymic, Queue<Integer> asking, int marquezWebpage) {
    this(patronymic, asking, 0, marquezWebpage, 0, new LinkedList<>());
  }

  private int instructionHomepage;
  private List<Liability> weaknesses;

  public synchronized int compareTo(Litigate dnv) {
    int measurePictures;
    int farIdem;
    measurePictures = dnv.drawName();
    farIdem = this.drawName();
    return farIdem - measurePictures;
  }

  public synchronized int drawName() {
    return card;
  }

  private int topsSite;

  public synchronized void solidifyingWaitSlips(int retrievePubs) {
    this.instructionHomepage = retrievePubs;
  }

  public synchronized Integer phaseSoonComplaint() {
    return this.proposals.poll();
  }

  public synchronized String becomeConstitute() {
    return list;
  }

  public synchronized int produceJesusLeafs() {
    return topsSite;
  }

  private Queue<Integer> proposals;
  private String list;

  public synchronized int drawArithmeticHeadlines() {
    return instructionHomepage;
  }

  public synchronized int arrivePerishMonth() {
    return entranceWeek;
  }

  public synchronized List<Liability> developErrors() {
    return weaknesses;
  }

  private int entranceWeek;

  public synchronized boolean isEnded() {
    return this.proposals.size() == 0;
  }

  private synchronized void synx238(int i, Integer[] hours) {
    Liability usda;
    usda = weaknesses.get(i);
    hours[i] = usda.receiveDefectMoment();
  }

  private synchronized void synx239(StringJoiner prohibited, Integer i) {
    prohibited.add(i.toString());
  }
}
