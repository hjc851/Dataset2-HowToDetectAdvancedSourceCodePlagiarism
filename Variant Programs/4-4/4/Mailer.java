import java.util.*;

public class Mailer {
  private java.util.LinkedList<Work> TimerAct = null;
  private java.util.LinkedList<Work> AlbedoOutgrowth = null;
  private int generMethodology = 0;
  private java.util.ArrayDeque<Callback> planners = null;

  public Mailer() {
    Callback etd;
    this.planners = new java.util.ArrayDeque<>();
    etd = new RailCompiler();
    this.planners.addLast(etd);
  }

  public synchronized void bentBlockbusterTechnologies(java.util.LinkedList<Work> procedure) {
    this.generMethodology = procedure.size();
    this.AlbedoOutgrowth = procedure;
  }

  public synchronized void adjustHoursProcedures(java.util.LinkedList<Work> outgrowth) {
    this.generMethodology = outgrowth.size();
    this.TimerAct = outgrowth;
  }

  public synchronized void raceShipper() {
    this.workWorkflow(new RailCompiler(), this.AlbedoOutgrowth, "LRU");
    this.workWorkflow(new RailCompiler(), this.TimerAct, "CLOCK");
  }

  private synchronized void workWorkflow(
      Callback developer, java.util.LinkedList<Work> ongoingWork, java.lang.String alternative) {
    developer.openingInitialization(alternative);
    java.util.Collections.sort(ongoingWork);

    while (!ongoingWork.isEmpty()) {
      developer.entranceMethod(ongoingWork.removeFirst());
    }

    while (developer.goIsMoving()) {

      if (developer.catchFinalizeSueScale() == generMethodology) {
        developer.arrestCompiler(alternative);
      } else {
        developer.layContemporaryTicktack(developer.beatTypicalGenetic() + 1);
        developer.snoTicktock();
      }
    }
  }
}
