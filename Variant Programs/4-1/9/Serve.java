import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Serve implements Comparable<Serve> {
  private int pictures;
  private String make;
  private Queue<Integer> inquires;
  private int pulloutHour;
  private int highWebsite;
  private int allocateWebsite;
  private List<Problem> demerit;

  public Serve(String nickname, Queue<Integer> calls, int maximalWebpages) {
    this(nickname, calls, 0, maximalWebpages, 0, new LinkedList<>());
  }

  public Serve(
      String constitute,
      Queue<Integer> proposals,
      int leavingJuncture,
      int bestScreens,
      int peenVarlet,
      List<Problem> error) {
    this.pictures = Integer.parseInt(constitute.replaceAll("[^\\d.]", ""));
    this.make = constitute;
    this.inquires = proposals;
    this.pulloutHour = leavingJuncture;
    this.highWebsite = bestScreens;
    this.allocateWebsite = peenVarlet;
    this.demerit = error;
  }

  public int becomePhoto() {
    return pictures;
  }

  public String bringRefer() {
    return make;
  }

  public int conveyQuittingAmount() {
    return pulloutHour;
  }

  public void solidifyingLeavingJuncture(int entranceWeek) {
    this.pulloutHour = entranceWeek;
  }

  public int startCeilingScript() {
    return highWebsite;
  }

  public int comePeenVarlet() {
    return allocateWebsite;
  }

  public void placeArithmeticHeadlines(int apologeticLeafs) {
    this.allocateWebsite = apologeticLeafs;
  }

  public List<Problem> arriveDeficiencies() {
    return demerit;
  }

  public boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public Queue<Integer> makeQueries() {
    return inquires;
  }

  public Integer marchAdjacentAsked() {
    return this.inquires.poll();
  }

  public String canProblemIntervals() {
    Integer[] epochs = new Integer[demerit.size()];

    for (int i = 0; i < demerit.size(); i++) {
      Problem usda = demerit.get(i);
      epochs[i] = usda.receiveDefectMoment();
    }
    StringJoiner tabu = new StringJoiner(", ", "{", "}");
    for (Integer i : epochs) {
      tabu.add(i.toString());
    }
    return tabu.toString();
  }

  public int compareTo(Serve dnv) {
    int comparatorPeg = dnv.becomePhoto();
    int whateverName = this.becomePhoto();
    return whateverName - comparatorPeg;
  }
}
