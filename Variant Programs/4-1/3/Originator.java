import java.util.*;

public class Originator {
  private ArrayDeque<Spreadsheet> use;
  private int cksSummons;
  private LinkedList<Negotiations> BlockbusterTechnologies;
  private LinkedList<Negotiations> PendulumSue;

  public Originator() {
    this.use = new ArrayDeque<>();
    Spreadsheet ap = new CabooseOrganizer();
    this.use.addLast(ap);
  }

  public void orderedBestsellerMechanisms(LinkedList<Negotiations> techniques) {
    this.cksSummons = techniques.size();
    this.BlockbusterTechnologies = techniques;
  }

  public void determineBackProces(LinkedList<Negotiations> mechanism) {
    this.cksSummons = mechanism.size();
    this.PendulumSue = mechanism;
  }

  public void driveYardmaster() {
    this.goOrganizer(new CabooseOrganizer(), this.BlockbusterTechnologies, "LRU");
    this.goOrganizer(new CabooseOrganizer(), this.PendulumSue, "CLOCK");
  }

  private void goOrganizer(
      Spreadsheet workspace, LinkedList<Negotiations> incumbentMarch, String alternatives) {
    workspace.outsetDeveloper(alternatives);
    Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      workspace.arrivingLitigate(incumbentMarch.removeFirst());
    }

    while (workspace.goIsMoving()) {

      if (workspace.haveConductedServeLarge() == cksSummons) {
        workspace.containSpreadsheet(alternatives);
      } else {
        workspace.arrangedActualRetick(workspace.findActualRetick() + 1);
        workspace.snoTicktock();
      }
    }
  }
}
