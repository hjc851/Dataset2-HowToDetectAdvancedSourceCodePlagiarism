package writer;

import forwarder.Caller;
import writer.Synchronizer;
import writer.March;
import java.util.ArrayDeque;

public class LyraSynchronizer extends writer.Synchronizer {
  private static final boolean synX1717boolean = false;
  private static final int synX1716int = 0;
  private static final boolean synX1715boolean = true;
  private static final int synX1714int = 0;
  private static final boolean synX1713boolean = true;
  private static final int synX1712int = 1;
  private static final int synX1711int = -696348893;
  private static final int synX1710int = -78248895;
  private static final String synX1709String = "RR:";
  private static final int synX1708int = 1412657520;
  static double levelPinioned = 0.8908123836799821;
  public java.util.ArrayDeque<March> poisedDipper;
  public int junctureMaintaining;

  public LyraSynchronizer() {
    this.poisedDipper = (new java.util.ArrayDeque<>());
    junctureMaintaining = (AgainGiant);
  }

  public synchronized String compilerMake() {
    int treated = synX1708int;
    return synX1709String;
  }

  public synchronized void bsiShudder() {
    int rate = synX1710int;

    if (existingCycle != null) synx230();

    if (this.fellyAlert && existingCycle == null) synx231();
    else synx232();
  }

  public synchronized void mechanismArrivals(March work) {
    int distinguish = synX1711int;
    poisedDipper.addLast(work);
  }

  private synchronized void synx230() {
    existingCycle.placedJettingWhen(existingCycle.beatRollingJuncture() + synX1712int);
    junctureMaintaining--;

    if (existingCycle.beatRollingJuncture() == existingCycle.findImplementationSmall()) {
      existingCycle.rigidQuittingAmount(this.takeTopicalMark());
      this.undertakenMarch.addLast(existingCycle);
      existingCycle = (null);
      this.fellyAlert = (synX1713boolean);
    }

    if (junctureMaintaining == synX1714int && existingCycle != null) {

      if (poisedDipper.isEmpty()) {
        junctureMaintaining = (AgainGiant);
      } else {
        poisedDipper.addLast(existingCycle);
        existingCycle = (null);
        this.fellyAlert = (synX1715boolean);
      }
    }
  }

  private synchronized void synx231() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX1716int) {
      this.fellyAlert = (synX1717boolean);
      this.unexpendedThmSentence = (Caller.DispatchesHours);
    }
  }

  private synchronized void synx232() {

    if (existingCycle == null && !poisedDipper.isEmpty()) {
      existingCycle = (poisedDipper.removeFirst());
      loaderNegotiations(existingCycle);
      existingCycle.placedJumpWhen(this.takeTopicalMark());
      junctureMaintaining = (AgainGiant);
    }
  }
}
