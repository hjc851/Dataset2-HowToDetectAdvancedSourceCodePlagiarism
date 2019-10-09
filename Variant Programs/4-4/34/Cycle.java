import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Cycle implements Comparable<Cycle> {

  public synchronized Queue<Integer> drawSubmissions() {
    return submissions;
  }

  public synchronized List<Accountable> haveFlaws() {
    return lapses;
  }

  public synchronized String drawGens() {
    return list;
  }

  public String list = null;

  public synchronized int haveActivateListings() {
    return unlockSlides;
  }

  public synchronized Integer marchAdjacentAsked() {
    return this.submissions.poll();
  }

  public int identifier = 0;
  public Queue<Integer> submissions = null;

  public synchronized int drawName() {
    return identifier;
  }

  public Cycle(String call, Queue<Integer> bespeak, int maximizeHomepage) {
    this(call, bespeak, 0, maximizeHomepage, 0, new LinkedList<>());
  }

  public synchronized void adjustAntipyreticSite(int analogicSheets) {
    this.unlockSlides = analogicSheets;
  }

  public synchronized String fixShortcomingThings() {
    StringJoiner unsuccessful;
    Integer[] periods = new Integer[lapses.size()];

    for (int i = 0; i < lapses.size(); i++) {
      Accountable usda;
      usda = lapses.get(i);
      periods[i] = usda.letFaultyHours();
    }
    unsuccessful = new StringJoiner(", ", "{", "}");
    for (Integer i : periods) {
      unsuccessful.add(i.toString());
    }
    return unsuccessful.toString();
  }

  public synchronized int sustainDepartThing() {
    return withdrawalChance;
  }

  public int bestScreens = 0;

  public Cycle(
      String pseudonym,
      Queue<Integer> appeals,
      int departureClock,
      int fullSections,
      int eprPageboy,
      List<Accountable> error) {
    this.identifier = Integer.parseInt(pseudonym.replaceAll("[^\\d.]", ""));
    this.list = pseudonym;
    this.submissions = appeals;
    this.withdrawalChance = departureClock;
    this.bestScreens = fullSections;
    this.unlockSlides = eprPageboy;
    this.lapses = error;
  }

  public synchronized int beatUpperSlips() {
    return bestScreens;
  }

  public synchronized int compareTo(Cycle trapezium) {
    int evaluateFinger;
    int yesUser;
    evaluateFinger = trapezium.drawName();
    yesUser = this.drawName();
    return yesUser - evaluateFinger;
  }

  public synchronized boolean isEnded() {
    return this.submissions.size() == 0;
  }

  public int withdrawalChance = 0;
  public List<Accountable> lapses = null;

  public synchronized void readyOutletDay(int passingMoment) {
    this.withdrawalChance = passingMoment;
  }

  public int unlockSlides = 0;
}
