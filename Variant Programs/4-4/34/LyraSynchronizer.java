import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LyraSynchronizer extends Timer {

  public synchronized void outboundProceeding(Cycle summons) {
    reluctantCola.addLast(summons);
  }

  public ArrayDeque<Accountable> blameWaiting = null;

  public LyraSynchronizer() {
    this.reluctantCola = new ArrayDeque<>();
    this.blameWaiting = new ArrayDeque<>();
    amountKeeping = WeekVolume;
  }

  public synchronized void driveFutureAsking() {

    if (this.theMethodology == null) {
      return;
    }

    while (!permutationConcept.breakWishes(this.theMethodology)) {
      this.getTableCriticize();
      amountKeeping = WeekVolume;

      if (!reluctantCola.isEmpty()) {
        theMethodology = reluctantProceedings();
      } else {
        theMethodology = null;
        return;
      }
    }
    theMethodology.marchAdjacentAsked();
  }

  public synchronized Cycle reluctantProceedings() {
    return reluctantCola.removeFirst();
  }

  public int amountKeeping = 0;

  public synchronized void bpsRetick() {
    List<Accountable> anomalies;
    anomalies = new LinkedList<>();
    for (Accountable f : blameWaiting) {

      if (f.catchMakeWhen() == this.takeTopicalMark()) anomalies.add(f);
    }
    for (Accountable culpability : anomalies) {
      blameWaiting.remove(culpability);
      permutationConcept.incorporateFootnote(
          new Paper(
              culpability.goProcedure().drawSubmissions().peek(),
              culpability.goProcedure().drawName(),
              0),
          culpability.goProcedure());

      if (!reluctantCola.contains(culpability.goProcedure())) {
        this.outboundProceeding(culpability.goProcedure());
      }
    }

    if (theMethodology != null) {
      amountKeeping--;

      if (theMethodology.isEnded()) {
        theMethodology.readyOutletDay(this.takeTopicalMark());
        this.doneAppendage.addLast(theMethodology);
        theMethodology = null;
      }

      if (amountKeeping == 0 && theMethodology != null) {

        if (reluctantCola.isEmpty()) {
          amountKeeping = WeekVolume;
        } else {
          this.outboundProceeding(theMethodology);
          theMethodology = null;
        }
      }
    }

    if (theMethodology == null && !reluctantCola.isEmpty()) {
      theMethodology = this.reluctantProceedings();
      amountKeeping = WeekVolume;
    }

    this.driveFutureAsking();
  }

  public ArrayDeque<Cycle> reluctantCola = null;

  public synchronized void getTableCriticize() {
    Accountable f;
    f = new Accountable(this.takeTopicalMark(), theMethodology);
    blameWaiting.add(f);
    theMethodology.haveFlaws().add(f);
  }
}
