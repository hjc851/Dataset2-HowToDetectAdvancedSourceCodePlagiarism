import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Parser {
  public boolean isMoving;
  public int flowingSentence;
  public int expectedHours;
  public LinkedList<Cycle> realizedWork;
  public int moderateDeferPeriods;
  public int avgSurgeWeek;
  public RefillingGambit alternativesProgram;
  public static final int YearSurface = 3;
  public Cycle prevailingProcedure;
  public int actualRetick;

  public Parser() {
    this.isMoving = false;
    this.flowingSentence = 0;
    this.expectedHours = 0;
    this.moderateDeferPeriods = 0;
    this.avgSurgeWeek = 0;
    this.actualRetick = -1;
    this.realizedWork = new LinkedList<>();
  }

  public synchronized void initiateWriter(String substitution) {
    this.isMoving = true;

    switch (substitution) {
      case "LRU":
        this.alternativesProgram = new Mississippi();
        break;
      case "CLOCK":
        this.alternativesProgram = new Countdown();
        break;
      default:
        break;
    }
    this.addOutset();
  }

  public synchronized void discontinueTimer(String replacing) {
    this.isMoving = false;
    this.publishStudy(replacing);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int comeConsummatedOperationLarger() {

    if (realizedWork.isEmpty()) {
      return 0;
    } else {
      return realizedWork.size();
    }
  }

  public synchronized int letAfootDials() {
    return actualRetick;
  }

  public synchronized void dictatedOngoingBeat(int incumbentTock) {
    this.actualRetick = incumbentTock;
  }

  public synchronized double letMediumAwaitingHours() {
    return (double) this.moderateDeferPeriods / this.realizedWork.size();
  }

  public synchronized double producePercentageTransitionNow() {
    return (double) this.avgSurgeWeek / this.realizedWork.size();
  }

  public synchronized void publishStudy(String backupFocused) {

    try {
      Collections.sort(realizedWork);
      TreatModelling.QuantityBinder.write("\n");
      System.out.println();
      String champion = backupFocused + " - Fixed";
      TreatModelling.QuantityBinder.write(champion + "\n");
      System.out.println(champion);
      String chapeau =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      TreatModelling.QuantityBinder.write(chapeau + "\n");
      System.out.println(chapeau);
      for (Cycle vig : realizedWork) {
        String negotiationsExterior =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.obtainEst(),
                vig.obtainAdvert(),
                vig.findGoSentence(),
                vig.haveFlaws().size(),
                vig.bringFlawDays());
        TreatModelling.QuantityBinder.write(negotiationsExterior + "\n");
        System.out.println(negotiationsExterior);
      }
      TreatModelling.QuantityBinder.write("\n");
      System.out.println();
      String protector = new String(new char[50]).replace("\0", "-");
      TreatModelling.QuantityBinder.write(protector + "\n");
      System.out.println(protector);
    } catch (IOException abel) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void addOutset() {}

  public abstract void bpsRetick();

  public abstract void electWork(Cycle methods);

  public abstract Cycle preparingSystem();
}
