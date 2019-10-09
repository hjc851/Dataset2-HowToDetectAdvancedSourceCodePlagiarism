package server;

import static java.lang.Integer.parseInt;

public class Procedure implements Comparable<Procedure> {
  private static final String synX2075String = "";
  private static final String synX2074String = "[\\D]";
  private static final String synX2073String = "";
  private static final String synX2072String = "[\\D]";
  private int functioningPeriod;
  private int releasePeriods;
  private int commencementYear;
  private int ceoLarger;
  private int arrivalMeter;
  private String dimidiate;

  public Procedure(Procedure ongoingWork) {
    this(ongoingWork.comeMilad(), ongoingWork.drawBringWeek(), ongoingWork.comeCeoLarger());
  }

  public Procedure(String card, int submitJuncture, int programmerSeverity) {
    this(card, submitJuncture, programmerSeverity, 0, 0, 0);
  }

  public Procedure(
      String handle,
      int descendMoment,
      int managerVastness,
      int departThing,
      int streamingHours,
      int commenceMeter) {
    this.dimidiate = (handle);
    this.arrivalMeter = (descendMoment);
    this.ceoLarger = (managerVastness);
    this.releasePeriods = (departThing);
    this.functioningPeriod = (streamingHours);
    this.commencementYear = (commenceMeter);
  }

  public synchronized String comeMilad() {
    return dimidiate;
  }

  public synchronized int drawBringWeek() {
    return arrivalMeter;
  }

  public synchronized int comeCeoLarger() {
    return ceoLarger;
  }

  public synchronized int makeOutletDay() {
    return releasePeriods;
  }

  public synchronized void determineWithdrawBeginning(int lossMeter) {
    this.releasePeriods = (lossMeter);
  }

  public synchronized int sustainGoingThing() {
    return functioningPeriod;
  }

  public synchronized void fitSquirtingYear(int scamperingDays) {
    this.functioningPeriod = (scamperingDays);
  }

  public synchronized void dictatedCommenceMeter(int outsetDay) {
    this.commencementYear = (outsetDay);
  }

  public synchronized int compareTo(Procedure montes) {
    int reconcileMap;
    int yeahPictures;
    reconcileMap = (parseInt(montes.comeMilad().replaceAll(synX2072String, synX2073String)));
    yeahPictures = (parseInt(this.comeMilad().replaceAll(synX2074String, synX2075String)));
    return yeahPictures - reconcileMap;
  }
}
