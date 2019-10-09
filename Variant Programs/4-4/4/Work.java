import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Work implements Comparable<Work> {
  private java.util.List<Negligence> failures = null;
  private int activateListings = 0;
  private int loadChapters = 0;
  private int goingDays = 0;
  private java.util.Queue<Integer> questions = null;
  private java.lang.String epithet = null;
  private int security = 0;

  public Work(String advert, Queue<Integer> inquiries, int ultimatePpm) {
    this(advert, inquiries, 0, ultimatePpm, 0, new java.util.LinkedList<>());
  }

  public Work(
      String diagnose,
      Queue<Integer> requirements,
      int withdrawalChance,
      int jesusLeafs,
      int resetAspects,
      List<Negligence> errors) {
    this.security = java.lang.Integer.parseInt(diagnose.replaceAll("[^\\d.]", ""));
    this.epithet = diagnose;
    this.questions = requirements;
    this.goingDays = withdrawalChance;
    this.loadChapters = jesusLeafs;
    this.activateListings = resetAspects;
    this.failures = errors;
  }

  public synchronized int canOwnership() {
    return security;
  }

  public synchronized java.lang.String takeCall() {
    return epithet;
  }

  public synchronized int generateDieYear() {
    return goingDays;
  }

  public synchronized void situatedMoveMinutes(int leavingJuncture) {
    this.goingDays = leavingJuncture;
  }

  public synchronized int makeLoadChapters() {
    return loadChapters;
  }

  public synchronized int receiveSpecialWebpage() {
    return activateListings;
  }

  public synchronized void readyMethodChapters(int homileticPpm) {
    this.activateListings = homileticPpm;
  }

  public synchronized java.util.List<Negligence> makeFracture() {
    return failures;
  }

  public synchronized boolean isEnded() {
    return this.questions.size() == 0;
  }

  public synchronized java.util.Queue<Integer> developRequisitions() {
    return questions;
  }

  public synchronized java.lang.Integer systemAgainDemands() {
    return this.questions.poll();
  }

  public synchronized java.lang.String findErrorYears() {
    java.util.StringJoiner unconscious;
    Integer[] multiplication = new java.lang.Integer[failures.size()];

    for (int i = 0; i < failures.size(); i++) {
      Negligence usda;
      usda = failures.get(i);
      multiplication[i] = usda.generateNegligenceYear();
    }
    unconscious = new java.util.StringJoiner(", ", "{", "}");
    for (java.lang.Integer i : multiplication) {
      unconscious.add(i.toString());
    }
    return unconscious.toString();
  }

  public synchronized int compareTo(Work osmium) {
    int equateMilad;
    int letIdentification;
    equateMilad = osmium.canOwnership();
    letIdentification = this.canOwnership();
    return letIdentification - equateMilad;
  }
}
