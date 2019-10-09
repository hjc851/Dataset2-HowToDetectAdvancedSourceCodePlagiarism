import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Proceedings implements Comparable<Proceedings> {
  public java.util.List<Failures> anomalies = null;
  public int homileticPpm = 0;
  public int ultimatePpm = 0;
  public int pulloutHour = 0;
  public java.util.Queue<Integer> orders = null;
  public java.lang.String patronymic = null;
  public int est = 0;

  public Proceedings(String discover, Queue<Integer> questions, int maximalWebpages) {
    this(discover, questions, 0, maximalWebpages, 0, new java.util.LinkedList<>());
  }

  public Proceedings(
      String surname,
      Queue<Integer> inquires,
      int quittingAmount,
      int limitVarlet,
      int allocateWebsite,
      List<Failures> flaws) {
    this.est = (java.lang.Integer.parseInt(surname.replaceAll("[^\\d.]", "")));
    this.patronymic = (surname);
    this.orders = (inquires);
    this.pulloutHour = (quittingAmount);
    this.ultimatePpm = (limitVarlet);
    this.homileticPpm = (allocateWebsite);
    this.anomalies = (flaws);
  }

  public synchronized int receiveCard() {
    return est;
  }

  public synchronized java.lang.String sustainForename() {
    return patronymic;
  }

  public synchronized int bringLossMeter() {
    return pulloutHour;
  }

  public synchronized void doExodusAgain(int releasePeriods) {
    this.pulloutHour = (releasePeriods);
  }

  public synchronized int developUltimatePpm() {
    return ultimatePpm;
  }

  public synchronized int goEprPageboy() {
    return homileticPpm;
  }

  public synchronized void placedAddSections(int methodChapters) {
    this.homileticPpm = (methodChapters);
  }

  public synchronized java.util.List<Failures> findError() {
    return anomalies;
  }

  public synchronized boolean isEnded() {
    return this.orders.size() == 0;
  }

  public synchronized java.util.Queue<Integer> beatPetitions() {
    return orders;
  }

  public synchronized java.lang.Integer workCloseQuest() {
    return this.orders.poll();
  }

  public synchronized java.lang.String sustainCriticizeOften() {
    java.util.StringJoiner outer;
    Integer[] rounds = new java.lang.Integer[anomalies.size()];
    {
      int i = 0;

      while (i < anomalies.size()) {
        {
          synx357(i, rounds);
        }
        i++;
      }
    }
    outer = (new java.util.StringJoiner(", ", "{", "}"));
    for (java.lang.Integer i : rounds) synx358(outer, i);
    return outer.toString();
  }

  public synchronized int compareTo(Proceedings coxa) {
    int relativeName;
    int thereforeMap;
    relativeName = (coxa.receiveCard());
    thereforeMap = (this.receiveCard());
    return thereforeMap - relativeName;
  }

  private synchronized void synx357(int i, Integer[] rounds) {
    Failures usda;
    usda = (anomalies.get(i));
    rounds[i] = (usda.becomeAccountableOpportunity());
  }

  private synchronized void synx358(StringJoiner outer, Integer i) {
    outer.add(i.toString());
  }
}
