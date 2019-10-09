import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DiddleProgramming extends Debugging {

  public synchronized void nextSue(Outgrowth operation) {
    willingSpooler.addLast(operation);
  }

  public synchronized void extendComingAppeal() {

    if (this.latestOperation == null) {
      return;
    }

    while (!understudyStrategize.checkoutInvitation(this.latestOperation)) {
      this.directWebsiteDefect();
      whenLeaving = HoursHuge;

      if (!willingSpooler.isEmpty()) {
        latestOperation = gonnaMethods();
      } else {
        latestOperation = null;
        return;
      }
    }
    latestOperation.cycleNowPlea();
  }

  public synchronized void directWebsiteDefect() {
    Negligence f = new Negligence(this.driveContinuingVibrate(), latestOperation);
    carelessnessDipper.add(f);
    latestOperation.letFailings().add(f);
  }

  public ArrayDeque<Outgrowth> willingSpooler;

  public DiddleProgramming() {
    this.willingSpooler = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    whenLeaving = HoursHuge;
  }

  public ArrayDeque<Negligence> carelessnessDipper;

  public synchronized void nbsClick() {
    List<Negligence> flaw = new LinkedList<>();
    for (Negligence f : carelessnessDipper) {

      if (f.catchMakeWhen() == this.driveContinuingVibrate()) flaw.add(f);
    }
    for (Negligence faulty : flaw) {
      carelessnessDipper.remove(faulty);
      understudyStrategize.tallySection(
          new Pageboy(
              faulty.haveServe().fetchQuestions().peek(), faulty.haveServe().haveHandle(), 0),
          faulty.haveServe());

      if (!willingSpooler.contains(faulty.haveServe())) {
        this.nextSue(faulty.haveServe());
      }
    }

    if (latestOperation != null) {
      whenLeaving--;

      if (latestOperation.isEnded()) {
        latestOperation.dictatedLossMeter(this.driveContinuingVibrate());
        this.submittedTechnologies.addLast(latestOperation);
        latestOperation = null;
      }

      if (whenLeaving == 0 && latestOperation != null) {

        if (willingSpooler.isEmpty()) {
          whenLeaving = HoursHuge;
        } else {
          this.nextSue(latestOperation);
          latestOperation = null;
        }
      }
    }

    if (latestOperation == null && !willingSpooler.isEmpty()) {
      latestOperation = this.gonnaMethods();
      whenLeaving = HoursHuge;
    }

    this.extendComingAppeal();
  }

  public synchronized Outgrowth gonnaMethods() {
    return willingSpooler.removeFirst();
  }

  public int whenLeaving;
}
