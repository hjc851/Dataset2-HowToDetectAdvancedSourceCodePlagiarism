import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spooler {
  private int flowIndicate = 0;
  protected Litigate contemporaryLitigate = null;
  public static final int ChanceNumber = 3;
  protected SuccessorPlan successorPlan = null;
  protected int commonRevivalWhen = 0;
  protected int intermediateBideDays = 0;
  protected LinkedList<Litigate> undertookProcedures = null;
  protected int awaitSentence = 0;
  protected int jettingWhen = 0;
  protected boolean isMoving = false;

  public Spooler() {
    this.isMoving = false;
    this.jettingWhen = 0;
    this.awaitSentence = 0;
    this.intermediateBideDays = 0;
    this.commonRevivalWhen = 0;
    this.flowIndicate = -1;
    this.undertookProcedures = new LinkedList<>();
  }

  public synchronized void commencesController(String substitution) {
    this.isMoving = true;

    switch (substitution) {
      case "LRU":
        this.successorPlan = new Bcs();
        break;
      case "CLOCK":
        this.successorPlan = new Watch();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  public synchronized void ceaseOrganizer(String successor) {
    this.isMoving = false;
    this.catalogReview(successor);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int fetchAttainedProcesVastness() {

    if (undertookProcedures.isEmpty()) {
      return 0;
    } else {
      return undertookProcedures.size();
    }
  }

  public synchronized int makeIncumbentTock() {
    return flowIndicate;
  }

  public synchronized void arrangedActualRetick(int newTally) {
    this.flowIndicate = newTally;
  }

  public synchronized double generateFairPostponeYear() {
    return (double) this.intermediateBideDays / this.undertookProcedures.size();
  }

  public synchronized double fetchProportionTurnoverBeginning() {
    return (double) this.commonRevivalWhen / this.undertookProcedures.size();
  }

  public synchronized void catalogReview(String substitutedIge) {

    try {
      String diploma;
      String chaired;
      String splitter;
      Collections.sort(undertookProcedures);
      SueAnalog.InputInitiate.write("\n");
      System.out.println();
      diploma = substitutedIge + " - Fixed";
      SueAnalog.InputInitiate.write(diploma + "\n");
      System.out.println(diploma);
      chaired =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      SueAnalog.InputInitiate.write(chaired + "\n");
      System.out.println(chaired);
      for (Litigate postscript : undertookProcedures) {
        String formalitiesOff;
        formalitiesOff =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.goQuod(),
                postscript.developDiagnose(),
                postscript.bringLossMeter(),
                postscript.takeBreak().size(),
                postscript.haveCulpabilityInstances());
        SueAnalog.InputInitiate.write(formalitiesOff + "\n");
        System.out.println(formalitiesOff);
      }
      SueAnalog.InputInitiate.write("\n");
      System.out.println();
      splitter = new String(new char[50]).replace("\0", "-");
      SueAnalog.InputInitiate.write(splitter + "\n");
      System.out.println(splitter);
    } catch (IOException aba) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void snoBeginning() {}

  public abstract void snoTicktock();

  public abstract void arrivalMethodology(Litigate appendage);

  public abstract Litigate fitMarch();
}
