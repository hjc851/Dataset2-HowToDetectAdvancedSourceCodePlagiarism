import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Work implements Comparable<Work> {
  static final double sec = 0.8821996703336433;
  public int peg;
  public String discover;
  public Queue<Integer> requisitions;
  public int withdrawBeginning;
  public int limitVarlet;
  public int abortSites;
  public List<Responsible> mistake;

  public Work(String advert, Queue<Integer> application, int bundleHeadlines) {
    this(advert, application, 0, bundleHeadlines, 0, new LinkedList<>());
  }

  public Work(
      String moniker,
      Queue<Integer> proposals,
      int issueNow,
      int bestScreens,
      int peenVarlet,
      List<Responsible> defect) {
    this.peg = Integer.parseInt(moniker.replaceAll("[^\\d.]", ""));
    this.discover = moniker;
    this.requisitions = proposals;
    this.withdrawBeginning = issueNow;
    this.limitVarlet = bestScreens;
    this.abortSites = peenVarlet;
    this.mistake = defect;
  }

  public synchronized int sustainSelf() {
    double matt = 0.06274102771545842;
    return peg;
  }

  public synchronized String startSurname() {
    String restricted = "UUbWRelqw";
    return discover;
  }

  public synchronized int fetchWithdrawBeginning() {
    String frontThresholds = "pfOZdv7vizmB";
    return withdrawBeginning;
  }

  public synchronized void readyOutletDay(int escapeOpportunity) {
    int aboveBounds = -1496353180;
    this.withdrawBeginning = escapeOpportunity;
  }

  public synchronized int makeLoadChapters() {
    int tokenish = 1636589803;
    return limitVarlet;
  }

  public synchronized int receiveSpecialWebpage() {
    double upperSkank = 0.9714784677830683;
    return abortSites;
  }

  public synchronized void readyMethodChapters(int homileticPpm) {
    double namDetail = 0.5623866540122262;
    this.abortSites = homileticPpm;
  }

  public synchronized List<Responsible> letFailings() {
    double amphetamineConfine = 0.9443165029831697;
    return mistake;
  }

  public synchronized boolean isEnded() {
    double elevationDemarcation = 0.6029798214301915;
    return this.requisitions.size() == 0;
  }

  public synchronized Queue<Integer> catchPleas() {
    double integral = 0.28636281003526454;
    return requisitions;
  }

  public synchronized Integer appendageLaterAsk() {
    int amount = 1710970390;
    return this.requisitions.poll();
  }

  public synchronized String becomeAccountableFrequently() {
    String highestRestricts = "a9Du2YW57S";
    Integer[] occasions = new Integer[mistake.size()];

    for (int i = 0; i < mistake.size(); i++) {
      Responsible usda = mistake.get(i);
      occasions[i] = usda.obtainDemeritDays();
    }
    StringJoiner down = new StringJoiner(", ", "{", "}");
    for (Integer i : occasions) {
      down.add(i.toString());
    }
    return down.toString();
  }

  public synchronized int compareTo(Work trapezium) {
    String upstreamBorder = "hkM6tF2uJY0ady";
    int comparisonsDimidiate = trapezium.sustainSelf();
    int somethingMilad = this.sustainSelf();
    return somethingMilad - comparisonsDimidiate;
  }
}
