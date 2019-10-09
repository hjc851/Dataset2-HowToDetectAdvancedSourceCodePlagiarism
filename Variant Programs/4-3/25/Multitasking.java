import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Multitasking {

  public abstract Operation availableSummons();

  public synchronized int takeDoneAppendageDiameter() {

    if (consummatedOperation.isEmpty()) {
      return 0;
    } else {
      return consummatedOperation.size();
    }
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public abstract void bsiShudder();

  public synchronized void bsiDepart() {}

  public int commonSeeWhen = 0;
  public boolean isMoving = false;

  public synchronized void solidifyingTypicalGenetic(int flowIndicate) {
    this.previousAnswer = flowIndicate;
  }

  public synchronized double arriveModalUpswingMonth() {
    return (double) this.middlingTurnaboutMeter / this.consummatedOperation.size();
  }

  public int middlingTurnaboutMeter = 0;
  public Operation flowProcedures = null;

  public synchronized void offsetCompiler(String alternates) {
    this.isMoving = true;

    switch (alternates) {
      case "LRU":
        this.replenishmentStratagem = new Texas();
        break;
      case "CLOCK":
        this.replenishmentStratagem = new Dial();
        break;
      default:
        break;
    }
    this.bsiDepart();
  }

  public synchronized double generateFairPostponeYear() {
    return (double) this.commonSeeWhen / this.consummatedOperation.size();
  }

  public synchronized int goPrevailingClick() {
    return previousAnswer;
  }

  public LinkedList<Operation> consummatedOperation = null;
  public RefillingGambit replenishmentStratagem = null;

  public synchronized void impressPaper(String alternatePolicy) {

    try {
      String titleholder;
      String head;
      String divider;
      Collections.sort(consummatedOperation);
      OutgrowthTrainer.ThroughputDocument.write("\n");
      System.out.println();
      titleholder = alternatePolicy + " - Fixed";
      OutgrowthTrainer.ThroughputDocument.write(titleholder + "\n");
      System.out.println(titleholder);
      head =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      OutgrowthTrainer.ThroughputDocument.write(head + "\n");
      System.out.println(head);
      for (Operation writes : consummatedOperation) {
        String cycleProscribed;
        cycleProscribed =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.fetchPictures(),
                writes.letDistinguish(),
                writes.beatLeavingJuncture(),
                writes.developErrors().size(),
                writes.sustainCriticizeOften());
        OutgrowthTrainer.ThroughputDocument.write(cycleProscribed + "\n");
        System.out.println(cycleProscribed);
      }
      OutgrowthTrainer.ThroughputDocument.write("\n");
      System.out.println();
      divider = new String(new char[50]).replace("\0", "-");
      OutgrowthTrainer.ThroughputDocument.write(divider + "\n");
      System.out.println(divider);
    } catch (IOException aba) {
      System.out.println("Unable to write to file.");
    }
  }

  public int previousAnswer = 0;

  public abstract void ingoingProcedure(Operation proceeding);

  public int awaitingClip = 0;
  public int spurtingWeek = 0;

  public Multitasking() {
    this.isMoving = false;
    this.spurtingWeek = 0;
    this.awaitingClip = 0;
    this.commonSeeWhen = 0;
    this.middlingTurnaboutMeter = 0;
    this.previousAnswer = -1;
    this.consummatedOperation = new LinkedList<>();
  }

  public synchronized void quitProgramming(String alternatives) {
    this.isMoving = false;
    this.impressPaper(alternatives);
  }

  public static final int OpportunityDramatic = 3;
}
