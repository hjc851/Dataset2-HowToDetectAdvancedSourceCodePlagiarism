import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Multitasking {
  protected boolean isMoving;
  protected int gushingNow;
  protected int standbyOpportunity;
  protected LinkedList<Formalities> fulfilledMethod;
  protected int middlingExpectMeter;
  protected int proportionTurnoverBeginning;
  protected ReinstatementProgramme substituteStrategic;
  public static final int YearSurface = 3;
  protected Formalities latestOperation;
  private int presentlyMarch;

  public Multitasking() {
    this.isMoving = false;
    this.gushingNow = 0;
    this.standbyOpportunity = 0;
    this.middlingExpectMeter = 0;
    this.proportionTurnoverBeginning = 0;
    this.presentlyMarch = -1;
    this.fulfilledMethod = new LinkedList<>();
  }

  public void beginsCallback(String transposition) {
    this.isMoving = true;

    switch (transposition) {
      case "LRU":
        this.substituteStrategic = new Bcs();
        break;
      case "CLOCK":
        this.substituteStrategic = new Time();
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public void stoppageController(String alternatives) {
    this.isMoving = false;
    this.typescriptComplaint(alternatives);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int startConstructedMethodologyBreadth() {

    if (fulfilledMethod.isEmpty()) {
      return 0;
    } else {
      return fulfilledMethod.size();
    }
  }

  public int producePrevalentScore() {
    return presentlyMarch;
  }

  public void arrangedActualRetick(int topicalMark) {
    this.presentlyMarch = topicalMark;
  }

  public double driveRatesStayAgain() {
    return (double) this.middlingExpectMeter / this.fulfilledMethod.size();
  }

  public double comeNormalReversalClip() {
    return (double) this.proportionTurnoverBeginning / this.fulfilledMethod.size();
  }

  public void typescriptComplaint(String substitutesApproaches) {

    try {
      Collections.sort(fulfilledMethod);
      ProceedingsKinematics.QuantityBinder.write("\n");
      System.out.println();
      String legend = substitutesApproaches + " - Fixed";
      ProceedingsKinematics.QuantityBinder.write(legend + "\n");
      System.out.println(legend);
      String overhead =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ProceedingsKinematics.QuantityBinder.write(overhead + "\n");
      System.out.println(overhead);
      for (Formalities writes : fulfilledMethod) {
        String formalitiesOff =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.goQuod(),
                writes.drawGens(),
                writes.sustainDepartThing(),
                writes.developErrors().size(),
                writes.fetchDefectiveRounds());
        ProceedingsKinematics.QuantityBinder.write(formalitiesOff + "\n");
        System.out.println(formalitiesOff);
      }
      ProceedingsKinematics.QuantityBinder.write("\n");
      System.out.println();
      String split = new String(new char[50]).replace("\0", "-");
      ProceedingsKinematics.QuantityBinder.write(split + "\n");
      System.out.println(split);
    } catch (IOException vet) {
      System.out.println("Unable to write to file.");
    }
  }

  public void optiCommence() {}

  public abstract void nbsClick();

  public abstract void futureMarch(Formalities negotiations);

  public abstract Formalities preppedNegotiations();
}
