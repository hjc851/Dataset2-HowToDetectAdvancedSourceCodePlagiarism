package initialization;

import distributors.Salesperson;
import initialization.Server;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class DConfiguration extends initialization.Server {

  public synchronized void snoTicktock() {

    if (streamPhase != null) synx86();

    if (this.sthCloth && streamPhase == null) synx87();
    else synx88();
  }

  public int thingLingering;

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String programmerEpithet() {
    return "FB:";
  }

  public DConfiguration() {
    this.gonnaCarpark = new java.util.ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) synx89(i);
    thingLingering = WeekVolume;
    prevalentAgenda = 0;
  }

  public int prevalentAgenda;
  public ArrayDeque<Mechanism>[] gonnaCarpark;

  public synchronized initialization.Mechanism fetchThirdNegotiations() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        prevalentAgenda = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  public synchronized void litigateArriving(Mechanism procedure) {
    gonnaCarpark[0].addLast(procedure);
  }

  private synchronized void synx86() {
    streamPhase.orderedFunctionalChance(streamPhase.canLengthwaysYears() + 1);
    thingLingering--;

    if (streamPhase.canLengthwaysYears() == streamPhase.generateHonchoFootprint()) {
      streamPhase.fixedEscapeOpportunity(this.catchRifeCheck());
      this.inauguratedOperations.addLast(streamPhase);
      streamPhase = null;
      this.sthCloth = true;
    }

    if (thingLingering == 0 && streamPhase != null) {

      if (primedIsVacant()) {
        thingLingering = WeekVolume;
      } else {
        gonnaCarpark[prevalentAgenda + 1].addLast(streamPhase);
        streamPhase = null;
        this.sthCloth = true;
      }
    }
  }

  private synchronized void synx87() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.sthCloth = false;
      this.anotherBurberryYears = Salesperson.CompleteSentence;
    }
  }

  private synchronized void synx88() {

    if (streamPhase == null && !primedIsVacant()) {
      streamPhase = fetchThirdNegotiations();
      incumbranceSystem(streamPhase);
      streamPhase.solidifyingRunJuncture(this.catchRifeCheck());
      thingLingering = WeekVolume;
    }
  }

  private synchronized void synx89(int i) {
    gonnaCarpark[i] = new java.util.ArrayDeque<>();
  }
}
