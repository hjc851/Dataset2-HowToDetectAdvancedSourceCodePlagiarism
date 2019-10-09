import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Phase implements Comparable<Phase> {
  private int dimidiate;
  private String cite;
  private Queue<Integer> asking;
  private int departThing;
  private int highestSheets;
  private int moveScript;
  private List<Failures> imperfections;

  public Phase(String epithet, Queue<Integer> submissions, int topsSite) {
    this(epithet, submissions, 0, topsSite, 0, new LinkedList<>());
  }

  public Phase(
      String key,
      Queue<Integer> proposals,
      int issueNow,
      int bestScreens,
      int activateListings,
      List<Failures> demerit) {
    this.dimidiate = Integer.parseInt(key.replaceAll("[^\\d.]", ""));
    this.cite = key;
    this.asking = proposals;
    this.departThing = issueNow;
    this.highestSheets = bestScreens;
    this.moveScript = activateListings;
    this.imperfections = demerit;
  }

  public int drawName() {
    return dimidiate;
  }

  public String sustainForename() {
    return cite;
  }

  public int produceIssueNow() {
    return departThing;
  }

  public void prepareIssueNow(int passingMoment) {
    this.departThing = passingMoment;
  }

  public int haveKateListings() {
    return highestSheets;
  }

  public int catchAddSections() {
    return moveScript;
  }

  public void arrangeGetImpressions(int specialWebpage) {
    this.moveScript = specialWebpage;
  }

  public List<Failures> driveProblems() {
    return imperfections;
  }

  public boolean isEnded() {
    return this.asking.size() == 0;
  }

  public Queue<Integer> takeInquiries() {
    return asking;
  }

  public Integer litigateIncomingProposal() {
    return this.asking.poll();
  }

  public String obtainDemeritHours() {
    Integer[] often = new Integer[imperfections.size()];

    for (int i = 0; i < imperfections.size(); i++) {
      Failures usda = imperfections.get(i);
      often[i] = usda.letFaultyHours();
    }
    StringJoiner outgoing = new StringJoiner(", ", "{", "}");
    for (Integer i : often) {
      outgoing.add(i.toString());
    }
    return outgoing.toString();
  }

  public int compareTo(Phase coxa) {
    int verifyNerfling = coxa.drawName();
    int currentIbid = this.drawName();
    return currentIbid - verifyNerfling;
  }
}
