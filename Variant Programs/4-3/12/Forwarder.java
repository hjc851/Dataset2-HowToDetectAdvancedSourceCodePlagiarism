import java.util.*;

public class Forwarder {
  private ArrayDeque<Compiler> use = null;
  private int reesPractices = 0;
  private LinkedList<Sue> AttractorServe = null;
  private LinkedList<Sue> TachMarch = null;

  public Forwarder() {
    this.use = new ArrayDeque<>();
    Compiler e = new EtdDeveloper();
    this.use.addLast(e);
  }

  public synchronized void putHasProcedure(LinkedList<Sue> march) {
    this.reesPractices = march.size();
    this.AttractorServe = march;
  }

  public synchronized void dictatedClockworkWork(LinkedList<Sue> techniques) {
    this.reesPractices = techniques.size();
    this.TachMarch = techniques;
  }

  public synchronized void bleedOriginator() {
    this.testMultitasking(new EtdDeveloper(), this.AttractorServe, "LRU");
    this.testMultitasking(new EtdDeveloper(), this.TachMarch, "CLOCK");
  }

  private synchronized void testMultitasking(
      Compiler compiler, LinkedList<Sue> underwayTreat, String successor) {
    compiler.getInterface(successor);
    Collections.sort(underwayTreat);

    while (!underwayTreat.isEmpty()) {
      compiler.electedMethods(underwayTreat.removeFirst());
    }

    while (compiler.goIsMoving()) {

      if (compiler.fixAchievedMechanismsProportions() == reesPractices) {
        compiler.kiboshSynchronization(successor);
      } else {
        compiler.readyIncumbentTock(compiler.conveyFormerGene() + 1);
        compiler.nbsClick();
      }
    }
  }
}
