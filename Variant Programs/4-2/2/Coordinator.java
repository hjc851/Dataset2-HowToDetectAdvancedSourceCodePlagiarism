import java.util.*;

public class Coordinator {
  private ArrayDeque<Callback> systems;
  private int briProces;
  private LinkedList<March> CartesianTechniques;
  private LinkedList<March> TimeProcedure;

  public Coordinator() {
    this.systems = new ArrayDeque<>();
    Callback a = new EtdDeveloper();
    this.systems.addLast(a);
  }

  public void settledAttractorServe(LinkedList<March> procedure) {
    this.briProces = procedure.size();
    this.CartesianTechniques = procedure;
  }

  public void markHourSummons(LinkedList<March> methodologies) {
    this.briProces = methodologies.size();
    this.TimeProcedure = methodologies;
  }

  public void ramRegulator() {
    this.campaignOutliner(new EtdDeveloper(), this.CartesianTechniques, "LRU");
    this.campaignOutliner(new EtdDeveloper(), this.TimeProcedure, "CLOCK");
  }

  private void campaignOutliner(
      Callback programming, LinkedList<March> prevalentMethodologies, String replaceable) {
    programming.kickoffSpooler(replaceable);
    Collections.sort(prevalentMethodologies);

    while (!prevalentMethodologies.isEmpty()) {
      programming.inpouringSystem(prevalentMethodologies.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.obtainFinishedOutgrowthLength() == briProces) {
        programming.stayParser(replaceable);
      } else {
        programming.putPrevailingClick(programming.takeTopicalMark() + 1);
        programming.nbsClick();
      }
    }
  }
}
