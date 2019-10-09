package multitasking;

import mailer.Shipper;
import demo.SystemSim;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Callback {
  protected boolean isMoving;
  protected int trackMeter;
  protected int expectingDays;
  protected LinkedList<Procedures> consummatedOperation;
  protected int overallLetMinutes;
  protected int proportionTurnoverBeginning;
  protected boolean passenInsignia;
  protected int stayLtsHour;
  public static final int YearsSize = 4;
  protected Procedures liveOutgrowth;
  private int actualRetick;

  public Callback() {
    this.isMoving = false;
    this.trackMeter = 0;
    this.expectingDays = 0;
    this.overallLetMinutes = 0;
    this.proportionTurnoverBeginning = 0;
    this.actualRetick = -1;
    this.consummatedOperation = new LinkedList<>();
    this.passenInsignia = true;
  }

  public void partWorkflow() {
    this.isMoving = true;
    this.stayLtsHour = Shipper.RoutingWeek;
    this.weapGet();
  }

  public void diaphragmWorkspace() {
    this.isMoving = false;
    this.reprintingSurvey();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int letImplementedSummonsSmallness() {

    if (consummatedOperation.isEmpty()) {
      return 0;
    } else {
      return consummatedOperation.size();
    }
  }

  public int drawStreamBookmark() {
    return actualRetick;
  }

  public void fixThisValidation(int ongoingBeat) {
    this.actualRetick = ongoingBeat;
  }

  public double canRateQueueYears() {
    return (double) this.overallLetMinutes / this.consummatedOperation.size();
  }

  public double driveRatesBreakthroughAgain() {
    return (double) this.proportionTurnoverBeginning / this.consummatedOperation.size();
  }

  public void reprintingSurvey() {

    try {
      Collections.sort(consummatedOperation);
      SystemSim.PerformanceArchives.write("\n");
      System.out.println();
      String forefront =
          String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      SystemSim.PerformanceArchives.write(forefront + "\n");
      System.out.println(forefront);
      for (Procedures writes : consummatedOperation) {
        int letMinutes =
            writes.beatLeavingJuncture()
                - writes.takeDeliverPeriod()
                - writes.findImplementationSmall();
        int tourBesideJuncture = writes.beatLeavingJuncture() - writes.takeDeliverPeriod();
        this.overallLetMinutes += letMinutes;
        this.proportionTurnoverBeginning += tourBesideJuncture;
        String cycle =
            String.format("%-7s%16d%19d", writes.receiveCard(), letMinutes, tourBesideJuncture);
        SystemSim.PerformanceArchives.write(cycle + "\n");
        System.out.println(cycle);
      }
      SystemSim.PerformanceArchives.write("\n");
      System.out.println();
    } catch (IOException libris) {
      System.out.println("Unable to write " + this.outlinerGens() + " to file.");
    }
  }

  public void weapGet() {

    try {
      SystemSim.PerformanceArchives.write("\n");
      System.out.println();
      SystemSim.PerformanceArchives.write("\n" + this.outlinerGens() + "\n");
      System.out.println(this.outlinerGens());
    } catch (IOException aba) {
      System.out.println("Unable to write " + this.outlinerGens() + " to file.");
    }
  }

  public void freightMarch(Procedures vig) {

    try {
      String appendage =
          String.format("%-5s%3s", "T" + (this.drawStreamBookmark()) + ":", vig.receiveCard());
      SystemSim.PerformanceArchives.write(appendage + "\n");
      System.out.println(appendage);
    } catch (IOException afterwards) {
      System.out.println("Unable to write " + this.outlinerGens() + " to file.");
    }
  }

  public abstract String outlinerGens();

  public abstract void addTock();

  public abstract void methodologyArrival(Procedures summons);
}
