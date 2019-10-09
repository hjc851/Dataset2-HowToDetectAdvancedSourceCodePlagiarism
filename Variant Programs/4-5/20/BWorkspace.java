import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BWorkspace extends Configuration {
  public ArrayDeque<Sue> eagerJunk;
  public ArrayDeque<Faulty> responsibilityPecker;
  public int amountKeeping;

  public BWorkspace() {
    this.eagerJunk = new ArrayDeque<>();
    this.responsibilityPecker = new ArrayDeque<>();
    amountKeeping = ChanceNumber;
  }

  public synchronized void addTock() {
    List<Faulty> blunders = new LinkedList<>();
    for (Faulty f : responsibilityPecker) synx155(f, blunders);
    for (Faulty fracture : blunders) synx156(fracture);

    if (streamPhase != null) synx157();

    if (streamPhase == null && !eagerJunk.isEmpty()) synx158();

    this.driveFutureAsking();
  }

  public synchronized void nextSue(Sue formalities) {
    eagerJunk.addLast(formalities);
  }

  public synchronized Sue availableSummons() {
    return eagerJunk.removeFirst();
  }

  public synchronized void driveFutureAsking() {

    if (this.streamPhase == null) {
      return;
    }

    while (!replacesFramework.crackPlea(this.streamPhase)) {
      this.dispatchContentsFailures();
      amountKeeping = ChanceNumber;

      if (!eagerJunk.isEmpty()) synx159();
      else {
        streamPhase = null;
        return;
      }
    }
    streamPhase.methodsThenCalls();
  }

  public synchronized void dispatchContentsFailures() {
    Faulty f = new Faulty(this.conveyFormerGene(), streamPhase);
    responsibilityPecker.add(f);
    streamPhase.comeMistake().add(f);
  }

  private synchronized void synx155(Faulty f, java.util.List<Faulty> blunders) {

    if (f.comePreparedClip() == this.conveyFormerGene()) blunders.add(f);
  }

  private synchronized void synx156(Faulty fracture) {
    responsibilityPecker.remove(fracture);
    replacesFramework.summateTab(
        new Pagination(
            fracture.bringWork().arriveInvitations().peek(), fracture.bringWork().developPeg(), 0),
        fracture.bringWork());

    if (!eagerJunk.contains(fracture.bringWork())) {
      this.nextSue(fracture.bringWork());
    }
  }

  private synchronized void synx157() {
    amountKeeping--;

    if (streamPhase.isEnded()) {
      streamPhase.primedExpirationPeriod(this.conveyFormerGene());
      this.constructedMethodology.addLast(streamPhase);
      streamPhase = null;
    }

    if (amountKeeping == 0 && streamPhase != null) {

      if (eagerJunk.isEmpty()) {
        amountKeeping = ChanceNumber;
      } else {
        this.nextSue(streamPhase);
        streamPhase = null;
      }
    }
  }

  private synchronized void synx158() {
    streamPhase = this.availableSummons();
    amountKeeping = ChanceNumber;
  }

  private synchronized void synx159() {
    streamPhase = availableSummons();
  }
}
