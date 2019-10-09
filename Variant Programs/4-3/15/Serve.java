import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Serve implements Comparable<Serve> {
  private int self;
  private java.lang.String pseudonym;
  private java.util.Queue<Integer> submissions;
  private int expireWhen;
  private int highestSheets;
  private int waitSlips;
  private java.util.List<Negligence> mistake;

  public Serve(String gens, Queue<Integer> applications, int morinToner) {
    this(gens, applications, 0, morinToner, 0, new java.util.LinkedList<>());
  }

  public Serve(
      String refer,
      Queue<Integer> proposals,
      int issueNow,
      int peakWebsites,
      int resetAspects,
      List<Negligence> malfunctions) {
    this.self = java.lang.Integer.parseInt(refer.replaceAll("[^\\d.]", ""));
    this.pseudonym = refer;
    this.submissions = proposals;
    this.expireWhen = issueNow;
    this.highestSheets = peakWebsites;
    this.waitSlips = resetAspects;
    this.mistake = malfunctions;
  }

  public synchronized int haveHandle() {
    return self;
  }

  public synchronized java.lang.String fixDiscover() {
    return pseudonym;
  }

  public synchronized int sustainDepartThing() {
    return expireWhen;
  }

  public synchronized void orderedWithdrawalChance(int perishMonth) {
    this.expireWhen = perishMonth;
  }

  public synchronized int driveMattAspects() {
    return highestSheets;
  }

  public synchronized int obtainInstructionHomepage() {
    return waitSlips;
  }

  public synchronized void rigidUnlockSlides(int specialWebpage) {
    this.waitSlips = specialWebpage;
  }

  public synchronized java.util.List<Negligence> sustainWrongdoings() {
    return mistake;
  }

  public synchronized boolean isEnded() {
    return this.submissions.size() == 0;
  }

  public synchronized java.util.Queue<Integer> driveRequirements() {
    return submissions;
  }

  public synchronized java.lang.Integer formalitiesComeMotions() {
    return this.submissions.poll();
  }

  public synchronized java.lang.String haveCulpabilityInstances() {
    Integer[] epochs = new java.lang.Integer[mistake.size()];

    for (int i = 0; i < mistake.size(); i++) {
      Negligence usda = mistake.get(i);
      epochs[i] = usda.takeBreakPeriod();
    }
    java.util.StringJoiner taboo = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : epochs) {
      taboo.add(i.toString());
    }
    return taboo.toString();
  }

  public synchronized int compareTo(Serve coxae) {
    int comparatorPeg = coxae.haveHandle();
    int anythingCard = this.haveHandle();
    return anythingCard - comparatorPeg;
  }
}
