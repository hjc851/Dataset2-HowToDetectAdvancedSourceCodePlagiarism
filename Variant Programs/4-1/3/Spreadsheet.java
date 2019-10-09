import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spreadsheet {
  protected boolean isMoving;
  protected int spoutingPeriods;
  protected int expectingDays;
  protected LinkedList<Negotiations> performedTreat;
  protected int overallLetMinutes;
  protected int normReverseSentence;
  protected ReplacingScheme substitutionPolicies;
  public static final int ChanceNumber = 3;
  protected Negotiations theMethodology;
  private int flowIndicate;

  public Spreadsheet() {
    this.isMoving = false;
    this.spoutingPeriods = 0;
    this.expectingDays = 0;
    this.overallLetMinutes = 0;
    this.normReverseSentence = 0;
    this.flowIndicate = -1;
    this.performedTreat = new LinkedList<>();
  }

  public void outsetDeveloper(String replaceable) {
    this.isMoving = true;

    switch (replaceable) {
      case "LRU":
        this.substitutionPolicies = new Georgia();
        break;
      case "CLOCK":
        this.substitutionPolicies = new Timer();
        break;
      default:
        break;
    }
    this.bsiDepart();
  }

  public void containSpreadsheet(String alternate) {
    this.isMoving = false;
    this.paperReputation(alternate);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int haveConductedServeLarge() {

    if (performedTreat.isEmpty()) {
      return 0;
    } else {
      return performedTreat.size();
    }
  }

  public int findActualRetick() {
    return flowIndicate;
  }

  public void arrangedActualRetick(int afootDials) {
    this.flowIndicate = afootDials;
  }

  public double becomeApproximatelyLingerOpportunity() {
    return (double) this.overallLetMinutes / this.performedTreat.size();
  }

  public double obtainIntermediateImprovementDays() {
    return (double) this.normReverseSentence / this.performedTreat.size();
  }

  public void paperReputation(String transpositionInitiative) {

    try {
      Collections.sort(performedTreat);
      WorkSimulating.SupplyDocumentation.write("\n");
      System.out.println();
      String designation = transpositionInitiative + " - Fixed";
      WorkSimulating.SupplyDocumentation.write(designation + "\n");
      System.out.println(designation);
      String letterhead =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      WorkSimulating.SupplyDocumentation.write(letterhead + "\n");
      System.out.println(letterhead);
      for (Negotiations vig : performedTreat) {
        String methodUnfashionable =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.receiveCard(),
                vig.fixDiscover(),
                vig.produceIssueNow(),
                vig.haveFlaws().size(),
                vig.developCarelessnessDay());
        WorkSimulating.SupplyDocumentation.write(methodUnfashionable + "\n");
        System.out.println(methodUnfashionable);
      }
      WorkSimulating.SupplyDocumentation.write("\n");
      System.out.println();
      String retractor = new String(new char[50]).replace("\0", "-");
      WorkSimulating.SupplyDocumentation.write(retractor + "\n");
      System.out.println(retractor);
    } catch (IOException appointed) {
      System.out.println("Unable to write to file.");
    }
  }

  public void bsiDepart() {}

  public abstract void snoTicktock();

  public abstract void arrivingLitigate(Negotiations serve);

  public abstract Negotiations availableSummons();
}
