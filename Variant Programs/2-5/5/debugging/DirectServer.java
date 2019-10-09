package debugging;

import shipper.Limiter;
import debugging.Programmer;
import debugging.Operation;
import java.util.ArrayDeque;

public class DirectServer extends debugging.Programmer {
  private static final boolean synX635boolean = false;
  private static final int synX634int = 0;
  private static final boolean synX633boolean = true;
  private static final int synX632int = 1;
  private static final int synX631int = 0;
  private static final boolean synX630boolean = true;
  private static final int synX629int = 1;
  private static final int synX628int = 0;
  private static final String synX627String = "FB:";
  private static final boolean synX626boolean = true;
  private static final boolean synX625boolean = false;
  private static final int synX624int = 0;
  private static final int synX623int = 0;
  private int nowUnanswered;

  public synchronized void addTock() {

    if (latestOperation != null) synx46();

    if (this.reckTricolor && latestOperation == null) synx47();
    else synx48();
  }

  private synchronized debugging.Operation bringCloseWork() {

    for (int i = synX623int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        underwayConcern = i;
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  private int underwayConcern;

  private synchronized boolean primedIsVacant() {

    for (int i = synX624int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return synX625boolean;
      }
    }
    return synX626boolean;
  }

  private ArrayDeque<Operation>[] ableThrongs;

  public DirectServer() {
    this.ableThrongs = new java.util.ArrayDeque[6];

    for (int i = 0; i < ableThrongs.length; i++) synx49(i);
    nowUnanswered = ClockAmount;
    underwayConcern = 0;
  }

  public synchronized String interfaceCall() {
    return synX627String;
  }

  public synchronized void serveInward(Operation negotiations) {
    ableThrongs[synX628int].addLast(negotiations);
  }

  private synchronized void synx46() {
    latestOperation.solidifyingRollingJuncture(latestOperation.beatRollingJuncture() + synX629int);
    nowUnanswered--;

    if (latestOperation.beatRollingJuncture() == latestOperation.findImplementationSmall()) {
      latestOperation.adjustPerishMonth(this.obtainLiveTic());
      this.finalizeSue.addLast(latestOperation);
      latestOperation = null;
      this.reckTricolor = synX630boolean;
    }

    if (nowUnanswered == synX631int && latestOperation != null) {

      if (primedIsVacant()) {
        nowUnanswered = ClockAmount;
      } else {
        ableThrongs[underwayConcern + synX632int].addLast(latestOperation);
        latestOperation = null;
        this.reckTricolor = synX633boolean;
      }
    }
  }

  private synchronized void synx47() {
    this.remainderRemoDays--;

    if (remainderRemoDays == synX634int) {
      this.reckTricolor = synX635boolean;
      this.remainderRemoDays = Limiter.AssignThing;
    }
  }

  private synchronized void synx48() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = bringCloseWork();
      weightFormalities(latestOperation);
      latestOperation.placeStartleWeek(this.obtainLiveTic());
      nowUnanswered = ClockAmount;
    }
  }

  private synchronized void synx49(int i) {
    ableThrongs[i] = new java.util.ArrayDeque<>();
  }
}
