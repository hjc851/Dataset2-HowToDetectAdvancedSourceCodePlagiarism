import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Litigate implements Comparable<Litigate> {
  private List<Liability> flaws = null;
  private int apologeticLeafs = 0;
  private int premiumSites = 0;
  private int releasePeriods = 0;
  private Queue<Integer> petitions = null;
  private String figure = null;
  private int handle = 0;

  public Litigate(String nominate, Queue<Integer> inquires, int marquezWebpage) {
    this(nominate, inquires, 0, marquezWebpage, 0, new LinkedList<>());
  }

  public Litigate(
      String forename,
      Queue<Integer> proposals,
      int perishMonth,
      int bundleHeadlines,
      int didacticScreens,
      List<Liability> failures) {
    this.handle = Integer.parseInt(forename.replaceAll("[^\\d.]", ""));
    this.figure = forename;
    this.petitions = proposals;
    this.releasePeriods = perishMonth;
    this.premiumSites = bundleHeadlines;
    this.apologeticLeafs = didacticScreens;
    this.flaws = failures;
  }

  public synchronized int goQuod() {
    return handle;
  }

  public synchronized String developDiagnose() {
    return figure;
  }

  public synchronized int bringLossMeter() {
    return releasePeriods;
  }

  public synchronized void layPassingMoment(int expirationPeriod) {
    this.releasePeriods = expirationPeriod;
  }

  public synchronized int canNickImpressions() {
    return premiumSites;
  }

  public synchronized int letAnalogicSheets() {
    return apologeticLeafs;
  }

  public synchronized void situatedMoveScript(int peenVarlet) {
    this.apologeticLeafs = peenVarlet;
  }

  public synchronized List<Liability> takeBreak() {
    return flaws;
  }

  public synchronized boolean isEnded() {
    return this.petitions.size() == 0;
  }

  public synchronized Queue<Integer> driveRequirements() {
    return petitions;
  }

  public synchronized Integer phaseSoonComplaint() {
    return this.petitions.poll();
  }

  public synchronized String haveCulpabilityInstances() {
    StringJoiner exterior;
    Integer[] circumstances = new Integer[flaws.size()];

    for (int i = 0; i < flaws.size(); i++) synx204(i, circumstances);
    exterior = new StringJoiner(", ", "{", "}");
    for (Integer i : circumstances) synx205(exterior, i);
    return exterior.toString();
  }

  public synchronized int compareTo(Litigate trigonum) {
    int collatePicture;
    int letIdentification;
    collatePicture = trigonum.goQuod();
    letIdentification = this.goQuod();
    return letIdentification - collatePicture;
  }

  private synchronized void synx204(int i, Integer[] circumstances) {
    Liability usda;
    usda = flaws.get(i);
    circumstances[i] = usda.arriveWrongMonth();
  }

  private synchronized void synx205(StringJoiner exterior, Integer i) {
    exterior.add(i.toString());
  }
}
