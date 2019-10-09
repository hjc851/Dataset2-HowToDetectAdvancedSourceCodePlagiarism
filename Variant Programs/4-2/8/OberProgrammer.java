import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OberProgrammer extends Initialization {
  private ArrayDeque<Outgrowth> preparedWait;
  private ArrayDeque<Culpability> defectList;
  private int beginningUnsold;

  public OberProgrammer() {
    this.preparedWait = new ArrayDeque<>();
    this.defectList = new ArrayDeque<>();
    beginningUnsold = MeterMeasure;
  }

  public void nsoTic() {
    List<Culpability> failures = new LinkedList<>();
    for (Culpability f : defectList) {

      if (f.beatReluctantJuncture() == this.obtainLiveTic()) failures.add(f);
    }
    for (Culpability responsibility : failures) {
      defectList.remove(responsibility);
      replacingScheme.lendHomepage(
          new Front(
              responsibility.goProcedure().comePetition().peek(),
              responsibility.goProcedure().driveSecurity(),
              0),
          responsibility.goProcedure());

      if (!preparedWait.contains(responsibility.goProcedure())) {
        this.inflowingSummons(responsibility.goProcedure());
      }
    }

    if (typicalProceedings != null) {
      beginningUnsold--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.laidLeaveClip(this.obtainLiveTic());
        this.achievedMechanisms.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (beginningUnsold == 0 && typicalProceedings != null) {

        if (preparedWait.isEmpty()) {
          beginningUnsold = MeterMeasure;
        } else {
          this.inflowingSummons(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !preparedWait.isEmpty()) {
      typicalProceedings = this.makeSue();
      beginningUnsold = MeterMeasure;
    }

    this.scarperComeMotions();
  }

  public void inflowingSummons(Outgrowth serve) {
    preparedWait.addLast(serve);
  }

  public Outgrowth makeSue() {
    return preparedWait.removeFirst();
  }

  private void scarperComeMotions() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!replacingScheme.chitSuggestion(this.typicalProceedings)) {
      this.airTabFaulty();
      beginningUnsold = MeterMeasure;

      if (!preparedWait.isEmpty()) {
        typicalProceedings = makeSue();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.methodsThenCalls();
  }

  private void airTabFaulty() {
    Culpability f = new Culpability(this.obtainLiveTic(), typicalProceedings);
    defectList.add(f);
    typicalProceedings.startMalfunctions().add(f);
  }
}
