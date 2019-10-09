import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Writer {
  protected boolean isMoving = false;
  protected int rollingJuncture = 0;
  protected int pendingMonth = 0;
  protected LinkedList<Phase> finalizingSystems = null;
  protected int ratesStayAgain = 0;
  protected int typicalRevitalizationHour = 0;
  protected SwitchApproach alternativesProgram = null;
  public static final int MeterMeasure = 3;
  protected Phase prevailingProcedure = null;
  private int latestTicktock = 0;

  public Writer() {
    this.isMoving = false;
    this.rollingJuncture = 0;
    this.pendingMonth = 0;
    this.ratesStayAgain = 0;
    this.typicalRevitalizationHour = 0;
    this.latestTicktock = -1;
    this.finalizingSystems = new LinkedList<>();
  }

  public synchronized void commencesController(String alternates) {
    this.isMoving = true;

    switch (alternates) {
      case "LRU":
        this.alternativesProgram = new Georgia();
        break;
      case "CLOCK":
        this.alternativesProgram = new Alarm();
        break;
      default:
        break;
    }
    this.bsiDepart();
  }

  public synchronized void stoppageController(String backup) {
    this.isMoving = false;
    this.printerAccount(backup);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int driveFinalizationTechniquesCapacity() {

    if (finalizingSystems.isEmpty()) {
      return 0;
    } else {
      return finalizingSystems.size();
    }
  }

  public synchronized int makeIncumbentTock() {
    return latestTicktock;
  }

  public synchronized void fixedTheSelect(int continuingVibrate) {
    this.latestTicktock = continuingVibrate;
  }

  public synchronized double developTypicalAwaitedHour() {
    return (double) this.ratesStayAgain / this.finalizingSystems.size();
  }

  public synchronized double producePercentageTransitionNow() {
    return (double) this.typicalRevitalizationHour / this.finalizingSystems.size();
  }

  public synchronized void printerAccount(String replacesFramework) {

    try {
      Collections.sort(finalizingSystems);
      MethodImpactor.ProductionFolder.write("\n");
      out.println();
      String legend = replacesFramework + " - Fixed";
      MethodImpactor.ProductionFolder.write(legend + "\n");
      out.println(legend);
      String forefront =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodImpactor.ProductionFolder.write(forefront + "\n");
      out.println(forefront);
      for (Phase writes : finalizingSystems) {
        String marchUnsuccessful =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.developPeg(),
                writes.arriveCite(),
                writes.generateDieYear(),
                writes.beatBlunders().size(),
                writes.receiveDefectPeriods());
        MethodImpactor.ProductionFolder.write(marchUnsuccessful + "\n");
        out.println(marchUnsuccessful);
      }
      MethodImpactor.ProductionFolder.write("\n");
      out.println();
      String retractor = new String(new char[50]).replace("\0", "-");
      MethodImpactor.ProductionFolder.write(retractor + "\n");
      out.println(retractor);
    } catch (IOException abe) {
      out.println("Unable to write to file.");
    }
  }

  public synchronized void bsiDepart() {}

  public abstract void nbsClick();

  public abstract void nextSue(Phase phase);

  public abstract Phase availableSummons();
}
