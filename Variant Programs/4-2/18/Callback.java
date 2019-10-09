import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Callback {
  protected boolean isMoving;
  protected int rollingJuncture;
  protected int queuePeriod;
  protected LinkedList<Procedure> implementedSummons;
  protected int overallLetMinutes;
  protected int middlingTurnaboutMeter;
  protected SubstituteStrategic refillingGambit;
  public static final int AmountMarkers = 3;
  protected Procedure topicalAppendage;
  private int presentlyMarch;

  public Callback() {
    this.isMoving = false;
    this.rollingJuncture = 0;
    this.queuePeriod = 0;
    this.overallLetMinutes = 0;
    this.middlingTurnaboutMeter = 0;
    this.presentlyMarch = -1;
    this.implementedSummons = new LinkedList<>();
  }

  public void offsetCompiler(String substitution) {
    this.isMoving = true;

    switch (substitution) {
      case "LRU":
        this.refillingGambit = new Usc();
        break;
      case "CLOCK":
        this.refillingGambit = new Dial();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public void catchPlanner(String understudy) {
    this.isMoving = false;
    this.photographyNote(understudy);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int arriveUndertookProceduresWingspan() {

    if (implementedSummons.isEmpty()) {
      return 0;
    } else {
      return implementedSummons.size();
    }
  }

  public int receiveContemporaryTicktack() {
    return presentlyMarch;
  }

  public void dictatedOngoingBeat(int newTally) {
    this.presentlyMarch = newTally;
  }

  public double bringMiddlingExpectMeter() {
    return (double) this.overallLetMinutes / this.implementedSummons.size();
  }

  public double drawAvgSurgeWeek() {
    return (double) this.middlingTurnaboutMeter / this.implementedSummons.size();
  }

  public void photographyNote(String renewalTactic) {

    try {
      Collections.sort(implementedSummons);
      ServeAnalogue.ProducingFolders.write("\n");
      System.out.println();
      String deed = renewalTactic + " - Fixed";
      ServeAnalogue.ProducingFolders.write(deed + "\n");
      System.out.println(deed);
      String subtitle =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      ServeAnalogue.ProducingFolders.write(subtitle + "\n");
      System.out.println(subtitle);
      for (Procedure cern : implementedSummons) {
        String cycleProscribed =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                cern.generateIdem(),
                cern.driveNickname(),
                cern.developPulloutHour(),
                cern.canAnomalies().size(),
                cern.conveyGlitchEpochs());
        ServeAnalogue.ProducingFolders.write(cycleProscribed + "\n");
        System.out.println(cycleProscribed);
      }
      ServeAnalogue.ProducingFolders.write("\n");
      System.out.println();
      String breaker = new String(new char[50]).replace("\0", "-");
      ServeAnalogue.ProducingFolders.write(breaker + "\n");
      System.out.println(breaker);
    } catch (IOException appointed) {
      System.out.println("Unable to write to file.");
    }
  }

  public void nbsBegin() {}

  public abstract void addTock();

  public abstract void designateAct(Procedure appendage);

  public abstract Procedure fitMarch();
}
