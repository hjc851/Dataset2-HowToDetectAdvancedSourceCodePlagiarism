import java.util.*;

public class Regulator {
  private ArrayDeque<Initialization> local;
  private int yummyMarch;
  private LinkedList<Outgrowth> AutocorrelationSue;
  private LinkedList<Outgrowth> BackProces;

  public Regulator() {
    this.local = new ArrayDeque<>();
    Initialization icc = new OberProgrammer();
    this.local.addLast(icc);
  }

  public void arrangedFifoAct(LinkedList<Outgrowth> method) {
    this.yummyMarch = method.size();
    this.AutocorrelationSue = method;
  }

  public void layCountdownLitigate(LinkedList<Outgrowth> systems) {
    this.yummyMarch = systems.size();
    this.BackProces = systems;
  }

  public void campaignReseller() {
    this.tallyConfiguration(new OberProgrammer(), this.AutocorrelationSue, "LRU");
    this.tallyConfiguration(new OberProgrammer(), this.BackProces, "CLOCK");
  }

  private void tallyConfiguration(
      Initialization spooler, LinkedList<Outgrowth> prevailingProcedure, String substitution) {
    spooler.partWorkflow(substitution);
    Collections.sort(prevailingProcedure);

    while (!prevailingProcedure.isEmpty()) {
      spooler.inflowingSummons(prevailingProcedure.removeFirst());
    }

    while (spooler.goIsMoving()) {

      if (spooler.produceUndergoneMethodologiesDensity() == yummyMarch) {
        spooler.interceptSpooler(substitution);
      } else {
        spooler.markAfootDials(spooler.obtainLiveTic() + 1);
        spooler.nsoTic();
      }
    }
  }
}
