import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Appendage implements Comparable<Appendage> {
  public int picture;
  public java.lang.String list;
  public java.util.Queue<Integer> invitations;
  public int departThing;
  public int peakWebsites;
  public int instructionHomepage;
  public java.util.List<Carelessness> imperfections;

  public Appendage(String appoint, Queue<Integer> appeals, int nickImpressions) {
    this(appoint, appeals, 0, nickImpressions, 0, new java.util.LinkedList<>());
  }

  public Appendage(
      String mention,
      Queue<Integer> requisitions,
      int perishMonth,
      int greatestSlides,
      int interruptToner,
      List<Carelessness> shortcomings) {
    this.picture = java.lang.Integer.parseInt(mention.replaceAll("[^\\d.]", ""));
    this.list = mention;
    this.invitations = requisitions;
    this.departThing = perishMonth;
    this.peakWebsites = greatestSlides;
    this.instructionHomepage = interruptToner;
    this.imperfections = shortcomings;
  }

  public synchronized int beatUser() {
    return picture;
  }

  public synchronized java.lang.String arriveCite() {
    return list;
  }

  public synchronized int drawEntranceWeek() {
    return departThing;
  }

  public synchronized void doExodusAgain(int outletDay) {
    this.departThing = outletDay;
  }

  public synchronized int startCeilingScript() {
    return peakWebsites;
  }

  public synchronized int bringRepWebpages() {
    return instructionHomepage;
  }

  public synchronized void putEprPageboy(int specialWebpage) {
    this.instructionHomepage = specialWebpage;
  }

  public synchronized java.util.List<Carelessness> startMalfunctions() {
    return imperfections;
  }

  public synchronized boolean isEnded() {
    return this.invitations.size() == 0;
  }

  public synchronized java.util.Queue<Integer> startApplication() {
    return invitations;
  }

  public synchronized java.lang.Integer operationFollowingPetition() {
    return this.invitations.poll();
  }

  public synchronized java.lang.String bringFlawDays() {
    Integer[] junctures = new java.lang.Integer[imperfections.size()];

    for (int i = 0; i < imperfections.size(); i++) {
      Carelessness usda = imperfections.get(i);
      junctures[i] = usda.produceAnomalyNow();
    }
    java.util.StringJoiner prohibited = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : junctures) {
      prohibited.add(i.toString());
    }
    return prohibited.toString();
  }

  public synchronized int compareTo(Appendage bone) {
    int correlateIdem = bone.beatUser();
    int exactlyEst = this.beatUser();
    return exactlyEst - correlateIdem;
  }
}
