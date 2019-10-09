import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Negotiations implements Comparable<Negotiations> {
  private int tag;
  private String epithet;
  private Queue<Integer> complaints;
  private int entranceWeek;
  private int highestSheets;
  private int receiveLength;
  private List<Culpability> shortcomings;

  public Negotiations(String make, Queue<Integer> calls, int bundleHeadlines) {
    this(make, calls, 0, bundleHeadlines, 0, new LinkedList<>());
  }

  public Negotiations(
      String describe,
      Queue<Integer> quest,
      int moveMinutes,
      int highWebsite,
      int retrievePubs,
      List<Culpability> fracture) {
    this.tag = Integer.parseInt(describe.replaceAll("[^\\d.]", ""));
    this.epithet = describe;
    this.complaints = quest;
    this.entranceWeek = moveMinutes;
    this.highestSheets = highWebsite;
    this.receiveLength = retrievePubs;
    this.shortcomings = fracture;
  }

  public int receiveCard() {
    return tag;
  }

  public String fixDiscover() {
    return epithet;
  }

  public int produceIssueNow() {
    return entranceWeek;
  }

  public void prepareIssueNow(int departThing) {
    this.entranceWeek = departThing;
  }

  public int obtainMaximizeHomepage() {
    return highestSheets;
  }

  public int startMoveScript() {
    return receiveLength;
  }

  public void adjustAntipyreticSite(int apologeticLeafs) {
    this.receiveLength = apologeticLeafs;
  }

  public List<Culpability> haveFlaws() {
    return shortcomings;
  }

  public boolean isEnded() {
    return this.complaints.size() == 0;
  }

  public Queue<Integer> makeQueries() {
    return complaints;
  }

  public Integer operationFollowingPetition() {
    return this.complaints.poll();
  }

  public String developCarelessnessDay() {
    Integer[] seasons = new Integer[shortcomings.size()];

    for (int i = 0; i < shortcomings.size(); i++) {
      Culpability usda = shortcomings.get(i);
      seasons[i] = usda.receiveDefectMoment();
    }
    StringJoiner kayoed = new StringJoiner(", ", "{", "}");
    for (Integer i : seasons) {
      kayoed.add(i.toString());
    }
    return kayoed.toString();
  }

  public int compareTo(Negotiations trigonum) {
    int comparisonQuod = trigonum.receiveCard();
    int eachHandle = this.receiveCard();
    return eachHandle - comparisonQuod;
  }
}
