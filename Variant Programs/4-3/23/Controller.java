import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Controller {
  public int formerGene;

  public synchronized double developTypicalAwaitedHour() {
    return (double) this.halfNotJuncture / this.undertakenMarch.size();
  }

  public March actualAct;

  public synchronized double haveModerateResurgencePeriods() {
    return (double) this.middlingTurnaboutMeter / this.undertakenMarch.size();
  }

  public abstract void nbsClick();

  public synchronized void resumeServer(String alternate) {
    this.isMoving = true;

    switch (alternate) {
      case "LRU":
        this.substituteStrategic = new Uconn();
        break;
      case "CLOCK":
        this.substituteStrategic = new Tach();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  public static final int WeekVolume = 3;

  public synchronized void quitProgramming(String replaces) {
    this.isMoving = false;
    this.reprintTheme(replaces);
  }

  public int halfNotJuncture;

  public synchronized int obtainLiveTic() {
    return formerGene;
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public Controller() {
    this.isMoving = false;
    this.continualOpportunity = 0;
    this.expectingDays = 0;
    this.halfNotJuncture = 0;
    this.middlingTurnaboutMeter = 0;
    this.formerGene = -1;
    this.undertakenMarch = new LinkedList<>();
  }

  public LinkedList<March> undertakenMarch;
  public SubstitutionPolicies substituteStrategic;

  public synchronized int beatInauguratedOperationsSeverity() {

    if (undertakenMarch.isEmpty()) {
      return 0;
    } else {
      return undertakenMarch.size();
    }
  }

  public synchronized void snoBeginning() {}

  public boolean isMoving;

  public abstract void arrivingLitigate(March cycle);

  public int expectingDays;
  public int middlingTurnaboutMeter;

  public synchronized void reprintTheme(String substitutedIge) {

    try {
      String trophy;
      String bay;
      String supplement;
      Collections.sort(undertakenMarch);
      MethodologyEmulator.ProducesFilename.write("\n");
      System.out.println();
      trophy = substitutedIge + " - Fixed";
      MethodologyEmulator.ProducesFilename.write(trophy + "\n");
      System.out.println(trophy);
      bay =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodologyEmulator.ProducesFilename.write(bay + "\n");
      System.out.println(bay);
      for (March cern : undertakenMarch) {
        String methodUnfashionable;
        methodUnfashionable =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                cern.bringCaller(),
                cern.developDiagnose(),
                cern.catchExpireWhen(),
                cern.sustainWrongdoings().size(),
                cern.receiveDefectPeriods());
        MethodologyEmulator.ProducesFilename.write(methodUnfashionable + "\n");
        System.out.println(methodUnfashionable);
      }
      MethodologyEmulator.ProducesFilename.write("\n");
      System.out.println();
      supplement = new String(new char[50]).replace("\0", "-");
      MethodologyEmulator.ProducesFilename.write(supplement + "\n");
      System.out.println(supplement);
    } catch (IOException late) {
      System.out.println("Unable to write to file.");
    }
  }

  public abstract March intelligentPhase();

  public int continualOpportunity;

  public synchronized void orderedNewTally(int incumbentTock) {
    this.formerGene = incumbentTock;
  }
}
