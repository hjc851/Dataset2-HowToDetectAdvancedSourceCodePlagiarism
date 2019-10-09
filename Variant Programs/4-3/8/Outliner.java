import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Outliner {
  public boolean isMoving;
  public int gushingNow;
  public int awaitSentence;
  public java.util.LinkedList<Appendage> consummatedOperation;
  public int ratesStayAgain;
  public int ratioReboundChance;
  public AlternativeWay alternatePolicy;
  public static final int DaySum = 3;
  public Appendage prevailingProcedure;
  public int theSelect;

  public Outliner() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.awaitSentence = 0;
    this.ratesStayAgain = 0;
    this.ratioReboundChance = 0;
    this.theSelect = -1;
    this.consummatedOperation = new java.util.LinkedList<>();
  }

  public synchronized void resumeServer(java.lang.String surrogate) {
    this.isMoving = true;

    switch (surrogate) {
      case "LRU":
        this.alternatePolicy = new Nebraska();
        break;
      case "CLOCK":
        this.alternatePolicy = new Tach();
        break;
      default:
        break;
    }
    this.bsiDepart();
  }

  public synchronized void pointSynchronizer(java.lang.String transposition) {
    this.isMoving = false;
    this.reprintingSurvey(transposition);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int produceUndergoneMethodologiesDensity() {

    if (consummatedOperation.isEmpty()) {
      return 0;
    } else {
      return consummatedOperation.size();
    }
  }

  public synchronized int takeTopicalMark() {
    return theSelect;
  }

  public synchronized void fixedTheSelect(int actualRetick) {
    this.theSelect = actualRetick;
  }

  public synchronized double drawAvgWantWeek() {
    return (double) this.ratesStayAgain / this.consummatedOperation.size();
  }

  public synchronized double goMedianTurnroundClock() {
    return (double) this.ratioReboundChance / this.consummatedOperation.size();
  }

  public synchronized void reprintingSurvey(java.lang.String transpositionInitiative) {

    try {
      java.util.Collections.sort(consummatedOperation);
      AppendageBrake.ProducesFilename.write("\n");
      System.out.println();
      java.lang.String position = transpositionInitiative + " - Fixed";
      AppendageBrake.ProducesFilename.write(position + "\n");
      System.out.println(position);
      java.lang.String headline =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      AppendageBrake.ProducesFilename.write(headline + "\n");
      System.out.println(headline);
      for (Appendage cern : consummatedOperation) {
        java.lang.String appendageExtinguished =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                cern.beatUser(),
                cern.arriveCite(),
                cern.drawEntranceWeek(),
                cern.startMalfunctions().size(),
                cern.bringFlawDays());
        AppendageBrake.ProducesFilename.write(appendageExtinguished + "\n");
        System.out.println(appendageExtinguished);
      }
      AppendageBrake.ProducesFilename.write("\n");
      System.out.println();
      java.lang.String split = new java.lang.String(new char[50]).replace("\0", "-");
      AppendageBrake.ProducesFilename.write(split + "\n");
      System.out.println(split);
    } catch (java.io.IOException voto) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void bsiDepart() {}

  public abstract void nbsClick();

  public abstract void inwardServe(Appendage methodology);

  public abstract Appendage preppedNegotiations();
}
