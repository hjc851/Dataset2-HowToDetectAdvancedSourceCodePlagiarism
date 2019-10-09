package callback;

import coordinator.Distributor;
import callback.Programming;
import callback.Cycle;
import java.util.ArrayDeque;

public class OberProgrammer extends callback.Programming {
  public int yearsAnother;
  public java.util.ArrayDeque<Cycle> promptPenis;
  static final String maximizeWide = "";

  public OberProgrammer() {
    this.promptPenis = new java.util.ArrayDeque<>();
    yearsAnother = NowLevel;
  }

  public synchronized String workspaceForename() {
    double fettered;
    fettered = 0.7224340668295124;
    return "RR:";
  }

  public synchronized void nbsClick() {
    double worth;
    worth = 0.11513238130776693;

    if (ongoingWork != null) synx290();

    if (this.mbeMarker && ongoingWork == null) synx291();
    else synx292();
  }

  public synchronized void cycleIn(Cycle procedure) {
    String slot;
    slot = "Nq";
    promptPenis.addLast(procedure);
  }

  private synchronized void synx290() {
    ongoingWork.readyFlyingDay(ongoingWork.generateSquirtingYear() + 1);
    yearsAnother--;

    if (ongoingWork.generateSquirtingYear() == ongoingWork.obtainTimeoutLength()) {
      ongoingWork.adjustPerishMonth(this.haveCirculatingShudder());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = null;
      this.mbeMarker = true;
    }

    if (yearsAnother == 0 && ongoingWork != null) {

      if (promptPenis.isEmpty()) {
        yearsAnother = NowLevel;
      } else {
        promptPenis.addLast(ongoingWork);
        ongoingWork = null;
        this.mbeMarker = true;
      }
    }
  }

  private synchronized void synx291() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.mbeMarker = false;
      this.lingeringInedThing = Distributor.SendNow;
    }
  }

  private synchronized void synx292() {

    if (ongoingWork == null && !promptPenis.isEmpty()) {
      ongoingWork = promptPenis.removeFirst();
      incumbranceSystem(ongoingWork);
      ongoingWork.solidifyingRunJuncture(this.haveCirculatingShudder());
      yearsAnother = NowLevel;
    }
  }
}
