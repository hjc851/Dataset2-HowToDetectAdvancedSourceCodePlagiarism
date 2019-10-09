import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class March implements Comparable<March> {
  private int est;
  private String refer;
  private Queue<Integer> requisitions;
  private int departThing;
  private int bundleHeadlines;
  private int apologeticLeafs;
  private List<Error> deficiencies;

  public March(String moniker, Queue<Integer> requirements, int fullSections) {
    this(moniker, requirements, 0, fullSections, 0, new LinkedList<>());
  }

  public March(
      String distinguish,
      Queue<Integer> demands,
      int entranceWeek,
      int highestSheets,
      int getImpressions,
      List<Error> failings) {
    this.est = Integer.parseInt(distinguish.replaceAll("[^\\d.]", ""));
    this.refer = distinguish;
    this.requisitions = demands;
    this.departThing = entranceWeek;
    this.bundleHeadlines = highestSheets;
    this.apologeticLeafs = getImpressions;
    this.deficiencies = failings;
  }

  public int driveSecurity() {
    return est;
  }

  public String haveFigure() {
    return refer;
  }

  public int bringLossMeter() {
    return departThing;
  }

  public void situatedMoveMinutes(int withdrawalChance) {
    this.departThing = withdrawalChance;
  }

  public int takePremiumSites() {
    return bundleHeadlines;
  }

  public int makeMethodChapters() {
    return apologeticLeafs;
  }

  public void adjustAntipyreticSite(int addSections) {
    this.apologeticLeafs = addSections;
  }

  public List<Error> findError() {
    return deficiencies;
  }

  public boolean isEnded() {
    return this.requisitions.size() == 0;
  }

  public Queue<Integer> arriveInvitations() {
    return requisitions;
  }

  public Integer proceduresExpectedMotion() {
    return this.requisitions.poll();
  }

  public String beatFailuresCircumstances() {
    Integer[] circumstances = new Integer[deficiencies.size()];

    for (int i = 0; i < deficiencies.size(); i++) {
      Error usda = deficiencies.get(i);
      circumstances[i] = usda.letFaultyHours();
    }
    StringJoiner extinct = new StringJoiner(", ", "{", "}");
    for (Integer i : circumstances) {
      extinct.add(i.toString());
    }
    return extinct.toString();
  }

  public int compareTo(March trigonum) {
    int comparisonQuod = trigonum.driveSecurity();
    int thereforeMap = this.driveSecurity();
    return thereforeMap - comparisonQuod;
  }
}
