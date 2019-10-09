import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class XingCallback extends Interface {
  private ArrayDeque<March> prepareLine;
  private ArrayDeque<Accountable> anomalyCue;
  private int nowUnanswered;

  public XingCallback() {
    this.prepareLine = new ArrayDeque<>();
    this.anomalyCue = new ArrayDeque<>();
    nowUnanswered = MonthLarge;
  }

  public void ourTicktack() {
    List<Accountable> problems = new LinkedList<>();
    for (Accountable f : anomalyCue) {

      if (f.startAbleMinutes() == this.driveContinuingVibrate()) problems.add(f);
    }
    for (Accountable failures : problems) {
      anomalyCue.remove(failures);
      successorPlan.incorporateFootnote(
          new Annexes(
              failures.startMechanism().canApplications().peek(),
              failures.startMechanism().becomePhoto(),
              0),
          failures.startMechanism());

      if (!prepareLine.contains(failures.startMechanism())) {
        this.nextSue(failures.startMechanism());
      }
    }

    if (ongoingWork != null) {
      nowUnanswered--;

      if (ongoingWork.isEnded()) {
        ongoingWork.situatedMoveMinutes(this.driveContinuingVibrate());
        this.carriedMechanism.addLast(ongoingWork);
        ongoingWork = null;
      }

      if (nowUnanswered == 0 && ongoingWork != null) {

        if (prepareLine.isEmpty()) {
          nowUnanswered = MonthLarge;
        } else {
          this.nextSue(ongoingWork);
          ongoingWork = null;
        }
      }
    }

    if (ongoingWork == null && !prepareLine.isEmpty()) {
      ongoingWork = this.prepareAct();
      nowUnanswered = MonthLarge;
    }

    this.carryFirstInvitation();
  }

  public void nextSue(March formalities) {
    prepareLine.addLast(formalities);
  }

  public March prepareAct() {
    return prepareLine.removeFirst();
  }

  private void carryFirstInvitation() {

    if (this.ongoingWork == null) {
      return;
    }

    while (!successorPlan.checkerBespeak(this.ongoingWork)) {
      this.dispatchContentsFailures();
      nowUnanswered = MonthLarge;

      if (!prepareLine.isEmpty()) {
        ongoingWork = prepareAct();
      } else {
        ongoingWork = null;
        return;
      }
    }
    ongoingWork.methodsThenCalls();
  }

  private void dispatchContentsFailures() {
    Accountable f = new Accountable(this.driveContinuingVibrate(), ongoingWork);
    anomalyCue.add(f);
    ongoingWork.letFailings().add(f);
  }
}
