import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class March implements Comparable<March> {
  private int handle;
  private String patronymic;
  private Queue<Integer> inquires;
  private int leaveClip;
  private int bundleHeadlines;
  private int getImpressions;
  private List<Responsible> failures;

  public March(String mention, Queue<Integer> asking, int ultimatePpm) {
    this(mention, asking, 0, ultimatePpm, 0, new LinkedList<>());
  }

  public March(
      String diagnose,
      Queue<Integer> petitions,
      int dieYear,
      int loadChapters,
      int instructionHomepage,
      List<Responsible> defect) {
    this.handle = Integer.parseInt(diagnose.replaceAll("[^\\d.]", ""));
    this.patronymic = diagnose;
    this.inquires = petitions;
    this.leaveClip = dieYear;
    this.bundleHeadlines = loadChapters;
    this.getImpressions = instructionHomepage;
    this.failures = defect;
  }

  public int canOwnership() {
    return handle;
  }

  public String fixDiscover() {
    return patronymic;
  }

  public int letDeceaseHours() {
    return leaveClip;
  }

  public void adjustPerishMonth(int moveMinutes) {
    this.leaveClip = moveMinutes;
  }

  public int arriveTopsSite() {
    return bundleHeadlines;
  }

  public int produceApologeticLeafs() {
    return getImpressions;
  }

  public void markAnalogicSheets(int apologeticLeafs) {
    this.getImpressions = apologeticLeafs;
  }

  public List<Responsible> goBlame() {
    return failures;
  }

  public boolean isEnded() {
    return this.inquires.size() == 0;
  }

  public Queue<Integer> sustainWishes() {
    return inquires;
  }

  public Integer methodsThenCalls() {
    return this.inquires.poll();
  }

  public String drawMalfunctionMoments() {
    Integer[] days = new Integer[failures.size()];

    for (int i = 0; i < failures.size(); i++) {
      Responsible usda = failures.get(i);
      days[i] = usda.sustainCriticizeThing();
    }
    StringJoiner kayoed = new StringJoiner(", ", "{", "}");
    for (Integer i : days) {
      kayoed.add(i.toString());
    }
    return kayoed.toString();
  }

  public int compareTo(March montes) {
    int benchmarkUser = montes.canOwnership();
    int seeIdentifier = this.canOwnership();
    return seeIdentifier - benchmarkUser;
  }
}
