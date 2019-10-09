import java.util.*;

public class Limiter {
  private java.util.ArrayDeque<Planner> systems;
  private int generMethodology;
  private java.util.LinkedList<Proceeding> CartesianTechniques;
  private java.util.LinkedList<Proceeding> SynchronizationMethods;

  public Limiter() {
    this.systems = new java.util.ArrayDeque<>();
    Planner ac = new OhioSynchronization();
    this.systems.addLast(ac);
  }

  public void settledAttractorServe(java.util.LinkedList<Proceeding> appendage) {
    this.generMethodology = appendage.size();
    this.CartesianTechniques = appendage;
  }

  public void adjustHoursProcedures(java.util.LinkedList<Proceeding> outgrowth) {
    this.generMethodology = outgrowth.size();
    this.SynchronizationMethods = outgrowth;
  }

  public void ramRegulator() {
    this.extendSynchronization(new OhioSynchronization(), this.CartesianTechniques, "LRU");
    this.extendSynchronization(new OhioSynchronization(), this.SynchronizationMethods, "CLOCK");
  }

  private void extendSynchronization(
      Planner parser, java.util.LinkedList<Proceeding> afootSummons, java.lang.String successor) {
    parser.originateConfiguration(successor);
    java.util.Collections.sort(afootSummons);

    while (!afootSummons.isEmpty()) {
      parser.outboundProceeding(afootSummons.removeFirst());
    }

    while (parser.goIsMoving()) {

      if (parser.startConstructedMethodologyBreadth() == generMethodology) {
        parser.arrestCompiler(successor);
      } else {
        parser.fixThisValidation(parser.arriveFlowIndicate() + 1);
        parser.nsoTic();
      }
    }
  }
}
