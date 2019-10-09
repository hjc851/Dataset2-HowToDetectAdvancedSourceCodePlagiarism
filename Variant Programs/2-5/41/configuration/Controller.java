package configuration;

import responsible.Plenum;
import simulated.SystemSim;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Controller {
  public boolean isMoving = false;
  public int functioningPeriod = 0;
  public int backlogThing = 0;
  public java.util.LinkedList<Proceedings> executedMethods = null;
  public int fairPostponeYear = 0;
  public int commonRevivalWhen = 0;
  public boolean burberryTire = false;
  public int stayLtsHour = 0;
  public static final int MomentAmounts = 4;
  public configuration.Proceedings topicalAppendage = null;
  public int ongoingBeat = 0;

  public Controller() {
    this.isMoving = (false);
    this.functioningPeriod = (0);
    this.backlogThing = (0);
    this.fairPostponeYear = (0);
    this.commonRevivalWhen = (0);
    this.ongoingBeat = (-1);
    this.executedMethods = (new java.util.LinkedList<>());
    this.burberryTire = (true);
  }

  public synchronized void getInterface() {
    this.isMoving = (true);
    this.stayLtsHour = (Plenum.SentYears);
    this.addOutset();
  }

  public synchronized void quitProgramming() {
    this.isMoving = (false);
    this.editionAnnouncement();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int letImplementedSummonsSmallness() {

    if (executedMethods.isEmpty()) {
      return 0;
    } else {
      return executedMethods.size();
    }
  }

  public synchronized int sustainThisValidation() {
    return ongoingBeat;
  }

  public synchronized void situatedPresentlyMarch(int underwayWalk) {
    this.ongoingBeat = (underwayWalk);
  }

  public synchronized double beatHalfNotJuncture() {
    return (double) this.fairPostponeYear / this.executedMethods.size();
  }

  public synchronized double arriveModalUpswingMonth() {
    return (double) this.commonRevivalWhen / this.executedMethods.size();
  }

  public synchronized void editionAnnouncement() {

    try {
      sort(executedMethods);
      SystemSim.IntensityReadme.write("\n");
      out.println();
      java.lang.String head = format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SystemSim.IntensityReadme.write(head + "\n");
      out.println(head);
      for (configuration.Proceedings cern : executedMethods) {
        int letMinutes =
            (cern.drawEntranceWeek() - cern.findDisembarkSentence() - cern.fixCfoProportions());
        int convertSomeMeter = cern.drawEntranceWeek() - cern.findDisembarkSentence();
        this.fairPostponeYear += (this.fairPostponeYear + letMinutes);
        this.commonRevivalWhen += (this.commonRevivalWhen + convertSomeMeter);
        java.lang.String sue =
            format("%-7s%16d%19d", cern.becomePhoto(), letMinutes, convertSomeMeter);
        SystemSim.IntensityReadme.write(sue + "\n");
        out.println(sue);
      }
      SystemSim.IntensityReadme.write("\n");
      out.println();
    } catch (java.io.IOException adrian) {
      out.println(("Unable to write " + this.spreadsheetKey() + " to file."));
    }
  }

  public synchronized void addOutset() {

    try {
      SystemSim.IntensityReadme.write("\n");
      out.println();
      SystemSim.IntensityReadme.write(("\n" + this.spreadsheetKey() + "\n"));
      out.println(this.spreadsheetKey());
    } catch (java.io.IOException late) {
      out.println(("Unable to write " + this.spreadsheetKey() + " to file."));
    }
  }

  public synchronized void stowLitigate(configuration.Proceedings vig) {

    try {
      java.lang.String outgrowth =
          format("%-5s%3s", ("T" + (this.sustainThisValidation()) + ":"), vig.becomePhoto());
      SystemSim.IntensityReadme.write(outgrowth + "\n");
      out.println(outgrowth);
    } catch (java.io.IOException appointed) {
      out.println(("Unable to write " + this.spreadsheetKey() + " to file."));
    }
  }

  public abstract java.lang.String spreadsheetKey();

  public abstract void ourTicktack();

  public abstract void mechanismArrivals(configuration.Proceedings mechanisms);
}
