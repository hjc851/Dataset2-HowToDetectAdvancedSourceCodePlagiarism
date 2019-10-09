import java.util.*;

public class Dealer {
  public java.util.LinkedList<Proceedings> CountdownLitigate = null;
  public java.util.LinkedList<Proceedings> ReplacementMarch = null;
  public int yumAct = 0;
  public java.util.ArrayDeque<Initialization> different = null;

  public Dealer() {
    Initialization caboose;
    this.different = (new java.util.ArrayDeque<>());
    caboose = (new OximeWorkflow());
    this.different.addLast(caboose);
  }

  public synchronized void determinedAlbedoOutgrowth(java.util.LinkedList<Proceedings> appendage) {
    this.yumAct = (appendage.size());
    this.ReplacementMarch = (appendage);
  }

  public synchronized void placedPendulumSue(java.util.LinkedList<Proceedings> methodology) {
    this.yumAct = (methodology.size());
    this.CountdownLitigate = (methodology);
  }

  public synchronized void driveYardmaster() {
    this.moveWriter(new OximeWorkflow(), this.ReplacementMarch, "LRU");
    this.moveWriter(new OximeWorkflow(), this.CountdownLitigate, "CLOCK");
  }

  public synchronized void moveWriter(
      Initialization controller,
      java.util.LinkedList<Proceedings> typicalOperations,
      java.lang.String alternate) {
    controller.firstPlanner(alternate);
    java.util.Collections.sort(typicalOperations);

    while (!typicalOperations.isEmpty()) synx369(controller, typicalOperations);

    while (controller.goIsMoving()) synx370(controller, alternate);
  }

  private synchronized void synx369(
      Initialization controller, java.util.LinkedList<Proceedings> typicalOperations) {
    controller.inflowingSummons(typicalOperations.removeFirst());
  }

  private synchronized void synx370(Initialization controller, String alternate) {

    if (controller.bringRealizedWorkWidth() == yumAct) {
      controller.hitchMultitasking(alternate);
    } else {
      controller.rigidFormerGene(controller.fixNewTally() + 1);
      controller.weapMark();
    }
  }
}
