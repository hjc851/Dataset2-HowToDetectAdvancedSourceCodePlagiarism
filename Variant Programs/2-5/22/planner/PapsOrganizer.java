package planner;

import starter.Shipper;
import planner.Organizer;
import planner.Summons;
import java.util.ArrayDeque;

public class PapsOrganizer extends Organizer {
  private static final String synX1950String = "FCFS:";
  private static final boolean synX1949boolean = false;
  private static final int synX1948int = 0;
  private static final boolean synX1947boolean = true;
  private static final int synX1946int = 1;

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.fixGoingThing(rifeSue.goMovingClock() + synX1946int);

      if (rifeSue.goMovingClock() == rifeSue.fetchManagerVastness()) {
        rifeSue.fitDieYear(this.goPrevailingClick());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = (null);
        this.fellyAlert = (synX1947boolean);
      }
    }

    if (this.fellyAlert && rifeSue == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX1948int) {
        this.fellyAlert = (synX1949boolean);
        this.pendingWhinAgain = (Shipper.ShipmentClip);
      }

    } else {

      if (rifeSue == null && !waitingList.isEmpty()) {
        rifeSue = (waitingList.removeFirst());
        rifeSue.doRestartAgain(this.goPrevailingClick());
        warheadMethod(rifeSue);
      }
    }
  }

  public ArrayDeque<Summons> waitingList = null;

  public synchronized void cycleIn(Summons summons) {
    waitingList.addLast(summons);
  }

  public synchronized String timerMention() {
    return synX1950String;
  }

  public PapsOrganizer() {
    this.waitingList = (new ArrayDeque<>());
  }
}
