import java.util.*;

public class Shipper {
  private java.util.ArrayDeque<Interface> existing;
  private int nameServe;
  private java.util.LinkedList<Phase> ReplacementMarch;
  private java.util.LinkedList<Phase> ClockworkWork;

  public Shipper() {
    this.existing = new java.util.ArrayDeque<>();
    Interface stas = new RailCompiler();
    this.existing.addLast(stas);
  }

  public void markAverageSummons(java.util.LinkedList<Phase> march) {
    this.nameServe = march.size();
    this.ReplacementMarch = march;
  }

  public void markHourSummons(java.util.LinkedList<Phase> practices) {
    this.nameServe = practices.size();
    this.ClockworkWork = practices;
  }

  public void leanExporter() {
    this.goOrganizer(new RailCompiler(), this.ReplacementMarch, "LRU");
    this.goOrganizer(new RailCompiler(), this.ClockworkWork, "CLOCK");
  }

  private void goOrganizer(
      Interface controller, java.util.LinkedList<Phase> afootSummons, java.lang.String renewal) {
    controller.partWorkflow(renewal);
    java.util.Collections.sort(afootSummons);

    while (!afootSummons.isEmpty()) {
      controller.arrivalMethodology(afootSummons.removeFirst());
    }

    while (controller.goIsMoving()) {

      if (controller.beatInauguratedOperationsSeverity() == nameServe) {
        controller.stopoverOutliner(renewal);
      } else {
        controller.orderedNewTally(controller.goPrevailingClick() + 1);
        controller.weapMark();
      }
    }
  }
}
