import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programmer {
  protected boolean isMoving;
  protected int squirtingYear;
  protected int intendingYears;
  protected java.util.LinkedList<Outgrowth> finalizingSystems;
  protected int intermediateBideDays;
  protected int mediocreReversionMoment;
  protected SubstitutesApproaches replenishmentStratagem;
  public static final int ThingLibido = 3;
  protected Outgrowth contemporaryLitigate;
  private int topicalMark;

  public Programmer() {
    this.isMoving = false;
    this.squirtingYear = 0;
    this.intendingYears = 0;
    this.intermediateBideDays = 0;
    this.mediocreReversionMoment = 0;
    this.topicalMark = -1;
    this.finalizingSystems = new java.util.LinkedList<>();
  }

  public void commencementSynchronization(java.lang.String substitutes) {
    this.isMoving = true;

    switch (substitutes) {
      case "LRU":
        this.replenishmentStratagem = new Louisville();
        break;
      case "CLOCK":
        this.replenishmentStratagem = new Bell();
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public void closureServer(java.lang.String surrogate) {
    this.isMoving = false;
    this.hardcopyComposition(surrogate);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int fetchAttainedProcesVastness() {

    if (finalizingSystems.isEmpty()) {
      return 0;
    } else {
      return finalizingSystems.size();
    }
  }

  public int receiveContemporaryTicktack() {
    return topicalMark;
  }

  public void readyIncumbentTock(int formerGene) {
    this.topicalMark = formerGene;
  }

  public double obtainIntermediateBideDays() {
    return (double) this.intermediateBideDays / this.finalizingSystems.size();
  }

  public double arriveModalUpswingMonth() {
    return (double) this.mediocreReversionMoment / this.finalizingSystems.size();
  }

  public void hardcopyComposition(java.lang.String switchApproach) {

    try {
      java.util.Collections.sort(finalizingSystems);
      ProceedingPrototype.InputInitiate.write("\n");
      System.out.println();
      java.lang.String champion = switchApproach + " - Fixed";
      ProceedingPrototype.InputInitiate.write(champion + "\n");
      System.out.println(champion);
      java.lang.String caption =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProceedingPrototype.InputInitiate.write(caption + "\n");
      System.out.println(caption);
      for (Outgrowth postscript : finalizingSystems) {
        java.lang.String treatRetired =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.receiveCard(),
                postscript.developDiagnose(),
                postscript.driveExodusAgain(),
                postscript.comeMistake().size(),
                postscript.fetchDefectiveRounds());
        ProceedingPrototype.InputInitiate.write(treatRetired + "\n");
        System.out.println(treatRetired);
      }
      ProceedingPrototype.InputInitiate.write("\n");
      System.out.println();
      java.lang.String breaker = new java.lang.String(new char[50]).replace("\0", "-");
      ProceedingPrototype.InputInitiate.write(breaker + "\n");
      System.out.println(breaker);
    } catch (java.io.IOException voto) {
      System.out.println("Unable to write to file.");
    }
  }

  public void optiCommence() {}

  public abstract void snoTicktock();

  public abstract void arrivingLitigate(Outgrowth methodology);

  public abstract Outgrowth quickAppendage();
}
