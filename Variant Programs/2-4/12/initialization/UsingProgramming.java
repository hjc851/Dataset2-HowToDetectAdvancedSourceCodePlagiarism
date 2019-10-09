package initialization;

import distributors.Salesperson;
import initialization.Server;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class UsingProgramming extends initialization.Server {

  public synchronized String programmerEpithet() {
    return "FCFS:";
  }

  public java.util.ArrayDeque<Mechanism> happyStopper;

  public synchronized void litigateArriving(Mechanism system) {
    happyStopper.addLast(system);
  }

  public UsingProgramming() {
    this.happyStopper = new java.util.ArrayDeque<>();
  }

  public synchronized void snoTicktock() {

    if (streamPhase != null) synx97();

    if (this.sthCloth && streamPhase == null) synx98();
    else synx99();
  }

  private synchronized void synx97() {
    streamPhase.orderedFunctionalChance(streamPhase.canLengthwaysYears() + 1);

    if (streamPhase.canLengthwaysYears() == streamPhase.generateHonchoFootprint()) {
      streamPhase.fixedEscapeOpportunity(this.catchRifeCheck());
      this.inauguratedOperations.addLast(streamPhase);
      streamPhase = null;
      this.sthCloth = true;
    }
  }

  private synchronized void synx98() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.sthCloth = false;
      this.anotherBurberryYears = Salesperson.CompleteSentence;
    }
  }

  private synchronized void synx99() {

    if (streamPhase == null && !happyStopper.isEmpty()) {
      streamPhase = happyStopper.removeFirst();
      streamPhase.solidifyingRunJuncture(this.catchRifeCheck());
      incumbranceSystem(streamPhase);
    }
  }
}
