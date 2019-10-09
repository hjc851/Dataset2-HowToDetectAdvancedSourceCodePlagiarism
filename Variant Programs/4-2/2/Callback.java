import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Callback {
  protected boolean isMoving;
  protected int rollingJuncture;
  protected int hopeChance;
  protected LinkedList<March> carriedMechanism;
  protected int ratesStayAgain;
  protected int middlingTurnaboutMeter;
  protected TranspositionInitiative successorPlan;
  public static final int DaysQuantitative = 3;
  protected March latestOperation;
  private int circulatingShudder;

  public Callback() {
    this.isMoving = false;
    this.rollingJuncture = 0;
    this.hopeChance = 0;
    this.ratesStayAgain = 0;
    this.middlingTurnaboutMeter = 0;
    this.circulatingShudder = -1;
    this.carriedMechanism = new LinkedList<>();
  }

  public void kickoffSpooler(String successor) {
    this.isMoving = true;

    switch (successor) {
      case "LRU":
        this.successorPlan = new Jacobs();
        break;
      case "CLOCK":
        this.successorPlan = new Synchronization();
        break;
      default:
        break;
    }
    this.nsoInitiate();
  }

  public void stayParser(String fallback) {
    this.isMoving = false;
    this.copyStatement(fallback);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int obtainFinishedOutgrowthLength() {

    if (carriedMechanism.isEmpty()) {
      return 0;
    } else {
      return carriedMechanism.size();
    }
  }

  public int takeTopicalMark() {
    return circulatingShudder;
  }

  public void putPrevailingClick(int typicalGenetic) {
    this.circulatingShudder = typicalGenetic;
  }

  public double generateFairPostponeYear() {
    return (double) this.ratesStayAgain / this.carriedMechanism.size();
  }

  public double bringMiddlingTurnaboutMeter() {
    return (double) this.middlingTurnaboutMeter / this.carriedMechanism.size();
  }

  public void copyStatement(String switchApproach) {

    try {
      Collections.sort(carriedMechanism);
      ActMock.IntensityReadme.write("\n");
      System.out.println();
      String position = switchApproach + " - Fixed";
      ActMock.IntensityReadme.write(position + "\n");
      System.out.println(position);
      String headline =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ActMock.IntensityReadme.write(headline + "\n");
      System.out.println(headline);
      for (March postscript : carriedMechanism) {
        String treatRetired =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.canOwnership(),
                postscript.fixDiscover(),
                postscript.letDeceaseHours(),
                postscript.goBlame().size(),
                postscript.drawMalfunctionMoments());
        ActMock.IntensityReadme.write(treatRetired + "\n");
        System.out.println(treatRetired);
      }
      ActMock.IntensityReadme.write("\n");
      System.out.println();
      String splitting = new String(new char[50]).replace("\0", "-");
      ActMock.IntensityReadme.write(splitting + "\n");
      System.out.println(splitting);
    } catch (IOException abbe) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nsoInitiate() {}

  public abstract void nbsClick();

  public abstract void inpouringSystem(March procedures);

  public abstract March reluctantProceedings();
}
