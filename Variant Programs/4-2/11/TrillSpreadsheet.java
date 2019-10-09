import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrillSpreadsheet extends Debugging {
  private ArrayDeque<Procedures> preparingReaper;
  private ArrayDeque<Responsibility> wrongJumping;
  private int periodFinal;

  public TrillSpreadsheet() {
    this.preparingReaper = new ArrayDeque<>();
    this.wrongJumping = new ArrayDeque<>();
    periodFinal = DaysQuantitative;
  }

  public void optiBeat() {
    List<Responsibility> weaknesses = new LinkedList<>();
    for (Responsibility f : wrongJumping) {

      if (f.makeFitDay() == this.bringOngoingBeat()) weaknesses.add(f);
    }
    for (Responsibility negligence : weaknesses) {
      wrongJumping.remove(negligence);
      refillingGambit.augmentPagination(
          new Tab(
              negligence.arriveProcedures().findBespeak().peek(),
              negligence.arriveProcedures().produceMap(),
              0),
          negligence.arriveProcedures());

      if (!preparingReaper.contains(negligence.arriveProcedures())) {
        this.ingressProcedures(negligence.arriveProcedures());
      }
    }

    if (streamPhase != null) {
      periodFinal--;

      if (streamPhase.isEnded()) {
        streamPhase.situatedMoveMinutes(this.bringOngoingBeat());
        this.implementedSummons.addLast(streamPhase);
        streamPhase = null;
      }

      if (periodFinal == 0 && streamPhase != null) {

        if (preparingReaper.isEmpty()) {
          periodFinal = DaysQuantitative;
        } else {
          this.ingressProcedures(streamPhase);
          streamPhase = null;
        }
      }
    }

    if (streamPhase == null && !preparingReaper.isEmpty()) {
      streamPhase = this.availableSummons();
      periodFinal = DaysQuantitative;
    }

    this.workExpectedMotion();
  }

  public void ingressProcedures(Procedures cycle) {
    preparingReaper.addLast(cycle);
  }

  public Procedures availableSummons() {
    return preparingReaper.removeFirst();
  }

  private void workExpectedMotion() {

    if (this.streamPhase == null) {
      return;
    }

    while (!refillingGambit.watchQuest(this.streamPhase)) {
      this.dispatchContentsFailures();
      periodFinal = DaysQuantitative;

      if (!preparingReaper.isEmpty()) {
        streamPhase = availableSummons();
      } else {
        streamPhase = null;
        return;
      }
    }
    streamPhase.litigateIncomingProposal();
  }

  private void dispatchContentsFailures() {
    Responsibility f = new Responsibility(this.bringOngoingBeat(), streamPhase);
    wrongJumping.add(f);
    streamPhase.haveFlaws().add(f);
  }
}
