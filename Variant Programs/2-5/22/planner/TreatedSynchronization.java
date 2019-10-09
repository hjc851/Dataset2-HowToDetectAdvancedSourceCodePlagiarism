package planner;

import starter.Shipper;
import planner.Organizer;
import planner.Summons;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Organizer {
  private static final String synX1945String = "SRT:";
  public PriorityQueue<Summons> happyStopper = null;

  public TreatedSynchronization() {
    this.tracer = (new NegotiationsWitness());
    this.happyStopper = (new PriorityQueue<>(5, tracer));
  }

  public synchronized void cycleIn(Summons phase) {
    happyStopper.add(phase);
  }

  public Comparator<Summons> tracer = null;

  public synchronized String timerMention() {
    return synX1945String;
  }

  public class NegotiationsWitness implements Comparator<Summons> {

    public synchronized int compare(Summons at, Summons p3) {
      int interferonStay;
      int blSurviving;
      interferonStay = (at.fetchManagerVastness() - at.goMovingClock());
      blSurviving = (p3.fetchManagerVastness() - p3.goMovingClock());

      if (interferonStay < blSurviving) {
        return -1;
      }

      if (interferonStay > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.fixGoingThing(rifeSue.goMovingClock() + 1);

      if (rifeSue.goMovingClock() == rifeSue.fetchManagerVastness()) {
        rifeSue.fitDieYear(this.goPrevailingClick());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = (null);
        this.fellyAlert = (true);
      }
    }

    if (!happyStopper.isEmpty() && rifeSue != null) {
      int formerKeeping;
      int watchRest;
      formerKeeping = (rifeSue.fetchManagerVastness() - rifeSue.goMovingClock());
      watchRest =
          (happyStopper.peek().fetchManagerVastness() - happyStopper.peek().goMovingClock());

      if (watchRest < formerKeeping) {
        happyStopper.add(rifeSue);
        rifeSue = (null);
        this.fellyAlert = (true);
      }
    }

    if (this.fellyAlert && rifeSue == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.fellyAlert = (false);
        this.pendingWhinAgain = (Shipper.ShipmentClip);
      }

    } else {

      if (rifeSue == null && !happyStopper.isEmpty()) {
        rifeSue = (happyStopper.poll());
        warheadMethod(rifeSue);
        rifeSue.doRestartAgain(this.goPrevailingClick());
      }
    }
  }
}
