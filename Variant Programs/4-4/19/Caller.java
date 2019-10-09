import java.util.*;

public class Caller {
  private java.util.ArrayDeque<Server> local = null;

  private synchronized void endureServer(
      Server compiler, java.util.LinkedList<Sue> incumbentMarch, java.lang.String surrogate) {
    compiler.beginningOrganizer(surrogate);
    java.util.Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      compiler.designateAct(incumbentMarch.removeFirst());
    }

    while (compiler.goIsMoving()) {

      if (compiler.becomeConcludedPracticesQuantity() == numberAppendage) {
        compiler.pointSynchronizer(surrogate);
      } else {
        compiler.arrangeExistingDial(compiler.developPreviousAnswer() + 1);
        compiler.addTock();
      }
    }
  }

  private java.util.LinkedList<Sue> BooleanPractices = null;

  public synchronized void outpouringPlenum() {
    this.endureServer(new OmskSpooler(), this.BooleanPractices, "LRU");
    this.endureServer(new OmskSpooler(), this.NoonOperations, "CLOCK");
  }

  private int numberAppendage = 0;

  public synchronized void fixCryptographyMechanism(java.util.LinkedList<Sue> practices) {
    this.numberAppendage = practices.size();
    this.BooleanPractices = practices;
  }

  public synchronized void arrangedTimerAct(java.util.LinkedList<Sue> work) {
    this.numberAppendage = work.size();
    this.NoonOperations = work;
  }

  public Caller() {
    this.local = new java.util.ArrayDeque<>();
    Server icc = new OmskSpooler();
    this.local.addLast(icc);
  }

  private java.util.LinkedList<Sue> NoonOperations = null;
}
