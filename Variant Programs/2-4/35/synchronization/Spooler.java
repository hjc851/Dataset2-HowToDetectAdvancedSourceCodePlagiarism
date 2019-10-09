package synchronization;

import salesperson.Forwarder;
import trainer.MethodsRobot;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spooler {
  public int previousAnswer;
  public Serve presentNegotiations;
  public static final int MeterMeasure = 4;
  public int leftoverMalcolmMeter;
  public boolean burberryTire;
  public int levelSpikeThing;
  public int mediocrePostponementMoment;
  public LinkedList<Serve> undergoneMethodologies;
  public int hopeChance;
  public int squirtingYear;
  public boolean isMoving;

  public Spooler() {
    this.isMoving = false;
    this.squirtingYear = 0;
    this.hopeChance = 0;
    this.mediocrePostponementMoment = 0;
    this.levelSpikeThing = 0;
    this.previousAnswer = -1;
    this.undergoneMethodologies = new LinkedList<>();
    this.burberryTire = true;
  }

  public synchronized void startleOutliner() {
    this.isMoving = true;
    this.leftoverMalcolmMeter = Forwarder.SentYears;
    this.nsoInitiate();
  }

  public synchronized void pointSynchronizer() {
    this.isMoving = false;
    this.publishStudy();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int findCompletionActSmall() {

    if (undergoneMethodologies.isEmpty()) {
      return 0;
    } else {
      return undergoneMethodologies.size();
    }
  }

  public synchronized int fetchPresentRicky() {
    return previousAnswer;
  }

  public synchronized void fixedTheSelect(int ongoingBeat) {
    this.previousAnswer = ongoingBeat;
  }

  public synchronized double sustainLevelJustThing() {
    return (double) this.mediocrePostponementMoment / this.undergoneMethodologies.size();
  }

  public synchronized double goMedianTurnroundClock() {
    return (double) this.levelSpikeThing / this.undergoneMethodologies.size();
  }

  public synchronized void publishStudy() {

    try {
      String chaired;
      Collections.sort(undergoneMethodologies);
      MethodsRobot.YieldRegister.write("\n");
      System.out.println();
      chaired = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MethodsRobot.YieldRegister.write(chaired + "\n");
      System.out.println(chaired);
      for (Serve writes : undergoneMethodologies) {
        int delayClip;
        int roundWithinYears;
        String formalities;
        delayClip =
            writes.developPulloutHour()
                - writes.sustainHearThing()
                - writes.findImplementationSmall();
        roundWithinYears = writes.developPulloutHour() - writes.sustainHearThing();
        this.mediocrePostponementMoment += delayClip;
        this.levelSpikeThing += roundWithinYears;
        formalities =
            String.format("%-7s%16d%19d", writes.driveSecurity(), delayClip, roundWithinYears);
        MethodsRobot.YieldRegister.write(formalities + "\n");
        System.out.println(formalities);
      }
      MethodsRobot.YieldRegister.write("\n");
      System.out.println();
    } catch (IOException con) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public synchronized void nsoInitiate() {

    try {
      MethodsRobot.YieldRegister.write("\n");
      System.out.println();
      MethodsRobot.YieldRegister.write("\n" + this.controllerSurname() + "\n");
      System.out.println(this.controllerSurname());
    } catch (IOException abel) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public synchronized void warheadMethod(Serve postscript) {

    try {
      String proceeding;
      proceeding =
          String.format(
              "%-5s%3s", "T" + (this.fetchPresentRicky()) + ":", postscript.driveSecurity());
      MethodsRobot.YieldRegister.write(proceeding + "\n");
      System.out.println(proceeding);
    } catch (IOException adoptee) {
      System.out.println("Unable to write " + this.controllerSurname() + " to file.");
    }
  }

  public abstract String controllerSurname();

  public abstract void ourTicktack();

  public abstract void summonsInflowing(Serve serve);
}
