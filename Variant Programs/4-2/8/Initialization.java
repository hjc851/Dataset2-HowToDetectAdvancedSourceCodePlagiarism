import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Initialization {
  protected boolean isMoving;
  protected int functionalChance;
  protected int intendingYears;
  protected LinkedList<Outgrowth> achievedMechanisms;
  protected int percentageTakeNow;
  protected int proportionTurnoverBeginning;
  protected UnderstudyStrategize replacingScheme;
  public static final int MeterMeasure = 3;
  protected Outgrowth typicalProceedings;
  private int liveTic;

  public Initialization() {
    this.isMoving = false;
    this.functionalChance = 0;
    this.intendingYears = 0;
    this.percentageTakeNow = 0;
    this.proportionTurnoverBeginning = 0;
    this.liveTic = -1;
    this.achievedMechanisms = new LinkedList<>();
  }

  public void partWorkflow(String successor) {
    this.isMoving = true;

    switch (successor) {
      case "LRU":
        this.replacingScheme = new Texas();
        break;
      case "CLOCK":
        this.replacingScheme = new Counting();
        break;
      default:
        break;
    }
    this.ourFirst();
  }

  public void interceptSpooler(String transposition) {
    this.isMoving = false;
    this.catalogReview(transposition);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int produceUndergoneMethodologiesDensity() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  public int obtainLiveTic() {
    return liveTic;
  }

  public void markAfootDials(int previousAnswer) {
    this.liveTic = previousAnswer;
  }

  public double drawAvgWantWeek() {
    return (double) this.percentageTakeNow / this.achievedMechanisms.size();
  }

  public double makeOrdinaryTransformationDay() {
    return (double) this.proportionTurnoverBeginning / this.achievedMechanisms.size();
  }

  public void catalogReview(String successorPlan) {

    try {
      Collections.sort(achievedMechanisms);
      AppendageBrake.PowerApplication.write("\n");
      System.out.println();
      String subtitle = successorPlan + " - Fixed";
      AppendageBrake.PowerApplication.write(subtitle + "\n");
      System.out.println(subtitle);
      String drainpipe =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      AppendageBrake.PowerApplication.write(drainpipe + "\n");
      System.out.println(drainpipe);
      for (Outgrowth writes : achievedMechanisms) {
        String operationAway =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.driveSecurity(),
                writes.developDiagnose(),
                writes.fetchWithdrawBeginning(),
                writes.startMalfunctions().size(),
                writes.goBlameMultiplication());
        AppendageBrake.PowerApplication.write(operationAway + "\n");
        System.out.println(operationAway);
      }
      AppendageBrake.PowerApplication.write("\n");
      System.out.println();
      String protector = new String(new char[50]).replace("\0", "-");
      AppendageBrake.PowerApplication.write(protector + "\n");
      System.out.println(protector);
    } catch (IOException past) {
      System.out.println("Unable to write to file.");
    }
  }

  public void ourFirst() {}

  public abstract void nsoTic();

  public abstract void inflowingSummons(Outgrowth treat);

  public abstract Outgrowth makeSue();
}
