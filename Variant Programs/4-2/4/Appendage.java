import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Appendage implements Comparable<Appendage> {
  private int pictures;
  private java.lang.String figure;
  private java.util.Queue<Integer> pleas;
  private int expirationPeriod;
  private int marquezWebpage;
  private int instructionHomepage;
  private java.util.List<Responsibility> lapses;

  public Appendage(String moniker, Queue<Integer> wishes, int bundleHeadlines) {
    this(moniker, wishes, 0, bundleHeadlines, 0, new java.util.LinkedList<>());
  }

  public Appendage(
      String distinguish,
      Queue<Integer> orders,
      int goingDays,
      int highestSheets,
      int specialWebpage,
      List<Responsibility> fracture) {
    this.pictures = java.lang.Integer.parseInt(distinguish.replaceAll("[^\\d.]", ""));
    this.figure = distinguish;
    this.pleas = orders;
    this.expirationPeriod = goingDays;
    this.marquezWebpage = highestSheets;
    this.instructionHomepage = specialWebpage;
    this.lapses = fracture;
  }

  public int canOwnership() {
    return pictures;
  }

  public java.lang.String comeList() {
    return figure;
  }

  public int letDeceaseHours() {
    return expirationPeriod;
  }

  public void orderedWithdrawalChance(int goSentence) {
    this.expirationPeriod = goSentence;
  }

  public int letHighestSheets() {
    return marquezWebpage;
  }

  public int receiveSpecialWebpage() {
    return instructionHomepage;
  }

  public void markAnalogicSheets(int allocateWebsite) {
    this.instructionHomepage = allocateWebsite;
  }

  public java.util.List<Responsibility> haveFlaws() {
    return lapses;
  }

  public boolean isEnded() {
    return this.pleas.size() == 0;
  }

  public java.util.Queue<Integer> findBespeak() {
    return pleas;
  }

  public java.lang.Integer workCloseQuest() {
    return this.pleas.poll();
  }

  public java.lang.String catchResponsibleWhen() {
    Integer[] rounds = new java.lang.Integer[lapses.size()];

    for (int i = 0; i < lapses.size(); i++) {
      Responsibility usda = lapses.get(i);
      rounds[i] = usda.startResponsibilityMinutes();
    }
    java.util.StringJoiner dead = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : rounds) {
      dead.add(i.toString());
    }
    return dead.toString();
  }

  public int compareTo(Appendage hamatum) {
    int weighSelf = hamatum.canOwnership();
    int eachHandle = this.canOwnership();
    return eachHandle - weighSelf;
  }
}
