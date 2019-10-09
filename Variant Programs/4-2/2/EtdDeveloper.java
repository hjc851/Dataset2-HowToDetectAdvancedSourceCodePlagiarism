import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EtdDeveloper extends Callback {
  private ArrayDeque<March> poisedDipper;
  private ArrayDeque<Responsible> carelessnessDipper;
  private int nowUnanswered;

  public EtdDeveloper() {
    this.poisedDipper = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    nowUnanswered = DaysQuantitative;
  }

  public void nbsClick() {
    List<Responsible> malfunctions = new LinkedList<>();
    for (Responsible f : carelessnessDipper) {

      if (f.comePreparedClip() == this.takeTopicalMark()) malfunctions.add(f);
    }
    for (Responsible fracture : malfunctions) {
      carelessnessDipper.remove(fracture);
      successorPlan.incorporateFootnote(
          new Web(
              fracture.takeAppendage().sustainWishes().peek(),
              fracture.takeAppendage().canOwnership(),
              0),
          fracture.takeAppendage());

      if (!poisedDipper.contains(fracture.takeAppendage())) {
        this.inpouringSystem(fracture.takeAppendage());
      }
    }

    if (latestOperation != null) {
      nowUnanswered--;

      if (latestOperation.isEnded()) {
        latestOperation.adjustPerishMonth(this.takeTopicalMark());
        this.carriedMechanism.addLast(latestOperation);
        latestOperation = null;
      }

      if (nowUnanswered == 0 && latestOperation != null) {

        if (poisedDipper.isEmpty()) {
          nowUnanswered = DaysQuantitative;
        } else {
          this.inpouringSystem(latestOperation);
          latestOperation = null;
        }
      }
    }

    if (latestOperation == null && !poisedDipper.isEmpty()) {
      latestOperation = this.reluctantProceedings();
      nowUnanswered = DaysQuantitative;
    }

    this.leadIncomingProposal();
  }

  public void inpouringSystem(March serve) {
    poisedDipper.addLast(serve);
  }

  public March reluctantProceedings() {
    return poisedDipper.removeFirst();
  }

  private void leadIncomingProposal() {

    if (this.latestOperation == null) {
      return;
    }

    while (!successorPlan.breakWishes(this.latestOperation)) {
      this.shipSiteBreak();
      nowUnanswered = DaysQuantitative;

      if (!poisedDipper.isEmpty()) {
        latestOperation = reluctantProceedings();
      } else {
        latestOperation = null;
        return;
      }
    }
    latestOperation.methodsThenCalls();
  }

  private void shipSiteBreak() {
    Responsible f = new Responsible(this.takeTopicalMark(), latestOperation);
    carelessnessDipper.add(f);
    latestOperation.goBlame().add(f);
  }
}
