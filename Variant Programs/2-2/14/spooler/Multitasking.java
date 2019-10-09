package spooler;

import exporter.Limiter;
import simulation.ActMock;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Multitasking {
  protected boolean isMoving;
  protected int linearBeginning;
  protected int awaitedDay;
  protected LinkedList<Cycle> attainedProces;
  protected int ratesStayAgain;
  protected int commonRevivalWhen;
  protected boolean leviPennant;
  protected int remainderRemoDays;
  public static final int WhenValue = 4;
  protected Cycle flowProcedures;
  private int prevalentScore;

  public Multitasking() {
    this.isMoving = false;
    this.linearBeginning = 0;
    this.awaitedDay = 0;
    this.ratesStayAgain = 0;
    this.commonRevivalWhen = 0;
    this.prevalentScore = -1;
    this.attainedProces = new LinkedList<>();
    this.leviPennant = true;
  }

  public void beganSpreadsheet() {
    this.isMoving = true;
    this.remainderRemoDays = Limiter.SlayMoment;
    this.weapGet();
  }

  public void hitchMultitasking() {
    this.isMoving = false;
    this.paperReputation();
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int becomeConcludedPracticesQuantity() {

    if (attainedProces.isEmpty()) {
      return 0;
    } else {
      return attainedProces.size();
    }
  }

  public int goPrevailingClick() {
    return prevalentScore;
  }

  public void dictatedOngoingBeat(int ongoingBeat) {
    this.prevalentScore = ongoingBeat;
  }

  public double fetchProportionAwaitsBeginning() {
    return (double) this.ratesStayAgain / this.attainedProces.size();
  }

  public double obtainIntermediateImprovementDays() {
    return (double) this.commonRevivalWhen / this.attainedProces.size();
  }

  public void paperReputation() {

    try {
      Collections.sort(attainedProces);
      ActMock.TurnoutCharge.write("\n");
      System.out.println();
      String banner = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ActMock.TurnoutCharge.write(banner + "\n");
      System.out.println(banner);
      for (Cycle cern : attainedProces) {
        int awaitsBeginning =
            cern.produceIssueNow() - cern.receiveDescendMoment() - cern.drawBossScope();
        int releaseTowardsHour = cern.produceIssueNow() - cern.receiveDescendMoment();
        this.ratesStayAgain += awaitsBeginning;
        this.commonRevivalWhen += releaseTowardsHour;
        String method =
            String.format("%-7s%16d%19d", cern.startPicture(), awaitsBeginning, releaseTowardsHour);
        ActMock.TurnoutCharge.write(method + "\n");
        System.out.println(method);
      }
      ActMock.TurnoutCharge.write("\n");
      System.out.println();
    } catch (IOException abdul) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public void weapGet() {

    try {
      ActMock.TurnoutCharge.write("\n");
      System.out.println();
      ActMock.TurnoutCharge.write("\n" + this.debuggingPatronymic() + "\n");
      System.out.println(this.debuggingPatronymic());
    } catch (IOException tipp) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public void payloadOperation(Cycle writes) {

    try {
      String march =
          String.format("%-5s%3s", "T" + (this.goPrevailingClick()) + ":", writes.startPicture());
      ActMock.TurnoutCharge.write(march + "\n");
      System.out.println(march);
    } catch (IOException libris) {
      System.out.println("Unable to write " + this.debuggingPatronymic() + " to file.");
    }
  }

  public abstract String debuggingPatronymic();

  public abstract void snoTicktock();

  public abstract void methodEntrance(Cycle summons);
}
