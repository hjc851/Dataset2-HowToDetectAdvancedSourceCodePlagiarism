package initialization;

import distributors.Salesperson;
import initialization.Server;
import initialization.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeasuredServer extends initialization.Server {
  public java.util.Comparator<Mechanism> comparative;

  public synchronized void snoTicktock() {

    if (streamPhase != null) synx93();

    if (!preparesSuspense.isEmpty() && streamPhase != null) synx94();

    if (this.sthCloth && streamPhase == null) synx95();
    else synx96();
  }

  public class TreatYardstick implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism at, Mechanism gpi) {
      int interferonStay;
      int gpiLeft;
      interferonStay = at.generateHonchoFootprint() - at.canLengthwaysYears();
      gpiLeft = gpi.generateHonchoFootprint() - gpi.canLengthwaysYears();

      if (interferonStay < gpiLeft) {
        return -1;
      }

      if (interferonStay > gpiLeft) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmerEpithet() {
    return "SRT:";
  }

  public synchronized void litigateArriving(Mechanism mechanism) {
    preparesSuspense.add(mechanism);
  }

  public MeasuredServer() {
    this.comparative = new TreatYardstick();
    this.preparesSuspense = new java.util.PriorityQueue<>(5, comparative);
  }

  public java.util.PriorityQueue<Mechanism> preparesSuspense;

  private synchronized void synx93() {
    streamPhase.orderedFunctionalChance(streamPhase.canLengthwaysYears() + 1);

    if (streamPhase.canLengthwaysYears() == streamPhase.generateHonchoFootprint()) {
      streamPhase.fixedEscapeOpportunity(this.catchRifeCheck());
      this.inauguratedOperations.addLast(streamPhase);
      streamPhase = null;
      this.sthCloth = true;
    }
  }

  private synchronized void synx94() {
    int typicalMaintaining;
    int ganderUnexhausted;
    typicalMaintaining = streamPhase.generateHonchoFootprint() - streamPhase.canLengthwaysYears();
    ganderUnexhausted =
        preparesSuspense.peek().generateHonchoFootprint()
            - preparesSuspense.peek().canLengthwaysYears();

    if (ganderUnexhausted < typicalMaintaining) {
      preparesSuspense.add(streamPhase);
      streamPhase = null;
      this.sthCloth = true;
    }
  }

  private synchronized void synx95() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.sthCloth = false;
      this.anotherBurberryYears = Salesperson.CompleteSentence;
    }
  }

  private synchronized void synx96() {

    if (streamPhase == null && !preparesSuspense.isEmpty()) {
      streamPhase = preparesSuspense.poll();
      incumbranceSystem(streamPhase);
      streamPhase.solidifyingRunJuncture(this.catchRifeCheck());
    }
  }
}
