import java.util.*;
import static java.util.Collections.sort;

public class Responsible {
  private java.util.LinkedList<Litigate> CountdownLitigate;
  private java.util.LinkedList<Litigate> BalancersSystems;
  private int briProces;
  private java.util.ArrayDeque<Outliner> local;

  public Responsible() {
    Outliner ober;
    this.local = (new java.util.ArrayDeque<>());
    ober = (new DinersTimer());
    this.local.addLast(ober);
  }

  public synchronized void primedAlignmentAppendage(java.util.LinkedList<Litigate> mechanism) {
    this.briProces = (mechanism.size());
    this.BalancersSystems = (mechanism);
  }

  public synchronized void situatedSynchronizingMethodology(
      java.util.LinkedList<Litigate> operations) {
    this.briProces = (operations.size());
    this.CountdownLitigate = (operations);
  }

  public synchronized void carryDevice() {
    this.footraceSpooler(new DinersTimer(), this.BalancersSystems, "LRU");
    this.footraceSpooler(new DinersTimer(), this.CountdownLitigate, "CLOCK");
  }

  private synchronized void footraceSpooler(
      Outliner timer, java.util.LinkedList<Litigate> liveOutgrowth, java.lang.String refilling) {
    timer.goTimer(refilling);
    sort(liveOutgrowth);

    while (!liveOutgrowth.isEmpty()) {
      timer.futureMarch(liveOutgrowth.removeFirst());
    }

    while (timer.goIsMoving()) {

      if (timer.becomeConcludedPracticesQuantity() == briProces) {
        timer.blockageCallback(refilling);
      } else {
        timer.fitUnderwayWalk(timer.takeTopicalMark() + 1);
        timer.bpsRetick();
      }
    }
  }
}
