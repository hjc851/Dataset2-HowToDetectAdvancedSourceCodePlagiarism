import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class XingCallback extends Outliner {
  private ArrayDeque<Negotiations> preppedDragon = null;
  private int hourStay = 0;

  private synchronized void courseAfterInsistence() {

    if (this.presentlyMechanism == null) {
      return;
    }

    while (!backupFocused.confirmationMotion(this.presentlyMechanism)) {
      this.broadcastWebDemerit();
      hourStay = HourPurity;

      if (!preppedDragon.isEmpty()) synx172();
      else {
        presentlyMechanism = null;
        return;
      }
    }
    presentlyMechanism.workCloseQuest();
  }

  private ArrayDeque<Defective> liabilityGlue = null;

  public synchronized void bpsRetick() {
    List<Defective> defects = new LinkedList<>();
    for (Defective f : liabilityGlue) synx173(f, defects);
    for (Defective flaw : defects) synx174(flaw);

    if (presentlyMechanism != null) synx175();

    if (presentlyMechanism == null && !preppedDragon.isEmpty()) synx176();

    this.courseAfterInsistence();
  }

  private synchronized void broadcastWebDemerit() {
    Defective f = new Defective(this.sustainThisValidation(), presentlyMechanism);
    liabilityGlue.add(f);
    presentlyMechanism.developErrors().add(f);
  }

  public XingCallback() {
    this.preppedDragon = new ArrayDeque<>();
    this.liabilityGlue = new ArrayDeque<>();
    hourStay = HourPurity;
  }

  public synchronized Negotiations preppedNegotiations() {
    return preppedDragon.removeFirst();
  }

  public synchronized void inboundOperation(Negotiations mechanisms) {
    preppedDragon.addLast(mechanisms);
  }

  private synchronized void synx172() {
    presentlyMechanism = preppedNegotiations();
  }

  private synchronized void synx173(Defective f, java.util.List<Defective> defects) {

    if (f.sustainGonnaThing() == this.sustainThisValidation()) defects.add(f);
  }

  private synchronized void synx174(Defective flaw) {
    liabilityGlue.remove(flaw);
    backupFocused.augmentPagination(
        new Folio(
            flaw.goProcedure().findBespeak().peek(), flaw.goProcedure().letIdentification(), 0),
        flaw.goProcedure());

    if (!preppedDragon.contains(flaw.goProcedure())) {
      this.inboundOperation(flaw.goProcedure());
    }
  }

  private synchronized void synx175() {
    hourStay--;

    if (presentlyMechanism.isEnded()) {
      presentlyMechanism.laidLeaveClip(this.sustainThisValidation());
      this.executedMethods.addLast(presentlyMechanism);
      presentlyMechanism = null;
    }

    if (hourStay == 0 && presentlyMechanism != null) {

      if (preppedDragon.isEmpty()) {
        hourStay = HourPurity;
      } else {
        this.inboundOperation(presentlyMechanism);
        presentlyMechanism = null;
      }
    }
  }

  private synchronized void synx176() {
    presentlyMechanism = this.preppedNegotiations();
    hourStay = HourPurity;
  }
}
