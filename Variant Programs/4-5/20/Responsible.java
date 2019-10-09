import java.util.*;

public class Responsible {
  public ArrayDeque<Configuration> use;
  public int briProces;
  public LinkedList<Sue> AttractorServe;
  public LinkedList<Sue> BackProces;

  public Responsible() {
    this.use = new ArrayDeque<>();
    Configuration lyra = new BWorkspace();
    this.use.addLast(lyra);
  }

  public synchronized void layLfuLitigate(LinkedList<Sue> systems) {
    this.briProces = systems.size();
    this.AttractorServe = systems;
  }

  public synchronized void layCountdownLitigate(LinkedList<Sue> mechanism) {
    this.briProces = mechanism.size();
    this.BackProces = mechanism;
  }

  public synchronized void leadCoordinator() {
    this.driveProgrammer(new BWorkspace(), this.AttractorServe, "LRU");
    this.driveProgrammer(new BWorkspace(), this.BackProces, "CLOCK");
  }

  public synchronized void driveProgrammer(
      Configuration synchronizer, LinkedList<Sue> topicalAppendage, String reinstatement) {
    synchronizer.beginsCallback(reinstatement);
    Collections.sort(topicalAppendage);

    while (!topicalAppendage.isEmpty()) synx165(synchronizer, topicalAppendage);

    while (synchronizer.goIsMoving()) synx166(synchronizer, reinstatement);
  }

  private synchronized void synx165(
      Configuration synchronizer, java.util.LinkedList<Sue> topicalAppendage) {
    synchronizer.nextSue(topicalAppendage.removeFirst());
  }

  private synchronized void synx166(Configuration synchronizer, String reinstatement) {

    if (synchronizer.fixAchievedMechanismsProportions() == briProces) {
      synchronizer.arrestCompiler(reinstatement);
    } else {
      synchronizer.rigidFormerGene(synchronizer.conveyFormerGene() + 1);
      synchronizer.addTock();
    }
  }
}
