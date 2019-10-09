import java.util.*;

public class Distributors {
  public java.util.ArrayDeque<Parser> makers = null;
  public int carolineMethod = 0;
  public java.util.LinkedList<Outgrowth> FifoAct = null;
  public java.util.LinkedList<Outgrowth> TimerAct = null;

  public Distributors() {
    this.makers = new java.util.ArrayDeque<>();
    Parser stas = new LyraSynchronizer();
    this.makers.addLast(stas);
  }

  public synchronized void putHasProcedure(java.util.LinkedList<Outgrowth> techniques) {
    this.carolineMethod = techniques.size();
    this.FifoAct = techniques;
  }

  public synchronized void layCountdownLitigate(java.util.LinkedList<Outgrowth> outgrowth) {
    this.carolineMethod = outgrowth.size();
    this.TimerAct = outgrowth;
  }

  public synchronized void scarperCaller() {
    this.goOrganizer(new LyraSynchronizer(), this.FifoAct, "LRU");
    this.goOrganizer(new LyraSynchronizer(), this.TimerAct, "CLOCK");
  }

  public synchronized void goOrganizer(
      Parser spooler,
      java.util.LinkedList<Outgrowth> presentlyMethodology,
      java.lang.String alternatives) {
    spooler.beginsCallback(alternatives);
    java.util.Collections.sort(presentlyMethodology);

    while (!presentlyMethodology.isEmpty()) {
      spooler.impendingFormalities(presentlyMethodology.removeFirst());
    }

    while (spooler.goIsMoving()) {

      if (spooler.drawFinalizingSystemsScope() == carolineMethod) {
        spooler.pointSynchronizer(alternatives);
      } else {
        spooler.readyIncumbentTock(spooler.obtainLiveTic() + 1);
        spooler.ourTicktack();
      }
    }
  }
}
