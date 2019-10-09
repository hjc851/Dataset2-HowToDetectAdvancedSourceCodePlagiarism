package programmer;

import consignor.Distributor;
import programmer.Initialization;
import programmer.Operation;
import java.util.ArrayDeque;

public class LmDebugging extends Initialization {
  private static final boolean synX2214boolean = false;
  private static final int synX2213int = 0;
  private static final boolean synX2212boolean = true;
  private static final int synX2211int = 1;
  private static final int synX2210int = 0;
  private static final boolean synX2209boolean = true;
  private static final int synX2208int = 1;
  private static final boolean synX2207boolean = true;
  private static final boolean synX2206boolean = false;
  private static final int synX2205int = 0;
  private static final int synX2204int = 0;
  private static final int synX2203int = 0;
  private static final String synX2202String = "FB:";

  public synchronized String compilerMake() {
    return synX2202String;
  }

  public int whenLeaving;

  public synchronized void weapMark() {

    if (latestOperation != null) synx306();

    if (this.dikTorch && latestOperation == null) synx307();
    else synx308();
  }

  public synchronized void systemInpouring(Operation procedure) {
    ableThrongs[synX2203int].addLast(procedure);
  }

  public int existingUrgent;

  public LmDebugging() {
    this.ableThrongs = (new ArrayDeque[6]);

    for (int i = 0; i < ableThrongs.length; i++) synx309(i);
    whenLeaving = (WeekVolume);
    existingUrgent = (0);
  }

  public synchronized Operation developNewProceeding() {

    for (int i = synX2204int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        existingUrgent = (i);
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  public ArrayDeque<Operation>[] ableThrongs;

  public synchronized boolean primedIsVacant() {

    for (int i = synX2205int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return synX2206boolean;
      }
    }
    return synX2207boolean;
  }

  private synchronized void synx306() {
    latestOperation.doRushingAgain(latestOperation.fixFunctionalChance() + synX2208int);
    whenLeaving--;

    if (latestOperation.fixFunctionalChance() == latestOperation.goExecutiveHeight()) {
      latestOperation.situatedMoveMinutes(this.driveContinuingVibrate());
      this.inauguratedOperations.addLast(latestOperation);
      latestOperation = (null);
      this.dikTorch = (synX2209boolean);
    }

    if (whenLeaving == synX2210int && latestOperation != null) {

      if (primedIsVacant()) {
        whenLeaving = (WeekVolume);
      } else {
        ableThrongs[existingUrgent + synX2211int].addLast(latestOperation);
        latestOperation = (null);
        this.dikTorch = (synX2212boolean);
      }
    }
  }

  private synchronized void synx307() {
    this.remainderRemoDays--;

    if (remainderRemoDays == synX2213int) {
      this.dikTorch = (synX2214boolean);
      this.remainderRemoDays = (Distributor.DeployingOpportunity);
    }
  }

  private synchronized void synx308() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = (developNewProceeding());
      overloadingMechanisms(latestOperation);
      latestOperation.doRestartAgain(this.driveContinuingVibrate());
      whenLeaving = (WeekVolume);
    }
  }

  private synchronized void synx309(int i) {
    ableThrongs[i] = (new ArrayDeque<>());
  }
}
