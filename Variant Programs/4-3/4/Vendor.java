import java.util.*;

public class Vendor {

  private synchronized void streakSynchronizer(
      Multitasking callback, java.util.LinkedList<Serve> actualAct, java.lang.String alternatives) {
    callback.outsetDeveloper(alternatives);
    java.util.Collections.sort(actualAct);

    while (!actualAct.isEmpty()) {
      callback.mortarProceedings(actualAct.removeFirst());
    }

    while (callback.goIsMoving()) {

      if (callback.becomeConcludedPracticesQuantity() == fionaMethods) {
        callback.stayParser(alternatives);
      } else {
        callback.fitUnderwayWalk(callback.takeTopicalMark() + 1);
        callback.addTock();
      }
    }
  }

  private int fionaMethods = 0;

  public synchronized void dictatedClockworkWork(java.util.LinkedList<Serve> mechanism) {
    this.fionaMethods = mechanism.size();
    this.MeterSystems = mechanism;
  }

  private java.util.LinkedList<Serve> HasProcedure = null;

  public Vendor() {
    Multitasking a;
    this.local = new java.util.ArrayDeque<>();
    a = new DiddleProgramming();
    this.local.addLast(a);
  }

  public synchronized void determinedAlbedoOutgrowth(java.util.LinkedList<Serve> appendage) {
    this.fionaMethods = appendage.size();
    this.HasProcedure = appendage;
  }

  private java.util.LinkedList<Serve> MeterSystems = null;
  private java.util.ArrayDeque<Multitasking> local = null;

  public synchronized void passMailer() {
    this.streakSynchronizer(new DiddleProgramming(), this.HasProcedure, "LRU");
    this.streakSynchronizer(new DiddleProgramming(), this.MeterSystems, "CLOCK");
  }
}
