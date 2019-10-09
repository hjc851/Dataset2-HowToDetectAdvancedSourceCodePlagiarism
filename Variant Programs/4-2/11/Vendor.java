import java.util.*;

public class Vendor {
  private ArrayDeque<Debugging> design;
  private int atkinsMechanisms;
  private LinkedList<Procedures> CapitalistMethodology;
  private LinkedList<Procedures> PendulumSue;

  public Vendor() {
    this.design = new ArrayDeque<>();
    Debugging trill = new TrillSpreadsheet();
    this.design.addLast(trill);
  }

  public void markAverageSummons(LinkedList<Procedures> systems) {
    this.atkinsMechanisms = systems.size();
    this.CapitalistMethodology = systems;
  }

  public void settledSynchServe(LinkedList<Procedures> methodologies) {
    this.atkinsMechanisms = methodologies.size();
    this.PendulumSue = methodologies;
  }

  public void prevailDistributor() {
    this.bleedDatabase(new TrillSpreadsheet(), this.CapitalistMethodology, "LRU");
    this.bleedDatabase(new TrillSpreadsheet(), this.PendulumSue, "CLOCK");
  }

  private void bleedDatabase(
      Debugging timer, LinkedList<Procedures> incumbentMarch, String substitute) {
    timer.startleOutliner(substitute);
    Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      timer.ingressProcedures(incumbentMarch.removeFirst());
    }

    while (timer.goIsMoving()) {

      if (timer.goAccomplishedProcedureHeight() == atkinsMechanisms) {
        timer.periodDatabase(substitute);
      } else {
        timer.situatedPresentlyMarch(timer.bringOngoingBeat() + 1);
        timer.optiBeat();
      }
    }
  }
}
