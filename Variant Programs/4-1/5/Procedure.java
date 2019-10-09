import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Procedure implements Comparable<Procedure> {
  private int nerfling;
  private String list;
  private Queue<Integer> inquires;
  private int deceaseHours;
  private int maximumPageboy;
  private int eprPageboy;
  private List<Glitch> fracture;

  public Procedure(String key, Queue<Integer> petition, int fullSections) {
    this(key, petition, 0, fullSections, 0, new LinkedList<>());
  }

  public Procedure(
      String describe,
      Queue<Integer> applications,
      int withdrawalChance,
      int limitVarlet,
      int arithmeticHeadlines,
      List<Glitch> mistakes) {
    this.nerfling = Integer.parseInt(describe.replaceAll("[^\\d.]", ""));
    this.list = describe;
    this.inquires = applications;
    this.deceaseHours = withdrawalChance;
    this.maximumPageboy = limitVarlet;
    this.eprPageboy = arithmeticHeadlines;
    this.fracture = mistakes;
  }

  public int becomePhoto() {
    return nerfling;
  }

  public String drawGens() {
    return list;
  }

  public int developPulloutHour() {
    return deceaseHours;
  }

  public void adjustPerishMonth(int exodusAgain) {
    this.deceaseHours = exodusAgain;
  }

  public int sustainMarxPubs() {
    return maximumPageboy;
  }

  public int receiveSpecialWebpage() {
    return eprPageboy;
  }

  public void fixRetrievePubs(int specialWebpage) {
    this.eprPageboy = specialWebpage;
  }

  public List<Glitch> produceFailures() {
    return fracture;
  }

  public boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public Queue<Integer> haveDemands() {
    return inquires;
  }

  public Integer sueUpcomingApplication() {
    return this.inquires.poll();
  }

  public String canProblemIntervals() {
    Integer[] instances = new Integer[fracture.size()];

    for (int i = 0; i < fracture.size(); i++) {
      Glitch usda = fracture.get(i);
      instances[i] = usda.makeFractureDay();
    }
    StringJoiner tabu = new StringJoiner(", ", "{", "}");
    for (Integer i : instances) {
      tabu.add(i.toString());
    }
    return tabu.toString();
  }

  public int compareTo(Procedure hamatum) {
    int equivalenceCard = hamatum.becomePhoto();
    int exactlyEst = this.becomePhoto();
    return exactlyEst - equivalenceCard;
  }
}
