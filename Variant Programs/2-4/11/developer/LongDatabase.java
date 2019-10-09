package developer;

import sender.Starter;
import developer.Writer;
import developer.Work;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends developer.Writer {

  public LongDatabase() {
    this.compared = new MechanismsComparaison();
    this.gonnaDong = new java.util.PriorityQueue<>(5, compared);
  }

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.dictatedTrackMeter(rifeSue.bringTrackMeter() + 1);

      if (rifeSue.bringTrackMeter() == rifeSue.generateHonchoFootprint()) {
        rifeSue.laidLeaveClip(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(rifeSue);
        rifeSue = null;
        this.malcolmIris = true;
      }
    }

    if (!gonnaDong.isEmpty() && rifeSue != null) {
      int liveRemainder;
      int seeFinal;
      liveRemainder = rifeSue.generateHonchoFootprint() - rifeSue.bringTrackMeter();
      seeFinal = gonnaDong.peek().generateHonchoFootprint() - gonnaDong.peek().bringTrackMeter();

      if (seeFinal < liveRemainder) {
        gonnaDong.add(rifeSue);
        rifeSue = null;
        this.malcolmIris = true;
      }
    }

    if (this.malcolmIris && rifeSue == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.malcolmIris = false;
        this.leavingBrinWhen = Starter.SentYears;
      }

    } else {

      if (rifeSue == null && !gonnaDong.isEmpty()) {
        rifeSue = gonnaDong.poll();
        lodePhase(rifeSue);
        rifeSue.fixEarlyThing(this.receiveContemporaryTicktack());
      }
    }
  }

  public synchronized void proceedingOutbound(Work litigate) {
    gonnaDong.add(litigate);
  }

  public java.util.PriorityQueue<Work> gonnaDong;
  public java.util.Comparator<Work> compared;

  public class MechanismsComparaison implements Comparator<Work> {

    public synchronized int compare(Work pt, Work e) {
      int aFinal;
      int p4Unexhausted;
      aFinal = pt.generateHonchoFootprint() - pt.bringTrackMeter();
      p4Unexhausted = e.generateHonchoFootprint() - e.bringTrackMeter();

      if (aFinal < p4Unexhausted) {
        return -1;
      }

      if (aFinal > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spoolerDistinguish() {
    return "SRT:";
  }
}
