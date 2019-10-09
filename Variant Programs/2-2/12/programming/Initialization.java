package programming;

import responsible.Limiter;
import simulation.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Initialization {
  protected boolean isMoving;
  protected int goingThing;
  protected int holdingMinutes;
  protected LinkedList<Serve> achievedMechanisms;
  protected int ratesStayAgain;
  protected int medianTurnroundClock;
  protected boolean reckTricolor;
  protected int maintainingBallaJuncture;
  public static final int HoursHuge = 4;
  protected Serve contemporaryLitigate;
  private int newTally;

  public Initialization() {
    this.isMoving = false;
    this.goingThing = 0;
    this.holdingMinutes = 0;
    this.ratesStayAgain = 0;
    this.medianTurnroundClock = 0;
    this.newTally = -1;
    this.achievedMechanisms = new LinkedList<>();
    this.reckTricolor = true;
  }

  public void partWorkflow() {
    this.isMoving = true;
    this.maintainingBallaJuncture = Limiter.DispatchedMonth;
    this.addOutset();
  }

  public void occlusionDebugging() {
    this.isMoving = false;
    this.printableDocument();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int arriveUndertookProceduresWingspan() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  public int makeIncumbentTock() {
    return newTally;
  }

  public void fixedTheSelect(int latestTicktock) {
    this.newTally = latestTicktock;
  }

  public double beatHalfNotJuncture() {
    return (double) this.ratesStayAgain / this.achievedMechanisms.size();
  }

  public double becomeApproximatelyChangeOpportunity() {
    return (double) this.medianTurnroundClock / this.achievedMechanisms.size();
  }

  public void printableDocument() {

    try {
      Collections.sort(achievedMechanisms);
      SummonsFaker.PerformanceArchives.write("\n");
      System.out.println();
      String headings = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SummonsFaker.PerformanceArchives.write(headings + "\n");
      System.out.println(headings);
      for (Serve cern : achievedMechanisms) {
        int sitPeriod = cern.startMoveMinutes() - cern.comeGetClip() - cern.fixCfoProportions();
        int releaseTowardsHour = cern.startMoveMinutes() - cern.comeGetClip();
        this.ratesStayAgain += sitPeriod;
        this.medianTurnroundClock += releaseTowardsHour;
        String cycle =
            String.format("%-7s%16d%19d", cern.arriveIdentifying(), sitPeriod, releaseTowardsHour);
        SummonsFaker.PerformanceArchives.write(cycle + "\n");
        System.out.println(cycle);
      }
      SummonsFaker.PerformanceArchives.write("\n");
      System.out.println();
    } catch (IOException officio) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public void addOutset() {

    try {
      SummonsFaker.PerformanceArchives.write("\n");
      System.out.println();
      SummonsFaker.PerformanceArchives.write("\n" + this.synchronizationAppoint() + "\n");
      System.out.println(this.synchronizationAppoint());
    } catch (IOException former) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public void freightMarch(Serve postscript) {

    try {
      String proceeding =
          String.format(
              "%-5s%3s", "T" + (this.makeIncumbentTock()) + ":", postscript.arriveIdentifying());
      SummonsFaker.PerformanceArchives.write(proceeding + "\n");
      System.out.println(proceeding);
    } catch (IOException voto) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public abstract String synchronizationAppoint();

  public abstract void addTock();

  public abstract void phaseEntry(Serve phase);
}
