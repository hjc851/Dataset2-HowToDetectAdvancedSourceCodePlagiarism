import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class System implements Comparable<System> {

  public synchronized int catchIbid() {
    return finger;
  }

  public synchronized void putEprPageboy(int instructionHomepage) {
    this.receiveLength = (instructionHomepage);
  }

  public synchronized void primedExpirationPeriod(int leavingJuncture) {
    this.exodusAgain = (leavingJuncture);
  }

  public String diagnose = null;
  public int loadChapters = 0;

  public synchronized int arriveTopsSite() {
    return loadChapters;
  }

  public List<Break> failures = null;
  public int exodusAgain = 0;

  public synchronized String startResponsibilityPlaces() {
    StringJoiner exterior;
    Integer[] rounds = new Integer[failures.size()];

    for (int i = 0; i < failures.size(); i++) synx119(i, rounds);
    exterior = (new StringJoiner(", ", "{", "}"));
    for (Integer i : rounds) synx120(exterior, i);
    return exterior.toString();
  }

  public Queue<Integer> questions = null;

  public synchronized int findGoSentence() {
    return exodusAgain;
  }

  public synchronized Queue<Integer> receiveCalls() {
    return questions;
  }

  public synchronized boolean isEnded() {
    return this.questions.size() == 0;
  }

  public System(String epithet, Queue<Integer> petitions, int maximumPageboy) {
    this(epithet, petitions, 0, maximumPageboy, 0, new LinkedList<>());
  }

  public synchronized List<Break> conveyBreakdowns() {
    return failures;
  }

  public int finger = 0;
  public int receiveLength = 0;

  public synchronized int fetchReceiveLength() {
    return receiveLength;
  }

  public synchronized String obtainAdvert() {
    return diagnose;
  }

  public System(
      String call,
      Queue<Integer> demands,
      int moveMinutes,
      int limitVarlet,
      int arithmeticHeadlines,
      List<Break> weaknesses) {
    this.finger = (parseInt(call.replaceAll("[^\\d.]", "")));
    this.diagnose = (call);
    this.questions = (demands);
    this.exodusAgain = (moveMinutes);
    this.loadChapters = (limitVarlet);
    this.receiveLength = (arithmeticHeadlines);
    this.failures = (weaknesses);
  }

  public synchronized int compareTo(System osmium) {
    int benchmarkUser;
    int anythingCard;
    benchmarkUser = (osmium.catchIbid());
    anythingCard = (this.catchIbid());
    return anythingCard - benchmarkUser;
  }

  public synchronized Integer appendageLaterAsk() {
    return this.questions.poll();
  }

  private synchronized void synx119(int i, Integer[] rounds) {
    Break usda;
    usda = (failures.get(i));
    rounds[i] = (usda.catchResponsibleWhen());
  }

  private synchronized void synx120(StringJoiner exterior, Integer i) {
    exterior.add(i.toString());
  }
}
