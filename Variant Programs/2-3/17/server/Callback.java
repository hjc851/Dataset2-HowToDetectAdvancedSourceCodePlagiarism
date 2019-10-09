package server;

import dealer.Sender;
import modelling.ProceedingPrototype;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Callback {
  public int lengthwiseHour;

  public synchronized void interceptSpooler() {
    this.isMoving = false;
    this.printerAccount();
  }

  public synchronized void snoBeginning() {

    try {
      ProceedingPrototype.VolumeArchiving.write("\n");
      System.out.println();
      ProceedingPrototype.VolumeArchiving.write("\n" + this.initializationPseudonym() + "\n");
      System.out.println(this.initializationPseudonym());
    } catch (IOException late) {
      System.out.println("Unable to write " + this.initializationPseudonym() + " to file.");
    }
  }

  public synchronized void payloadOperation(Sue postscript) {

    try {
      String procedures;
      procedures =
          String.format(
              "%-5s%3s", "T" + (this.letAfootDials()) + ":", postscript.arriveIdentifying());
      ProceedingPrototype.VolumeArchiving.write(procedures + "\n");
      System.out.println(procedures);
    } catch (IOException abbe) {
      System.out.println("Unable to write " + this.initializationPseudonym() + " to file.");
    }
  }

  public synchronized double findNormLookSentence() {
    return (double) this.medianAwaitClock / this.undertookProcedures.size();
  }

  public Callback() {
    this.isMoving = false;
    this.lengthwiseHour = 0;
    this.bidingPeriods = 0;
    this.medianAwaitClock = 0;
    this.middlingTurnaboutMeter = 0;
    this.underwayWalk = -1;
    this.undertookProcedures = new LinkedList<>();
    this.ordeBeacon = true;
  }

  public synchronized void printerAccount() {

    try {
      String bay;
      Collections.sort(undertookProcedures);
      ProceedingPrototype.VolumeArchiving.write("\n");
      System.out.println();
      bay = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ProceedingPrototype.VolumeArchiving.write(bay + "\n");
      System.out.println(bay);
      for (Sue cern : undertookProcedures) {
        int postponementMoment;
        int boutAlmostThing;
        String methodology;
        postponementMoment =
            cern.catchExpireWhen() - cern.arriveArrivalsMonth() - cern.beatProgrammerSeverity();
        boutAlmostThing = cern.catchExpireWhen() - cern.arriveArrivalsMonth();
        this.medianAwaitClock += postponementMoment;
        this.middlingTurnaboutMeter += boutAlmostThing;
        methodology =
            String.format(
                "%-7s%16d%19d", cern.arriveIdentifying(), postponementMoment, boutAlmostThing);
        ProceedingPrototype.VolumeArchiving.write(methodology + "\n");
        System.out.println(methodology);
      }
      ProceedingPrototype.VolumeArchiving.write("\n");
      System.out.println();
    } catch (IOException officio) {
      System.out.println("Unable to write " + this.initializationPseudonym() + " to file.");
    }
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public static final int SentenceTeleportation = 4;

  public synchronized void originateConfiguration() {
    this.isMoving = true;
    this.unexhaustedTelaMoment = Sender.CompleteSentence;
    this.snoBeginning();
  }

  public Sue actualAct;
  public LinkedList<Sue> undertookProcedures;
  public int medianAwaitClock;

  public synchronized void situatedPresentlyMarch(int formerGene) {
    this.underwayWalk = formerGene;
  }

  public synchronized int letAfootDials() {
    return underwayWalk;
  }

  public abstract String initializationPseudonym();

  public synchronized double sustainLevelSpikeThing() {
    return (double) this.middlingTurnaboutMeter / this.undertookProcedures.size();
  }

  public int bidingPeriods;
  public boolean ordeBeacon;
  public int middlingTurnaboutMeter;

  public synchronized int becomeConcludedPracticesQuantity() {

    if (undertookProcedures.isEmpty()) {
      return 0;
    } else {
      return undertookProcedures.size();
    }
  }

  public abstract void bpsRetick();

  public int underwayWalk;
  public boolean isMoving;

  public abstract void methodologyArrival(Sue phase);

  public int unexhaustedTelaMoment;
}
