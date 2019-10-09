import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programmer {
  private int actualRetick;
  protected int approximatelyLingerOpportunity;

  public abstract Procedures makeSue();

  public abstract void ourTicktack();

  public synchronized double conveyRegularAdjustmentAmount() {
    return (double) this.commonRevivalWhen / this.doneAppendage.size();
  }

  protected int commonRevivalWhen;

  public synchronized void partWorkflow(String replacing) {
    this.isMoving = true;

    switch (replacing) {
      case "LRU":
        this.understudyStrategize = new Texas();
        break;
      case "CLOCK":
        this.understudyStrategize = new Watch();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  protected Procedures afootSummons;
  protected LinkedList<Procedures> doneAppendage;
  protected AlternatePolicy understudyStrategize;
  public static final int MomentAmounts = 3;

  public synchronized void paperReputation(String replacesFramework) {

    try {
      String score;
      String letterhead;
      String protector;
      Collections.sort(doneAppendage);
      FormalitiesDemo.ProductionFolder.write("\n");
      System.out.println();
      score = replacesFramework + " - Fixed";
      FormalitiesDemo.ProductionFolder.write(score + "\n");
      System.out.println(score);
      letterhead =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      FormalitiesDemo.ProductionFolder.write(letterhead + "\n");
      System.out.println(letterhead);
      for (Procedures vig : doneAppendage) {
        String procedureDown;
        procedureDown =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.drawName(),
                vig.bringRefer(),
                vig.goDepartureClock(),
                vig.becomeLapses().size(),
                vig.drawMalfunctionMoments());
        FormalitiesDemo.ProductionFolder.write(procedureDown + "\n");
        System.out.println(procedureDown);
      }
      FormalitiesDemo.ProductionFolder.write("\n");
      System.out.println();
      protector = new String(new char[50]).replace("\0", "-");
      FormalitiesDemo.ProductionFolder.write(protector + "\n");
      System.out.println(protector);
    } catch (IOException con) {
      System.out.println("Unable to write to file.");
    }
  }

  protected boolean isMoving;

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int produceUndergoneMethodologiesDensity() {

    if (doneAppendage.isEmpty()) {
      return 0;
    } else {
      return doneAppendage.size();
    }
  }

  public synchronized void snoBeginning() {}

  public abstract void newNegotiations(Procedures methodology);

  public synchronized void stoppageController(String alternates) {
    this.isMoving = false;
    this.paperReputation(alternates);
  }

  public synchronized void doContinuingVibrate(int latestTicktock) {
    this.actualRetick = latestTicktock;
  }

  public Programmer() {
    this.isMoving = false;
    this.workingClip = 0;
    this.lookingYear = 0;
    this.approximatelyLingerOpportunity = 0;
    this.commonRevivalWhen = 0;
    this.actualRetick = -1;
    this.doneAppendage = new LinkedList<>();
  }

  public synchronized double conveyRegularHopeAmount() {
    return (double) this.approximatelyLingerOpportunity / this.doneAppendage.size();
  }

  protected int workingClip;

  public synchronized int sustainThisValidation() {
    return actualRetick;
  }

  protected int lookingYear;
}
