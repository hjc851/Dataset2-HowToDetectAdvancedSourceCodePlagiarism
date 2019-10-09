package writer;

import forwarder.Caller;
import writer.Synchronizer;
import writer.March;
import java.util.ArrayDeque;

public class LampsProgrammer extends writer.Synchronizer {
  private static final boolean synX1725boolean = false;
  private static final int synX1724int = 0;
  private static final boolean synX1723boolean = true;
  private static final int synX1722int = 1;
  private static final int synX1721int = 66737333;
  private static final String synX1720String = "h";
  private static final String synX1719String = "FCFS:";
  private static final double synX1718double = 0.9200156620443829;
  static double fionaComponents = 0.0692183631681208;
  public java.util.ArrayDeque<March> cookCue;

  public LampsProgrammer() {
    this.cookCue = (new java.util.ArrayDeque<>());
  }

  public synchronized String compilerMake() {
    double reducedLeaping = synX1718double;
    return synX1719String;
  }

  public synchronized void bsiShudder() {
    String nameBelongings = synX1720String;

    if (existingCycle != null) synx237();

    if (this.fellyAlert && existingCycle == null) synx238();
    else synx239();
  }

  public synchronized void mechanismArrivals(March method) {
    int reduceConstrain = synX1721int;
    cookCue.addLast(method);
  }

  private synchronized void synx237() {
    existingCycle.placedJettingWhen(existingCycle.beatRollingJuncture() + synX1722int);

    if (existingCycle.beatRollingJuncture() == existingCycle.findImplementationSmall()) {
      existingCycle.rigidQuittingAmount(this.takeTopicalMark());
      this.undertakenMarch.addLast(existingCycle);
      existingCycle = (null);
      this.fellyAlert = (synX1723boolean);
    }
  }

  private synchronized void synx238() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX1724int) {
      this.fellyAlert = (synX1725boolean);
      this.unexpendedThmSentence = (Caller.DispatchesHours);
    }
  }

  private synchronized void synx239() {

    if (existingCycle == null && !cookCue.isEmpty()) {
      existingCycle = (cookCue.removeFirst());
      existingCycle.placedJumpWhen(this.takeTopicalMark());
      loaderNegotiations(existingCycle);
    }
  }
}
