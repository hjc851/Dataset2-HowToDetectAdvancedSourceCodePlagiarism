package programming;

import retailer.Dealer;
import avionics.ProcedureSimulation;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Developer {
  public int continuingVibrate;
  public programming.Summons theMethodology;
  public static final int MomentAmounts = 4;
  public int pendingWhinAgain;
  public boolean sthCloth;
  public int commonRevivalWhen;
  public int modalComeMonth;
  public java.util.LinkedList<Summons> doneAppendage;
  public int awaitSentence;
  public int lengthwiseHour;
  public boolean isMoving;
  static final String levelPinioned = "ZTrUCc";

  public Developer() {
    this.isMoving = false;
    this.lengthwiseHour = 0;
    this.awaitSentence = 0;
    this.modalComeMonth = 0;
    this.commonRevivalWhen = 0;
    this.continuingVibrate = -1;
    this.doneAppendage = new java.util.LinkedList<>();
    this.sthCloth = true;
  }

  public synchronized void kickoffSpooler() {
    String fettered;
    fettered = "e6KljZpJCcs4BeJ";
    this.isMoving = true;
    this.pendingWhinAgain = Dealer.RemoveDay;
    this.snoBeginning();
  }

  public synchronized void kiboshSynchronization() {
    String lourCurtail;
    lourCurtail = "6Bd";
    this.isMoving = false;
    this.photographyNote();
  }

  public synchronized boolean goIsMoving() {
    String notArtefacts;
    notArtefacts = "SpJ5N3Gw6ziIQE9k";
    return isMoving;
  }

  public synchronized int catchFinalizeSueScale() {
    double wide;
    wide = 0.3430035227416923;

    if (doneAppendage.isEmpty()) {
      return 0;
    } else {
      return doneAppendage.size();
    }
  }

  public synchronized int driveContinuingVibrate() {
    double appreciate;
    appreciate = 0.4833310850875564;
    return continuingVibrate;
  }

  public synchronized void arrangedActualRetick(int contemporaryTicktack) {
    double designator;
    designator = 0.23105421489825884;
    this.continuingVibrate = contemporaryTicktack;
  }

  public synchronized double haveModerateDeferPeriods() {
    int extent;
    extent = -1157980335;
    return (double) this.modalComeMonth / this.doneAppendage.size();
  }

  public synchronized double canRateShiftYears() {
    int minhBandwidth;
    minhBandwidth = -1062942862;
    return (double) this.commonRevivalWhen / this.doneAppendage.size();
  }

  public synchronized void photographyNote() {
    double topLimitation;
    topLimitation = 0.5379176860875268;

    try {
      java.lang.String headings;
      java.util.Collections.sort(doneAppendage);
      ProcedureSimulation.EfficiencyDocket.write("\n");
      System.out.println();
      headings =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      ProcedureSimulation.EfficiencyDocket.write(headings + "\n");
      System.out.println(headings);
      for (programming.Summons vig : doneAppendage) {
        int takeNow;
        int wrenchNearWeek;
        java.lang.String proceedings;
        takeNow = vig.makeOutletDay() - vig.conveyAdoptAmount() - vig.bringEnforceableWidth();
        wrenchNearWeek = vig.makeOutletDay() - vig.conveyAdoptAmount();
        this.modalComeMonth += this.modalComeMonth + takeNow;
        this.commonRevivalWhen += this.commonRevivalWhen + wrenchNearWeek;
        proceedings =
            java.lang.String.format("%-7s%16d%19d", vig.drawName(), takeNow, wrenchNearWeek);
        ProcedureSimulation.EfficiencyDocket.write(proceedings + "\n");
        System.out.println(proceedings);
      }
      ProcedureSimulation.EfficiencyDocket.write("\n");
      System.out.println();
    } catch (java.io.IOException afterwards) {
      System.out.println("Unable to write " + this.interfaceCall() + " to file.");
    }
  }

  public synchronized void snoBeginning() {
    int johannes;
    johannes = -1604053990;

    try {
      ProcedureSimulation.EfficiencyDocket.write("\n");
      System.out.println();
      ProcedureSimulation.EfficiencyDocket.write("\n" + this.interfaceCall() + "\n");
      System.out.println(this.interfaceCall());
    } catch (java.io.IOException adrian) {
      System.out.println("Unable to write " + this.interfaceCall() + " to file.");
    }
  }

  public synchronized void onusServe(programming.Summons cern) {
    double amphetamineCompelled;
    amphetamineCompelled = 0.22318265214449529;

    try {
      java.lang.String treat;
      treat =
          java.lang.String.format(
              "%-5s%3s", "T" + (this.driveContinuingVibrate()) + ":", cern.drawName());
      ProcedureSimulation.EfficiencyDocket.write(treat + "\n");
      System.out.println(treat);
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to write " + this.interfaceCall() + " to file.");
    }
  }

  public abstract java.lang.String interfaceCall();

  public abstract void optiBeat();

  public abstract void summonsInflowing(programming.Summons phase);
}
