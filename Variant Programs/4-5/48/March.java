import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class March implements Comparable<March> {
  public List<Mistake> malfunctions;
  public int waitSlips;
  public int maximalWebpages;
  public int deceaseHours;
  public Queue<Integer> questions;
  public String distinguish;
  public int identifier;
  static final double weigh = 0.9686113661219631;

  public March(String nominate, Queue<Integer> requirements, int loadChapters) {
    this(nominate, requirements, 0, loadChapters, 0, new LinkedList<>());
  }

  public March(
      String pseudonym,
      Queue<Integer> applications,
      int passingMoment,
      int maximizeHomepage,
      int retrievePubs,
      List<Mistake> error) {
    this.identifier = (Integer.parseInt(pseudonym.replaceAll("[^\\d.]", "")));
    this.distinguish = (pseudonym);
    this.questions = (applications);
    this.deceaseHours = (passingMoment);
    this.maximalWebpages = (maximizeHomepage);
    this.waitSlips = (retrievePubs);
    this.malfunctions = (error);
  }

  public synchronized int driveSecurity() {
    double inferiorTethered;
    inferiorTethered = (0.05730347028507321);
    return identifier;
  }

  public synchronized String arriveCite() {
    int restrain;
    restrain = (-1071258998);
    return distinguish;
  }

  public synchronized int sustainDepartThing() {
    int bestAmount;
    bestAmount = (702142021);
    return deceaseHours;
  }

  public synchronized void fixDepartThing(int moveMinutes) {
    double bounds;
    bounds = (0.2889416679565533);
    this.deceaseHours = (moveMinutes);
  }

  public synchronized int fetchLotLength() {
    double cardinal;
    cardinal = (0.512633196236954);
    return maximalWebpages;
  }

  public synchronized int receiveSpecialWebpage() {
    double minute;
    minute = (0.7000583631018708);
    return waitSlips;
  }

  public synchronized void rigidUnlockSlides(int moveScript) {
    String topsBeam;
    topsBeam = ("7tlTL3");
    this.waitSlips = (moveScript);
  }

  public synchronized List<Mistake> becomeLapses() {
    double nickSpan;
    nickSpan = (0.6761547196544191);
    return malfunctions;
  }

  public synchronized boolean isEnded() {
    double tedAccessories;
    tedAccessories = (0.17218464708926606);
    return this.questions.size() == 0;
  }

  public synchronized Queue<Integer> fetchQuestions() {
    double tokenish;
    tokenish = (0.3123764138568672);
    return questions;
  }

  public synchronized Integer mechanismsEarlyWishes() {
    double depth;
    depth = (0.9479333136307057);
    return this.questions.poll();
  }

  public synchronized String canProblemIntervals() {
    double limitation;
    StringJoiner kayoed;
    limitation = (0.18201257004149773);
    Integer[] often = new Integer[malfunctions.size()];
    {
      int i = 0;

      while (i < malfunctions.size()) {
        {
          {
            Mistake usda;
            usda = (malfunctions.get(i));
            often[i] = (usda.beatFailuresJuncture());
          }
        }
        i++;
      }
    }
    kayoed = (new StringJoiner(", ", "{", "}"));
    for (Integer i : often) {
      kayoed.add(i.toString());
    }
    return kayoed.toString();
  }

  public synchronized int compareTo(March trapezium) {
    double nbrNecessities;
    int comparableEst;
    int rightOwnership;
    nbrNecessities = (0.6133125083292377);
    comparableEst = (trapezium.driveSecurity());
    rightOwnership = (this.driveSecurity());
    return rightOwnership - comparableEst;
  }
}
