package compiler;

import vendor.Exporter;
import compiler.Parser;
import compiler.Mechanisms;
import java.util.ArrayDeque;

public class DcSpreadsheet extends Parser {

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void optiBeat() {

    if (contemporaryLitigate != null) {
      contemporaryLitigate.fixedContinualOpportunity(contemporaryLitigate.catchJettingWhen() + 1);
      yearStill--;

      if (contemporaryLitigate.catchJettingWhen()
          == contemporaryLitigate.beatProgrammerSeverity()) {
        contemporaryLitigate.placeEntranceWeek(this.driveContinuingVibrate());
        this.finalizeSue.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.variWaving = true;
      }

      if (yearStill == 0 && contemporaryLitigate != null) {

        if (primedIsVacant()) {
          yearStill = ChanceNumber;
        } else {
          gonnaCarpark[circulatingImperative + 1].addLast(contemporaryLitigate);
          contemporaryLitigate = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && contemporaryLitigate == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.variWaving = false;
        this.leftDeviceClock = Exporter.AssignThing;
      }

    } else {

      if (contemporaryLitigate == null && !primedIsVacant()) {
        contemporaryLitigate = receiveIncomingLitigate();
        warheadMethod(contemporaryLitigate);
        contemporaryLitigate.rigidOpeningAmount(this.driveContinuingVibrate());
        yearStill = ChanceNumber;
      }
    }
  }

  private int yearStill;

  public synchronized String multitaskingMoniker() {
    return "FB:";
  }

  private int circulatingImperative;

  public DcSpreadsheet() {
    this.gonnaCarpark = new ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) {
      gonnaCarpark[i] = new ArrayDeque<>();
    }
    yearStill = ChanceNumber;
    circulatingImperative = 0;
  }

  public synchronized void phaseEntry(Mechanisms treat) {
    gonnaCarpark[0].addLast(treat);
  }

  private ArrayDeque<Mechanisms>[] gonnaCarpark;

  private synchronized Mechanisms receiveIncomingLitigate() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        circulatingImperative = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }
}
