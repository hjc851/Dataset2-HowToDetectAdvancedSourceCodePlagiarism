import java.util.*;
import static java.util.Collections.sort;

public class Exporter {
  private static final int synX1399int = 1;
  private static final String synX1398String = "CLOCK";
  private static final String synX1397String = "LRU";
  public java.util.LinkedList<Proceedings> HoursProcedures;
  public java.util.LinkedList<Proceedings> CartesianTechniques;
  public int bersWork;
  public java.util.ArrayDeque<Controller> engineers;

  public Exporter() {
    Controller diners;
    this.engineers = new java.util.ArrayDeque<>();
    diners = new AController();
    this.engineers.addLast(diners);
  }

  public synchronized void determineCartelProces(java.util.LinkedList<Proceedings> work) {
    this.bersWork = work.size();
    this.CartesianTechniques = work;
  }

  public synchronized void adjustHoursProcedures(java.util.LinkedList<Proceedings> methodologies) {
    this.bersWork = methodologies.size();
    this.HoursProcedures = methodologies;
  }

  public synchronized void ramRegulator() {
    this.prevailSpreadsheet(new AController(), this.CartesianTechniques, synX1397String);
    this.prevailSpreadsheet(new AController(), this.HoursProcedures, synX1398String);
  }

  public synchronized void prevailSpreadsheet(
      Controller workflow,
      java.util.LinkedList<Proceedings> continuingTechniques,
      java.lang.String refilling) {
    workflow.restartDatabase(refilling);
    sort(continuingTechniques);

    while (!continuingTechniques.isEmpty()) {
      workflow.succeedingOutgrowth(continuingTechniques.removeFirst());
    }

    while (workflow.goIsMoving()) {

      if (workflow.fetchAttainedProcesVastness() == bersWork) {
        workflow.haltProgrammer(refilling);
      } else {
        workflow.solidifyingTypicalGenetic(workflow.producePrevalentScore() + synX1399int);
        workflow.ourTicktack();
      }
    }
  }
}
