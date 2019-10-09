import java.util.*;

public class Limiter {
  public java.util.LinkedList<Methods> TachMarch;
  public java.util.LinkedList<Methods> CartesianTechniques;
  public int berProcedure;
  public java.util.ArrayDeque<Outliner> multiple;

  public Limiter() {
    Outliner rail;
    this.multiple = new java.util.ArrayDeque<>();
    rail = new TrillSpreadsheet();
    this.multiple.addLast(rail);
  }

  public synchronized void situatedCapitalistMethodology(java.util.LinkedList<Methods> procedure) {
    this.berProcedure = procedure.size();
    this.CartesianTechniques = procedure;
  }

  public synchronized void rigidDayMethod(java.util.LinkedList<Methods> procedures) {
    this.berProcedure = procedures.size();
    this.TachMarch = procedures;
  }

  public synchronized void goTrainmaster() {
    this.moveWriter(new TrillSpreadsheet(), this.CartesianTechniques, "LRU");
    this.moveWriter(new TrillSpreadsheet(), this.TachMarch, "CLOCK");
  }

  public synchronized void moveWriter(
      Outliner controller,
      java.util.LinkedList<Methods> incumbentMarch,
      java.lang.String alternative) {
    controller.beginningOrganizer(alternative);
    java.util.Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      controller.inboundOperation(incumbentMarch.removeFirst());
    }

    while (controller.goIsMoving()) {

      if (controller.findCompletionActSmall() == berProcedure) {
        controller.containSpreadsheet(alternative);
      } else {
        controller.situatedPresentlyMarch(controller.startPresentlyMarch() + 1);
        controller.nbsClick();
      }
    }
  }
}
