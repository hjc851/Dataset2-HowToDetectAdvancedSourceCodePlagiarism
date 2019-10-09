package planner;

import starter.Shipper;
import planner.Organizer;
import planner.Summons;
import java.util.ArrayDeque;

public class TrillSpreadsheet extends Organizer {
  private static final boolean synX1944boolean = false;
  private static final int synX1943int = 0;
  private static final boolean synX1942boolean = true;
  private static final int synX1941int = 0;
  private static final boolean synX1940boolean = true;
  private static final int synX1939int = 1;
  private static final String synX1938String = "RR:";

  public synchronized String timerMention() {
    return synX1938String;
  }

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.fixGoingThing(rifeSue.goMovingClock() + synX1939int);
      amountKeeping--;

      if (rifeSue.goMovingClock() == rifeSue.fetchManagerVastness()) {
        rifeSue.fitDieYear(this.goPrevailingClick());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = (null);
        this.fellyAlert = (synX1940boolean);
      }

      if (amountKeeping == synX1941int && rifeSue != null) {

        if (primedWaiting.isEmpty()) {
          amountKeeping = (DaySum);
        } else {
          primedWaiting.addLast(rifeSue);
          rifeSue = (null);
          this.fellyAlert = (synX1942boolean);
        }
      }
    }

    if (this.fellyAlert && rifeSue == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX1943int) {
        this.fellyAlert = (synX1944boolean);
        this.pendingWhinAgain = (Shipper.ShipmentClip);
      }

    } else {

      if (rifeSue == null && !primedWaiting.isEmpty()) {
        rifeSue = (primedWaiting.removeFirst());
        warheadMethod(rifeSue);
        rifeSue.doRestartAgain(this.goPrevailingClick());
        amountKeeping = (DaySum);
      }
    }
  }

  public ArrayDeque<Summons> primedWaiting = null;

  public TrillSpreadsheet() {
    this.primedWaiting = (new ArrayDeque<>());
    amountKeeping = (DaySum);
  }

  public synchronized void cycleIn(Summons work) {
    primedWaiting.addLast(work);
  }

  public int amountKeeping = 0;
}
