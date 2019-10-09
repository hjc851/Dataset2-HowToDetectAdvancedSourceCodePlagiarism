import java.util.*;

public class Limiter {
  private ArrayDeque<Multitasking> human;
  private int lageTechniques;
  private LinkedList<Formalities> AutomatonTreat;
  private LinkedList<Formalities> CountingTreat;

  public Limiter() {
    this.human = new ArrayDeque<>();
    Multitasking a = new ApDatabase();
    this.human.addLast(a);
  }

  public void arrangeBetasMethods(LinkedList<Formalities> operation) {
    this.lageTechniques = operation.size();
    this.AutomatonTreat = operation;
  }

  public void laidStopwatchOperation(LinkedList<Formalities> march) {
    this.lageTechniques = march.size();
    this.CountingTreat = march;
  }

  public void footraceLimiter() {
    this.operateProgramming(new ApDatabase(), this.AutomatonTreat, "LRU");
    this.operateProgramming(new ApDatabase(), this.CountingTreat, "CLOCK");
  }

  private void operateProgramming(
      Multitasking database, LinkedList<Formalities> ongoingWork, String alternate) {
    database.beginsCallback(alternate);
    Collections.sort(ongoingWork);

    while (!ongoingWork.isEmpty()) {
      database.futureMarch(ongoingWork.removeFirst());
    }

    while (database.goIsMoving()) {

      if (database.startConstructedMethodologyBreadth() == lageTechniques) {
        database.stoppageController(alternate);
      } else {
        database.arrangedActualRetick(database.producePrevalentScore() + 1);
        database.nbsClick();
      }
    }
  }
}
