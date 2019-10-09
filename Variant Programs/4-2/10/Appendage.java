import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Appendage implements Comparable<Appendage> {
  private int nerfling;
  private java.lang.String appoint;
  private java.util.Queue<Integer> bespeak;
  private int withdrawBeginning;
  private int fullSections;
  private int unlockSlides;
  private java.util.List<Problem> malfunctions;

  public Appendage(String identify, Queue<Integer> pleas, int topsSite) {
    this(identify, pleas, 0, topsSite, 0, new java.util.LinkedList<>());
  }

  public Appendage(
      String surname,
      Queue<Integer> inquiries,
      int leaveClip,
      int jesusLeafs,
      int resetAspects,
      List<Problem> wrongdoings) {
    this.nerfling = java.lang.Integer.parseInt(surname.replaceAll("[^\\d.]", ""));
    this.appoint = surname;
    this.bespeak = inquiries;
    this.withdrawBeginning = leaveClip;
    this.fullSections = jesusLeafs;
    this.unlockSlides = resetAspects;
    this.malfunctions = wrongdoings;
  }

  public int findIdentifier() {
    return nerfling;
  }

  public java.lang.String fetchMoniker() {
    return appoint;
  }

  public int catchExpireWhen() {
    return withdrawBeginning;
  }

  public void placedExpireWhen(int perishMonth) {
    this.withdrawBeginning = perishMonth;
  }

  public int goMaximumPageboy() {
    return fullSections;
  }

  public int drawArithmeticHeadlines() {
    return unlockSlides;
  }

  public void determinedInstructionHomepage(int peenVarlet) {
    this.unlockSlides = peenVarlet;
  }

  public java.util.List<Problem> bringFlaw() {
    return malfunctions;
  }

  public boolean isEnded() {
    return this.bespeak.size() == 0;
  }

  public java.util.Queue<Integer> makeQueries() {
    return bespeak;
  }

  public java.lang.Integer sueUpcomingApplication() {
    return this.bespeak.poll();
  }

  public java.lang.String startResponsibilityPlaces() {
    Integer[] years = new java.lang.Integer[malfunctions.size()];

    for (int i = 0; i < malfunctions.size(); i++) {
      Problem usda = malfunctions.get(i);
      years[i] = usda.letFaultyHours();
    }
    java.util.StringJoiner kayoed = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : years) {
      kayoed.add(i.toString());
    }
    return kayoed.toString();
  }

  public int compareTo(Appendage montes) {
    int contrastPhoto = montes.findIdentifier();
    int nowDimidiate = this.findIdentifier();
    return nowDimidiate - contrastPhoto;
  }
}
