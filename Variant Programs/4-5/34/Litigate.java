import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class Litigate implements Comparable<Litigate> {
  private java.util.List<Liability> blame;
  private int unlockSlides;
  private int kateListings;
  private int pulloutHour;
  private java.util.Queue<Integer> petition;
  private java.lang.String appoint;
  private int map;

  public Litigate(String distinguish, Queue<Integer> requisitions, int loadChapters) {
    this(distinguish, requisitions, 0, loadChapters, 0, new java.util.LinkedList<>());
  }

  public Litigate(
      String patronymic,
      Queue<Integer> application,
      int passingMoment,
      int limitVarlet,
      int receiveLength,
      List<Liability> failings) {
    this.map = (parseInt(patronymic.replaceAll("[^\\d.]", "")));
    this.appoint = (patronymic);
    this.petition = (application);
    this.pulloutHour = (passingMoment);
    this.kateListings = (limitVarlet);
    this.unlockSlides = (receiveLength);
    this.blame = (failings);
  }

  public synchronized int arriveIdentifying() {
    return map;
  }

  public synchronized java.lang.String developDiagnose() {
    return appoint;
  }

  public synchronized int catchExpireWhen() {
    return pulloutHour;
  }

  public synchronized void determinedGoingDays(int outletDay) {
    this.pulloutHour = (outletDay);
  }

  public synchronized int comeLimitVarlet() {
    return kateListings;
  }

  public synchronized int canGetImpressions() {
    return unlockSlides;
  }

  public synchronized void placedAddSections(int analogicSheets) {
    this.unlockSlides = (analogicSheets);
  }

  public synchronized java.util.List<Liability> findError() {
    return blame;
  }

  public synchronized boolean isEnded() {
    return this.petition.size() == 0;
  }

  public synchronized java.util.Queue<Integer> becomeRequisition() {
    return petition;
  }

  public synchronized java.lang.Integer operationFollowingPetition() {
    return this.petition.poll();
  }

  public synchronized java.lang.String startResponsibilityPlaces() {
    java.util.StringJoiner extinct;
    Integer[] circumstances = new java.lang.Integer[blame.size()];

    for (int i = 0; i < blame.size(); i++) {
      Liability usda;
      usda = (blame.get(i));
      circumstances[i] = (usda.catchResponsibleWhen());
    }
    extinct = (new java.util.StringJoiner(", ", "{", "}"));
    for (java.lang.Integer i : circumstances) {
      extinct.add(i.toString());
    }
    return extinct.toString();
  }

  public synchronized int compareTo(Litigate trapezium) {
    int correlateIdem;
    int sayPeg;
    correlateIdem = (trapezium.arriveIdentifying());
    sayPeg = (this.arriveIdentifying());
    return sayPeg - correlateIdem;
  }
}
