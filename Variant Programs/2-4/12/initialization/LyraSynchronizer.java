package initialization;

import distributors.Salesperson;
import initialization.Server;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class LyraSynchronizer extends initialization.Server {

  public LyraSynchronizer() {
    this.wantGlue = new java.util.ArrayDeque<>();
    clipOther = WeekVolume;
  }

  public int clipOther;
  public java.util.ArrayDeque<Mechanism> wantGlue;

  public synchronized void litigateArriving(Mechanism mechanisms) {
    wantGlue.addLast(mechanisms);
  }

  public synchronized void snoTicktock() {

    if (streamPhase != null) synx90();

    if (this.sthCloth && streamPhase == null) synx91();
    else synx92();
  }

  public synchronized String programmerEpithet() {
    return "RR:";
  }

  private synchronized void synx90() {
    streamPhase.orderedFunctionalChance(streamPhase.canLengthwaysYears() + 1);
    clipOther--;

    if (streamPhase.canLengthwaysYears() == streamPhase.generateHonchoFootprint()) {
      streamPhase.fixedEscapeOpportunity(this.catchRifeCheck());
      this.inauguratedOperations.addLast(streamPhase);
      streamPhase = null;
      this.sthCloth = true;
    }

    if (clipOther == 0 && streamPhase != null) {

      if (wantGlue.isEmpty()) {
        clipOther = WeekVolume;
      } else {
        wantGlue.addLast(streamPhase);
        streamPhase = null;
        this.sthCloth = true;
      }
    }
  }

  private synchronized void synx91() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.sthCloth = false;
      this.anotherBurberryYears = Salesperson.CompleteSentence;
    }
  }

  private synchronized void synx92() {

    if (streamPhase == null && !wantGlue.isEmpty()) {
      streamPhase = wantGlue.removeFirst();
      incumbranceSystem(streamPhase);
      streamPhase.solidifyingRunJuncture(this.catchRifeCheck());
      clipOther = WeekVolume;
    }
  }
}
