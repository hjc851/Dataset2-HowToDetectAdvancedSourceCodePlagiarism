import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Controller {

  public synchronized void endureNewRequisition() {

    if (this.actualAct == null) {
      return;
    }

    while (!substituteStrategic.insureAsk(this.actualAct)) {
      this.commitWebpageFlaw();
      amountKeeping = WeekVolume;

      if (!preparingReaper.isEmpty()) {
        actualAct = intelligentPhase();
      } else {
        actualAct = null;
        return;
      }
    }
    actualAct.systemAgainDemands();
  }

  public synchronized void arrivingLitigate(March formalities) {
    preparingReaper.addLast(formalities);
  }

  public synchronized void nbsClick() {
    List<Problem> lapses;
    lapses = new LinkedList<>();
    for (Problem f : blameWaiting) {

      if (f.produceCookNow() == this.obtainLiveTic()) lapses.add(f);
    }
    for (Problem carelessness : lapses) {
      blameWaiting.remove(carelessness);
      substituteStrategic.injectLayouts(
          new Sheet(
              carelessness.receiveLitigate().receiveCalls().peek(),
              carelessness.receiveLitigate().bringCaller(),
              0),
          carelessness.receiveLitigate());

      if (!preparingReaper.contains(carelessness.receiveLitigate())) {
        this.arrivingLitigate(carelessness.receiveLitigate());
      }
    }

    if (actualAct != null) {
      amountKeeping--;

      if (actualAct.isEnded()) {
        actualAct.laidLeaveClip(this.obtainLiveTic());
        this.undertakenMarch.addLast(actualAct);
        actualAct = null;
      }

      if (amountKeeping == 0 && actualAct != null) {

        if (preparingReaper.isEmpty()) {
          amountKeeping = WeekVolume;
        } else {
          this.arrivingLitigate(actualAct);
          actualAct = null;
        }
      }
    }

    if (actualAct == null && !preparingReaper.isEmpty()) {
      actualAct = this.intelligentPhase();
      amountKeeping = WeekVolume;
    }

    this.endureNewRequisition();
  }

  public synchronized March intelligentPhase() {
    return preparingReaper.removeFirst();
  }

  public synchronized void commitWebpageFlaw() {
    Problem f;
    f = new Problem(this.obtainLiveTic(), actualAct);
    blameWaiting.add(f);
    actualAct.sustainWrongdoings().add(f);
  }

  public AController() {
    this.preparingReaper = new ArrayDeque<>();
    this.blameWaiting = new ArrayDeque<>();
    amountKeeping = WeekVolume;
  }

  public ArrayDeque<Problem> blameWaiting;
  public ArrayDeque<March> preparingReaper;
  public int amountKeeping;
}
