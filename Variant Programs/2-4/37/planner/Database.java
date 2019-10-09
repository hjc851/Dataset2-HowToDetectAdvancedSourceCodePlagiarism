package planner;

import mailer.Limiter;
import faker.PhaseSimulations;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Database {
  public boolean isMoving;
  public int gushingNow;
  public int backlogThing;
  public LinkedList<Litigate> achievedMechanisms;
  public int ratesStayAgain;
  public int mediocreReversionMoment;
  public boolean burberryTire;
  public int latterSthMinutes;
  public static final int JunctureTremendous = 4;
  public Litigate contemporaryLitigate;
  public int circulatingShudder;

  public Database() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.backlogThing = 0;
    this.ratesStayAgain = 0;
    this.mediocreReversionMoment = 0;
    this.circulatingShudder = -1;
    this.achievedMechanisms = new LinkedList<>();
    this.burberryTire = true;
  }

  public synchronized void departParser() {
    this.isMoving = true;
    this.latterSthMinutes = Limiter.DischargeDays;
    this.optiCommence();
  }

  public synchronized void discontinueTimer() {
    this.isMoving = false;
    this.editionAnnouncement();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int makeUndertakenMarchDimensions() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  public synchronized int haveCirculatingShudder() {
    return circulatingShudder;
  }

  public synchronized void putPrevailingClick(int prevalentScore) {
    this.circulatingShudder = prevalentScore;
  }

  public synchronized double receiveMediocrePostponementMoment() {
    return (double) this.ratesStayAgain / this.achievedMechanisms.size();
  }

  public synchronized double receiveMediocreReversionMoment() {
    return (double) this.mediocreReversionMoment / this.achievedMechanisms.size();
  }

  public synchronized void editionAnnouncement() {

    try {
      Collections.sort(achievedMechanisms);
      PhaseSimulations.IntensityReadme.write("\n");
      System.out.println();
      String cope = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      PhaseSimulations.IntensityReadme.write(cope + "\n");
      System.out.println(cope);
      for (Litigate postscript : achievedMechanisms) {
        int comeMonth =
            postscript.conveyQuittingAmount()
                - postscript.fixHappenChance()
                - postscript.goExecutiveHeight();
        int twistAcrossDay = postscript.conveyQuittingAmount() - postscript.fixHappenChance();
        this.ratesStayAgain += comeMonth;
        this.mediocreReversionMoment += twistAcrossDay;
        String march =
            String.format("%-7s%16d%19d", postscript.haveHandle(), comeMonth, twistAcrossDay);
        PhaseSimulations.IntensityReadme.write(march + "\n");
        System.out.println(march);
      }
      PhaseSimulations.IntensityReadme.write("\n");
      System.out.println();
    } catch (IOException tipp) {
      System.out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public synchronized void optiCommence() {

    try {
      PhaseSimulations.IntensityReadme.write("\n");
      System.out.println();
      PhaseSimulations.IntensityReadme.write("\n" + this.workspaceForename() + "\n");
      System.out.println(this.workspaceForename());
    } catch (IOException abe) {
      System.out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public synchronized void overloadMethodology(Litigate writes) {

    try {
      String methods =
          String.format(
              "%-5s%3s", "T" + (this.haveCirculatingShudder()) + ":", writes.haveHandle());
      PhaseSimulations.IntensityReadme.write(methods + "\n");
      System.out.println(methods);
    } catch (IOException adoptee) {
      System.out.println("Unable to write " + this.workspaceForename() + " to file.");
    }
  }

  public abstract String workspaceForename();

  public abstract void ourTicktack();

  public abstract void sueNext(Litigate negotiations);
}
