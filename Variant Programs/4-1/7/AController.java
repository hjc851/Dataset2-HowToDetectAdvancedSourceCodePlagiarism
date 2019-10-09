import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AController extends Workspace {
  private ArrayDeque<Treat> cookCue;
  private ArrayDeque<Break> liabilityGlue;
  private int junctureMaintaining;

  public AController() {
    this.cookCue = new ArrayDeque<>();
    this.liabilityGlue = new ArrayDeque<>();
    junctureMaintaining = SentenceTeleportation;
  }

  public void nsoTic() {
    List<Break> anomalies = new LinkedList<>();
    for (Break f : liabilityGlue) {

      if (f.findPrepareSentence() == this.becomeTheSelect()) anomalies.add(f);
    }
    for (Break fracture : anomalies) {
      liabilityGlue.remove(fracture);
      refillingGambit.impartWebsite(
          new Site(
              fracture.arriveProcedures().startApplication().peek(),
              fracture.arriveProcedures().becomePhoto(),
              0),
          fracture.arriveProcedures());

      if (!cookCue.contains(fracture.arriveProcedures())) {
        this.succeedingOutgrowth(fracture.arriveProcedures());
      }
    }

    if (presentlyMechanism != null) {
      junctureMaintaining--;

      if (presentlyMechanism.isEnded()) {
        presentlyMechanism.arrangeEgressYears(this.becomeTheSelect());
        this.performedTreat.addLast(presentlyMechanism);
        presentlyMechanism = null;
      }

      if (junctureMaintaining == 0 && presentlyMechanism != null) {

        if (cookCue.isEmpty()) {
          junctureMaintaining = SentenceTeleportation;
        } else {
          this.succeedingOutgrowth(presentlyMechanism);
          presentlyMechanism = null;
        }
      }
    }

    if (presentlyMechanism == null && !cookCue.isEmpty()) {
      presentlyMechanism = this.availableSummons();
      junctureMaintaining = SentenceTeleportation;
    }

    this.playSucceedingBespeak();
  }

  public void succeedingOutgrowth(Treat system) {
    cookCue.addLast(system);
  }

  public Treat availableSummons() {
    return cookCue.removeFirst();
  }

  private void playSucceedingBespeak() {

    if (this.presentlyMechanism == null) {
      return;
    }

    while (!refillingGambit.checkerBespeak(this.presentlyMechanism)) {
      this.beamAddendumAnomaly();
      junctureMaintaining = SentenceTeleportation;

      if (!cookCue.isEmpty()) {
        presentlyMechanism = availableSummons();
      } else {
        presentlyMechanism = null;
        return;
      }
    }
    presentlyMechanism.negotiationsThirdPetitioning();
  }

  private void beamAddendumAnomaly() {
    Break f = new Break(this.becomeTheSelect(), presentlyMechanism);
    liabilityGlue.add(f);
    presentlyMechanism.beatBlunders().add(f);
  }
}
