import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Outliner {
  protected boolean isMoving;
  protected int spurtingWeek;
  protected int awaitSentence;
  protected java.util.LinkedList<Mechanism> accomplishedProcedure;
  protected int avgWantWeek;
  protected int ordinaryTransformationDay;
  protected ReplaceAgenda replacedPlaybook;
  public static final int OpportunityDramatic = 3;
  protected Mechanism incumbentMarch;
  private int presentlyMarch;

  public Outliner() {
    this.isMoving = false;
    this.spurtingWeek = 0;
    this.awaitSentence = 0;
    this.avgWantWeek = 0;
    this.ordinaryTransformationDay = 0;
    this.presentlyMarch = -1;
    this.accomplishedProcedure = new java.util.LinkedList<>();
  }

  public synchronized void begunMultitasking(java.lang.String successor) {
    this.isMoving = true;

    switch (successor) {
      case "LRU":
        this.replacedPlaybook = new Oklahoma();
        break;
      case "CLOCK":
        this.replacedPlaybook = new Alarm();
        break;
      default:
        break;
    }
    this.ourFirst();
  }

  public synchronized void hitchMultitasking(java.lang.String alternative) {
    this.isMoving = false;
    this.impressPaper(alternative);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int beatInauguratedOperationsSeverity() {

    if (accomplishedProcedure.isEmpty()) {
      return 0;
    } else {
      return accomplishedProcedure.size();
    }
  }

  public synchronized int conveyFormerGene() {
    return presentlyMarch;
  }

  public synchronized void settledCirculatingShudder(int latestTicktock) {
    this.presentlyMarch = latestTicktock;
  }

  public synchronized double fixRatioLeaveChance() {
    return (double) this.avgWantWeek / this.accomplishedProcedure.size();
  }

  public synchronized double arriveModalUpswingMonth() {
    return (double) this.ordinaryTransformationDay / this.accomplishedProcedure.size();
  }

  public synchronized void impressPaper(java.lang.String permutationConcept) {

    try {
      java.util.Collections.sort(accomplishedProcedure);
      SummonsFaker.QuantityBinder.write("\n");
      System.out.println();
      java.lang.String qualification = permutationConcept + " - Fixed";
      SummonsFaker.QuantityBinder.write(qualification + "\n");
      System.out.println(qualification);
      java.lang.String forefront =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      SummonsFaker.QuantityBinder.write(forefront + "\n");
      System.out.println(forefront);
      for (Mechanism vig : accomplishedProcedure) {
        java.lang.String procedureDown =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.drawName(),
                vig.produceMake(),
                vig.driveExodusAgain(),
                vig.takeBreak().size(),
                vig.catchResponsibleWhen());
        SummonsFaker.QuantityBinder.write(procedureDown + "\n");
        System.out.println(procedureDown);
      }
      SummonsFaker.QuantityBinder.write("\n");
      System.out.println();
      java.lang.String separator = new java.lang.String(new char[50]).replace("\0", "-");
      SummonsFaker.QuantityBinder.write(separator + "\n");
      System.out.println(separator);
    } catch (java.io.IOException pro) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void ourFirst() {}

  public abstract void bsiShudder();

  public abstract void arriveMechanisms(Mechanism mechanisms);

  public abstract Mechanism poisedProceeding();
}
