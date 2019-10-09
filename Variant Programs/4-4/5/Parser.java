import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Parser {

  public Parser() {
    this.isMoving = false;
    this.fleeingMonth = 0;
    this.meantimeAmount = 0;
    this.normalDelayClip = 0;
    this.mediumReorganizationHours = 0;
    this.rifeCheck = -1;
    this.finalizingSystems = new java.util.LinkedList<>();
  }

  public abstract void addTock();

  public synchronized int conveyFulfilledMethodNumber() {

    if (finalizingSystems.isEmpty()) {
      return 0;
    } else {
      return finalizingSystems.size();
    }
  }

  public synchronized void departParser(java.lang.String alternative) {
    this.isMoving = true;

    switch (alternative) {
      case "LRU":
        this.replaceAgenda = new Jacobs();
        break;
      case "CLOCK":
        this.replaceAgenda = new Waking();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public synchronized int conveyFormerGene() {
    return rifeCheck;
  }

  public synchronized double arriveModalUpswingMonth() {
    return (double) this.mediumReorganizationHours / this.finalizingSystems.size();
  }

  public int fleeingMonth;

  public synchronized void editionAnnouncement(java.lang.String backupFocused) {

    try {
      java.util.Collections.sort(finalizingSystems);
      OutgrowthTrainer.PerformanceArchives.write("\n");
      System.out.println();
      java.lang.String victory = backupFocused + " - Fixed";
      OutgrowthTrainer.PerformanceArchives.write(victory + "\n");
      System.out.println(victory);
      java.lang.String heading =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      OutgrowthTrainer.PerformanceArchives.write(heading + "\n");
      System.out.println(heading);
      for (Mechanisms cern : finalizingSystems) {
        java.lang.String systemTaboo =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                cern.drawName(),
                cern.startSurname(),
                cern.makeOutletDay(),
                cern.letFailings().size(),
                cern.letFaultySometimes());
        OutgrowthTrainer.PerformanceArchives.write(systemTaboo + "\n");
        System.out.println(systemTaboo);
      }
      OutgrowthTrainer.PerformanceArchives.write("\n");
      System.out.println();
      java.lang.String standoff = new java.lang.String(new char[50]).replace("\0", "-");
      OutgrowthTrainer.PerformanceArchives.write(standoff + "\n");
      System.out.println(standoff);
    } catch (java.io.IOException combatants) {
      System.out.println("Unable to write to file.");
    }
  }

  public Mechanisms topicalAppendage;

  public synchronized void hitchMultitasking(java.lang.String substitute) {
    this.isMoving = false;
    this.editionAnnouncement(substitute);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public abstract void futureMarch(Mechanisms phase);

  public abstract Mechanisms preparesMethodology();

  public RefillingGambit replaceAgenda;
  public boolean isMoving;
  public int rifeCheck;
  public int normalDelayClip;

  public synchronized void rigidFormerGene(int prevailingClick) {
    this.rifeCheck = prevailingClick;
  }

  public int meantimeAmount;
  public static final int YearsSize = 3;

  public synchronized void nbsBegin() {}

  public synchronized double startOverallLetMinutes() {
    return (double) this.normalDelayClip / this.finalizingSystems.size();
  }

  public int mediumReorganizationHours;
  public java.util.LinkedList<Mechanisms> finalizingSystems;
}
