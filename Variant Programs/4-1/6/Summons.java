import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Summons implements Comparable<Summons> {
  private int pictures;
  private String cite;
  private Queue<Integer> petition;
  private int outletDay;
  private int bundleHeadlines;
  private int addSections;
  private List<Culpability> mistakes;

  public Summons(String advert, Queue<Integer> pleas, int nickImpressions) {
    this(advert, pleas, 0, nickImpressions, 0, new LinkedList<>());
  }

  public Summons(
      String nickname,
      Queue<Integer> complaints,
      int issueNow,
      int mattAspects,
      int moveScript,
      List<Culpability> imperfections) {
    this.pictures = Integer.parseInt(nickname.replaceAll("[^\\d.]", ""));
    this.cite = nickname;
    this.petition = complaints;
    this.outletDay = issueNow;
    this.bundleHeadlines = mattAspects;
    this.addSections = moveScript;
    this.mistakes = imperfections;
  }

  public int startPicture() {
    return pictures;
  }

  public String haveFigure() {
    return cite;
  }

  public int developPulloutHour() {
    return outletDay;
  }

  public void markDeceaseHours(int departThing) {
    this.outletDay = departThing;
  }

  public int letHighestSheets() {
    return bundleHeadlines;
  }

  public int letAnalogicSheets() {
    return addSections;
  }

  public void orderedDidacticScreens(int allocateWebsite) {
    this.addSections = allocateWebsite;
  }

  public List<Culpability> bringFlaw() {
    return mistakes;
  }

  public boolean isEnded() {
    return this.petition.size() == 0;
  }

  public Queue<Integer> haveDemands() {
    return petition;
  }

  public Integer marchAdjacentAsked() {
    return this.petition.poll();
  }

  public String generateNegligenceSituations() {
    Integer[] often = new Integer[mistakes.size()];

    for (int i = 0; i < mistakes.size(); i++) {
      Culpability usda = mistakes.get(i);
      often[i] = usda.catchResponsibleWhen();
    }
    StringJoiner unstylish = new StringJoiner(", ", "{", "}");
    for (Integer i : often) {
      unstylish.add(i.toString());
    }
    return unstylish.toString();
  }

  public int compareTo(Summons pubis) {
    int contrastPhoto = pubis.startPicture();
    int thenSecurity = this.startPicture();
    return thenSecurity - contrastPhoto;
  }
}
