import java.util.*;

public class Mailer {
  private ArrayDeque<Developer> available;
  private int numbersOutgrowth;
  private LinkedList<March> UsingOperation;
  private LinkedList<March> HourSummons;

  public Mailer() {
    this.available = new ArrayDeque<>();
    Developer gpa = new StasConfiguration();
    this.available.addLast(gpa);
  }

  public void bentBlockbusterTechnologies(LinkedList<March> practices) {
    this.numbersOutgrowth = practices.size();
    this.UsingOperation = practices;
  }

  public void fixCountMechanism(LinkedList<March> technologies) {
    this.numbersOutgrowth = technologies.size();
    this.HourSummons = technologies;
  }

  public void passMailer() {
    this.passDeveloper(new StasConfiguration(), this.UsingOperation, "LRU");
    this.passDeveloper(new StasConfiguration(), this.HourSummons, "CLOCK");
  }

  private void passDeveloper(
      Developer database, LinkedList<March> prevailingProcedure, String substituted) {
    database.runDebugging(substituted);
    Collections.sort(prevailingProcedure);

    while (!prevailingProcedure.isEmpty()) {
      database.inwardServe(prevailingProcedure.removeFirst());
    }

    while (database.goIsMoving()) {

      if (database.conveyFulfilledMethodNumber() == numbersOutgrowth) {
        database.stoppageController(substituted);
      } else {
        database.primedTopicalMark(database.sustainThisValidation() + 1);
        database.bsiShudder();
      }
    }
  }
}
