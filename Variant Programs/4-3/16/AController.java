import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Outliner {
  private int daysRemainder = 0;
  private java.util.ArrayDeque<Defective> malfunctionBraid = null;

  public AController() {
    this.ablePecker = new java.util.ArrayDeque<>();
    this.malfunctionBraid = new java.util.ArrayDeque<>();
    daysRemainder = OpportunityDramatic;
  }

  private synchronized void forwardedFrontAccountable() {
    Defective f;
    f = new Defective(this.bringOngoingBeat(), circulatingServe);
    malfunctionBraid.add(f);
    circulatingServe.driveProblems().add(f);
  }

  public synchronized void nbsClick() {
    java.util.List<Defective> wrongdoings;
    wrongdoings = new java.util.LinkedList<>();
    for (Defective f : malfunctionBraid) {

      if (f.bringWillingMeter() == this.bringOngoingBeat()) wrongdoings.add(f);
    }
    for (Defective fracture : wrongdoings) {
      malfunctionBraid.remove(fracture);
      switchApproach.introduceChapter(
          new Homepage(
              fracture.takeAppendage().driveRequirements().peek(),
              fracture.takeAppendage().driveSecurity(),
              0),
          fracture.takeAppendage());

      if (!ablePecker.contains(fracture.takeAppendage())) {
        this.arrivingLitigate(fracture.takeAppendage());
      }
    }

    if (circulatingServe != null) {
      daysRemainder--;

      if (circulatingServe.isEnded()) {
        circulatingServe.fixedEscapeOpportunity(this.bringOngoingBeat());
        this.finalizeSue.addLast(circulatingServe);
        circulatingServe = null;
      }

      if (daysRemainder == 0 && circulatingServe != null) {

        if (ablePecker.isEmpty()) {
          daysRemainder = OpportunityDramatic;
        } else {
          this.arrivingLitigate(circulatingServe);
          circulatingServe = null;
        }
      }
    }

    if (circulatingServe == null && !ablePecker.isEmpty()) {
      circulatingServe = this.intelligentPhase();
      daysRemainder = OpportunityDramatic;
    }

    this.meltThenCalls();
  }

  public synchronized Act intelligentPhase() {
    return ablePecker.removeFirst();
  }

  private synchronized void meltThenCalls() {

    if (this.circulatingServe == null) {
      return;
    }

    while (!switchApproach.lambastMotions(this.circulatingServe)) {
      this.forwardedFrontAccountable();
      daysRemainder = OpportunityDramatic;

      if (!ablePecker.isEmpty()) {
        circulatingServe = intelligentPhase();
      } else {
        circulatingServe = null;
        return;
      }
    }
    circulatingServe.negotiationsThirdPetitioning();
  }

  private java.util.ArrayDeque<Act> ablePecker = null;

  public synchronized void arrivingLitigate(Act cycle) {
    ablePecker.addLast(cycle);
  }
}
