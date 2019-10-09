import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Interface {
  protected boolean isMoving;
  protected int walkingAmount;
  protected int anticipationNow;
  protected java.util.LinkedList<Phase> achievedMechanisms;
  protected int fairPostponeYear;
  protected int rateShiftYears;
  protected SuccessorPlan alternatesGie;
  public static final int MonthLarge = 3;
  protected Phase contemporaryLitigate;
  private int presentlyMarch;

  public Interface() {
    this.isMoving = false;
    this.walkingAmount = 0;
    this.anticipationNow = 0;
    this.fairPostponeYear = 0;
    this.rateShiftYears = 0;
    this.presentlyMarch = -1;
    this.achievedMechanisms = new java.util.LinkedList<>();
  }

  public void partWorkflow(java.lang.String replenishment) {
    this.isMoving = true;

    switch (replenishment) {
      case "LRU":
        this.alternatesGie = new Georgia();
        break;
      case "CLOCK":
        this.alternatesGie = new Frequency();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public void stopoverOutliner(java.lang.String alternates) {
    this.isMoving = false;
    this.publishStudy(alternates);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int beatInauguratedOperationsSeverity() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  public int goPrevailingClick() {
    return presentlyMarch;
  }

  public void orderedNewTally(int latestTicktock) {
    this.presentlyMarch = latestTicktock;
  }

  public double generateFairPostponeYear() {
    return (double) this.fairPostponeYear / this.achievedMechanisms.size();
  }

  public double developTypicalRevitalizationHour() {
    return (double) this.rateShiftYears / this.achievedMechanisms.size();
  }

  public void publishStudy(java.lang.String replenishmentStratagem) {

    try {
      java.util.Collections.sort(achievedMechanisms);
      MethodsRobot.VolumeArchiving.write("\n");
      System.out.println();
      java.lang.String victory = replenishmentStratagem + " - Fixed";
      MethodsRobot.VolumeArchiving.write(victory + "\n");
      System.out.println(victory);
      java.lang.String masthead =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodsRobot.VolumeArchiving.write(masthead + "\n");
      System.out.println(masthead);
      for (Phase vig : achievedMechanisms) {
        java.lang.String negotiationsExterior =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.catchIbid(),
                vig.produceMake(),
                vig.drawEntranceWeek(),
                vig.canAnomalies().size(),
                vig.catchResponsibleWhen());
        MethodsRobot.VolumeArchiving.write(negotiationsExterior + "\n");
        System.out.println(negotiationsExterior);
      }
      MethodsRobot.VolumeArchiving.write("\n");
      System.out.println();
      java.lang.String splitter = new java.lang.String(new char[50]).replace("\0", "-");
      MethodsRobot.VolumeArchiving.write(splitter + "\n");
      System.out.println(splitter);
    } catch (java.io.IOException afterwards) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nbsBegin() {}

  public abstract void weapMark();

  public abstract void arrivalMethodology(Phase phase);

  public abstract Phase willingWork();
}
