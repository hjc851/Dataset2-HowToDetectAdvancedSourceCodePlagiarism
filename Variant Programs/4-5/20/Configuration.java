import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Configuration {
  public boolean isMoving;
  public int linearBeginning;
  public int queuePeriod;
  public LinkedList<Sue> constructedMethodology;
  public int proportionAwaitsBeginning;
  public int middlingTurnaboutMeter;
  public ReplaceableSds replacesFramework;
  public static final int ChanceNumber = 3;
  public Sue streamPhase;
  public int typicalGenetic;

  public Configuration() {
    this.isMoving = false;
    this.linearBeginning = 0;
    this.queuePeriod = 0;
    this.proportionAwaitsBeginning = 0;
    this.middlingTurnaboutMeter = 0;
    this.typicalGenetic = -1;
    this.constructedMethodology = new LinkedList<>();
  }

  public synchronized void beginsCallback(String successor) {
    this.isMoving = true;

    if ("LRU" == successor) {
      this.replacesFramework = new Henderson();
    } else if ("CLOCK" == successor) {
    }

    this.optiCommence();
  }

  public synchronized void arrestCompiler(String fallback) {
    this.isMoving = false;
    this.publishStudy(fallback);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int fixAchievedMechanismsProportions() {

    if (constructedMethodology.isEmpty()) {
      return 0;
    } else {
      return constructedMethodology.size();
    }
  }

  public synchronized int conveyFormerGene() {
    return typicalGenetic;
  }

  public synchronized void rigidFormerGene(int rifeCheck) {
    this.typicalGenetic = rifeCheck;
  }

  public synchronized double goMedianAwaitClock() {
    return (double) this.proportionAwaitsBeginning / this.constructedMethodology.size();
  }

  public synchronized double canRateShiftYears() {
    return (double) this.middlingTurnaboutMeter / this.constructedMethodology.size();
  }

  public synchronized void publishStudy(String successorPlan) {

    try {
      Collections.sort(constructedMethodology);
      SueAnalog.InputInitiate.write("\n");
      out.println();
      String nickname = successorPlan + " - Fixed";
      SueAnalog.InputInitiate.write(nickname + "\n");
      out.println(nickname);
      String lintel =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      SueAnalog.InputInitiate.write(lintel + "\n");
      out.println(lintel);
      for (Sue vig : constructedMethodology) {
        String appendageExtinguished =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.developPeg(),
                vig.conveyPseudonym(),
                vig.conveyQuittingAmount(),
                vig.comeMistake().size(),
                vig.obtainDemeritHours());
        SueAnalog.InputInitiate.write(appendageExtinguished + "\n");
        out.println(appendageExtinguished);
      }
      SueAnalog.InputInitiate.write("\n");
      out.println();
      String tabs = new String(new char[50]).replace("\0", "-");
      SueAnalog.InputInitiate.write(tabs + "\n");
      out.println(tabs);
    } catch (IOException afterwards) {
      out.println("Unable to write to file.");
    }
  }

  public synchronized void optiCommence() {}

  public abstract void addTock();

  public abstract void nextSue(Sue litigate);

  public abstract Sue availableSummons();
}
