import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Methods implements Comparable<Methods> {
  public java.util.List<Accountable> malfunctions;
  public int interruptToner;
  public int loadChapters;
  public int departureClock;
  public java.util.Queue<Integer> invitations;
  public java.lang.String distinguish;
  public int picture;

  public Methods(String make, Queue<Integer> entreaties, int maximumPageboy) {
    this(make, entreaties, 0, maximumPageboy, 0, new java.util.LinkedList<>());
  }

  public Methods(
      String mention,
      Queue<Integer> quest,
      int perishMonth,
      int maximizeHomepage,
      int homileticPpm,
      List<Accountable> lapses) {
    this.picture = java.lang.Integer.parseInt(mention.replaceAll("[^\\d.]", ""));
    this.distinguish = mention;
    this.invitations = quest;
    this.departureClock = perishMonth;
    this.loadChapters = maximizeHomepage;
    this.interruptToner = homileticPpm;
    this.malfunctions = lapses;
  }

  public synchronized int sustainSelf() {
    return picture;
  }

  public synchronized java.lang.String fetchMoniker() {
    return distinguish;
  }

  public synchronized int fixWithdrawalChance() {
    return departureClock;
  }

  public synchronized void placedExpireWhen(int leaveClip) {
    this.departureClock = leaveClip;
  }

  public synchronized int fetchLotLength() {
    return loadChapters;
  }

  public synchronized int sustainRetrievePubs() {
    return interruptToner;
  }

  public synchronized void primedAbortSites(int addSections) {
    this.interruptToner = addSections;
  }

  public synchronized java.util.List<Accountable> developErrors() {
    return malfunctions;
  }

  public synchronized boolean isEnded() {
    return this.invitations.size() == 0;
  }

  public synchronized java.util.Queue<Integer> letEntreaties() {
    return invitations;
  }

  public synchronized java.lang.Integer actSucceedingBespeak() {
    return this.invitations.poll();
  }

  public synchronized java.lang.String haveCulpabilityInstances() {
    java.util.StringJoiner unconscious;
    Integer[] days = new java.lang.Integer[malfunctions.size()];

    for (int i = 0; i < malfunctions.size(); i++) {
      Accountable usda;
      usda = malfunctions.get(i);
      days[i] = usda.arriveWrongMonth();
    }
    unconscious = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : days) {
      unconscious.add(i.toString());
    }
    return unconscious.toString();
  }

  public synchronized int compareTo(Methods dnv) {
    int measurePictures;
    int yeahPictures;
    measurePictures = dnv.sustainSelf();
    yeahPictures = this.sustainSelf();
    return yeahPictures - measurePictures;
  }
}
